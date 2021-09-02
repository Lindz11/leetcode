-- Find the top-ranked songs for the past 30 years. -- Find all the songs that were top-ranked (at first position) at least once in the past 30 years
-- Steep 1: Select the DISTINCT song_name and year rank
-- Step 2: Use where and datefiff to count of 30 years from todays date
-- Step 3: U need to use current_date to get the year u are in and subtract it from the year column 
-- Step 4: And U only want songs with year rank 1
select 
    DISTINCT song_name, 
    year_rank
from billboard_top_100_year_end
where  date_part('year', CURRENT_DATE) - year <= 30 AND year_rank = 1
