-- Recent Refinance Submissions -- Write a query that joins this submissions table to the loans table and returns the total loan balance on each user’s most recent ‘Refinance’ submission. Return all users and the balance for each of them.
-- Step 1: Inner join the two tables together based on Id 
-- Step 2: Select the users and the balance 
-- Step 3: Use where filter to see all balanced where l.type is refinance 
-- The Id's for this question are already joined by latest refinance 
select 
    l.user_id, 
    s.balance
from loans as l 
inner join submissions as s 
on l.id = s.loan_id
where l.type = 'Refinance' 
