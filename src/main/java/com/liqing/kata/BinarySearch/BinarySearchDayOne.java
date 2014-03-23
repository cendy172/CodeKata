package com.liqing.kata.binarysearch;

import java.util.List;

public class BinarySearchDayOne
{

	public int chop(int destination, List<Integer> source)
	{
		int low = 0, high = source.size() - 1;
		for (int i = high; low <= high; i = (low + high) / 2)
		{
			if (EqualUtils.isEqual(destination, source.get(i)))
			{
				return i;
			} else if (EqualUtils.isGreater(destination, source.get(i)))
			{
				low = nextIndex(i);
			} else
			{
				high = previousIndex(i);
			}
		}
		return -1;
	}

	private int nextIndex(int i)
	{
		return i + 1;
	}

	private int previousIndex(int i)
	{
		return i - 1;
	}

}
