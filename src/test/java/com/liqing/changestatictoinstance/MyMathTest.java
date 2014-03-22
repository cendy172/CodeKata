package com.liqing.changestatictoinstance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyMathTest
{

	@Test
	public void shouldAddTwoInteger()
	{
		assertThat(new MyMath().add(1, 2), is(3));
	}
}
