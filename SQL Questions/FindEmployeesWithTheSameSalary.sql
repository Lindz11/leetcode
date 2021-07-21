-- Find employees with the same salary
select 
DISTINCT
a.worker_id, 
a.first_name, 
a.salary
from worker as a
inner join worker as b
on a.salary = b.salary
and a.worker_id != b.worker_id
