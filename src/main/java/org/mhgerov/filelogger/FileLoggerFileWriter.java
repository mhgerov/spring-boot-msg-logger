package org.mhgerov.filelogger;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class FileLoggerFileWriter {

	public static void main(final String[] args) throws IOException {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("logs/main.log");
			out.write("I\'m overwritten!\nWhoo hoo!\n".getBytes());
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
