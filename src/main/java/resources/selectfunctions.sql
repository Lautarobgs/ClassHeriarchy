USE music_streaming;

SELECT 
    s.subscription_type,
    COUNT(u.user_id) AS total_users
FROM 
    Subscriptions s
LEFT JOIN 
    Users u ON s.subscription_id = u.subscription_id
GROUP BY 
    s.subscription_type;


SELECT 
    s.subscription_type,
    AVG(s.price) AS average_price
FROM 
    Subscriptions s
GROUP BY 
    s.subscription_type;


SELECT 
    g.genre_name,
    COUNT(s.song_id) AS total_songs
FROM 
    Genres g
LEFT JOIN 
    Songs s ON g.genre_id = s.genre_id
GROUP BY 
    g.genre_name;


SELECT 
    a.artist_name,
    COUNT(al.album_id) AS total_albums
FROM 
    Artists a
LEFT JOIN 
    Albums al ON a.artist_id = al.artist_id
GROUP BY 
    a.artist_name;


SELECT 
    al.album_name,
    MAX(s.duration) AS max_duration
FROM 
    Albums al
LEFT JOIN 
    Songs s ON al.album_id = s.album_id
GROUP BY 
    al.album_name;


SELECT 
    u.username,
    COUNT(p.playlist_id) AS total_playlists
FROM 
    Users u
LEFT JOIN 
    Playlists p ON u.user_id = p.user_id
GROUP BY 
    u.username;


SELECT 
    p.playlist_name,
    AVG(s.duration) AS average_duration
FROM 
    Playlists p
LEFT JOIN 
    Playlist_Songs ps ON p.playlist_id = ps.playlist_id
LEFT JOIN 
    Songs s ON ps.song_id = s.song_id
GROUP BY 
    p.playlist_name;
    
USE music_streaming;

-- Having

SELECT 
    s.subscription_type,
    COUNT(u.user_id) AS total_users
FROM 
    Subscriptions s
LEFT JOIN 
    Users u ON s.subscription_id = u.subscription_id
GROUP BY 
    s.subscription_type
HAVING 
    total_users > 5;


SELECT 
    s.subscription_type,
    AVG(s.price) AS average_price
FROM 
    Subscriptions s
GROUP BY 
    s.subscription_type
HAVING 
    average_price > 10;


SELECT 
    g.genre_name,
    COUNT(s.song_id) AS total_songs
FROM 
    Genres g
LEFT JOIN 
    Songs s ON g.genre_id = s.genre_id
GROUP BY 
    g.genre_name
HAVING 
    total_songs > 10;


SELECT 
    a.artist_name,
    COUNT(al.album_id) AS total_albums
FROM 
    Artists a
LEFT JOIN 
    Albums al ON a.artist_id = al.artist_id
GROUP BY 
    a.artist_name
HAVING 
    total_albums > 2;


SELECT 
    al.album_name,
    MAX(s.duration) AS max_duration
FROM 
    Albums al
LEFT JOIN 
    Songs s ON al.album_id = s.album_id
GROUP BY 
    al.album_name
HAVING 
    max_duration > '00:03:00';


SELECT 
    u.username,
    COUNT(p.playlist_id) AS total_playlists
FROM 
    Users u
LEFT JOIN 
    Playlists p ON u.user_id = p.user_id
GROUP BY 
    u.username
HAVING 
    total_playlists > 1;


SELECT 
    p.playlist_name,
    AVG(s.duration) AS average_duration
FROM 
    Playlists p
LEFT JOIN 
    Playlist_Songs ps ON p.playlist_id = ps.playlist_id
LEFT JOIN 
    Songs s ON ps.song_id = s.song_id
GROUP BY 
    p.playlist_name
HAVING 
    average_duration > '00:04:00';    