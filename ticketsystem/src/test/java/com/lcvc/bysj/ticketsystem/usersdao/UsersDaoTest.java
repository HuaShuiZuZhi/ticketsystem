package com.lcvc.bysj.ticketsystem.usersdao;

import com.lcvc.bysj.ticketsystem.TicketsystemApplication;
import com.lcvc.bysj.ticketsystem.contrller.AdminController;
import com.lcvc.bysj.ticketsystem.contrller.AdminLoginController;
import com.lcvc.bysj.ticketsystem.dao.AdminDao;
import com.lcvc.bysj.ticketsystem.entity.Admin;
import com.lcvc.bysj.ticketsystem.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TicketsystemApplication.class)
public class UsersDaoTest{
    @Autowired
    AdminDao adminDao;
    @Autowired
    AdminService adminService;
    @Autowired
    AdminController adminController;
    @Autowired
    AdminLoginController adminLoginController;

    @Test
    public void testAdminDaoSave(){
        Admin admin=new Admin();
        admin.setName("wangwu");
        adminController.insertAdmin(admin);
    }
    @Test
    public void testLogin(){

    }





}
