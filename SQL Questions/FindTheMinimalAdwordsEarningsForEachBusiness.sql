-- Find the minimal adwords earnings for each business type
select 
business_type, 
min(adwords_earnings) as min_earnings
from google_adwords_earnings
group by business_type 

-- seems like a simple min function question
-- group by business type 
-- order doesnt matter for this question 
