-- Highest Salary In Department -- Find the employee with the highest salary per department. Output the department name, employee's first name along with the corresponding salary.
select 
    first_name, 
    department, 
    salary
from employee
where salary in (select max(salary) as salary from employee group by department)
group by department, first_name, salary
