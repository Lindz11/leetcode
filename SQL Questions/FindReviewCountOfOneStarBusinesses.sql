-- Find the review count for one-star businesses from yelp.
-- Output the name along with the corresponding review count.
select 
    name,
    review_count
from yelp_business
where stars = 1
group by name,review_count
