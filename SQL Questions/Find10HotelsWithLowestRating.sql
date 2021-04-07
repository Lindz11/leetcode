-- Find the ten hotels with the lowest ratings. Output the hotel name along with the corresponding average score. Sort records based on the average score in ascending order.
select 
    DISTINCT hotel_name,
    average_score
from hotel_reviews
order by average_score asc
LIMIT 10
