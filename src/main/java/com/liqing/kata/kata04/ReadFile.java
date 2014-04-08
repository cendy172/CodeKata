package com.liqing.kata.kata04;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class ReadFile {

    public String[] getRows(String source) throws IOException
    {
        InputStream weatherData = getClass().getClassLoader().getResourceAsStream(source);
        return IOUtils.toString(weatherData, "UTF-8").split("\n");
    }
}
