-- Find the top 10 ranked songs in 2010 -- Output the rank, group name, and song name but do not show the same song twice. Sort the result based on the year_rank in ascending order
-- Step 1: Select the song, rank, group_name,
-- Step 2: Make sure its distinct since we dont want duplicates 
-- Step 3: use where so we only get songs from 2010
-- Step 4: Order by year_rank in asc order 
-- Step 5: Limit to 10 .
select DISTINCT
    year, 
    group_name, 
    song_name, 
    year_rank
from billboard_top_100_year_end
where year = 2010 
order by year_rank asc
LIMIT 10 
