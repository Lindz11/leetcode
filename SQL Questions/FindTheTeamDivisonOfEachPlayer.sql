-- Find the team division of each player. Output the player name along with the corresponding team division.
select 
    t.division, 
    p.player_name 
from college_football_teams as t
inner join college_football_players as p
on p.school_name = t.school_name
