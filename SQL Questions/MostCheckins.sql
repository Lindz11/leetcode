-- Find the top 5 businesses with the most check-ins.
-- Output the business id along with the number of check-ins.
-- Order records by the number of check-ins in descending order.
select 
    business_id,
    checkins
from yelp_checkin
order by checkins desc
LIMIT 5
