package Singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigClass {

    private static volatile ConfigClass configClass;
    private static Map <String , String> configMap = new HashMap<>();

    private ConfigClass() {

        configMap.put("application.name" , "cclarke");
        configMap.put("db.host" , "cclarke.net");
        configMap.put("db.pass" , "admin123");
    }

    public static ConfigClass getInstance() {

        if (configClass == null ) {

           synchronized (ConfigClass.class) {
               if (configClass == null) {
                   configClass = new ConfigClass();
               }
           }
        }

        return configClass;
    }

    public String getConfigValue(String key) {

        return configMap.getOrDefault(key , " ");
    }
}
