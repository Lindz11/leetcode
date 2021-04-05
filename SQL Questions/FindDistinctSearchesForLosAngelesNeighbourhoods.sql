-- Find searches for Los Angeles neighborhoods
select 
    DISTINCT neighbourhood 
from airbnb_search_details
where city ='LA'
