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