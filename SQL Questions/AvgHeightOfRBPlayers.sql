-- Find the average height of RB position players by division.
-- Output the team division along with the average height.
select 
    division, -- We want the division
    avg(college_football_players.height) -- and the avg height 
from college_football_teams
inner join college_football_players on college_football_teams.id = college_football_players.id -- we can inner join on the id of each table 
where college_football_players.position = 'RB' -- We only want positions with RB 
group by division
