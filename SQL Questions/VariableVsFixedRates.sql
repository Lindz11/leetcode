-- Variable vs Fixed Rates -- Write a query that returns binary description of rate type per loan_id. The results should have one row per loan_id and two columns: for fixed and variable type. 
-- Step 1: Select the loan_id, 
-- Step 2: Do a case when for fixed and variable 
-- Step 3: Group by laon_id, rate_type
select 
    loan_id, 
    case when rate_type = 'fixed' then 1 else 0 end as fixed, 
    case when rate_type = 'variable' then 1 else 0 end as variable
from submissions
group by loan_id, rate_type
