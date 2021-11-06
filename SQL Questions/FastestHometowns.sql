-- Fastest Hometowns -- Find the hometowns with the top 3 average net times. Output the hometowns and their average net time. In case there are ties in net time, return all unique hometowns.
-- Step 1: Use a window function to go through and rank every single avg net time per city 
-- Step 2: Use that table and select the hometoen and avg_net_time
-- Step 3: Use the where filter to only select hometown that have a rank less than or equal to 3
with cte as 
(
    select 
        hometown,
        avg(net_time) as avg_net_time,
        dense_rank () over (order by avg(net_time) asc) rnk
    from marathon_male
    group by 1
)
select 
    hometown, 
    avg_net_time
from cte
where rnk <= 3
