-- Find the number of male and female employees per department and also their corresponding total
--  salaries. Output department names along with the corresponding number of female employees, the total 
-- salary of female employees, the number of male employees, and the total salary of male employees.
select 
employee.department, 
count(case when sex = 'F' then employee.id
        else NULL
        end) as females_per_department,
sum(case when sex = 'F'then employee.salary
        else 0
        end) as female_salary, 
count(case  when sex = 'M' then employee.id
        else NULL
        end) as males_per_department, 
sum(case when sex = 'M'then employee.salary
    else 0
    end) as male_salary
from employee
group by employee.department
