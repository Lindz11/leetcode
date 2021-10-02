-- Questions in Second Quarter -- How many searches were there in the second quarter of 2021?
-- Step 1: Use count function on search_query column 
-- Step 2: Use where filter to only select only second quarter months 
select 
    count(search_query) as num_of_questions
from fb_searches
where extract(month from date) >= 4 and extract(month from date) < 7
-- The second quarter when looked up is defined as april 1st to june 30th 
