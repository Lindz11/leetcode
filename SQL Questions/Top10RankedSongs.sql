-- Find the top 10 ranked songs by position. Output the track name along with he corresponding position
-- and sort records by the position in descending order and track name alphabetically,as there are many
-- tracks that are tied for the same position.
select 
    trackname,
    position
from spotify_worldwide_daily_song_ranking
where position <= 10
group by position, trackname
order by position desc
