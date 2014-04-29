package com.liqing.kata.kata08;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConflictingObjectivesTest
{

	private ConflictingObjectives conflictingObjectives;

	@Before
	public void setUp()
	{
		conflictingObjectives = new ConflictingObjectives();
	}

	@Test
	public void shouldGetAllConflictingObjectives()
	{
		Component component = new Component("al", "bums");

		List<Component> albums = conflictingObjectives.getAllConflictingObjectives("albums");

		assertThat(albums.size(), is(3));
		assertThat(albums.get(0), is(component));
	}
}
