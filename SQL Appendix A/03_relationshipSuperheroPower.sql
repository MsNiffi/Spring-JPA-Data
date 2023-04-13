DROP TABLE IF EXISTS hero_power_link;

CREATE TABLE power_link (
    hero_id int NOT NULL REFERENCES superhero(hero_id),
    power_id int NOT NULL REFERENCES power(power_id),
    PRIMARY KEY (hero_id, power_id)
);