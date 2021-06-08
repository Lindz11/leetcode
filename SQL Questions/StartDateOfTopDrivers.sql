-- Find contract starting dates of the top 5 most paid Lyft drivers. Consider drivers who are still working 
-- with Lyft
select 
    start_date --  we only want to pull the start date 
from lyft_drivers
where end_date IS NULL -- and the drivers end date should be null 
order by yearly_salary desc -- we want the highest salaries at the to
LIMIT 5 -- We only want 5 
