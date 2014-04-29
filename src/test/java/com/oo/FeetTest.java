package com.oo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class FeetTest
{

	@Test
	public void shouldBeEqualWhenLengthAreSame()
	{
		Feet mile1 = new Feet(3);
		Feet mile2 = new Feet(3);

		assertThat(mile1, is(mile2));
	}

	@Test
	public void shouldNotEqualWhenLengthAreNotSame()
	{
		Feet mile1 = new Feet(3);
		Feet mile2 = new Feet(4);

		assertThat(mile1, not(mile2));
	}

	@Test
	public void shouldBeEqual1YardAnd3Feet()
	{
		Length yard = new Yard(1);
		Length feet = new Feet(3);

		assertThat(yard, is(feet));
	}

	@Test
	public void shouldNotBeEqual1MileAnd1760Yard()
	{
		Length yard = new Yard(1);
		Length feet = new Feet(4);

		assertThat(yard, not(feet));
	}

}
