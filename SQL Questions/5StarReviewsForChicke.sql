-- Find the number of 5-star reviews earned by Lo-Lo's Chicken & Waffles.
select 
    count(*) -- We want the count of all 5 star reviews 
from yelp_reviews
where stars = '5' and business_name like 'Lo-Lo_s Chicken & Waffles' -- We also need to search by business name
-- Can use _ to replace ' in this case 
