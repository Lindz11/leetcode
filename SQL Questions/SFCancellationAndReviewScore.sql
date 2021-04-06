-- Find all searches for San Francisco with a flexible cancellation policy and a review score rating. 
-- Sort the results by the review score in the descending order.
select 
    * 
from airbnb_search_details
where cancellation_policy ='flexible' and city='SF' and review_scores_rating IS NOT NULL
order by review_scores_rating asc
