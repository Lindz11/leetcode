-- For this problem we need to go through the table and select the department, first name, salary, and avg salary per department
-- Then we group by the department, first name, and salary
-- Then we display the data in ascending order by the department name
select 
    department,
    first_name, 
    salary, 
    avg(salary) over (partition by department) as avg
from employee
group by department, salary, first_name
order by department asc 
