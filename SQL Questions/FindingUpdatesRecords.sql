-- Finding Updated Records -- We have a table with employees and their salaries, however, some of the records are old and contain outdated salary information. Find the current salary of each employee assuming that salaries increase each year. Output their id, first name, last name, department ID, and current salary. Order your list by employee ID in ascending order.
-- Step 1: Make sure to only choose distinct ids
-- Step 2; Choose the max salary per person
-- Step 3: Group by the id, first and last name, and department
-- Step 4; Order by the id in asc order 
select 
    DISTINCT id,
    first_name,
    last_name,
    department_id,
    MAX(salary)
FROM ms_employee_salary 
group by 1,2,3,4
ORDER BY id asc 
