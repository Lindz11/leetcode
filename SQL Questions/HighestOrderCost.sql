-- Highest Cost Orders -- Find the customer with the highest total order cost between 2019-02-01 to 2019-05-01. If customer had more than one order on a certain day, sum the order costs on daily basis. Output their first name, total cost of their items, and the date.
-- Step 1: We need to sum the cost per day 
-- Step 2: We need to find the 
select 
    c.first_name, 
    o.order_date,
    sum(o.total_order_cost) as total_cost
from customers as c 
left join orders as o 
on c.id = o.cust_id
where o.order_date between '2019-02-01' and '2019-05-01'
group by 1,2
order by total_cost desc 
LIMIT 1
