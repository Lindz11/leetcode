-- Find the top five hotels with the highest total reviews given by the most active reviewer. Output the hotel name along with the highest total reviews. Order records based on the highest total reviews in descending order.
select 
hotel_name, 
max(total_number_of_reviews_reviewer_has_given) as max_total_reviews
from hotel_reviews
group by hotel_name
order by max_total_reviews desc 
LIMIT 5
