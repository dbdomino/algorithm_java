package com.ex.programmers;

public class 특정물고기잡은수 {
    /**
     FISH_INFO   테이블 (잡은 물고기 테이블, 물고기 길이가 10cm 이하일 경우 length가 널임)
     select * from FISH_INFO as A where A.LENGTH <= 10;
     FISH_NAME_INFO 테이블 (물고기 이름 테이블, FISH_INFO의 FISH타입에 외래키로 값을 줌.)

     FISH_INFO에서 잡은 BASS, SNAPPER 물고기 (물고기 이름)

     select * from FISH_INFO as A join FISH_NAME_INFO as B on A.FISH_TYPE=B.FISH_TYPE where B.FISH_NAME = 'BASS' or B.FISH_NAME = 'SNAPPER';

     select count(*) as FISH_COUNT  from FISH_INFO as A join FISH_NAME_INFO as B on A.FISH_TYPE=B.FISH_TYPE where B.FISH_NAME = 'BASS' or B.FISH_NAME = 'SNAPPER';
     */
}
