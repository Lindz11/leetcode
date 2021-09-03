-- Top Businesses With Most Reviews -- Find the top 5 businesses with most reviews. Assume that each row has a unique business_id such that the total reviews for each business is listed on each row. Output the business name along with the total number of reviews and order your results by the total reviews in descending order.
-- Step 1: Rank by review count in desc order 
-- Step 2: Use rank to only outpust business 5 and up 
select
    name, review_count
from(
    select 
        name, review_count,
        rank() over(order by review_count desc) as rnk
    from yelp_business) as t
where rnk<=5
