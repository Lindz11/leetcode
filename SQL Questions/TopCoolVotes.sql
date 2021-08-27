-- Top Cool Votes -- Find the business and the review_text that received the highest number of  'cool' votes. Output the business name along with the review text.
-- Step 1; select the business name, review_text, 
-- Step 2: Use from to make the new table
-- Step 3: In from use business_name, review_text, and cool to filter 
-- Step 4: Use where to fitler the businesses by the number of cool votes 
-- Step 5: Group by business_name, review_text, cool
select 
    business_name, 
    review_text
from 
(
    select
        business_name,
        review_text,
        cool
    from yelp_reviews
    where cool = (select max(cool) from yelp_reviews)
    group by business_name, review_text,cool
) b
