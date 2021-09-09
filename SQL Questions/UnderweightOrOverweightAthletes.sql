-- Underweight/Overweight Athletes -- Identify colleges with underweight and overweight athletes. Consider athletes with weight <= 50 pounds as underweight and players with weight >=200 pounds as overweight. Output the college along with the total number of overweight and underweight players. If the college does not have any underweight/overweight players, leave the college out of the output.
-- Step 1: Select the college
-- Step 2: Use the where filter to select count the athletes who way more or less than the given numbers 
-- Step 3: Make sure to count distinct names
select 
    college, 
    count(DISTINCT name) as num_of_athletes
from nfl_combine
where weight <= 50 or weight >= 200 
group by college
order by count(name) desc
