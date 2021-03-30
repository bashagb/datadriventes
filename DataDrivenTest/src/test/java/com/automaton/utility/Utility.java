package com.automaton.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public static Object fetchPropertyValue(String key) throws IOException
	{
		FileInputStream file= new FileInputStream("./config/config.properties");
		Properties prop= new Properties();
		prop.load(file);
		return prop.get(key);
	}
	
	public static String fetchLocatorValue(String key) throws IOException
	{
		FileInputStream file= new FileInputStream("./config/elements.properties");
		Properties property= new Properties();
		property.load(file);
		return property.get(key).toString();
	}
	
}
