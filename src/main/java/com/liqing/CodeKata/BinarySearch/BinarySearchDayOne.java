package com.liqing.CodeKata.BinarySearch;

import java.util.List;

import com.liqing.CodeKata.EqualUtils;

/**
 * User: LiQing Date: 8/6/13 Time: 7:37 PM
 */
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
				low = i + 1;
			} else
			{
				high = i - 1;
			}
		}
		return -1;
	}

}
