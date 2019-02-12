package com.leo.cyber.dojo05.qps;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class QPS {

	TimeService timeService;

	AtomicLong counter = new AtomicLong();

	private AtomicLong currentPeriod = new AtomicLong();

	/**
	 * 此接口每秒只可以被调用100次
	 * 
	 * @return 每秒调用超过100次时，会返回null
	 */
	public Date getNow() {
		if (isLimit()) {
			return null;
		} else {
			return timeService.getNow();
		}

	}

	private boolean isLimit() {
		long requestPeriod = getRequestPeriod();
		if (!isCurrentPeriod(requestPeriod)) {
			initCurrentPeriod(requestPeriod);
		}
		return counter.incrementAndGet() > 100;
	}

	private void initCurrentPeriod(long requestPeriod) {
		currentPeriod.set(requestPeriod);
		counter.set(0l);
	}

	private boolean isCurrentPeriod(long requestPeriod) {
		return currentPeriod.get() == requestPeriod;
	}

	private static long getRequestPeriod() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTimeInMillis();
	}
}
