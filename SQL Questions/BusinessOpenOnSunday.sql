-- Find the number of businesses that are open on Sundays. Output the slot of operating hours along with the corresponding number of businesses open during those time slots. Order records by total number of businesses opened during those hours in descending order.
select 
    h.sunday, 
    count(*) as total_business
from yelp_business_hours h
left join yelp_business b
on h.business_id = b.business_id
where h.sunday IS NOT NULL and is_open = 1
group by h.sunday

-- Need to specify is open column has a 1 
