package com.liqing.kata.kata04;

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

	public String getMaxT()
	{
		return String.valueOf(maxT);
	}

	public void setMaxT(String maxT)
	{
		this.maxT = convertStringToInteger(maxT);
	}

	public int getMinT()
	{
		return minT;
	}

	public void setMinT(String minT)
	{
		this.minT = convertStringToInteger(minT);
	}

	public int getTemperatureSpread()
	{
		return this.temperatureSpread == 0 ? maxT - minT : this.temperatureSpread;
	}

	private Integer convertStringToInteger(String temperature)
	{
		return Integer.parseInt(temperature.replace("*", ""));
	}
}
