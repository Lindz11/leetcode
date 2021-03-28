-- Find the number of Yelp businesses that sell pizza.
-- You can use the keyword like with % to look up a keyword in a paragraph 
select 
    count(business_id)
from yelp_business
where categories like '%Pizza%'
