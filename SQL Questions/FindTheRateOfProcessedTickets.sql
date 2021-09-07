-- Find the rate of processed tickets for each type -- Find the rate of processed tickets for each type.
-- Note rate is interpreted as average
-- Step 1: Use select and case when to find the rate per ticket  and select the type
-- Step 2: Group by the type of ticket
select
    type,
    sum(case when processed is TRUE then 1 else 0 end ) * 1.0 / count(*)  as processed_rate 
from facebook_complaints
group by 1
