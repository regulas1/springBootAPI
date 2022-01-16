package com.apitest.sriregula;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    List <User> list;

    public UserServiceimpl(){
        list = new ArrayList<>();
        list.add(new User(2,"Shanna@melissa.tv","010-692-6593 x09125"));
    }


    @Override
    public List<User> getUsers() {
        return list;
    }



}
