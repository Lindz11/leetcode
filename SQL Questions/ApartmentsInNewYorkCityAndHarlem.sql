-- Find the search details of 50 apartment searches the Harlem neighborhood of New York City.
select * 
from airbnb_search_details
where city = 'NYC' and neighbourhood ='Harlem'and property_type ='Apartment'
Limit 50
