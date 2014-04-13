package com.liqing.kata.kata04;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RecordTest
{

	@Test
	public void shouldGetAbsoluteDiffIfFirstLessThanSecond()
	{
		Record record = new Record("id", "1", "2");

		assertThat(record.getSmallestDiff(), is(1));
	}

	@Test
	public void shouldGetAbsoluteDiff()
	{
		Record record = new Record("id", "2", "1");

		assertThat(record.getSmallestDiff(), is(1));
	}

	@Test
	public void shouldIgnoreStartMark()
	{
		Record record = new Record("id", "2*", "1*");

		assertThat(record.getSmallestDiff(), is(1));
	}
}
