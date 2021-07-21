-- Find departments with less than 5 employees
select 
department,
count(worker_id) as num_of_employees
from worker
group by department
having count(worker_id) < 5
