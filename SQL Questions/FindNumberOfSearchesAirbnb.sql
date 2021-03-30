-- Find the number of people that search for hosts on Airbnb.
select 
count(DISTINCT id_user)
from airbnb_searches
