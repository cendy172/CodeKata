package com.liqing.kata.binarysearch;

import java.util.ArrayList;

import static com.liqing.kata.binarysearch.EqualUtils.isEqual;
import static com.liqing.kata.binarysearch.EqualUtils.isGreater;

public class BinarySearchDayTwo
{
	private ArrayList<Integer> source;

	public int chop(int target, ArrayList<Integer> source)
	{
		this.source = source;
		return chop(0, source.size() - 1, target);
	}

	private int chop(int low, int high, int target)
	{
		return isBreak(low, high) ? -1 : getTargetIndex(low, high, target);
	}

	private boolean isBreak(int low, int high)
	{
		return high < low;
	}

	private int getTargetIndex(int low, int high, int target)
	{
		int midIndex = getMidIndex(low, high);
		int mid = source.get(midIndex);

		if (isEqual(mid, target))
		{
			return midIndex;
		} else if (isGreater(mid, target))
		{
			return chop(low, midIndex - 1, target);
		} else
		{
			return chop(midIndex + 1, high, target);
		}
	}

	private int getMidIndex(int low, int high)
	{
		return (low + high) / 2;
	}
}
