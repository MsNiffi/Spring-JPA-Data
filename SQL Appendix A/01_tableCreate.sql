DROP TABLE IF EXISTS superhero;

CREATE TABLE superhero (
	hero_id SERIAL PRIMARY KEY,
	hero_name VARCHAR(50) NOT NULL,
	hero_alias VARCHAR(50) NOT NULL,
	hero_origin VARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS assistant;

CREATE TABLE assistant (
	assist_id SERIAL PRIMARY KEY,
	assist_name VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS power;

CREATE TABLE power (
	power_id SERIAL PRIMARY KEY,
	power_name VARCHAR(50) NOT NULL,
	power_desc VARCHAR(100) NOT NULL
);