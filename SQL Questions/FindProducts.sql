-- Find Products -- Find product ids whose average sales price is at least $3 and that are sold at least 2 times? Output product id and their brand.
-- Step 1: Join the two tables 
-- Step 2: Select the product_id and the brand_name
-- Step 3: Group by 1,2
-- Step 4: Use having filter to filter by avg(cost_in_dollar) and the count of product_id in sales table
select
    s.product_id, 
    p.brand_name
from facebook_products as p 
inner join facebook_sales as s 
on p.product_id = s.product_id
group by 1,2
having avg(cost_in_dollars) >= 3 and count(s.product_id) >= 2
