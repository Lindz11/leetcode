-- Find customers who appear in the orders table more than three times.
select 
    cust_id as customer_id
from orders
group by customer_id
having count(*) > 3
