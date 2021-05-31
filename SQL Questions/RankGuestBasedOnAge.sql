-- Rank guests based on their ages. Output the guest id along with the corresponding rank.
-- Order records by the age in descending order.
select 
    guest_id, -- we want to output the guest id 
    rank() over(
    order by age desc -- we want to ranked the data based on the age in descending order 
    ) age_rank
from airbnb_guests
