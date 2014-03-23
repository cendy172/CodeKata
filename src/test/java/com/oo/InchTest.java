package com.oo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class InchTest
{

	@Before
	public void setUp()
	{

	}

	@Test
	public void shouldBeEqualWhenLengthAreSame()
	{
		Inch inch1 = new Inch(3);
		Inch inch2 = new Inch(3);

		assertThat(inch1, is(inch2));
	}

	@Test
	public void shouldNotEqualWhenLengthAreNotSame()
	{
		Inch inch1 = new Inch(3);
		Inch inch2 = new Inch(4);

		assertThat(inch1, not(inch2));
	}

	@Test
	public void shouldBeEqual1YardAnd3Feet()
	{
		Length feet = new Feet(1);
		Length inch = new Inch(12);

		assertThat(feet, is(inch));
	}

	@Test
	public void shouldNotBeEqual1MileAnd1760Yard()
	{
		Length feet = new Feet(1);
		Length inch = new Inch(13);

		assertThat(feet, not(inch));
	}

	@After
	public void tearDown()
	{

	}
}
