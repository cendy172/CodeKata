package com.liqing.kata.kata04;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class Weather
{

	private List<Record> records;

	public Weather()
	{
		records = new ArrayList<Record>();
	}

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
		return getSmallestSpread(getWeatherRecords(weather));
	}

	private String getSmallestSpread(String[] rows)
	{
		int minIndex = 0;
		for (int i = 2; i < rows.length; i++)
		{
			Record record = setRecords(rows[i]);
			records.add(record);
			if (records.get(minIndex).getDifference() > record.getDifference())
			{
				minIndex = i - 2;
			}
		}
		return records.get(minIndex).getId();
	}

	private Record setRecords(String row)
	{
		String[] record = row.trim().split("\\s+");

		Record weatherRecord = new Record();
		weatherRecord.setId(record[0]);
		weatherRecord.setFirst(record[1]);
		weatherRecord.setSecond(record[2]);
		return weatherRecord;
	}

	private String[] getWeatherRecords(String weather)
	{
		return weather.split("\n");
	}

	private String getWeatherAsString(String source) throws IOException
	{
		InputStream weatherData = getClass().getClassLoader().getResourceAsStream(source);
		return IOUtils.toString(weatherData, "UTF-8");
	}
}
