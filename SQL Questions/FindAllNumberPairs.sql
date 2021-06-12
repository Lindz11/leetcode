-- Find all number pairs whose first number is smaller than the second one and the product of two numbers
--  is larger than 11. Output both numbers in the combination.
select 
    DISTINCT -- We only want distinct number pairs
    a.number as num1,
    b.number as num2
from transportation_numbers a 
inner join transportation_numbers b 
on a.number < b.number -- where the first is less than the second 
and a.number*b.number > 11 -- and the multiplaction is greater than 11
