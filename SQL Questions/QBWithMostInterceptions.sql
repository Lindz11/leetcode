-- Find quarterbacks with the most interceptions in 2016. Output the quarterbacks along with the corresponding
-- number of interceptions. Sort records by the interceptions in descending order.
select 
    qb, 
    sum(int) as num_of_interceptions
from qbstats_1996_2016
where year = 2016
group by qb
order by num_of_interceptions desc
