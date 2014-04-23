package com.liqing.kata.support;

import org.junit.Test;

import static com.liqing.kata.support.Dictionary.isInDictionary;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DictionaryTest
{

	@Test
	public void shouldInDictionary()
	{
		assertThat(isInDictionary("word"), is(true));
	}

	@Test
	public void shouldNotInDictionary()
	{
		assertThat(isInDictionary(""), is(false));
	}
}
