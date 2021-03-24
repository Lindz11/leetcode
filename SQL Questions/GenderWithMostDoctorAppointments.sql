-- Find the gender that has made the most number of doctor appointments.
-- Output the gender along with the corresponding number of appointments.
select 
    gender, 
    COUNT(DISTINCT patientid)
from medical_appointments
group by gender
LIMIT 1
