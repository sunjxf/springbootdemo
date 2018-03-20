package com.swsun.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swsun.springboot.dao.CategoryDAO;
import com.swsun.springboot.mapper.UserMapper;
import com.swsun.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/listUser")
    public String listUser(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "3") int size) throws Exception {
        PageHelper.startPage(start, size, "id desc");
        List<User> cs = userMapper.findAll();
        PageInfo<User> page = new PageInfo<>(cs);
        m.addAttribute("page", page);
        return "listUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User u) throws Exception {
        userMapper.save(u);
        return "redirect:listUser";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(User u) throws Exception {
        userMapper.delete(u.getId());
        return "redirect:listUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User u) throws Exception {
        userMapper.update(u);
        return "redirect:listUser";
    }

    @RequestMapping("/editUser")
    public String editUser(int id, Model m) throws Exception {
        User u = userMapper.get(id);
        m.addAttribute("c", u);
        return "editUser";
    }
}
