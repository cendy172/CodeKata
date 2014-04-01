package com.liqing.kata.kata04;

import static java.lang.Math.abs;

public class WeatherRecord
{

	private String date;
	private int maxT;
	private int minT;
	private int temperatureSpread;

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public void setMaxT(String maxT)
	{
		this.maxT = convertStringToInteger(maxT);
	}

	public void setMinT(String minT)
	{
		this.minT = convertStringToInteger(minT);
	}

	public int getTemperatureSpread()
	{
		return this.temperatureSpread == 0 ? abs(maxT - minT) : this.temperatureSpread;
	}

	private Integer convertStringToInteger(String temperature)
	{
		return Integer.parseInt(temperature.replace("*", ""));
	}
}
