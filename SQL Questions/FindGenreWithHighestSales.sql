-- Find the genres that yielded the highest sales
select
genre, 
sum(total) as sum_of_total_sales
from global_weekly_charts_2013_2014
group by genre
order by sum_of_total_sales

-- We want to output the genre and the sumoftotalsales
-- group by genre 
-- order by sumoftotalsales desc
