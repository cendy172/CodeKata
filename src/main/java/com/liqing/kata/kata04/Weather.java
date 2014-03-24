package com.liqing.kata.kata04;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Weather
{
	public String getSmallestTemperatureSpreadDate()
	{
		InputStream weatherData = getClass().getClassLoader().getResourceAsStream("weather.dat");
		String weather = "";
		try
		{
			weather = IOUtils.toString(weatherData, "UTF-8");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return "";
	}
}
