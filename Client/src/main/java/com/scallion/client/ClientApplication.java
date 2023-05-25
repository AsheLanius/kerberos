package com.scallion.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

@SpringBootApplication
public class ClientApplication {

	static {
		System.setProperty("java.security.krb5.conf",
				Paths.get("Kerberos-config/krb5.conf").normalize().toAbsolutePath().toString());
		System.setProperty("sun.security.krb5.debug", "true");
		//
		System.setProperty("http.use.global.creds", "false");
		// 手动设置realm为true
		/*System.setProperty("java.security.krb5.realm","SCALLION.COM");
		System.setProperty("java.security.krb5.kdc","SCALLION.COM");*/
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
