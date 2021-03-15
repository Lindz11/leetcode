-- Need to get better at naming my variables and the columns that I call
-- For this problem I need to remember to join the tables based on the users/guest
-- Then group by the gender and only needing to display one means we have use the limit function
select 
    gender, 
    avg(airbnb_reviews.review_score) as avg_score 
from airbnb_guests join airbnb_reviews on airbnb_guests.guest_id = airbnb_reviews.from_user
where from_type = 'guest'
group by gender
order by avg_score desc 
limit 1
