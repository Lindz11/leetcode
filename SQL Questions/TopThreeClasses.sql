-- Top Three Classes -- The marketing department wants to launch a new promotion for the most successful product classes. What are the top 3 product classes by total sales?
-- Step 1: Make a subquery to rank all of the product classes
-- Step 2: Join the two tables to go through make sure the rank is correct in correlation to sales 
-- Step 3:  Use the where filter to only look when rnk is less than or equal to 3
with cte as 
(
    select  
        p.product_class,
        dense_rank () over (order by count(*) desc) rnk
    from facebook_products as p 
    inner join facebook_sales as s 
    on p.product_id = s.product_id
    group by 1
)
select 
    product_class
from cte
where cte.rnk <=3
