-- Find the price of the cheapest property for every city.
select 
    min(price), -- You can use the minimum function
    city 
from airbnb_search_details
group by city -- we want one price per city 
