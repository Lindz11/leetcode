-- Find the number of apartments per nationality that are owned by people under 30 years old
-- Output the nationality along with the number of apartments. Sort records by the apartments count in
-- in descending order.
select 
    airbnb_hosts.nationality, -- we want to pull each nationality 
    sum(airbnb_hosts.host_id) as apartment_count --  we want the sum of each count 
from airbnb_hosts 
inner join airbnb_units 
on airbnb_hosts.host_id = airbnb_units.host_id -- we want to join by the host id 
where airbnb_units.unit_type = 'Apartment' and age < 30 -- we only want apartment units and ages under 30 
group by nationality -- group by nationality 
order by apartment_count desc -- we also want the answer in descending order 
