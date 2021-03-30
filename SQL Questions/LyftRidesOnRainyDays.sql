-- Find all Lyft rides which happened on rainy days before noon
select 
    index,
    weather,
    hour,
    travel_distance,
    gasoline_cost
from lyft_rides
where weather = 'rainy' and hour <= 12
