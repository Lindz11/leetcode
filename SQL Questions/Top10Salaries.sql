-- Find the top 10 highest salaries and the corresponding information in the table
-- Sort records based on the salary in descending order.
select 
    * -- Asterisk since we want all of the info 
from worker
order by 
    salary desc -- Since we only want the highest sort in descending 
LIMIT 10 -- Since we only want 10 set a limit 
