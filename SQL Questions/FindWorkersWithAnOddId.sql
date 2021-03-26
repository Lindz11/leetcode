-- Find workers and their corresponding information from the table with an odd number for their worker id.
select 
    worker_id,
    first_name,
    last_name,
    salary,
    joining_date,
    department
from worker
where mod(worker_id,2) = 1
