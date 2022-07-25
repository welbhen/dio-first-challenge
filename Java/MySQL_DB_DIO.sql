SHOW DATABASES;

CREATE DATABASE dio;

SHOW DATABASES;

USE dio;

CREATE TABLE student(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(89) NOT NULL,
    age INTEGER NOT NULL,
    state CHARACTER(2) NOT NULL
);

SHOW TABLES;

SELECT * FROM student;

INSERT INTO student (name, age, state) VALUES ('Pedro', 20, 'RJ');
INSERT INTO student (name, age, state) VALUES ('Maria', 35, 'AC');
INSERT INTO student (name, age, state) VALUES ('Joao', 10, 'SC');
INSERT INTO student (name, age, state) VALUES ('Ana', 51, 'GO');

SELECT * FROM student;
