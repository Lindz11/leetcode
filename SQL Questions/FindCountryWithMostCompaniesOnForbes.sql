-- Find the country that has the most companies listed on Forbes. Output the country along with the number of companies. Order records based on the number of companies in descending order.
select 
country, 
count(DISTINCT company) as n_companies 
from forbes_global_2010_2014
group by country 
order by n_companies desc 
LIMIT 1
