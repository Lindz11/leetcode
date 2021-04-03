-- Find the number of streams for the top 100 ranked songs.
select 
count(streams)
from spotify_worldwide_daily_song_ranking
where position <= 100
