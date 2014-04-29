package com.liqing.kata.kata04;

import java.io.IOException;

public abstract class SmallestDiff
{
	private static final String DIVIDING_LINE = "-------------------------------------------------------";
	private static final String BLANK = "";
	private Record smallestDiff;
	private final ReadFile readFile;
	private final String fileName;

	public SmallestDiff(String fileName)
	{
		smallestDiff = new Record("", "99", "0");
		readFile = new ReadFile();
		this.fileName = fileName;
	}

	public String getSmallestDifferenceId()
	{
		String[] weather;
		try
		{
			weather = readFile.getRows(fileName);

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
			String row = rows[i].trim();
			if (row.contains(DIVIDING_LINE) || row.equals(BLANK))
			{
				continue;
			}
			String[] cells = readFile.splitRow(row);
			Record footBallRecord = setRecords(cells);
			if (footBallRecord.getSmallestDiff() < smallestDiff.getSmallestDiff())
			{
				smallestDiff = footBallRecord;
			}
		}
		return smallestDiff.getId();
	}

	protected abstract Record setRecords(String[] row);
}
