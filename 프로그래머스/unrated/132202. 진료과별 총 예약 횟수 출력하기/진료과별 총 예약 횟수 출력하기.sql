-- 코드를 입력하세요
SELECT MCDP_CD AS 진료과코드, COUNT(*) AS 5월예약건수 FROM APPOINTMENT
WHERE APNT_YMD >= '2022-05-01 00:00:00' AND APNT_YMD < '2022-06-01 00:00:00'
GROUP BY MCDP_CD
ORDER BY 5월예약건수 ASC, 진료과코드 ASC;