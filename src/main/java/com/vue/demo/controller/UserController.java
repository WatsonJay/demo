package com.vue.demo.controller;

import com.vue.demo.model.User;
import com.vue.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/userlist")
    @CrossOrigin
    public List<User> userList(String filter){
        return userService.getAll(filter);
    }

    @PostMapping("/submit")
    @CrossOrigin
    public Object submitUser(User user) {
        Map<String,Object> result = new HashMap<String, Object>();
        try {
            if(user.getId()==0) {
                userService.newp(user);
            }else{
                userService.update(user);
            }
            result.put("success", true);
            return result;
        }
        catch (Exception e){
            result.put("success", false);
            return result;
        }
    }

    @PostMapping("/deleteUser")
    @CrossOrigin
    public Object deleteUser(int id){
        Map<String,Object> result = new HashMap<String, Object>();
        try{
            userService.delete(id);
            result.put("success", true);
            return result;
        }
        catch (Exception e){
            result.put("success", false);
            return result;
        }
    }
}
