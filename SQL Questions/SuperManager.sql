-- Super Managers -- Find managers with at least 7 direct reporting employees. Output first names of managers.
-- Step 1: Use an inner join to match all of the manager_ids with the reguar id
-- Step 2: Use a having filter 
select 
    DISTINCT a.first_name 
from employee as a 
inner join employee as b 
on a.id = b.manager_id
where a.employee_title = 'Manager' 
group by 1
having count(a.department) >= 7
