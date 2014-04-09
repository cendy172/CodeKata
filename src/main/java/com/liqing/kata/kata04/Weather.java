package com.liqing.kata.kata04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Weather
{

	private final ReadFile readFile;
	private List<Record> records;

	public Weather()
	{
		records = new ArrayList<Record>();
		readFile = new ReadFile();
	}

	public String getSmallestTemperatureSpreadDate()
	{
		String[] weather;
		try
		{
			weather = readFile.getRows("weather.dat");

		} catch (IOException e)
		{
			e.printStackTrace();
			return "";
		}
		return getSmallestSpread(weather);
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
		String[] record = readFile.splitRow(row);

		Record weatherRecord = new Record();
		weatherRecord.setId(record[0]);
		weatherRecord.setFirst(record[1]);
		weatherRecord.setSecond(record[2]);
		return weatherRecord;
	}
}
