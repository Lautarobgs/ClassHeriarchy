use music_streaming;
SELECT *

FROM Users u

JOIN Subscriptions s
JOIN Countries c 
JOIN Playlists p 
JOIN Playlist_Songs ps 
JOIN Songs so 
JOIN Albums al 
JOIN Artists a 
JOIN Genres g 
JOIN Instruments_Artists ia 
JOIN Instruments i 
JOIN Payment_Methods pm 