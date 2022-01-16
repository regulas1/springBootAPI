package com.apitest.sriregula;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService{
    public List<User> getUsers();

}
