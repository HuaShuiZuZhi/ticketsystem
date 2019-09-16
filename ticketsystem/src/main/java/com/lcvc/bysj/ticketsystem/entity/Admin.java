package com.lcvc.bysj.ticketsystem.entity;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
/**
 * 管理员信息类
 */
@Data
@Entity
@Table(name = "admin")
@Setter
@Getter
@ToString
public class Admin {
    /**
     *  @Id : 标注为表的对应id
     *  @Column : 表中对应列的字段
     *  @GeneratedValue ：id增值的类型
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;     //主键
    @Column(name = "a_name")
    private String name;      //管理员姓名
    @Column(name = "a_username")
    private String username;      //账号
    @Column(name = "a_password")
    private String password;      //密码
    @Column(name = "a_email")
    private String email;     //邮箱
    @Column(name = "a_phone")
    private String phone;        //电话



}
