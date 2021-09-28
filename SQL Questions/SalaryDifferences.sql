-- Salaries Differences -- Write a query that calculates the difference between the highest salaries found in the marketing and engineering departments. Output just the difference in salaries.
-- Step 1: Use a subquery to filer the maximum for each category by picking its salary 
-- Step 2: Subtrack the marketing category from the engineering category
select 
    max_mark - max_eng
from 
(
    select 
        max(case when db_dept.department = 'engineering' then db_employee.salary else null end) as max_eng,
        max(case when db_dept.department = 'marketing' then db_employee.salary else null end) as max_mark
    from db_employee 
    inner join db_dept on db_employee.department_id = db_dept.id
) as a
