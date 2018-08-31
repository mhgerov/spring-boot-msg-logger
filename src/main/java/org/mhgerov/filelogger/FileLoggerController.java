package org.mhgerov.filelogger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileLoggerController {

	@PostMapping("/api/logger")
	public void logMessage(@RequestBody String message) {
		System.out.println(message);
	}

}
