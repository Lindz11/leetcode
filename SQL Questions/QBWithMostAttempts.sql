-- Find quarterbacks that made most attempts to throw the ball in 2016. Output the quarterback along with the
--  corresponding number of attempts. Sort records by the number of attempts in descending order.
select 
    qb, 
    sum(att) as attempts -- the question wants a sum of the attempts
from qbstats_1996_2016
where year = 2016
group by qb
order by attempts desc
