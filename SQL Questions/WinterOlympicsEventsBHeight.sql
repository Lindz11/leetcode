-- Find the lowest, average, and the highest ages of athletes across all Olympics.
select 
avg(age)  as mean_age, 
min(age) as lowest_age, 
max(age) as highest_age
from olympics_athletes_events
