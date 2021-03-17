-- Find the details of each customer regardless of whether the customer made an 
-- an order not. Output customer's first name, last name, and the city along 
-- with the corresponding order details. Sort records based on the customer's first name 
-- and the order details in ascending order
select 
    first_name,
    last_name,
    city, 
    orders.order_details
from customers 
left join orders 
    on customers.id = orders.cust_id
order by first_name, 
orders.order_details
