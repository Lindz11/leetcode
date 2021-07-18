-- Find the best publishers based on total sales
select
publisher, 
sum(total) as sum_of_total_sales
from global_weekly_charts_2013_2014
group by publisher
order by sum_of_total_sales

-- Seems like a simple question 
-- We want the publishers and the sum(total)
-- group each total by publisher
-- and order by sum_of_total
