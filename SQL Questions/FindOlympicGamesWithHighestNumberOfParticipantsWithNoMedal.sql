--  Find the Olympic game which had the highest number of participants that didn't earn a medal.
-- Output the Olympic game name along with the corresponding number of athletes.
-- Olympic game name consists of the year and the season.
select
games, 
count(distinct id) as n_athletes 
from olympics_athletes_events
where medal IS NULL
group by games
order by n_athletes desc 
LIMIT 1
