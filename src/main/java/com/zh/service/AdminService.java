package com.zh.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.pojo.Admin;
import com.zh.pojo.LoginForm;

public interface AdminService extends IService<Admin> {

    Admin login(LoginForm loginForm);


    Admin getAdminById(Long userId);

    IPage<Admin> getAdminsByOpr(Page<Admin> pageParam, String adminName);

}
