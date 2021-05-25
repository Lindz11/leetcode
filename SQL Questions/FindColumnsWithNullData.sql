-- Find all search details where data is missing from the host_response_rate column.
select 
    * -- We dont care about specific keywords so we use astrisks 
from airbnb_search_details
where host_response_rate IS NULL -- you have to use is null keyword 
