package com.liqing.kata.kata04;

import static java.lang.Math.abs;

public class Record
{

	private String id;
	private int first;
	private int second;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public void setFirst(String first)
	{
		this.first = convertStringToInteger(first);
	}

	public void setSecond(String second)
	{
		this.second = convertStringToInteger(second);
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
