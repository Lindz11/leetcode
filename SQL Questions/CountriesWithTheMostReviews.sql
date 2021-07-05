-- Find the countries with the most positive reviews.
-- Output the country along with the number of positive reviews.
-- Sort records based on the number of positive reviews in descending order.
select
reviewer_nationality, 
count(positive_review) as n_positive_reviews 
from hotel_reviews
where review_total_positive_word_counts > 0 
group by reviewer_nationality
order by n_positive_reviews desc
