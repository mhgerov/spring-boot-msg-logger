# spring-boot-msg-logger
Simple message logger updated via API, then compiles and sends logs to ftp server

## Endpoints

* **POST /api/logger**
  * Parameters: None
  * Body: String containing message
  * Logs message in a local file

* **POST /api/admin/backup**
  * Parameters: None
  * Body: None
  * Sends a copy of the local log to a remote ftp server
