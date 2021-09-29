-- Submission Types -- Write a query that returns the user ID of all users that have created at least one ‘Refinance’ submission and at least one ‘InSchool’ submission.
-- Step 1: Write a subquery of the counts for each person whole case a refinance and inschool submission 
-- Step 2:Use where to only select ones with both who are greater than 0 
select 
    user_id
from 
(
    select
        user_id, 
        count(case when type = 'Refinance' then 1 else null end) as ref_count, 
        count(case when type = 'InSchool' then 1 else null end) as in_count
    from loans 
    group by 1
) as a 
where ref_count > 0 and in_count > 0
