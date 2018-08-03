package com.example.beetl_test1.service.WeatherData.observer;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午5:36
 */
public interface Observer {

  public void update(float temp, float humidity, float pressure);
}
