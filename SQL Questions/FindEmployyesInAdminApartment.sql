-- Find the number of employees working in the Admin department.
select 
    count(*) -- We just want the count and dont care we look at all info 
from worker
where department = 'Admin' -- Specify the department that we are looking at 
