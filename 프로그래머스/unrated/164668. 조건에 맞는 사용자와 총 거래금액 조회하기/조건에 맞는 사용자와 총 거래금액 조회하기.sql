-- 코드를 입력하세요
SELECT A.user_id, A.nickname, SUM(B.price) AS TOTAL_SALES
FROM used_goods_user AS A
JOIN used_goods_board AS B ON A.user_id = B.writer_id
WHERE B.status = 'done'
GROUP BY A.user_id, A.nickname
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES ASC;