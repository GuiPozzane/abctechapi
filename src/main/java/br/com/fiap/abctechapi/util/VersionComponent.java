package br.com.fiap.abctechapi.util;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class VersionComponent {
    private Properties properties;
    public VersionComponent()  throws IOException{
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.yml");
        properties.load(inputStream);
    }
    public String GetVersion() {

        var name = properties.get("build_name");
        var version = properties.get("build_version");
        return name + " - " + version;
    }
}
