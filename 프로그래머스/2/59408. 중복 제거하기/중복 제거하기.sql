-- 코드를 입력하세요
SELECT Count(DISTINCT NAME) as count
from ANIMAL_INS
where NAME IS NOT NULL;