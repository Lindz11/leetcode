-- Find the top 10 quarterbacks based on their ratings. Output the quarterback along with the corresponding rating and order the results by highest rating to lowest and then alphabetically by QB name.
select 
DISTINCT qb, 
rate
from qbstats_1996_2016
where rate IS NOT NULL
order by rate desc, qb
LIMIT 10
