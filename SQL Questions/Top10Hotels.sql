-- Find the top ten hotels with the highest ratings. Output the hotel name along with the corresponding average score. Sort records based on the average score in descending order.
select 
    hotel_name,
    average_score
from hotel_reviews
group by
    hotel_name,
    average_score
order by average_score desc
LIMIT 10
