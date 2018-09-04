package org.mhgerov.filelogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("org/mhgerov/filelogger/integration.xml")
public class FileLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileLoggerApplication.class, args);
	}
}
