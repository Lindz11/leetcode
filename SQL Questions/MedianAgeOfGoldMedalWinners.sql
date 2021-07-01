-- Find the median age of gold medal winners across all Olympics.
select
 percentile_cont(0.5) 
    within group(order by age) as percentage
from olympics_athletes_events
where medal = 'Gold'
