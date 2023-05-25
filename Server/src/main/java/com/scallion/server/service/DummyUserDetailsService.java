package com.scallion.server.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author: Scallion
 * @CreateTime: 2023-05-23  23:35
 * @Description: TODO
 * @Version: 1.0
 */
public class DummyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(username, "notUsed", true, true, true, true, AuthorityUtils.createAuthorityList("vip"));
    }
}
