INSERT INTO power (power_id, power_name, power_desc) VALUES (1, 'Bat Tools', 'A collection of tools created by Batman, such as the Batarang or Utility Belt.');
INSERT INTO power (power_id, power_name, power_desc) VALUES (2, 'Spider Sense', 'An ability to sense danger before it can be perceived by other senses.');
INSERT INTO power (power_id, power_name, power_desc) VALUES (3, 'Flight', 'The ability to fly freely at high speeds.');
INSERT INTO power (power_id, power_name, power_desc) VALUES (4, 'Superspeed', 'The ability to run, move, and think extremely fast.');

INSERT INTO power_link (hero_id, power_id)
VALUES
(1, 1),	
(1, 3),
(2, 2),
(3, 3),
(3, 4);

				  