-- Old And Young Athletes -- Find the old-to-young player ratio for each Olympic games. 'Old' is defined as ages 50 and older and 'young' is defined as athletes 25 or younger. Output the Olympic games, number of old athletes, number of young athletes, and the old-to-young ratio.
-- Step 1: You do a subquery to take keep only distinct Id's 
-- Step 2: You select the game, age, and id, in the subquery, 
-- Step 3: Outside you select the game 
-- Step 4: 3 Case whens for old people, young people, and the ratio you want. 
select 
    games, 
    sum(case when age >= 50 then 1 else 0 end) as old_athletes, 
    sum(case when age <= 25 then 1 else 0 end) as young_athletes,
    sum(case when age >= 50 then 1 else 0 end) :: FLOAT / sum(case when age <= 25 then 1 else 0 end) as old_to_young_ratio
from 
(
    select 
        DISTINCT id,
        games,
        age 
    from olympics_athletes_events
) as a
group by games
