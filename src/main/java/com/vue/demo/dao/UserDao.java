package com.vue.demo.dao;

import com.vue.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserDao {
    /*
    列表清单
    return List<User>
     */
    List<User> getAll(String name);

    /*
    根据ID查询
    {name} 要查询人员的 name
     */
    User getUserByid(int id);

    /*
    删除
    {id} 要删除人员的 id
     */
    void delete(int id);

    /*
    更新
    {u} 要更新的Person实例
     */
    void update(User u);

    /*
    增加
    {u} 要新增的Person实例
     */
    void newp(User u);
}
