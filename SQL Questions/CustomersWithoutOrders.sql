-- Find customers who have never made an order. Output the first name of the customer.
select 
    c.first_name 
from customers as c
left join orders as o -- you left join because u want the see when everything from customers table 
-- and matching from the other table 
on c.id = o.cust_id 
where o.order_quantity is NULL -- we only want names where order quantity is null 
