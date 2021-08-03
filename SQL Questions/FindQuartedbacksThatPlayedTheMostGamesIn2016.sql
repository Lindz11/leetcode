-- Find quarterbacks that played the most games in 2016 
-- Find quarterbacks that played the most games in 2016. Output the quarterback along with the corresponding number of appearances.
select 
 qb, 
 count(home_away) as num_of_games
from qbstats_1996_2016
where year = 2016
group by qb
order by num_of_games desc
