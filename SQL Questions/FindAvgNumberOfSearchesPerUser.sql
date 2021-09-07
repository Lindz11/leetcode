-- Find the average number of searches from each user -- Find the average number of searches made by each user and present the result with their corresponding user id.
-- Step 1: Select the user_id
-- Step 2: Use avg function if its in the name try to use the fucntion first and see 
-- Step 3: Group by the user id 
select 
 id_user, 
 avg(n_searches) as avg_searches
from airbnb_searches
group by 1
order by avg_searches desc
