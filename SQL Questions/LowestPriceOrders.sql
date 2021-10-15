-- Lowest Priced Orders -- Find the lowest order cost of each customer. Output the customer id along with the first name and the lowest order price. 
-- Step 1: Join the two tables togther 
-- Step 2: Use min function for the total order cost 
-- Step 3: Select the customer id and the first name columns 

select 
    o.cust_id, 
    c.first_name,
    min(o.total_order_cost) as min_costs
from customers as c 
inner join orders as o 
on c.id = o.cust_id
group by 1,2
order by min_costs desc
