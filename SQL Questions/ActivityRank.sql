-- Activity Rank -- Find the email activity rank for each user. Email activity rank is defined by the total number of emails sent. The user with the highest number of emails sent will have a rank of 1, and so on. Output the user, total emails, and their activity rank. Order records by the total emails in descending order. Sort users with the same number of emails in alphabetical order. In your rankings, return a unique value (i.e., a unique rank) even if multiple users have the same number of emails.
-- Step 1: This seems like a dense_rank problem
-- Step 2: Use a inner query to get the count of how many emails each user has sent
-- Step 3: Order by user asc, then count desc 
select 
    from_user,
    num_of_emails_sent,
    row_number () over (order by num_of_emails_sent desc, from_user asc) as rnk
from 
(
    select 
        count(*) as num_of_emails_sent,
        from_user 
    from google_gmail_emails
    group by from_user
) a
group by from_user, num_of_emails_sent
order by rnk asc
