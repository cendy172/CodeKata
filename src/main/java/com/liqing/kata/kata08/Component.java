package com.liqing.kata.kata08;

public class Component
{
	private final String first;
	private final String second;

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
        return second.equals(component.second);

    }

	@Override
	public int hashCode()
	{
		int result = first.hashCode();
		result = 31 * result + second.hashCode();
		return result;
	}
}
