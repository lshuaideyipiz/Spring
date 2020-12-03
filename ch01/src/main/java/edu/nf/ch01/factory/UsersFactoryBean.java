package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

/**
 * @author LZ
 * @date 2020/11/30
 * 创建一个自定义工厂给Spring，Spring就会根据这个工厂来创建Bean对象，这个自定义工厂本身也会纳入Spring容器中管理
 * 因此命名通常都是XxxFactoryBean
 */
public class UsersFactoryBean {

    public Users build(){
        return new Users();
    }

}
