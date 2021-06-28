-- To better understand the effect of the review count on the price, categorize the number of reviews into the following groups along with the price.
select 
    (case when number_of_reviews = 0 then 'NO'
        when number_of_reviews between 1 and 5 then 'FEW'
        when number_of_reviews between 6 and 15 then 'SOME'
        when number_of_reviews between 16 and 40 then 'MANY'
        when number_of_reviews > 40 then 'A LOT'
        end) as reviews_qualifications, 
        price
from airbnb_search_details
-- This questions is case sensitive
