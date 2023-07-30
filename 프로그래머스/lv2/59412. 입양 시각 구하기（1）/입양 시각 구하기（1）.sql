-- 코드를 입력하세요
SELECT HOUR(datetime) AS HOUR, COUNT(animal_id) AS COUNT
FROM animal_outs
WHERE HOUR(datetime) BETWEEN 9 AND 20
GROUP BY HOUR(datetime)
order by hour