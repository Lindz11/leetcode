-- User Email Labels -- Find the number of emails received by each user under each built-in email label. The email labels are: 'Promotion', 'Social', and 'Shopping'. Output the user along with the number of promotion, social, and shopping mails count,.
-- Step 1: Use case when to get each email label and the to_user
-- Step 2 : Use count case when for all of the labes 
-- Step 3: Group by the user 
select 
    e.to_user, 
    count( case when l.label = 'Social' then 1 else null end) as Social_count, 
    count( case when l.label = 'Promotion' then 1 else null end) as Promotion_count,
    count(case when l.label = 'Shopping' then 1 else null end) as Shopping_count
from google_gmail_emails as e
inner join google_gmail_labels as l 
on e.id = l.email_id
group by e.to_user
