-- Total Searched For Rooms - Find the total number of searches for each room type (apartments, private, shared) by city.
select 
city,
count(case when room_type ILIKE '%ap%t' then 1 else null end ) as apt_count, 
count(case when room_type ILIKE '%Private%' then 1 else null end ) as private_count, 
count(case when room_type ILIKE '%Shared%' then 1 else null end ) as shared_count
from airbnb_search_details
group by city
