package com.liqing.kata.kata04;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FootBallTest
{
	@Test
	public void shouldGetTheNameOfSmallestDifferenceBetweenFAndA()
	{
		FootBall footBall = new FootBall();
		String teamName = footBall.getSmallestDifferenceFAndATeamName();

		assertThat(teamName, is("Liverpool"));
	}
}
