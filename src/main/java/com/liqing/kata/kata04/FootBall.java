package com.liqing.kata.kata04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FootBall
{

	private final ReadFile readFile;
	private List<Record> footBallRecords;

	public FootBall()
	{
		footBallRecords = new ArrayList<Record>();
		readFile = new ReadFile();
	}

	public String getSmallestDifferenceFAndATeamName()
	{
		String[] weather;
		try
		{
			weather = readFile.getRows("football.dat");

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
		String[] columns = readFile.splitRow(row);

		Record footBallRecord = new Record();
		footBallRecord.setId(columns[1]);
		footBallRecord.setFirst(columns[6]);
		footBallRecord.setSecond(columns[8]);
		return footBallRecord;
	}

}
