-- Find the details of oscar winners between 2001 and 2009.
select 
    category,
    year,
    nominee, 
    movie, 
    winner,
    id
from oscar_nominees
where year >=2001 and year <=2009 and winner='TRUE'
