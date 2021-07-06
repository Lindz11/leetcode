-- Find the duplicate records in the dataset. Output the worker title, affected_from date, and the number of times the records were duplicated
select 
    worker_title, 
    affected_from,
    count(*) as n_times 
from title
group by worker_title, affected_from
having count(*) > 1
