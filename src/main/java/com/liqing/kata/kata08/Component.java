package com.liqing.kata.kata08;

public class Component
{
	private String first;
	private String second;

	public Component(String first, String second)
	{
		this.first = first;
		this.second = second;
	}

	public String getFirst()
	{
		return first;
	}

	public String getSecond()
	{
		return second;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Component component = (Component) o;

		if (!first.equals(component.first))
			return false;
		if (!second.equals(component.second))
			return false;

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = first.hashCode();
		result = 31 * result + second.hashCode();
		return result;
	}
}
