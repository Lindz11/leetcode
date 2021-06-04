-- Find the average weight of medal-winning Judo players of each team with a minimum age of 20 and a maximum
-- age of 30. Consider players at the age of 20 and 30 too. Output the team along with the average player
-- weight.
select 
    team, -- We need group by teams
    avg(weight) -- and we want the avg weight
from olympics_athletes_events
where age between 20 and 30 and medal IS NOT NULL and sport = 'Judo' -- then we only want ones between 20 and
-- 30 with sport being judo and medal
group by team 
