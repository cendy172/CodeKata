package com.liqing.kata.kata08;

import java.util.ArrayList;
import java.util.List;

import static com.liqing.kata.support.Dictionary.isInDictionary;

public class ConflictingObjectives
{

	public List<Component> getAllConflictingObjectives(String source)
	{
		ArrayList<Component> results = new ArrayList<Component>();
		for (int i = 1; i < source.length(); i++)
		{
			String first = source.substring(0, i);
			if (isInDictionary(first))
			{
				String second = source.substring(i, source.length());
				if (isInDictionary(second))
				{
					results.add(new Component(first, second));
				}
			}
		}
		return results;
	}
}
