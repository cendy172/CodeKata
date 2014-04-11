package com.liqing.kata.kata04;

public class Weather extends SmallestDiff
{
	private static final int ID_COLUMN = 0;
	private static final int FIRST_COLUMN = 1;
	private static final int SECOND_COLUMN = 2;

	public Weather()
	{
		super("weather.dat");
	}

	@Override
    protected Record setRecords(String[] cells)
	{
		return new Record(cells[ID_COLUMN], cells[FIRST_COLUMN], cells[SECOND_COLUMN]);
	}
}
