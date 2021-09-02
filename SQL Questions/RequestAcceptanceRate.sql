-- Requests Acceptance Rate -- Find the acceptance rate of requests which is defined as the ratio of accepted contacts vs all contacts. Multiply the ratio by 100 to get the rate.
-- Step 1: Use a case when in the select to see when accepted at is not nul l
-- Step 2: Multiply it by 1 and divide it by everything in the num ob entries then multiply by a hundred 
select 
    count(case when ts_accepted_at is not null then 1 else null end) * 1.0 / count(*) * 100 as acceptance_rate
from airbnb_contacts
