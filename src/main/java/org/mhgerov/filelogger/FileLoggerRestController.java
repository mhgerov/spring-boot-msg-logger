package org.mhgerov.filelogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileLoggerRestController {

	@Autowired
	FileLoggerHttpInterface fileLoggerHttpInterface;

	@PostMapping("/api/logger")
	public void logMessage(@RequestBody final String msg) {
		this.fileLoggerHttpInterface.logMessage(msg);
	}

	@PostMapping("/api/admin/backup")
	public void backupLog() {
		this.fileLoggerHttpInterface.backupLog();
	}
}
