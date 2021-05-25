-- How many unique users have performed a search?
select  
    count(DISTINCT id_user) -- Since you want unique you need Distinct keyword
from airbnb_searches
where n_searches > 0 -- Then just make sure the searches are greater than 0
