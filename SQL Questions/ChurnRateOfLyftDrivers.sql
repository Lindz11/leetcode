-- Churn Rate Of Lyft Drivers -- Find the global churn rate of Lyft drivers across all years. Output the rate as a ratio.
-- Step 1: Count the number of drivers still active and the number of the drivers that left by their end date 
-- Step 2: Use some arithmetic so that it will not displat 0 
select
count(case when end_date is not null then 1 else null end) * 1.0 / count(*) as churn_rate
from lyft_drivers
