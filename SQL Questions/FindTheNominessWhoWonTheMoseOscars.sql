-- Find the nominee who has won the most Oscars -- Find the nominee who has won the most Oscars. Output the nominee's name alongside the result. Order the result based on the number of wins in descending order.
-- Step 1: select the noominee, and count(winner)
-- Step 2: Use where clause to only look for when winner is true
-- Step 3: Group by nominee 
-- Step 4: Order by the num_of_wins desc order 
select 
    nominee, 
    count(id) as num_of_wins
from oscar_nominees
where winner is TRUE
group by nominee
order by num_of_wins
