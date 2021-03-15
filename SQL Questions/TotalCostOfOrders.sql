-- So anything that is lower than 0 should not be displayed 
-- Then we want to group by first name and cust id and order by first name
select 
    orders.cust_id,
    first_name, 
    sum(orders.order_cost) as total_cost
from customers
    join orders
    on customers.id = orders.cust_id
    where orders.order_cost > 0
group by first_name, orders.cust_id order by first_name asc;
