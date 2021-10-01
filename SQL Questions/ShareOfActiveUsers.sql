-- Share of Active Users -- Return the share of monthly active users in the United States (US). Active users are the ones with an "open" status in the table.
-- Step 1: Use sum function with case when to select all with a status of open divided by all of the users of the app 
-- Step 2: Use where filter to filter by the country = 'USA'
select
    sum(case when status = 'open' then 1 else 0 end) :: FLOAT/ count(*) as share_of_active_users 
from fb_active_users
where country = 'USA'
