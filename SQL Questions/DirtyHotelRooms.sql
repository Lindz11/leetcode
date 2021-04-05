-- Find hotels in the Netherlands that got complaints from guests about room dirtiness. Output all the columns in your results
select 
    *
from hotel_reviews
where negative_review  Ilike '%dirty%'
