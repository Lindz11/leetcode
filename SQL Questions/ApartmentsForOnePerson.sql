-- Find the search details made by people who searched for apartments designed for a single-person stay
select 
    * -- We want all of the search details 
from airbnb_search_details
where accommodates = 1 and property_type = 'Apartment' -- We want only a single person accomidation
order by accommodates
