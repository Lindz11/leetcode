-- Workers With The Highest Salaries -- Find the titles of workers that earn the highest salaries. Output the highest-paid titles.
select 
    t.worker_title
from title as t 
inner join worker as w on 
t.worker_ref_id = w.worker_id
where w.salary = (select max(salary) from worker)
group by 1
