-- Find the total assets of the energy sector.
select 
    sector, 
    sum(assets) as total_assets
from forbes_global_2010_2014
where sector = 'Energy'
group by sector
