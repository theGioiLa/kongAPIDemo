package com.quynq.KongAPIEx.controller;

import com.quynq.KongAPIEx.model.Role;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
    String template = "Only accessible by accounts with the %s role";

    @GetMapping("/dev")
    public Role showUserRole() {
        return new Role("ROLE_DEV", String.format(template, "DEV"));
    }

    @GetMapping("/leader")
    public Role showSAdminRole() {
        return new Role("ROLE_LEADER", String.format(template, "LEADER"));
    }

    @GetMapping("/manager")
    public Role showAdminRole() {
        return new Role("ROLE_MANAGER", String.format(template, "MANAGER"));
    }
}
