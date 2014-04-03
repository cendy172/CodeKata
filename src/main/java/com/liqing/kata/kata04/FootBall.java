package com.liqing.kata.kata04;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FootBall
{

	private List<Record> footBallRecords;

	public FootBall()
	{
		footBallRecords = new ArrayList<Record>();
	}

	public String getSmallestDifferenceFAndATeamName()
	{
		String weather;
		try
		{
			weather = getWeatherAsString("football.dat");

		} catch (IOException e)
		{
			e.printStackTrace();
			return "";
		}
		return getSmallestDifference(getWeatherRecords(weather));
	}

	private String getSmallestDifference(String[] rows)
	{
		int minIndex = 0;
		for (int i = 1; i < rows.length; i++)
		{
			if (rows[i].trim().equals(""))
			{
				continue;
			}
			Record footBallRecord = setRecords(rows[i]);
			footBallRecords.add(footBallRecord);
			if (footBallRecords.get(minIndex).getDifference() > footBallRecord.getDifference())
			{
				minIndex = i - 2;
			}
		}
		return footBallRecords.get(minIndex).getId();
	}

	private Record setRecords(String row)
	{
		String[] record = row.trim().split("\\s+");

		Record footBallRecord = new Record();
		footBallRecord.setId(record[1]);
		footBallRecord.setFirst(record[6]);
		footBallRecord.setSecond(record[8]);
		return footBallRecord;
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
