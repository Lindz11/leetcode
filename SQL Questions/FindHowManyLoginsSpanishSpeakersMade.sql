-- Find how many logins Spanish speakers made by country. Output the country along with the corresponding number of logins. Order records by the number of logins in descending order.
select
    e.location, 
    count(u.user_id) as n_logins
from playbook_events as e 
inner join playbook_users as u
on e.user_id = u.user_id
where u.language = 'spanish' and e.event_name = 'login'
group by e.location
order by n_logins desc 
