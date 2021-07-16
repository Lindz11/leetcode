-- Find the top 10 cities with the most 5 star businesses
select 
city, 
count(stars) as num_of_businesses
from yelp_business
where stars = 5 
group by city
order by num_of_businesses desc
LIMIT 10


-- we want the city in the output 
-- we want to select only businesses with a 5 in it and count them all then store in a variable 
-- then use this variable to order in desc order 
-- We want to limit it to only 10
