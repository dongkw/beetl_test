package com.example.beetl_test1.dao;

import com.example.beetl_test1.bean.User;
import java.util.List;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:33
 */
@SqlResource("user")
public interface UserDao extends BaseMapper<User> {

  List<User> getByName(@Param("name") String name);
}
