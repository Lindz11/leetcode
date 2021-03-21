-- Find the total number of housing units completed for each year. Output the year along 
-- with the total number of housings. Order the result by year in ascending order.
select 
    year,
    sum(south + west + northeast + midwest) 
from housing_units_completed_us
group by year 
order by year asc
