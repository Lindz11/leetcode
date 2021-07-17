-- Find the most popular sector in the Forbes list
select
sector, 
count(company) as num_of_companies
from forbes_global_2010_2014
group by sector 
order by num_of_companies desc
LIMIT 1
-- pick the sector and company column 
-- count all companies in each sector 
-- sort by num of comapnies desc
-- group by sector 
-- LIMIT since we only want 1 
