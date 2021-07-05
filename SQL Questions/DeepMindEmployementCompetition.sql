-- Find the winning teams of DeepMind employment competition.
-- Output the team along with the average team score.
-- Sort records by the team score in descending order.
select 
p.team_id, 
avg(s.member_score) as avg_team_score
from google_competition_participants as p
inner join google_competition_scores as s 
on p.member_id = s.member_id
group by team_id
order by team_id desc
