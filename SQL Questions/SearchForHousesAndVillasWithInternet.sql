-- Find the search details for villas and houses with wireless internet access.
select 
    * 
from airbnb_search_details
where property_type in ('Villa','House') and amenities like '%Wireless Internet%'
