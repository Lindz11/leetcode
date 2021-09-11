-- Signup By Day -- Write a query that returns an array of signup ids by day. Order by most signups in descending order.
select 
    array_agg(signup_id) as array_agg,
    signup_start_date
from signups
group by signup_start_date
order by count(*) desc
