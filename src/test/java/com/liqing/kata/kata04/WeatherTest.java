package com.liqing.kata.kata04;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WeatherTest
{

	private Weather weather;

	@Before
	public void setUp()
	{
		weather = new Weather();
	}

	@Test
	public void shouldGetTheSmallestTemperatureSpreadDateSuccessfully()
	{
		String date = weather.getSmallestTemperatureSpreadDate();

		assertThat(date, is("2"));
	}
}
