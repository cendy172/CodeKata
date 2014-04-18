package com.liqing.kata.kata05;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SpellCheckTest
{

	private SpellCheck spellCheck;

	@Before
	public void setUp()
	{
		spellCheck = new SpellCheck();
	}

	@Test
	public void shouldBeCorrectWord()
	{
		boolean isCorrect = spellCheck.checkSpell("word");

		assertThat(isCorrect, is(true));
	}

	@Test
	public void shouldBeIncorrectWord()
	{
		boolean isCorrect = spellCheck.checkSpell("2");

		assertThat(isCorrect, is(false));
	}
}
