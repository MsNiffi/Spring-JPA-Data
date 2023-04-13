ALTER TABLE assistant ADD COLUMN hero_id int NOT NULL;
ALTER TABLE assistant ADD FOREIGN KEY (hero_id) REFERENCES superhero(hero_id);