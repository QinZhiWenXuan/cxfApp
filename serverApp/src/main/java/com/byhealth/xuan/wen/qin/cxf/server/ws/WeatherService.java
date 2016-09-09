package com.byhealth.xuan.wen.qin.cxf.server.ws;

import javax.jws.WebService;

/***
 * WeatherService<br>
 * 
 * @Remark 
 * 
 * @Date 2016年9月9日 上午11:00:18
 * @Author qinzhiwenxuan
 * @Email qinzhiwenxuan@gmail.com
 * @Version 1.0
 * @Address by-health
 */
@WebService
public interface WeatherService {
	String getWeather(String city);
}
