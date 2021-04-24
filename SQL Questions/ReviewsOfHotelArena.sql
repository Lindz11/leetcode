-- Find the total number of reviews for each review score earned by 'Hotel Arena'. Output the hotel name
-- (which should be 'Hotel Arena'), review score along with the corresponding total number of reviews.
-- Order records by the reviewer score in ascending order.
select 
    hotel_name,
    reviewer_score, 
    count(total_number_of_reviews)
from hotel_reviews
where hotel_name = 'Hotel Arena'
group by hotel_name,reviewer_score
order by reviewer_score asc
