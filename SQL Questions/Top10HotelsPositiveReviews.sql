-- Find the top ten hotels with the most positive reviews in the summer (June-Aug) of 2017. Output the hotel 
-- name along with the corresponding number of positive reviews. Sort records based on the number of positive
-- reviews in descending order.
select 
hotel_name, 
count(positive_review) as num_of_positive_reviews
from hotel_reviews
where review_date between '06-01-2017' and '08-31-2017' -- use between keyword 
group by hotel_name
order by hotel_name desc -- order in descending order
LIMIT 10 -- limit at 10 
