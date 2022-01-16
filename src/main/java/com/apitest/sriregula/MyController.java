package com.apitest.sriregula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "Test Home Page";
    }

    @GetMapping("/getusercontacts")
    public List<User> getUsers(){
        return this.userService.getUsers();

    }

    @GetMapping("/externalusers")
    public List<Object> getExternalUsers(){
        String url = "https://jsonplaceholder.typicode.com/users?id=2";
        RestTemplate restTemplate = new RestTemplate();

        Object[] users = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(users);

    }

    @GetMapping("/otherUsers")
    public List<Object> getOthers() throws IOException {
        String url = "https://jsonplaceholder.typicode.com/users?id=22";
        RestTemplate restTemplate = new RestTemplate();

        Object[] users = restTemplate.getForObject(url,Object[].class);

        if (Arrays.asList(users).isEmpty()){
            int a = -1;
            return Collections.singletonList(a);
        }
        else {
            return Arrays.asList(users);
        }
    }




}
