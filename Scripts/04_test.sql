SELECT NAME, USERID, PWD, EMAIL, PHONE, ADMIN FROM MEMBER;

INSERT INTO MEMBER VALUES ('박규영', 'parkgy', '1234', 'pgy@naver.com', '010-1111-2222', 0);

SELECT NAME, USERID, PWD, EMAIL, PHONE, ADMIN FROM MEMBER WHERE USERID = 'somi';

UPDATE MEMBER SET NAME = '문채원', PWD ='5678', EMAIL='mcw@gmail.com', PHONE='010-3333-5555', ADMIN='1' WHERE USERID = 'parkgy'
 
DELETE FROM MEMBER WHERE USERID = 'parkgy';