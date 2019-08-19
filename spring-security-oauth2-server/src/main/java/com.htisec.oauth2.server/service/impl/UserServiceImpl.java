package com.htisec.oauth2.server.service.impl;

import com.htisec.oauth2.server.domain.TbPermission;
import com.htisec.oauth2.server.domain.TbUser;
import com.htisec.oauth2.server.mapper.TbPermissionDAO;
import com.htisec.oauth2.server.mapper.TbUserDAO;
import com.htisec.oauth2.server.service.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserDAO tbUserDAO;

    @Autowired
    private TbPermissionDAO tbPermissionDAO;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser user = tbUserDAO.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        List<TbPermission> permissions = tbPermissionDAO.selectByUserId(user.getId());

        permissions.forEach((tbPermission -> {
            if (tbPermission != null && tbPermission.getEnname() != null) {
                GrantedAuthority authority = new SimpleGrantedAuthority(tbPermission.getEnname());
                authorities.add(authority);
            }

        }));
        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
