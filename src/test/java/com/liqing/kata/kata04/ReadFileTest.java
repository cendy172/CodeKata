package com.liqing.kata.kata04;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReadFileTest
{

	@Test
	public void shouldGetRows() throws IOException
	{
		ReadFile readFile = new ReadFile();

		String[] rows = readFile.getRows("weather.dat");

		assertThat(rows.length, is(4));
	}
}
