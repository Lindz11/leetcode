-- Find "favorite" customers based on the order count and the total cost
-- of orders. A customer is considered as a favorite if he or she has
-- placed more than 3 orders and with the total cost of orders more than
-- $100. The `order_cost` column is the total cost of the order. Output
-- the customer's first name, city, number of orders, and total cost of orders.
select 
    c.first_name as name, 
    c.city,
    count(o.order_quantity) as order_count,
    sum(order_cost) as total_cost
from customers c
inner join orders o
on c.id = o.cust_id
group by c.first_name,c.city
having sum(o.order_cost) > 100 and count(o.order_quantity) > 3
