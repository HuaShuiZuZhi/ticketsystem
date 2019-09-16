package com.lcvc.bysj.ticketsystem.service.impl;

import com.lcvc.bysj.ticketsystem.dao.AdminDao;
import com.lcvc.bysj.ticketsystem.entity.Admin;
import com.lcvc.bysj.ticketsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;
    @Override
    public Admin save(Admin admin) {
        return adminDao.save(admin);
    }

    @Override
    public Page<Admin> findAdmin(Integer currentPage, Integer size) {

        Pageable pageable=new PageRequest(currentPage,size);
        return adminDao.findAll(pageable);
    }


    @Override
    public boolean adminLogin(String username, String password) {
        if (adminDao.findByUsernameAndPassword(username,password)!=null){
            return true;
        }
        return false;
    }

    @Override
    public void deleteAdmin(Integer integer) {
        adminDao.deleteById(integer);
    }
}
