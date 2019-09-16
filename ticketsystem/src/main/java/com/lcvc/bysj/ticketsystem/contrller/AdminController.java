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
@Api(value = "管理员信息模块", tags = "管理员信息模块")
@RequestMapping(value = "/api")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/admin")
    @ApiOperation(value = "创建一个管理员账户",notes = "创建管理员后返回创建的对象信息")
    public ResponseData insertAdmin(Admin admin){
        return ResponseDataUtil.buildSuccess(admin);
    }

    @GetMapping("/adminList")
    @ApiOperation(value = "查询所有管理员账户",notes = "=返回所有管理员账户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage",value = "请求查询页数",dataType = "Integer"),
            @ApiImplicitParam(name = "size",value = "查询记录条数",dataType = "Integer")
    })
    public ResponseData findAllAdmin(Integer currentPage,Integer size){
        return ResponseDataUtil.buildSuccess(ResultEnums.SUCCESS.getCode(),
                "获取成功",adminService.findAdmin(currentPage-1,size));
    }
    @DeleteMapping("/deleteAdmin/{id}")
    @ApiOperation(value = "删除指定管理员",notes = "根据id删除管理员")
    @ApiImplicitParam(name = "id",value = "管理员ID",dataType = "Integer")
    public ResponseData deleteAdmin(@PathVariable Integer id){
        if (id!=null){
            adminService.deleteAdmin(id);
            return ResponseDataUtil.buildSuccess(ResultEnums.SUCCESS.getCode(),"删除成功");
        }
        return ResponseDataUtil.buildSuccess(ResultEnums.ERROR.getCode(),"管理员不存在");
    }
}
