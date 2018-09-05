package org.mhgerov.filelogger;

public interface FileLoggerRestGateway {
	public void logMessage(String msg);

	public void backupLog();
}
