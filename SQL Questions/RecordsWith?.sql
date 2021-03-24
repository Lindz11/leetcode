-- Find records with the value '?' in the `stars` column.
select 
    business_name,
    review_id,
    user_id,
    stars,
    review_date,
    review_text,
    funny,
    useful,
    cool
from yelp_reviews
where stars = '?'
