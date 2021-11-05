-- Transactions By Billing Method and Signup ID -- Get list of signups which have a transaction start date earlier than 10 months ago from March 2021. For all of those users get the average transaction value and group it by the billing cycle. Your output should include the billing cycle, signup_id of the user, and average transaction amount. Sort your results by billing cycle in reverse alphabetical order and signup_id in ascending order.
-- Step 1: Join all necessary tables together
-- Step 2: Select the signup_id, billing cycle, avg_transaction amount

select 
    p.billing_cycle, 
    s.signup_id, 
    avg(t.amt) as transaction
from signups as s 
inner join transactions as t on s.signup_id = t.signup_id
inner join plans as p on s.plan_id = p.id 
where transaction_start_date < '2021-03-01'::date - 10 * interval '1 month'
group by 1,2
