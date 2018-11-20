/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rogueapp;

/**
 *
 * @author Ricardo
 */
import java.net.MalformedURLException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.ektorp.support.DesignDocument;

public class javaCouchDB {

    public static void main(String[] args) throws MalformedURLException {
        Properties log4jProp = new Properties();
        log4jProp.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(log4jProp);
//--------------- Creating Connection--------------------------//  
        HttpClient httpClient = new StdHttpClient.Builder()
                .url("http://localhost:5984")
                .username("administrator2")
                .password("123456789")
                .build();
        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
//--------------- Creating database----------------------------//  
        CouchDbConnector db = new StdCouchDbConnector("javatpoint", dbInstance);
        db.createDatabaseIfNotExists();
//--------------- Creating Document----------------------------//  
       // DesignDocument dd = new DesignDocument("light");
       // db.create(dd);
    }
}
