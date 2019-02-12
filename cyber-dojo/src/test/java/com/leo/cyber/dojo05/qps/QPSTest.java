package com.leo.cyber.dojo05.qps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QPSTest {

	private static final Long OneSeconed = 1000l;

	@InjectMocks
	QPS sut;

	@Mock
	TimeService timeService;

	@Test
	public void when_getNow_100_times_in_one_second_willpass() throws Exception {
		int oneHundred = 100;
		// given
		long start = System.currentTimeMillis();
		given(timeService.getNow()).willCallRealMethod();
		// when

		for (int i = 0; i < oneHundred; i++) {
			sut.getNow();
		}

		long end = System.currentTimeMillis();
		// then
		assertThat(end - start).isLessThan(OneSeconed);
		verify(timeService, times(oneHundred)).getNow();
	}

	@Test
	public void when_getNow_101_times_in_one_second_will_not_pass() throws Exception {
		int oneHundred = 100;
		int oneHundredAndOne = 101;
		List<Date> dateList=new ArrayList<>();
		// given
		long start = System.currentTimeMillis();
		given(timeService.getNow()).willCallRealMethod();
		// when

		for (int i = 0; i < oneHundredAndOne; i++) {
			dateList.add(sut.getNow());
		}

		long end = System.currentTimeMillis();
		// then
		assertThat(end - start).isLessThan(OneSeconed);
		verify(timeService, times(oneHundred)).getNow();
		assertThat(dateList.size()).isEqualTo(oneHundredAndOne);
		assertThat(getRandomDateButNotTheLastOneFromDateList(dateList)).isNotNull();
		assertThat(getLastDateOfTheList(dateList)).isNull();
	}

	private Date getRandomDateButNotTheLastOneFromDateList(List<Date> dateList) {
		Random random=new Random();
		return dateList.get(random.nextInt(dateList.size()-1));
	}

	private Date getLastDateOfTheList(List<Date> dataList) {
		return dataList.get(dataList.size()-1);
	}
	
}
