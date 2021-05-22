package com.atguigu.webfluxdemo1.service.impl;

import com.atguigu.webfluxdemo1.entity.User;
import com.atguigu.webfluxdemo1.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/22-20:52
 */
@Repository
public class UserServiceImpl implements UserService {

    //创建map集合存储数据
    private final Map<Integer, User> users = new HashMap<>();


    public UserServiceImpl() {
        this.users.put(1, new User("lucy", "man", 20));
        this.users.put(2, new User("lucy2", "man", 21));
        this.users.put(3, new User("lucy3", "man", 22));
    }

    //根据id查询
    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }
    //查询所有
    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(users.values());
    }

    //添加用户
    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person->{
            //向map集合放值
            int id = users.size()+1;
            users.put(id, person);
        }).thenEmpty(Mono.empty());
    }
}
