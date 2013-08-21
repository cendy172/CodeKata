package com.liqing.CodeKata.BinarySearch;

import java.util.ArrayList;

import com.liqing.CodeKata.EqualUtils;

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
		if (high < low)
		{
			return -1;
		}

		int midIndex = (low + high) / 2;
		int mid = this.source.get(midIndex);

		if (EqualUtils.isEqual(mid, target))
		{
			return midIndex;
		} else if (EqualUtils.isGreater(mid, target))
		{
			return chop(low, midIndex - 1, target);
		} else
		{
			return chop(midIndex + 1, high, target);
		}
	}
}
