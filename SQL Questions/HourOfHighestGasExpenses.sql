-- Find the hour with the highest gasoline cost. Assume there's only 1 hour with the highest gas cost.
select 
    hour,
    max(gasoline_cost) as highest_hour
from lyft_rides
group by hour
order by highest_hour desc
LIMIT 1
