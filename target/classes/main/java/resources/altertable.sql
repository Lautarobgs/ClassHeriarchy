use music_streaming;
-- Add a column to Users
ALTER TABLE Users ADD date_of_birth DATE;

-- Drop a column from Artists
ALTER TABLE Artists ADD artist_lastname VARCHAR(200);

-- Rename a column in Songs
ALTER TABLE Songs CHANGE song_name title VARCHAR(200);

-- Modify column in Playlists
ALTER TABLE Playlists MODIFY playlist_name VARCHAR(200);

-- Add a foreign key constraint to Instruments_Artists
ALTER TABLE Instruments_Artists ADD CONSTRAINT fk_artist FOREIGN KEY (artist_id) REFERENCES Artists(artist_id);