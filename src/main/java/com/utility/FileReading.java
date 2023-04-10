package com.utility;

import com.constants.Constant;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileReading {

    public Map<String, String> readEnvironment(String env) {
        Properties p = new Properties();
        Map<String, String> data = new HashMap<String, String>();
        try {
            File f = new File(Constant.pathTestResources + "\\Environment" + Constant.env + "\\env.properties");
            FileInputStream fis = new FileInputStream(f);
            p.load(fis);
            for(Map.Entry e : p.entrySet()){
                data.put((String) e.getKey(),(String) e.getValue());
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }return data;
    }

    public Map<String,String> readUserProperties(String user){
        Map<String,String> userData = new HashMap<String, String>();
        Properties p = new Properties();
        try {
            File f = new File(Constant.pathTestResources + "\\TestData\\users.properties");
            FileInputStream fis = new FileInputStream(f);
            p.load(fis);

            for(Map.Entry e : p.entrySet()){
                userData.put((String)e.getKey(),(String)e.getValue());
            }
        }catch(Exception e){
            System.out.println(e.toString());
        } return userData;

    }
}