USE music_streaming;

-- Create the Countries table first as it's referenced by other tables
CREATE TABLE Countries (
    country_id INT PRIMARY KEY AUTO_INCREMENT,
    country_name VARCHAR(100) NOT NULL UNIQUE
);

-- Create the Subscriptions table, which is referenced by Users
CREATE TABLE Subscriptions (
    subscription_id INT PRIMARY KEY AUTO_INCREMENT,
    subscription_type VARCHAR(50) NOT NULL,
    price DECIMAL(5,2) NOT NULL
);

-- Create the Users table
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL UNIQUE,
    email VARCHAR(150) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    subscription_id INT,
    country_id INT,
    -- Foreign key to the Subscriptions table (each user has a subscription)
    FOREIGN KEY (subscription_id) REFERENCES Subscriptions(subscription_id),
    -- Foreign key to the Countries table (each user is from a specific country)
    FOREIGN KEY (country_id) REFERENCES Countries(country_id)
);

-- Create the Artists table
CREATE TABLE Artists (
    artist_id INT PRIMARY KEY AUTO_INCREMENT,
    artist_name VARCHAR(150) NOT NULL,
    country_id INT,
    -- Foreign key to the Countries table (each artist is from a specific country)
    FOREIGN KEY (country_id) REFERENCES Countries(country_id)
);

-- Create the Albums table
CREATE TABLE Albums (
    album_id INT PRIMARY KEY AUTO_INCREMENT,
    album_name VARCHAR(200) NOT NULL,
    release_year YEAR NOT NULL,
    artist_id INT,
    -- Foreign key to the Artists table (each album belongs to an artist)
    FOREIGN KEY (artist_id) REFERENCES Artists(artist_id)
);

-- Create the Genres table
CREATE TABLE Genres (
    genre_id INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(100) NOT NULL UNIQUE
);

-- Create the Songs table
CREATE TABLE Songs (
    song_id INT PRIMARY KEY AUTO_INCREMENT,
    song_name VARCHAR(200) NOT NULL,
    duration TIME NOT NULL,
    album_id INT,
    genre_id INT,
    -- Foreign key to the Albums table (each song belongs to an album)
    FOREIGN KEY (album_id) REFERENCES Albums(album_id),
    -- Foreign key to the Genres table (each song has a genre)
    FOREIGN KEY (genre_id) REFERENCES Genres(genre_id)
);

-- Create the Playlists table
CREATE TABLE Playlists (
    playlist_id INT PRIMARY KEY AUTO_INCREMENT,
    playlist_name VARCHAR(150) NOT NULL,
    user_id INT,
    -- Foreign key to the Users table (each playlist is created by a user)
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Create the Playlist_Songs table (many-to-many relationship between Playlists and Songs)
CREATE TABLE Playlist_Songs (
    playlist_id INT,
    song_id INT,
    PRIMARY KEY (playlist_id, song_id),
    -- Foreign key to the Playlists table
    FOREIGN KEY (playlist_id) REFERENCES Playlists(playlist_id),
    -- Foreign key to the Songs table
    FOREIGN KEY (song_id) REFERENCES Songs(song_id)
);

-- Create the Payment_Methods table
CREATE TABLE Payment_Methods (
    payment_id INT PRIMARY KEY AUTO_INCREMENT,
    method_name VARCHAR(100) NOT NULL UNIQUE
);

-- Create the Instruments table
CREATE TABLE Instruments (
    instrument_id INT PRIMARY KEY AUTO_INCREMENT,
    instrument_name VARCHAR(100) NOT NULL UNIQUE
);

-- Create the Instruments_Artists table (many-to-many relationship between Instruments and Artists)
CREATE TABLE Instruments_Artists (
    artist_id INT,
    instrument_id INT,
    PRIMARY KEY (artist_id, instrument_id),
    -- Foreign key to the Artists table
    FOREIGN KEY (artist_id) REFERENCES Artists(artist_id),
    -- Foreign key to the Instruments table
    FOREIGN KEY (instrument_id) REFERENCES Instruments(instrument_id)
);