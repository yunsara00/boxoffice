DROP SEQUENCE PAYMENT_SEQ;
DROP TABLE PAYMENT;

CREATE SEQUENCE PAYMENT_SEQ;
CREATE TABLE PAYMENT(
	PAYMENT_NO NUMBER PRIMARY KEY,
	PAYMENT_TYPE VARCHAR2(50) NOT NULL,
	PAYMENT_PRICE VARCHAR2(50) NOT NULL,
	PAYMENT_STATE VARCHAR2(2) NOT NULL,
	PAYMENT_DATE DATE NOT NULL,
	PAYMENT_IMPUID VARCHAR2(100) NOT NULL,
	PAYMENT_REFUND VARCHAR2(2) NOT NULL,
	
	CONSTRAINT PAYMENT_CK1 CHECK(PAYMENT_STATE IN('Y','N')),
	CONSTRAINT PAYMENT_CK2 CHECK(PAYMENT_REFUND IN('Y','N'))
);

SELECT * FROM PAYMENT;

INSERT INTO PAYMENT
VALUES(PAYMENT_SEQ.NEXTVAL, 'pg', 30000, 'Y', '20-01-11', '1234', 'N')