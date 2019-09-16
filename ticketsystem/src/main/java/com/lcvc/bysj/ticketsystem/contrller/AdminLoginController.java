package com.lcvc.bysj.ticketsystem.contrller;

import com.lcvc.bysj.ticketsystem.entity.Admin;
import com.lcvc.bysj.ticketsystem.message.ResponseData;
import com.lcvc.bysj.ticketsystem.message.ResponseDataUtil;
import com.lcvc.bysj.ticketsystem.message.ResultEnums;
import com.lcvc.bysj.ticketsystem.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@Api(value = "管理员登录模块", tags = "管理员登录模块")
@RequestMapping(value = "/api")
public class AdminLoginController {
    @Autowired
    AdminService adminService;



    @GetMapping("/login")
    @ApiOperation(value = "管理员登录",notes = "登录成功返回true")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",dataType = "String"),
            @ApiImplicitParam(name = "password",value = "密码",dataType = "String")
    })
    public ResponseData loginAdmin(String username,String password){
        boolean status = adminService.adminLogin(username,password);
        if (status){
            ResponseData responseData = ResponseDataUtil.buildSuccess(status);
            System.out.println(responseData);
            return responseData;
        }else {
            return ResponseDataUtil.buildError(ResultEnums.ERROR.getCode(),"用户名或密码错误",status);
        }

    }
}
