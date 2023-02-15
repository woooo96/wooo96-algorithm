-- 코드를 입력하세요
SELECT animal_type, 
    case when name is null then 'No name' 
    when name is not null then name
    END NAME,
    sex_upon_intake
    from animal_ins