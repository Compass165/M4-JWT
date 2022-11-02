package com.jwt.service;


import com.jwt.model.Role;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}