package com.bj.basic;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperites {

    public String getProperty(String key) throws IOException {
        Properties props = new Properties();
        try {
            InputStream is = ReadProperites.class.getResourceAsStream("/config.properties");
            props.load(is);
        }catch (Exception e){
            e.printStackTrace();
        }
        return props.getProperty(key);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new ReadProperites().getProperty("Backend_URL"));
    }

}
