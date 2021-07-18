-- Find the number of nights that are searching for when trying to book a host
select 
n_nights,
sum(n_searches) as sum_of_searches_per_night
from airbnb_searches
group by n_nights
order by sum_of_searches_per_night desc 

-- We want to output sumofsearchesrpernight and the numberofnights the user wanted
-- we want this in desc order
-- This question wants the sum of the searches 
