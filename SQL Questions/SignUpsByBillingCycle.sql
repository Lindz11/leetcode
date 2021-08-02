-- Signups By Billing Cycle -- Write a query that returns a table containing the number of signups for each weekday and for each billing cycle frequency.
select 
extract(dow from signup_start_date) as weekday,
count(distinct case when p.billing_cycle = 'annual' then s.signup_id end) as annual,
count(distinct case when p.billing_cycle = 'monthly' then s.signup_id end) as monthly,
count(distinct case when p.billing_cycle = 'quarterly' then s.signup_id end) as quarterly
from signups as s
inner join plans as p 
on s.plan_id = p.id
group by weekday
