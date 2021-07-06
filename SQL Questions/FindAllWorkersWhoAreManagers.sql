-- Find all workers who are also managers.    
-- Output the first name along with the corresponding title.
select 
* 
from worker as w 
inner join title as t 
on t.worker_ref_id = w.worker_id
where t.worker_title = 'Manager'
