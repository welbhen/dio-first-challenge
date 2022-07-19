CREATE TABLE people(
    id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
    name VARCHAR(20) NOT NULL,
    birth DATE
);

SELECT * FROM people;

INSERT INTO people (name, birth) VALUES (
    'John Doe',
    '1990/05/22'
);
INSERT INTO people (name, birth) VALUES (
    'Linn March',
    '1992/08/03'
);
INSERT INTO people (name, birth) VALUES (
    'Mark Bill',
    '1972/12/26'
);

SELECT name FROM people;

UPDATE people SET name = 'Liniker March' WHERE id = 2;


SELECT * FROM people WHERE id = 3;
DELETE FROM people WHERE id = 3;

SELECT * FROM people ORDER BY name;
SELECT * FROM people ORDER BY name DESC;

ALTER TABLE people ADD gender VARCHAR(1) NOT NULL AFTER birth;
UPDATE people SET gender = 'M' WHERE id = 1;
UPDATE people SET gender = 'F' WHERE id = 2;
UPDATE people SET gender = 'M' WHERE id = 3;

SELECT * FROM people GROUP BY gender;
SELECT COUNT(id), gender FROM people GROUP BY gender;