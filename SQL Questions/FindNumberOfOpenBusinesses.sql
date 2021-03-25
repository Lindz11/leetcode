-- Find the number of open businesses.
select 
    count(business_id)
from yelp_business
where is_open = 1
