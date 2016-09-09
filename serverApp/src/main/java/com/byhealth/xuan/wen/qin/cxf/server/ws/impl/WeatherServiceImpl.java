package com.byhealth.xuan.wen.qin.cxf.server.ws.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.byhealth.xuan.wen.qin.cxf.server.ws.WeatherService;

/***
 * WeatherServiceImpl<br>
 * 
 * @Remark
 * 
 * @Date 2016年9月9日 上午11:00:56
 * @Author qinzhiwenxuan
 * @Email qinzhiwenxuan@gmail.com
 * @Version 1.0
 * @Address by-health
 */
@WebService(endpointInterface = "com.byhealth.xuan.wen.qin.cxf.server.ws.WeatherService", 
serviceName = "weatherService",
name="weatherService")
public class WeatherServiceImpl implements WeatherService {
	private static final Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class) ;
	@Override
	public String getWeather(String city) {
		logger.debug("WeatherServiceImpl.getWeather | city : {}" , city);
		return "WeatherServiceImpl.getWeather | city : " + city ;
	}

}
