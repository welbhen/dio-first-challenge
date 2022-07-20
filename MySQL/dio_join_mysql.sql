CREATE TABLE channels(
    channel_name VARCHAR(20) NOT NULL
);

CREATE TABLE videos(
    video_name VARCHAR(20) NOT NULL,
    video_author VARCHAR(20) NOT NULL,
);

CREATE TABLE videos_channels(
    fk_channel INT,
    fk_video INT
);

/*******************************************
    Tables: 'channels' and 'videos'
            are populated by data
    Table: 'videos_channels'
            if populated by "foreign key"
*******************************************/

SELECT v.video_name, v.video_author, c.channel_name
FROM videos_channels AS vc JOIN videos AS v ON vc.fk_video = v.id_video
JOIN channels AS c ON vc.fk_channel = c.id_channel;

SELECT v.video_name, v.video_author, c.channel_name
FROM videos_channels AS vc INNER JOIN videos AS v ON vc.fk_video = v.id_video
INNER JOIN channels AS c ON vc.fk_channel = c.id_channel;

SELECT * FROM videos_channels AS vc LEFT OUTER JOIN videos AS v ON vc.fk_video = v.id_video;

SELECT * FROM videos_channels AS vc RIGHT OUTER JOIN videos AS v ON vc.fk_video = v.id_video;

SELECT v.id_video, v.video_name FROM videos AS v LEFT OUTER JOIN videos_channels AS vc ON v.id_video = vc.fk_video
UNION
SELECT c.id_channel, c.channel_name FROM videos_channels AS vc RIGHT OUTER JOIN channels AS c ON vc.fk_channel = c.id_channel;