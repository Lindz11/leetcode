-- Find the countries with the most negative reviews. Output the country along with the number of negative reviews and sort records based on the number of negative reviews in descending order. You can ignore countries with no negative reviews.
select 
reviewer_nationality, 
count(distinct negative_review) as n_neg_reviews
from hotel_reviews
where review_total_negative_word_counts > 0
group by reviewer_nationality 
order by n_neg_reviews desc 
