package com.example.beetl_test1.bean;

import javax.persistence.Column;
import javax.persistence.Table;
import lombok.Data;
import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.annotatoin.AutoID;


/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:35
 */
@Data
@Table(name = "user")
public class User {

  @AutoID
  private Long id;
  private String name;
  private String pwd;
  @Column(name = "dept_id")
  private Long deptId;
}
