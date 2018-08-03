package com.example.beetl_test1.service.WeatherData.test;

import com.example.beetl_test1.service.WeatherData.WeatherDate;
import com.example.beetl_test1.service.WeatherData.board.CurrentConditionsDisplay;
import com.example.beetl_test1.service.WeatherData.board.StatisticsDisplay;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午6:03
 */
public class WeatherStation {

  public static void main(String[] args) {
    WeatherDate weatherDate = new WeatherDate();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDate);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDate);
    weatherDate.setMeasurements(1, 2.0f, 3);
  }
}
