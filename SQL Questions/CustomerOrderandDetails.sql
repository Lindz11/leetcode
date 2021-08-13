-- Customer Orders and Details -- Find the number of orders, the number of customers, and the total cost of orders for each city. Only include cities that have made at least 5 orders and count all customers in each city even if they did not place an order.
select 
    c.city, 
    count(o.order_details) as num_of_orders,
    count(DISTINCT c.id) as cust_per_city,
    sum(o.total_order_cost) as sum_of_costs
from customers as c 
left join orders as o
on c.id = o.cust_id
group by c.city
having count(DISTINCT order_details) > 4
-- You want EVERY customer so that is why you do a left join on the customer table no matter if they made an order or not. 
