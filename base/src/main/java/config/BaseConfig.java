package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BaseConfig {

    public static Properties properties;
    private static final File propertiesFile = new File(System.getProperty("user.dir") + File.separator + "src"
            + File.separator + "main" + File.separator + "resources" + File.separator + "config" + File.separator
            + "config.properties");

    public static Map<Object, String> databaseConfig() {
        try {
            properties = loadProperties();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        Map<Object, String> dbConfig = new HashMap<>();

        if (properties != null) {
            dbConfig.put(DBProperties.DRIVER_CLASS, properties.getProperty("MYSQLJDBC.driver"));
            dbConfig.put(DBProperties.HOST, properties.getProperty("MYSQLJDBC.host"));
            dbConfig.put(DBProperties.USER, properties.getProperty("MYSQLJDBC.username"));
            dbConfig.put(DBProperties.PASSWORD, properties.getProperty("MYSQLJDBC.password"));
        }

        return dbConfig;
    }

    private static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(propertiesFile);

        prop.load(fis);
        fis.close();

        return prop;
    }

    public enum DBProperties {
        DRIVER_CLASS, HOST, USER, PASSWORD
    }

}
