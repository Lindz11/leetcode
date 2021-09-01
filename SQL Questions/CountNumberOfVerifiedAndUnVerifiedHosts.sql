-- Find the count of verified and non-verified Airbnb hosts -- Find how many hosts are verified by the Airbnb staff and how many aren't.
-- Step 1: Select the id and count them and host_identity_verified 
-- Step 2: Group by the host_identity_verified
select 
    host_identity_verified, 
    count(id) as n_hosts 
from airbnb_search_details
group by host_identity_verified
