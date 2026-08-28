package com.chay.corejava.collections.map.properties;

import java.util.Properties;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EX00_Properties {
    public static void main(String[] args) throws IOException {
        // Properties is a subclass of Hashtable
        // It is used to maintain lists of values in which the key is a String and the
        // value is also a String.

        // Properties can be saved to a stream or loaded from a stream.

        // Properties can be used to maintain configuration data for an application.

        Properties props = new Properties();

        String propertiesPath = "src/main/java/com/chay/corejava/collections/map/properties/abc.properties";
        FileInputStream fis = new FileInputStream(propertiesPath);
        props.load(fis);
        System.out.println(props); // {CONNECTION_URL=jdbc:mysql://localhost:3306/mydatabase, PASSWORD=secret,
                                   // USER=Scott}

        String connectionUrl = props.getProperty("CONNECTION_URL");
        System.out.println("Connection URL: " + connectionUrl); // Connection URL:
                                                                // jdbc:mysql://localhost:3306/mydatabase

        props.setProperty("SSL", "cert/sf/xyz");
        System.out.println("Updated Properties: " + props); // Updated Properties:
                                                            // {CONNECTION_URL=jdbc:mysql://localhost:3306/mydatabase,
                                                            // PASSWORD=secret, USER=Scott, SSL=cert/sf/xyz}

        FileOutputStream fos = new FileOutputStream(propertiesPath);
        props.store(fos, "Updated SSL property");

    }
}
