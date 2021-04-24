-- Find all messages which have references to either user 2 or 3.    
select * 
from facebook_messages_sent
where text LIKE '%3%' OR 
      text LIKE '%2%'
