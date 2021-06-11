-- Find matching hosts and guests pairs in a way that they are both of the same gender and nationality
-- Output the host id and the guest id of matched pair.
select 
    h.host_id, -- We want pairs of hosts and guests
    g.guest_id
from airbnb_hosts h
inner join airbnb_guests g 
on h.nationality = g.nationality -- we want the pairs when nationality and genders are equal 
and h.gender = g.gender 
