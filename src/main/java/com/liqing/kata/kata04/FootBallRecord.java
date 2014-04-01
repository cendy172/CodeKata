package com.liqing.kata.kata04;

import static java.lang.Math.abs;

public class FootBallRecord
{

	private String teamName;
	private int scoredFor;
	private int against;
	private int difference;

	public String getTeamName()
	{
		return teamName;
	}

	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}

	public int getScoredFor()
	{
		return scoredFor;
	}

	public void setScoredFor(String scoredFor)
	{
		this.scoredFor = convertStringToInteger(scoredFor);
	}

	public int getAgainst()
	{
		return against;
	}

	public void setAgainst(String against)
	{
		this.against = convertStringToInteger(against);
	}

	public int getDifference()
	{
		return this.difference == 0 ? abs(scoredFor - against) : this.difference;
	}

	public void setDifference(int difference)
	{
		this.difference = difference;
	}

	private Integer convertStringToInteger(String temperature)
	{
		return Integer.parseInt(temperature.replace("*", ""));
	}
}
