package com.pzhu.novel.controller;

import java.util.List;

import com.pzhu.novel.common.api.CommonPage;
import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.dto.UserDTO;
import com.pzhu.novel.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/8
 **/
@RestController
@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    @ApiOperation("根据用户id获取用户信息")
    public CommonResult<UserDTO> getUserById(@PathVariable("userId") Long userId) {
        UserDTO userDTO = userService.getUserById(userId);
        return CommonResult.success(userDTO);
    }

    @GetMapping
    @ApiOperation("根据关键信息查找用户信息")
    public CommonResult<CommonPage<UserDTO>> getAllUser(@RequestParam(value = "search",required = false) String search,
                                                        @RequestParam(value = "page", defaultValue = "1") Integer page,
                                                        @RequestParam(value = "limit") Integer limit) {
        UserDTO userDTO = null;
        if (search != null) {
            userDTO = new UserDTO();
            userDTO.setUsername(search);
        }
        List<UserDTO> userDTOS = userService.getAllUser(userDTO, page, limit);
        return CommonResult.success(CommonPage.restPage(userDTOS));
    }

    @PutMapping
    @ApiOperation("修改用户信息")
    public CommonResult editUser(@RequestBody UserDTO user) {
        userService.update(user);
        return CommonResult.success(user);
    }

    @DeleteMapping
    @ApiOperation("删除用户")
    public CommonResult deleteUser(Long userId) {
        userService.delete(userId);
        return CommonResult.success(null);
    }
}
