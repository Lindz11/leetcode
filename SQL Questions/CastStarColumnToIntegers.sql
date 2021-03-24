-- Cast stars column values to integer and return with all other column values.
select  
    CAST(stars as int),
    business_name,
    review_id,
    user_id,
    review_date,
    review_text,
    funny,
    useful,
    cool
from yelp_reviews
where stars != '?'
