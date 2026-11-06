package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input =
                     ConfigReader.class.getClassLoader()
                                       .getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new IllegalStateException(
                    "config.properties was not found on the classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}