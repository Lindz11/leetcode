-- Top Company Where Users Use Desktop Only -- Write a query that returns the top company in terms of events where users use desktop only.
-- Step 1: Select the customer_id
-- Step 2: Use where to filer by desktop
-- Step 3: Order by the count event_type in desc order 
-- Step 4: Limit to 1 
select
    customer_id
from fact_events 
where client_id = 'desktop'
group by customer_id
order by count(event_type) desc
LIMIT 1
