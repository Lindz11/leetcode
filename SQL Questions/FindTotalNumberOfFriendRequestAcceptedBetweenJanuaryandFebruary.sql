-- Find the total number of approved friendship requests in January and February -- Find the total number of approved friendship requests in January and February.
-- Step 1: count(sender)
-- Step 2: Use the where filter to only count the ones where date sent and date approived are not null 
select 
    count(sender) as approvals
from facebook_friendship_requests
where extract('month' from date_sent) = 1 and extract('month' from date_approved) = 2 or extract('month' from date_approved) = 1
