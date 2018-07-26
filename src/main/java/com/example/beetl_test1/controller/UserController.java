package com.example.beetl_test1.controller;

import com.example.beetl_test1.bean.User;
import com.example.beetl_test1.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:41
 */
@RestController

public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/user")
  public User getById(@RequestParam("id") Long id) {
    return userService.getById(id);
  }

  @GetMapping("/user/name")
  public List<User> getByName(@RequestParam("name") String name) {
    return userService.getByName(name);
  }
}
