package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class ConfigFileReader {

        public static Properties props;

        public static void readPropertyFile(String configPath){
            try {
                props = new Properties();
                props.load(Files.newInputStream(Path.of(configPath)));
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }





