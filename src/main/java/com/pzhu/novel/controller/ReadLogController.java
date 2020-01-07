package com.pzhu.novel.controller;

import com.pzhu.novel.common.api.CommonResult;
import com.pzhu.novel.dto.ReadLogDTO;
import com.pzhu.novel.mbg.mapper.AdminMapper;
import com.pzhu.novel.mbg.model.Admin;
import com.pzhu.novel.mbg.model.AdminExample;
import com.pzhu.novel.mbg.model.ReadLog;
import com.pzhu.novel.service.ReadLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "ReadLogController", description = "阅读记录管理")
@RequestMapping("/api/readLog")
public class ReadLogController {
    @Autowired
    private ReadLogService readLogService;

    @Autowired
    private AdminMapper adminMapper;

    // 添加 阅读记录
    @PostMapping
    @ApiOperation(value = "阅读记录添加")
    public CommonResult add(ReadLog readLog) {
        readLogService.add(readLog);
        return CommonResult.success(readLog);
    }

    // 查询 阅读记录
    @GetMapping
    @ApiOperation("查询阅读记录")
    public CommonResult query(Authentication authentication) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(authentication.getName());
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.isEmpty()) {
            return CommonResult.failed("未登录");
        }
        List<ReadLogDTO> readLogDTOList = readLogService.query(admins.get(0).getId());

        return CommonResult.success(readLogDTOList);
    }

    // 删除 阅读记录
    @DeleteMapping("{readLogId}")
    @ApiOperation("删除阅读记录")
    public CommonResult deleteOne(@PathVariable("readLogId") Long readLogId) {
        readLogService.delete(readLogId);
        return CommonResult.success(readLogId);
    }

    // 更新 阅读记录
    @PutMapping
    @ApiOperation("更新阅读记录")
    public CommonResult updateOne(ReadLog readLog) {
        readLogService.update(readLog);
        return CommonResult.success(readLog);
    }

}
