-- Percentage Of Revenue Loss -- For each service, calculate the percentage of incomplete orders along with the revenue loss percentage. Your output should include the name of the service, percentage of incomplete orders, and revenue loss from the incomplete orders.
-- Step 1: Use sum function for monetary value, select the service name, 
-- Step 2: Use a case when to count all of the orders with status of order not equal to complete then divide by the sum of orders
-- Step 3: Do the same arithmetic for monetary_value 
-- Step 4: Group by the service_name
select 
    service_name,
    sum(case when status_of_order != 'Completed' then number_of_orders else 0 end) / sum(number_of_orders)::float * 100  as orders_loss_percent,
    sum(case when status_of_order != 'Completed' then monetary_value else null end) / sum(monetary_value)::float * 100 as profit_loss_percent
from uber_orders 
group by service_name
