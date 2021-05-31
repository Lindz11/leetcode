-- Output the nationality along with the corresponding total number of available beds.
-- Sort records by the total available beds in descending order.
select 
    nationality,
    sum(airbnb_apartments.n_beds) as total_beds_available -- use a sum function to count all the beds 
from airbnb_hosts
inner join airbnb_apartments -- inner join the two tables 
on airbnb_hosts.host_id = airbnb_apartments.host_id -- inner join them based on host id 
group by nationality
order by total_beds_available desc -- order the new table in desc order 
