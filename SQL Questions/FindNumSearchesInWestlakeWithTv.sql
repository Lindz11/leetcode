-- Find the total number of searches for houses in Westlake neighborhood with a TV among the amenities.
select 
    count(DISTINCT id) -- we only want unique id's 
from airbnb_search_details
where neighbourhood = 'Westlake' and amenities LIKE '%TV%' -- only pick neighbourhood with westlake and
