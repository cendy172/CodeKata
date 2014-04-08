package com.liqing.kata.kata04;

import java.io.IOException;
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
		String[] weather;
		try
		{
			weather = new ReadFile().getRows("football.dat");

		} catch (IOException e)
		{
			e.printStackTrace();
			return "";
		}
		return getSmallestDifference(weather);
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
		String[] columns = row.trim().split("\\s+");

		Record footBallRecord = new Record();
		footBallRecord.setId(columns[1]);
		footBallRecord.setFirst(columns[6]);
		footBallRecord.setSecond(columns[8]);
		return footBallRecord;
	}

}
