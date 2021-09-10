-- Number Of User's Events -- Find the total number of events a user has triggered and the average number of days between the event date and date of when the user activated. Your output should include the user_id, event types, the number of events by event type, and the average date between the event dates and the user's activated date.
-- Step 1: Select the user_id, the event types, and the extract the days from when it occurred and when it was activated then use the avg function on that
-- Step 2: Inner join on the two tables to access the columns that u want 
-- Step 3: Group by user_id and the event_name
select
    e.user_id, 
    e.event_name,
    count(e.event_name) as num_of_events,
    avg(extract(day from e.occurred_at - u.activated_at)) as avg_date_diff
from playbook_events as e 
inner join playbook_users as u 
on e.user_id = u.user_id
group by e.user_id, e.event_name
