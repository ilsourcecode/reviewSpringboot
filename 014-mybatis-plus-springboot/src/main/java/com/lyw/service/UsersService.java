package com.lyw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyw.entity.Users;
import com.lyw.mapper.UsersMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService extends ServiceImpl<UsersMapper, Users> implements IService<Users> {
}
