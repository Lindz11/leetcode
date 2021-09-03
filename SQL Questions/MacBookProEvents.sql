-- MacBook Pro Events -- Find how many events happened on MacBook-Pro per company in Argentina from users that do not speak Spanish. Output the company id, language of users, and the number of events performed by users
-- Step 1: Select the event_type, company_id, and language of the users 
-- Step 2: Use the where to filter by location in argentina, and laguage not being spanish 
-- Step 3: Group by the company_id 
select 
 count(e.event_type) as num_of_events, 
 u.company_id, 
 u.language
from playbook_events as e 
inner join playbook_users as u 
on e.user_id = u.user_id 
where e.location = 'Argentina' and u.language <> 'spanish' and e.device ilike '%macbook pro%'
group by u.company_id, u.language
