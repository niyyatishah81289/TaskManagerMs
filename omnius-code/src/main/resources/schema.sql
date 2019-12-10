DROP TABLE IF EXISTS TBL_TASKS;
  
CREATE TABLE TBL_TASKS (
  taskId INT AUTO_INCREMENT  PRIMARY KEY,
  createdAt VARCHAR(250) NOT NULL,
  updatedAt VARCHAR(250) DEFAULT NULL,
  dueDate VARCHAR(250) DEFAULT NULL,
  resolvedAt VARCHAR(250) DEFAULT NULL,
  title VARCHAR(250) DEFAULT NULL,
  description VARCHAR(250) DEFAULT NULL,
  priority VARCHAR(250) DEFAULT NULL,
  status VARCHAR(250) DEFAULT "CREATED"
);