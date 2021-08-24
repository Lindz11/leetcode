-- Population Census -- Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.
select 
    sum(ci.population) as sum_population
from city as ci
inner join country as co
on  ci.countrycode = co.code
where co.continent = 'Asia'
