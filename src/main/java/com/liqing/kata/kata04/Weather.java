package com.liqing.kata.kata04;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class Weather
{
	public String getSmallestTemperatureSpreadDate()
	{
		String weather;
		try
		{
			weather = getWeatherAsString("weather.dat");

		} catch (IOException e)
		{
			e.printStackTrace();
			return "";
		}

		List<WeatherRecord> weatherRecords = new ArrayList<WeatherRecord>();

		int minIndex = 0;
		String[] rows = weather.split("\n");

		for (int i = 2; i < rows.length; i++)
		{
			String[] record = rows[i].trim().split("\\s+");

			WeatherRecord weatherRecord = new WeatherRecord();
			weatherRecord.setDate(record[0]);
			weatherRecord.setMaxT(record[1]);
			weatherRecord.setMinT(record[2]);
			weatherRecords.add(weatherRecord);

			if (weatherRecords.get(minIndex).getTemperatureSpread() > weatherRecord.getTemperatureSpread())
			{
				minIndex = i - 2;
			}
		}
		return weatherRecords.get(minIndex).getDate();
	}

	private String getWeatherAsString(String source) throws IOException
	{
		InputStream weatherData = getClass().getClassLoader().getResourceAsStream(source);
		return IOUtils.toString(weatherData, "UTF-8");
	}
}
