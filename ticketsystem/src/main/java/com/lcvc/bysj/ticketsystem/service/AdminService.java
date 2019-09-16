package com.lcvc.bysj.ticketsystem.service;

import com.lcvc.bysj.ticketsystem.entity.Admin;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    //创建一个管理员账户
    Admin save(Admin admin);

    //查询所有管理员账户
    Page<Admin> findAdmin(Integer currentPage, Integer size);

    //管理员登录
    boolean adminLogin(String username,String password);

    //删除指定管理员
    void deleteAdmin(Integer integer);
}
