-- Find the quarterback who had the highest number of touchdowns (column 'td') in 2016. Output the quarterback
-- along with the corresponding number of TDs. Sort records based on the number of TDs in descending order.
select
    qb, 
    sum(td) as tds -- We need the sum of all the touchdowns 
from qbstats_1996_2016
where year = 2016-- where the year is 2016
group by qb
order by tds desc 
