-- Find the year which had the highest number of players -- Find the year which had the highest number of players. Output the result based on the number of players in ascending order.
-- Step 1: count the distinct names of the players 
-- Step 2: Group by the limit 
-- Step 3: Use the LIMIT method to get only 1 
select 
    year, 
    count(DISTINCT name) as num_of_players
from nfl_combine
group by year
order by num_of_players desc
LIMIT 1
