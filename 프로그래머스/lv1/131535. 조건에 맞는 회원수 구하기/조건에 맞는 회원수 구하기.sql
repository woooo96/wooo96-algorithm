-- 코드를 입력하세요
SELECT count(*) as USERS from user_info
where age between 20 and 29
and  DATE_FORMAT(joined, '%Y')=2021
;