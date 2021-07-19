-- Win-to-Nomination Ratio - Calculate the win-to-nomination ratio for each nominee. 
select 
nominee, 
sum(case 
    when winner = 'TRUE' then 1.0 else 0.0 end)/count(*) as ratio
from oscar_nominees
group by nominee
order by ratio desc 
-- This might invole a little math or a case when 
-- where we look to see when winner is true or false
-- group by nominess 
-- order by ratio desc
-- Need to put .0 so it can be recognized as flot arithmetic 
