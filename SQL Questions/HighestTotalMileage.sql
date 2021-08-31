-- Highest Total Miles -- You’re given a table of Uber rides that contains the mileage and the purpose for the business expense.  You’re asked to find business purposes that generate the most miles driven for passengers that use Uber for their business transportation. Find the top 3 business purpose categories by total mileage.
-- Step 1: Select the category, sum the miles
-- Step 2: Use where to check for not null entrances of purpose 
-- Step 3: Group by the category 
-- Step 4: Order by the sum of miles desc order 
-- Step 5: LIMIT 3 
select
    purpose, 
    sum(miles) as total_miles 
from my_uber_drives
where purpose is not null
group by purpose
order by total_miles desc
LIMIT 3
