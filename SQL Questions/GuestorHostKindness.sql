-- Guest Or Host Kindness -- Find whether hosts or guests give higher review scores based on their average review scores. Output the higher of the average review score rounded to the 2nd decimal spot (e.g., 5.11)
-- Step 1: Use round and avg functions to avg the review scores 
-- Step 2: Use the group by filter to group by from_type 
-- Step 3: Use the order by filer to order by avg_score
-- Step 4: LIMIT 1
select 
    round(avg(review_score),2) as avg_scores,
    from_type
from airbnb_reviews
group by 2
order by avg_scores desc 
LIMIT 1
