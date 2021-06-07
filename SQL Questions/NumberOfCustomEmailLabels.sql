-- Find the number of occurrences of custom email labels for each user receiving an email. Output the
-- receiver user id, label, and the corresponding number of occurrences.
select 
    google_gmail_emails.to_user, -- we want to see who the email is going to 
    google_gmail_labels.label, -- we want the label 
    count(google_gmail_labels.label) -- and count of aLl labels for each user 
from google_gmail_emails
inner join google_gmail_labels 
on google_gmail_emails.id = google_gmail_labels.email_id -- join so we can match labels with ids 
where google_gmail_labels.label ILIKE '%Custom%' -- sort labels bu keyword customs
group by google_gmail_emails.to_user, google_gmail_labels.label
