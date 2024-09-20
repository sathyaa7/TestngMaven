package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationUtility {
    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/java/resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}

