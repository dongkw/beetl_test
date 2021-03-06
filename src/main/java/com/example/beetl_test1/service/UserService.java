package com.example.beetl_test1.service;

import com.example.beetl_test1.bean.User;
import com.example.beetl_test1.dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:38
 */
@Service
public class UserService {

  @Autowired
  private UserDao userDao;

  public User getById(Long id) {
    return userDao.unique(id);
  }

  public List<User> getByName(String name) {
    return userDao.getByName(name);
  }
}
