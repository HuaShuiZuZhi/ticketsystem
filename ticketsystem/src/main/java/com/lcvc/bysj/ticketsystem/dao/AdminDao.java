package com.lcvc.bysj.ticketsystem.dao;

import com.lcvc.bysj.ticketsystem.entity.Admin;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AdminDao extends JpaRepository<Admin,Integer> {

    //添加一个管理员账户
    @Override
    <S extends Admin> S save(S s);

    //查询所有管理员账户
    @Override
    Page<Admin> findAll(Pageable pageable);

    //管理员登录
    Admin findByUsernameAndPassword(String username,String password);

    //删除指定管理员
    @Override
    void deleteById(Integer integer);
}
