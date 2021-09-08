-- Customer Revenue In March -- Output the revenue along with the customer id and sort the results based on the revenue in descending order
-- Step 1: Select the cust_id and sum up the total order costs per customer 
-- Step 2: Use the where filter to select rows only with the order date in month 3 
-- Group by the cust_id 
select 
    cust_id, 
    sum(total_order_cost) as total_revenue 
from orders
where extract('month' from  order_date) = 3 and extract('year' from order_date) = 2019
group by cust_id
order by total_revenue desc 
