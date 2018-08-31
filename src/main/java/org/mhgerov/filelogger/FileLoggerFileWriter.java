package org.mhgerov.filelogger;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;

@Component
public class FileLoggerFileWriter {

	public void writeToFile(final String message) throws IOException {

		PrintWriter outputStream = null;

		try {
			outputStream = new PrintWriter("logs/main.log");
			outputStream.println(message);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
