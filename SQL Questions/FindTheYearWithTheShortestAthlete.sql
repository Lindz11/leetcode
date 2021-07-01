-- Find the year in which the shortest athlete participated. Output the year and the corresponding height.
select 
year, 
height
from olympics_athletes_events
group by year, height
having min(height) > 1
order by height asc
LIMIT 1
