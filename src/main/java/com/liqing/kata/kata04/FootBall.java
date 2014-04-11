package com.liqing.kata.kata04;

public class FootBall extends SmallestDiff
{

	private static final int ID_COLUMN = 1;
	private static final int FIRST_COLUMN = 6;
	private static final int SECOND_COLUMN = 8;

	public FootBall()
	{
		super("football.dat");
	}

	@Override
	protected Record setRecords(String[] cells)
	{
		return new Record(cells[FootBall.ID_COLUMN], cells[FootBall.FIRST_COLUMN], cells[FootBall.SECOND_COLUMN]);
	}

}
