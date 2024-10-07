use music_streaming;
-- 1. Delete songs from a specific playlist
DELETE FROM Playlist_Songs WHERE song_id = 1;

-- 2. Delete a specific playlist
DELETE FROM Playlists WHERE playlist_id = 1;

-- 3. Delete all songs from playlists associated with a specific user
DELETE FROM Playlist_Songs WHERE playlist_id IN (SELECT playlist_id FROM Playlists WHERE user_id = 1);

-- 4. Delete all playlists associated with a specific user
DELETE FROM Playlists WHERE user_id = 1;

-- 5. Delete a specific user
DELETE FROM Users WHERE user_id = 1;

-- 6. Delete a specific artist
DELETE FROM Artists WHERE artist_id = 1;

-- 7. Delete a specific album
DELETE FROM Albums WHERE album_id = 1;

-- 8. Delete a specific song
DELETE FROM Songs WHERE song_id = 1;

-- 9. Delete a specific genre
DELETE FROM Genres WHERE genre_id = 1;

-- 10. Delete a specific payment method
DELETE FROM Payment_Methods WHERE payment_id = 1;