package com.liqing.kata.support;

import com.liqing.kata.kata05.SpellCheck;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class Dictionary
{
	public static HashMap<String, String> dictionary;

	private static MessageDigest md5;

	static
	{
		dictionary = new HashMap<String, String>();

		try
		{
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		try
		{
			InputStream wordListStream = SpellCheck.class.getClassLoader().getResourceAsStream("wordlist.txt");
			String wordList = IOUtils.toString(wordListStream);
			String[] words = wordList.trim().split("\n");
			for (String word : words)
			{
				String wordTrimmed = word.trim();
				dictionary.put(md5(wordTrimmed), wordTrimmed);
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public Dictionary()
	{
	}

	public static boolean isInDictionary(String target)
	{
		String key = md5(target);
		return dictionary.containsKey(key) && dictionary.get(key).equals(target);
	}

	private static String md5(String source)
	{
		byte[] digest = md5.digest(source.getBytes());
		BigInteger bigInteger = new BigInteger(1, digest);
		return bigInteger.toString(16);
	}

}
