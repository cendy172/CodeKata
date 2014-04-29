package com.oo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class YardTest
{

	@Test
	public void shouldBeEqualWhenLengthAreSame()
	{
		Yard yard1 = new Yard(3);
		Yard yard2 = new Yard(3);

		assertThat(yard1, is(yard2));
	}

	@Test
	public void shouldNotEqualWhenLengthAreNotSame()
	{
		Yard yard1 = new Yard(3);
		Yard yard2 = new Yard(4);

		assertThat(yard1, not(yard2));
	}

	@Test
	public void shouldBeEqual1MileAnd1760Yard()
	{
		Length mile = new Mile(1);
		Length yard = new Yard(1760);

		assertThat(mile, is(yard));
	}

	@Test
	public void shouldNotBeEqual1MileAnd1760Yard()
	{
		Length mile = new Mile(1);
		Length yard = new Yard(1761);

		assertThat(mile, not(yard));
	}

}
