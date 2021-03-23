-- Find workers and their corresponding information from the table with an even number for their worker id.
select 
    worker_id,
    last_name,
    first_name,
    salary,
    joining_date,
    department
from worker
where worker_id % 2 = 0
