-- Count the number of user events performed by MacBookPro users -- Count the number of user events performed by MacBookPro users.Output the result along with the event name. Sort the result based on the event count in the descending order.
-- Step 1: Select the event_name , and count the user_id for the even type 
-- Step 2: Use where clause and ilike pick only  machbook pro devices 
-- Step 3: Group by event name 
-- Step 3: Order by the count desc order 
select 
event_name,
count(event_name) as num_of_user_events 
from playbook_events
where device ilike '%macbook pro%'
group by event_name
order by num_of_user_events desc 
