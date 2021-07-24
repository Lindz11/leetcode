-- Pizza Partners
select 
    p.name as name, 
    avg(o.amount) as avg
from postmates_orders as o
inner join postmates_markets as m
    on o.city_id = m.id
inner join postmates_partners as p 
    on o.seller_id = p.id
where m.name = 'Boston' and p.name ILIKE '%pizza%'
group by p.name

-- Use a inner join on all of the tables 
-- Use where to filter for Boston and ILIKE for pizza keyword
