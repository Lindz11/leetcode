-- Find songs that are ranked between 8-10. Output the track name along with the corresponding position.
select 
    id,
    position,
    trackname,
    artist,
    streams,
    url, 
    date,
    region
from spotify_worldwide_daily_song_ranking
where position >=8 and position <= 10
