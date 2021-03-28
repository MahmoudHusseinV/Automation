package Utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class PropertiesReader {

    static Properties properties;
    static String updatedMail;
    boolean generated=false;

    public PropertiesReader() {
        properties = new Properties();
        InputStream stream = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getEmail(){
        return properties.getProperty("email");
    }

    public String getPassword(){
        return properties.getProperty("password");
    }

    public static void generateupdatedEmail()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        updatedMail = properties.getProperty("emailregistration").substring(0, 4)
                + String.valueOf(randomNum) + properties.getProperty("emailregistration").substring(4);
        properties.setProperty("emailregistration",updatedMail);
        try {
            properties.store(new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties"), null);
            reloadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void reloadProperties()
    {
        properties = new Properties();
        InputStream stream = PropertiesReader.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getmailtoberegistered()
    {
           return  properties.getProperty("emailregistration");
    }

    public String getURL(){
        return properties.getProperty("url");
    }

    public static int getTimeOut(){
        return Integer.parseInt(properties.getProperty("waitTimeOut"));
    }
    public String getfirstname(){ return properties.getProperty("Firstname");}
    public String getlastname(){return properties.getProperty("Lastname");}
    public String getPasswordregistration(){return properties.getProperty("Passwordregistration");}
    public String getCity(){return properties.getProperty("City");}
    public String getZipCode(){return properties.getProperty("ZipCode");}
    public String getphone(){return properties.getProperty("phone");}
    public String getanotheraddress(){return properties.getProperty("anotheraddress");}
    public String getAddress(){return properties.getProperty("Address");}
    public String getAccountName(){return properties.getProperty("AccountName");}



}
