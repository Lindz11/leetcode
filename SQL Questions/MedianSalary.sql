-- Median Salary -- Find the median employee salary of each department. Output the department name along with the corresponding salary rounded to the nearest whole dollar.
-- Step 1: Use the percentile function to calculate to the 50% percentile 
--
select 
    department,
    percentile_cont(0.5) within group(order by salary) as median_salary
from employee
group by 1
