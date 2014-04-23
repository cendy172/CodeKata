package com.liqing.kata.kata05;

import static com.liqing.kata.support.Dictionary.isInDictionary;

public class SpellCheck
{
	public boolean checkSpell(String target)
	{
		return isInDictionary(target);
	}
}
