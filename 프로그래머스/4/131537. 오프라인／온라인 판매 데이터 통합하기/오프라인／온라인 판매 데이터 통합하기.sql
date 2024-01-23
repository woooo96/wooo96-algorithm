WITH ONLINE as (
select DATE_FORMAT(SALES_DATE, '%Y-%m-%d') as SALES_DATE
     , PRODUCT_ID
     , USER_ID
     , SALES_AMOUNT
  from ONLINE_SALE
 where SALES_DATE between '2022-03-01' and '2022-03-31'
),
OFFLINE as (
select DATE_FORMAT(SALES_DATE, '%Y-%m-%d') as SALES_DATE
     , PRODUCT_ID
     , null as USER_ID
     , SALES_AMOUNT
  from OFFLINE_SALE
 where SALES_DATE between '2022-03-01' and '2022-03-31'
)
select  *
  from (select * from ONLINE
        union 
        SELECT * from OFFLINE) as ONOFF
 order by ONOFF.SALES_DATE asc, ONOFF.PRODUCT_ID asc, ONOFF.USER_ID asc;
