package com.vue.demo.service;

import com.vue.demo.dao.UserDao;
import com.vue.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getAll(String name){
        return userDao.getAll(name);
    }

    public User getUserByid(int id){
        return userDao.getUserByid(id);
    }

    public void  delete(int id){
        userDao.delete(id);
    }

    public void update(User p){
        userDao.update(p);
    }

    public void newp(User p){
        userDao.newp(p);
    }
}
