package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;
	
	static {
	
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream("D:\\Skills\\Eclipse-Workspace-New\\selenium-framework\\src\\main\\resources\\config.properties");
			properties.load(fis);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}
