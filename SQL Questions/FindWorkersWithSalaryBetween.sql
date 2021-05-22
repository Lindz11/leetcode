-- Find all workers whose salary lies between 100000 and 500000.
select 
    * -- We want all of the information from the worker 
from 
    worker
where
    salary >= 100000 and salary <= 500000 -- we only want the salaries between the 10 and 50 thresholds 
