package com.pzhu.novel.controller;

import com.pzhu.novel.annotations.LoginLog;
import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.dto.AdminLoginParam;
import com.pzhu.novel.dto.UserDTO;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.Permission;
import com.pzhu.novel.service.AdminService;
import com.pzhu.novel.service.UserService;
import com.pzhu.novel.util.JwtTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户管理
 * Created by macro on 2018/4/26.
 */
@RestController
@Api(tags = "AdminController", description = "后台管理员登录管理")
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    private final JwtTokenUtil jwtTokenUtil;
    private final UserService userService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    public AdminController(AdminService adminService, JwtTokenUtil jwtTokenUtil, UserService userService) {
        this.adminService = adminService;
        this.jwtTokenUtil = jwtTokenUtil;
        this.userService = userService;
    }

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "/register")
    public CommonResult<Admin> register(@RequestBody Admin AdminParam, BindingResult result) {
        Admin Admin = userService.register(AdminParam);
        if (Admin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(Admin);
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping(value = "/login")
    @LoginLog
    public CommonResult login(@RequestBody AdminLoginParam AdminLoginParam, BindingResult result) {
        String token = userService.login(AdminLoginParam.getUsername(), AdminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>(1);
        tokenMap.put("token", tokenHead + " " + token);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @GetMapping(value = "/permission/{adminId}")
    public CommonResult<List<Permission>> getPermissionList(@PathVariable Long adminId) {
        List<Permission> permissionList = adminService.getPermissionList(adminId);
        return CommonResult.success(permissionList);
    }

    @ApiOperation("获取当前登录者信息")
    @GetMapping(value = "/info")
    public CommonResult<UserDTO> getAdminInfo(HttpServletRequest request) {
        UserDTO userDTO = new UserDTO();
        Admin admin = new Admin();
        String authHeader = request.getHeader(this.tokenHeader);
        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
            String authToken = authHeader.substring(this.tokenHead.length());
            String userName = jwtTokenUtil.getUserNameFromToken(authToken);
            admin = adminService.getAdminByUsername(userName);
            BeanUtils.copyProperties(admin, userDTO);
        }
        return CommonResult.success(userDTO);
    }


}
