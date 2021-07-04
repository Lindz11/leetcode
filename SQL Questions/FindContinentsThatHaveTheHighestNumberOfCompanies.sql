-- Find continents that have the highest number of companies.
-- Output the continents along with the corresponding number of companies.
-- Order results based on the number of companies in descending order.
select
    continent, 
    count(company) as n_companies
from forbes_global_2010_2014
group by continent
order by n_companies desc 
