package com.zh.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.pojo.Admin;
import com.zh.pojo.LoginForm;
import com.zh.pojo.Teacher;

public interface TeacherService extends IService<Teacher> {

    Teacher login(LoginForm loginForm);


    Teacher getByTeacherById(Long userId);

    IPage<Teacher> getTeachersByOpr(Page<Teacher> paraParam, Teacher teacher);

}
