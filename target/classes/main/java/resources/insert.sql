use music_streaming;
-- Inserting into Countries
INSERT INTO Countries (country_name) VALUES ('Argentina');
INSERT INTO Countries (country_name) VALUES ('USA');
INSERT INTO Countries (country_name) VALUES ('UK');

-- Inserting into Subscriptions
INSERT INTO Subscriptions (subscription_type, price) VALUES ('Free', 0.00);
INSERT INTO Subscriptions (subscription_type, price) VALUES ('Premium', 9.99);

-- Inserting into Users
INSERT INTO Users (username, email, password_hash, subscription_id, country_id) 
VALUES ('john_doe', 'john@example.com', 'hashedpassword1', 1, 1);

INSERT INTO Users (username, email, password_hash, subscription_id, country_id) 
VALUES ('jane_doe', 'jane@example.com', 'hashedpassword2', 2, 2);

-- Inserting into Artists
INSERT INTO Artists (artist_name, country_id) VALUES ('The Beatles', 3);
INSERT INTO Artists (artist_name, country_id) VALUES ('Soda Stereo', 1);

-- Inserting into Genres
INSERT INTO Genres (genre_name) VALUES ('Rock');