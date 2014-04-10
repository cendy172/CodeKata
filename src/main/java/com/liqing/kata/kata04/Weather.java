package com.liqing.kata.kata04;

import java.io.IOException;

public class Weather
{
	public static final int ID_COLUMN = 0;
	public static final int FIRST_COLUMN = 1;
	public static final int SECOND_COLUMN = 2;
	public static final CharSequence DIVIDING_LINE = "";
	private final ReadFile readFile;
	private Record smallestDiff;

	public Weather()
	{
		readFile = new ReadFile();
		smallestDiff = new Record("", "99", "0");
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
		for (int i = 1; i < rows.length; i++)
		{
			if (rows[i].trim().equals(DIVIDING_LINE))
			{
				continue;
			}
			Record record = setRecords(rows[i]);
			if (record.getSmallestDiff() < smallestDiff.getSmallestDiff())
			{
				smallestDiff = record;
			}
		}
		return smallestDiff.getId();
	}

	private Record setRecords(String row)
	{
		String[] cells = readFile.splitRow(row);
		return new Record(cells[ID_COLUMN], cells[FIRST_COLUMN], cells[SECOND_COLUMN]);
	}
}
