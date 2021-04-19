-- Find artists that have been on Spotify the most number of times.
-- Output the artist name along with the corresponding number of occurrences.
-- Order records by the number of occurrences in descending order.
select
    artist, 
    count(artist) as number_of_occurrences
from spotify_worldwide_daily_song_ranking
group by artist 
order by artist desc
