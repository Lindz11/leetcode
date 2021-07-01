-- Find the number of athletes who participated in the Olympics that hosted in European cities.
select count(distinct name) as n_atheletes
from olympics_athletes_events
where city in('Berlin', 'Athina', 'Lillehammer', 'London', 'Paris')
