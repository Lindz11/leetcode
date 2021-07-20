-- Longest Top 10 Game
select 
game,
platform, 
count(week) as num_of_weeks
from global_weekly_charts_2013_2014
where week <= 10
group by game,platform
order by num_of_weeks

-- seems like a simple problem pulling the game,platform, and count(numofweeks)
