package com.liqing.CodeKata.BinarySearch;

import java.util.List;

/**
 * User: LiQing Date: 8/6/13 Time: 7:37 PM
 */
public class BinarySearchDayOne
{

	public boolean isEqual(int number1, int number2)
	{
		return number1 == number2;
	}

	public Boolean isGreater(int number1, int number2)
	{
		return number1 > number2;
	}

	public int chop(int destination, List<Integer> source)
	{
		int low = 0, high = source.size() - 1;
		for (int i = high; low <= high; i = (low + high) / 2)
		{
			if (isEqual(destination, source.get(i)))
			{
				return i;
			} else if (isGreater(destination, source.get(i)))
			{
				low = i + 1;
			} else
			{
				high = i - 1;
			}
		}
		return -1;
	}

}
