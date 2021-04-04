-- Find songs with less than 2000 streams. Output the track name along with the corresponding streams.
-- Sort records by streams in descending order.
select 
    trackname,
    streams
from spotify_worldwide_daily_song_ranking
where streams < 2000
