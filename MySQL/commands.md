# THIS IS A FILE WITH USEFULL COMMANDS TO WORK WITH MySQL

### While on Windows cmd:
	mysql -h localhost -u root -p
    * -h localhost => because we're using a localhost
    * -u root => because we're using the "root" user from MySQL
    * -p => this will require us to type in the password: 1322 (I choose this password on MySQL installation)

### After doing the above:

	SHOW DATABASES;
	
	CREATE DATABESE databaseName;
    * databaseName => we can choose whatever name we want

	USE databaseName;
    * this enters the database we created with the chosen name

	SHOW TABLES;
    * this shows the tables inside our database

	CREATE TABLE tableName(...);
    * create a table

	DESCRIBE tableName;
    * this will show with details the table we created and it's columns

	INSERT INTO tableName(...) VALUES(..);
    * insert data into the table

	SELECT * FROM tableName;
    * this will list ALL data from tableName
    * the '*' means ALL

	SELECT * FROM tableName WHERE column = value;
    * this allow us to select specific data from our table
    * example: our table called "users" and it has a column called "age", and we want to access the users who are 21 years old
    * we use the command as: SELECT * FROM users WHERE age = 21;
    * we can use logic operators such as: >= <= = > <

	DELETE FROM tableName WHERE column = value;
    * works the same way as SELECT, but this one deletes the selected data

	UPDATE tableName SET column = newValue WHERE column = value;
    * works the same way as SELECT and DELETE, but this one updates the selected data