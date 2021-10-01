-- Find the most profitable company in the financial sector of the entire world along with its continent -- Find the most profitable company from the financial sector. Output the result along with the continent.
-- Step 1: Select the company and continent
-- Step 2: Use the where filter to only look at companies in the financials sector
-- Step 3: Use the order by to order by profits in desc order 
select 
    company, 
    continent
from forbes_global_2010_2014
where sector = 'Financials'
order by profits desc 
LIMIT 1
