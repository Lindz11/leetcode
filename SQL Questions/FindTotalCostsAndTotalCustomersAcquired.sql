-- Find the total costs and total customers acquired in each year. Output the year along with corresponding 
--  total money spent and total acquired customers.
select 
year, 
sum(money_spent) as total_money_spent, -- We just want the sum of the money spent
sum(customers_acquired) as total_customer_acquired -- We want the sum of customers acquired 
from uber_advertising
group by year -- group the totals by the year 
