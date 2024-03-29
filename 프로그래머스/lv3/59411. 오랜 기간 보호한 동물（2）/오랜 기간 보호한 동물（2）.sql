-- 코드를 입력하세요
# SELECT I.ANIMAL_ID, I.NAME FROM ANIMAL_INS I
# JOIN ANIMAL_OUTS O ON I.ANIMAL_ID=O.ANIMAL_ID

SELECT I.ANIMAL_ID, I.NAME FROM ANIMAL_INS I, 
    (SELECT O.ANIMAL_ID, O.NAME, O.DATETIME-I.DATETIME AS DATETIME
     FROM ANIMAL_OUTS O, ANIMAL_INS I
     WHERE O.ANIMAL_ID=I.ANIMAL_ID) O
WHERE I.ANIMAL_ID=O.ANIMAL_ID
ORDER BY O.DATETIME DESC
LIMIT 2;