package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
    static Properties properties;
    static {// static blok herseyden once calisir
        String dosyaYolu= "configuration.properties";
        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);
            properties= new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("properties dosyasi okunamadi");
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}

/*
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/reyhany/team01_testNG.git
git push -u origin main
 */