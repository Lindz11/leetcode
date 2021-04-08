-- Find all neighborhoods that have properties with a parking space and don't charge for cleaning fees. 
select 
    DISTINCT neighbourhood 
from airbnb_search_details
where cleaning_fee is FALSE and amenities like '%parking%'
