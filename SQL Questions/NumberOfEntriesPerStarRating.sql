-- Find the number of entries per star
select 
stars, 
count(business_name) as num_of_entries 
from yelp_reviews
group by stars
order by stars asc 

-- we want ALL businesses per star rating 
-- we want to output the star rating and num of businesses 
-- order by stars in asc order 
-- group by stars 
