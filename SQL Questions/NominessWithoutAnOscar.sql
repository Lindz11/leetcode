--  Nominees Without An Oscar -- Find the nominees who have been nominated the most but have never won an Oscar. Output the number of unsuccessful nominations alongside the nominee's name. Order records based on the number of nominations in descending order.
-- Step 1: Find all of the nominees with a oscar 
-- Step 2: Use that list to find all names NOT on that list 
-- Step 3: Get each nominees distinct nomination count
-- Step 4: Order by nomination count in desc order 
-- This is a where problem to combine nominees we dont want in our answer
select 
    nominee, 
    count(DISTINCT id) as num_of_nominations
from oscar_nominees
where nominee not in 
(
    select 
        nominee
    from oscar_nominees 
    where winner is TRUE
)
group by nominee
order by num_of_nominations desc 
