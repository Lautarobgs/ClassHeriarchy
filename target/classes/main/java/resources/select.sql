USE music_streaming;

-- 1. INNER JOIN
SELECT 
    u.user_id,
    u.username,
    s.subscription_type
FROM 
    Users u
INNER JOIN 
    Subscriptions s ON u.subscription_id = s.subscription_id;

-- 2. LEFT JOIN
SELECT 
    u.user_id,
    u.username,
    p.playlist_name
FROM 
    Users u
LEFT JOIN 
    Playlists p ON u.user_id = p.user_id;

-- 3. RIGHT JOIN
SELECT 
    c.country_name,
    a.artist_name
FROM 
    Countries c
RIGHT JOIN 
    Artists a ON c.country_id = a.country_id;

-- 4. FULL OUTER JOIN Simulation because it doesnt exist on MySQL
SELECT 
    a.artist_name,
    i.instrument_name
FROM 
    Artists a
LEFT JOIN 
    Instruments_Artists ia ON a.artist_id = ia.artist_id
LEFT JOIN 
    Instruments i ON ia.instrument_id = i.instrument_id

UNION

SELECT 
    a.artist_name,
    i.instrument_name
FROM 
    Artists a
RIGHT JOIN 
    Instruments_Artists ia ON a.artist_id = ia.artist_id
RIGHT JOIN 
    Instruments i ON ia.instrument_id = i.instrument_id;

-- 5. LEFT JOIN
SELECT 
    u.username,
    so.song_name,
    p.playlist_name
FROM 
    Users u
LEFT JOIN 
    Playlists p ON u.user_id = p.user_id
LEFT JOIN 
    Playlist_Songs ps ON p.playlist_id = ps.playlist_id
LEFT JOIN 
    Songs so ON ps.song_id = so.song_id;
    
    
    