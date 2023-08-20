-- 코드를 입력하세요
SELECT
    mp.MEMBER_NAME,
    rr.REVIEW_TEXT,
    DATE_FORMAT(rr.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM
    (
        SELECT
            MEMBER_ID
        FROM
            REST_REVIEW
        GROUP BY
            MEMBER_ID
        ORDER BY
            COUNT(*) DESC
        LIMIT 1
    ) most_reviewed_member
JOIN
    REST_REVIEW rr ON most_reviewed_member.MEMBER_ID = rr.MEMBER_ID
JOIN
    MEMBER_PROFILE mp ON rr.MEMBER_ID = mp.MEMBER_ID
ORDER BY
    rr.REVIEW_DATE ASC,
    rr.REVIEW_TEXT ASC;
