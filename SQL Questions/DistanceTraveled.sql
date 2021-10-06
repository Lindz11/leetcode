-- Distances Traveled -- Find the top 10 users that have traveled the greatest distance. Output their id, name and a total distance traveled.
-- Step 1: Join the two tables together 
-- Step 2: Select the id, name name and travel distance
-- Step 3: Order by travel distance in desc order 
-- Step 4: LIMIT 10 
select 
   l.user_id, 
   u.name, 
   sum(l.distance) as total_distance
from lyft_rides_log as l 
inner join lyft_users as u 
on l.user_id = u.id
group by 1,2
order by total_distance desc 
LIMIT 10
