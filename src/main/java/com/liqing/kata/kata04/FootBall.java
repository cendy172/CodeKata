package com.liqing.kata.kata04;

import java.io.IOException;

public class FootBall
{

	public static final int ID_COLUMN = 1;
	public static final int FIRST_COLUMN = 6;
	public static final int SECOND_COLUMN = 8;
	public static final String DIVIDING_LINE = "-------------------------------------------------------";
	private final ReadFile readFile;
	private Record smallestDiff;

	public FootBall()
	{
		smallestDiff = new Record("", "99", "0");
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
		for (int i = 1; i < rows.length; i++)
		{
			if (rows[i].trim().contains(DIVIDING_LINE))
			{
				continue;
			}
			Record footBallRecord = setRecords(rows[i]);
			if (footBallRecord.getSmallestDiff() < smallestDiff.getSmallestDiff())
			{
				smallestDiff = footBallRecord;
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
