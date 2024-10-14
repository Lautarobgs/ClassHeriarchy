use music_streaming;
-- Updating Countries
UPDATE Countries SET country_name = 'Canada' WHERE country_id = 2;

-- Updating Subscriptions
UPDATE Subscriptions SET price = 12.99 WHERE subscription_id = 2;

-- Updating Users
UPDATE Users SET username = 'new_john' WHERE user_id = 1;
UPDATE Users SET email = 'new_john@example.com' WHERE user_id = 1;

-- Updating Artists
UPDATE Artists SET artist_name = 'Queen' WHERE artist_id = 1;

-- Updating Genres
UPDATE Genres SET genre_name = 'Pop Rock' WHERE genre_id = 1;

-- Updating Songs
UPDATE Songs SET song_name = 'Bohemian Rhapsody' WHERE song_id = 1;
UPDATE Songs SET duration = '00:05:55' WHERE song_id = 1;

-- Updating Albums
UPDATE Albums SET album_name = 'Greatest Hits' WHERE album_id = 1;
UPDATE Albums SET release_year = 1981 WHERE album_id = 1;