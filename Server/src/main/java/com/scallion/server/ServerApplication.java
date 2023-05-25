package com.scallion.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

@SpringBootApplication
public class ServerApplication {

    static {
        System.out.println(Paths.get("Kerberos-config/krb5.conf").normalize().toAbsolutePath().toString());

        System.setProperty("java.security.krb5.conf",
                Paths.get("Kerberos-config/krb5.conf")
                        .normalize().toAbsolutePath().toString());
        System.setProperty("sun.security.krb5.debug", "true");
        System.setProperty("sun.security.spnego.debug", "true");
        System.setProperty("http.use.global.creds", "true");

        //设置realm
        /*System.setProperty("java.security.krb5.realm","SCALLION.COM");
        System.setProperty("java.security.krb5.kdc","SCALLION.COM");*/
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
