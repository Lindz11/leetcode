-- Find artists with the highest number of top 10 ranked songs over the years.
-- Output the artist along with the corresponding number of top 10 rankings.
-- Sort records by the number of top 10 ranks in descending order.
select 
    artist, 
    count(position) as n_times
from spotify_worldwide_daily_song_ranking
where position <= 10
group by artist 
order by n_times desc
