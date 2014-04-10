package com.liqing.kata.kata04;

import static java.lang.Math.abs;

public class Record
{

	private String id;
	private int first;
	private int second;

	public Record(String id, String first, String second)
	{
		this.id = id;
		this.first = convertStringToInteger(first);
		this.second = convertStringToInteger(second);
	}

	public String getId()
	{
		return id;
	}

	public int getDifference()
	{
		return abs(first - second);
	}

	private Integer convertStringToInteger(String temperature)
	{
		return Integer.parseInt(temperature.replace("*", ""));
	}
}
