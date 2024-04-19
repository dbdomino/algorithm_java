
select count(*) as FISH_COUNT  from FISH_INFO as A join FISH_NAME_INFO as B on A.FISH_TYPE=B.FISH_TYPE where B.FISH_NAME = 'BASS' or B.FISH_NAME = 'SNAPPER';