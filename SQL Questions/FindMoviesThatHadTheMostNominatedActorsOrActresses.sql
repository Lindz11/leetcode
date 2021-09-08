-- Find movies that had the most nominated actors/actresses -- Find movies that had the most nominated actors/actresses. Output the movie name alongside the number of nominees. Order the result in descending order.
-- Step 1: Select the movie and count nominess 
-- Step 2: Group by the movie 
-- Step 3: Order by the num_of_nominees
select 
    movie, 
    count(nominee) as num_of_nominees
from oscar_nominees
group by 1
order by num_of_nominees desc 
