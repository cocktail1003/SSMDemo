package com.coc.controller;

import com.coc.entity.UserEntity;
import com.coc.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * Name:UserController
 * Description:
 * Author:yangxiaocui
 * Time: 2018/5/30 16:34
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserJpa userJpa;

    @RequestMapping(value = "/login")
    public String login(UserEntity user, HttpServletRequest request) {
        boolean flag = true;
        String result = "登录成功";
        //根据用户名查询用户是否存在
        Optional<UserEntity> userEntity = userJpa.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                query.where(criteriaBuilder.equal(root.get("name"), user.getName()));
                return null;
            }
        });
        //用户不存在
        if (userEntity.get() == null){
            flag = false;
            result = "用户不存在，登录失败";
        }else if (!userEntity.get().getPassword().equals(user.getPassword())){
            flag = false;
            result = "密码错误，登录失败";
        }
        if (flag){
            //将用户写入session中
            request.getSession().setAttribute("_session_user",userEntity);
        }
            return result;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<UserEntity> getUser() {
        return userJpa.findAll();
    }

    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public List<UserEntity> addUser(UserEntity userEntity) {
        userJpa.saveAndFlush(userEntity);
        return userJpa.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public List<UserEntity> delUser(Long id) {
        userJpa.deleteById(id);
        return userJpa.findAll();
    }


}
