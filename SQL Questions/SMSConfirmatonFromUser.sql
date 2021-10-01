-- SMS Confirmations From Users -- Facebook sends SMS texts when users attempt to 2FA (2-factor authenticate) into the platform to log in. In order to successfully 2FA they must confirm they received the SMS text message. Confirmation texts are only valid on the date they were sent. Unfortunately, there was an ETL problem with the database where friend requests and invalid confirmation records were inserted into the logs, which are stored in the 'fb_sms_sends' table. These message types should not be in the table. Fortunately, the 'fb_confirmers' table contains valid confirmation records so you can use this table to identify SMS text messages that were confirmed by the user.
-- Step 1: Use the sum function and case when to only select messages that have a type of confirmation
-- Step 2: Divide it by all of the things found in the table for confimrers
-- Step 3: Right join the sms_sends tbale with with the confirmers table 
-- Step 4: Use the where filter to only count the dates that are on august 4th, 2020 
select 
    sum(case when s.type = 'confirmation' then 1 else 0 end) :: NUMERIC/ count(s.*) * 100 as percentage_of_confirmations
from fb_sms_sends as s 
right join fb_confirmers as c on s.phone_number = c.phone_number
where c.date = '2020-08-04'
