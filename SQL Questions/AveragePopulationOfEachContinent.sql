-- Average Popualtion Of Each Conitnent -- Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent) and their respective average city populations (CITY.Population) rounded down to the nearest integer
select 
    co.continent, 
    floor(avg(ci.population))
from city as ci 
inner join country as co 
on ci.countrycode = co.code
group by co.continent
