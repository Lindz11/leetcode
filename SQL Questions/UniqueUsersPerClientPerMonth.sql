-- Unique Users Per Client Per Month -- Write a query that returns the number of unique users per client per month
select 
    count(distinct user_id) as num_of_unique_users,
    client_id, 
    to_char(time_id,'MM') as month
from fact_events
group by 2,3
order by 1 desc 
