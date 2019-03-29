package com.kg.rest.web;

import com.kg.rest.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author long chen
 * @date 2019/3/29
 * @description
 */
@RestController
public class WebResource {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers() {
        List<Users> list = new ArrayList<Users>();
        for (int i = 0; i < 3; i++) {
            Users users = new Users();
            users.setId(i);
            users.setName("robot" + i);
            users.setAge(i);
            list.add(users);
        }
        return list;
    }

    @PostMapping("/doUsers")
    public String doUsers(@RequestBody Users users) {
        System.out.println("接收到的users: " + users);
        //这里做增删改查等操作
        users.setName("updateName");
        return "操作users成功:" + users;
    }

}
