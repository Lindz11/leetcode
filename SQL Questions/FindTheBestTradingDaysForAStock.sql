-- Find The Best Day For Trading AAPL Stock -- Find the best day of the month for AAPL stock trading. Output the result along with the average opening and closing prices. Sort in ascending order based on the average closing price.
-- Step 1: Select the day using the extract function
-- Step 2: Use the avg function for both the closing and opening prices
select
    extract(day from date) as days, 
    avg(open) as opening_price, 
    avg(close) as closing_price
from aapl_historical_stock_price
group by days
order by closing_price asc
