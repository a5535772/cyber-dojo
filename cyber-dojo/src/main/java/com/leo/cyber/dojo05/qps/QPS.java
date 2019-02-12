package com.leo.cyber.dojo05.qps;

import java.util.Date;

public class QPS {

	TimeService timeService;


	/**
	 * 此接口每秒只可以被调用100次
	 * @return 每秒调用超过100次时，会返回null
	 */
	public Date getNow() {
		return timeService.getNow();
	}
}
