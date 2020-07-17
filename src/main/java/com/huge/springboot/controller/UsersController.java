package com.huge.springboot.controller;

import com.huge.springboot.entity.Users;
import com.huge.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * @Desc:
 * @aut
 * hor:huge
 * @create:2020-07-16 0:40
 */
@Controller
public class UsersController {

    @Autowired
    public UserService userService;
    //查询所有用户
    @RequestMapping("findAllUser")
    public String findAllUser(Model model){
        List<Users> user = userService.findAllUser();
        model.addAttribute("userList",user);
        return "user";
    }
    //跳转到添加用户页面
    @RequestMapping("toAdd")
    public String toAdd(@ModelAttribute("users") Users users){
        return "add";
    }
    //添加用户信息

    /***
     *
     * @param users
     * @param result
     * @return
     * @valid开启对Users对象的数据校验
     * BindingResult：封装了校验的结果
     *
     */
    @RequestMapping("addUser")
    public String addUser(@ModelAttribute("users") @Valid Users users, BindingResult result){
        if(result.hasErrors()){
            return "add";
        }
        return userService.addUser(users)>0?"redirect:findAllUser":"redirect:toAdd";
    }
}
