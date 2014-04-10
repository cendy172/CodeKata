package com.liqing.kata.kata04;

import static java.lang.Math.abs;

public class Record
{

	private String id;
    private int smallestDiff;

	public Record(String id, String first, String second)
	{
		this.id = id;
        smallestDiff = getDifference(convertStringToInteger(first), convertStringToInteger(second));
	}

	public String getId()
	{
		return id;
	}

    public int getSmallestDiff() {
        return smallestDiff;
    }

	private int getDifference(int first1, int second1)
	{
		return abs(first1 - second1);
	}

	private Integer convertStringToInteger(String temperature)
	{
		return Integer.parseInt(temperature.replace("*", ""));
	}
}
