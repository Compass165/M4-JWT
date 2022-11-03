package com.jwt.service.role;

import com.jwt.model.Role;
import com.jwt.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}