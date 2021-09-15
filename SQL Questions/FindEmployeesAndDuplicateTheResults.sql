-- Find employees in the HR department and output the result with one duplicate -- Find employees in the HR department and output the result with one duplicate. Output the first name and the department of employees.
-- Step 1: Seelct first name 
-- Step 2: Use where clause to filter by department = HR 
-- Step 3: Union all so that you can select the entries from the same table twice and output and one
select 
    first_name, 
    department
from worker 
where department = 'HR'
union all  
select 
    first_name, 
    department
from worker 
where department = 'HR'
