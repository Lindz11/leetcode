-- The Blunder -- Write a query calculating the amount of error (i.e.:  average monthly salaries), and round it up to the next integer. Samantha was tasked with calculating the average monthly salaries for all employees in the EMPLOYEES table, but did not realize her keyboard's 0 key. 
select 
    ceil(avg(salary) - avg(replace(salary,'0','')))
from employees
-- If tou want to use round you will have to use round the same way you use avg, on both sides of the subtraction. 
