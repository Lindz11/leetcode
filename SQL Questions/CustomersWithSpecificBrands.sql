-- Customers with Specific Brands -- In the latest promotion, the marketing department wants to target customers who have bought products from two specific brands. Prepare a list of customers who purchased products from both the "Fort West" and the "Golden" brands.
-- Step 1: Select the customer id 
-- Step 2: Use the where filter and the in function to filter by keywords Fort West and Golden
-- Step 3: Use the having filter to only accept customer id's with a distinct count of 2 
-- Step 4: Group by customer_id
select 
    DISTINCT s.customer_id
from facebook_products as p 
inner join facebook_sales as s 
on p.product_id = s.product_id
where p.brand_name in ('Fort West','Golden')
group by s.customer_id
having count(DISTINCT p.brand_name) > 1
