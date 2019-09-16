package com.lcvc.bysj.ticketsystem;

import com.lcvc.bysj.ticketsystem.dao.AdminDao;
import com.lcvc.bysj.ticketsystem.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TicketsystemApplication.class)
public class Login {
    @Autowired
    AdminDao adminDao;
    @Test
    public void testAdminLoginDao(){
        Admin b=adminDao.findByUsernameAndPassword("xhui","123456");
        System.out.println(b);
    }
    @Test
    public void testDeleteAdmin() {
        adminDao.deleteById(7);
    }
}
