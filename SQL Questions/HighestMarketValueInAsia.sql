-- Find industries with the highest market value in Asia.
-- Output the industries along with the corresponding total market value.
-- Sort records based on the market value in descending order.
select 
DISTINCT industry, 
sum(marketvalue) as markets 
from forbes_global_2010_2014
where continent = 'Asia'
group by industry
order by markets desc
