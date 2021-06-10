-- Find the number of hosts that have apartments in countries of which they are not citizens.
select 
    count(DISTINCT h.host_id)  -- we only want unique hosts 
from airbnb_hosts h
inner join airbnb_apartments a -- join the two tables based on the id 
on a.host_id = h.host_id
and h.nationality <> a.country --  This <> symbol is equivalent to NOT 
