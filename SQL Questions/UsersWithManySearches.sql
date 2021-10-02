-- Users with Many Searches -- Count the number of users who made more than 5 searches in August 2021.
-- Step 1: Use count function to count search_query and select user_id
-- Step 2: Use where filter to go between the month of august 
-- Step 3: Group by user_id
select 
    count(DISTINCT user_id) as num_of_people
from 
(   select
        user_id
    from fb_searches
    where 
        extract(month from date) = 8 and extract(year from date) = 2021
    group by 1
    having 
        count(search_query) > 5
) as a
