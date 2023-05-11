--CRUD (WEB���� �⺻ 4���� ������ ���  CRUD��� ǥ���� �Ѵ�.)
--����, ����, ����
--DML (DATA MANIPULATION LANGUAGE) - ���� INSERT, UPDATE, DELETE (SELECT)

--DDL (Data Definition Language) - CREATE, ALTER, DROP (���̺��� �����ϰ�, �����ϰ�, ����)

--JAVA (JDBC)->(SQL)DBMS -> DB(Exceló�� ���常 �ϴ� â��)

SELECT 1 from dual;
-- KEY �����ͺ��̽��� ����ȭ ������ ��ġ�µ� �� �� �����͸� �ϳ��� ���� �Ǵ� �����ϰ� �Ҽ��ְ� ���ִ� 
-- �ĺ��� (������� ġ�� �� �ĺ���: �ֹε�Ϲ�ȣ, �� �ĺ���:�θ���� �ֹε�Ϲ�ȣ)
-- NUMBER(int), VARCHAR2(String), NVARCHAR2(String)
CREATE TABLE KGH (
    COL1 VARCHAR2(1000),
    COL2 NUMBER,
    COL3 VARCHAR2(1000),
    COL4 VARCHAR2(1000),
    COL5 VARCHAR2(1000)
);
-- ����� ������?
DROP TABLE KGH;

INSERT INTO KGH (COL1, COL2, COL3, COL4, COL5) VALUES ('��ȣ��1', '1', 'C', 'D', 'E');
INSERT INTO KGH (COL1, COL2, COL3, COL4, COL5) VALUES ('��ȣ��1', '1', 'B', 'D', 'E');
INSERT INTO KGH (COL1, COL2, COL3, COL4, COL5) VALUES ('A', '1', 'C', 'C', 'E');
INSERT INTO KGH (COL1, COL2, COL3, COL4, COL5) VALUES ('A', '1', 'C', 'D', 'E');
INSERT INTO KGH (COL1, COL2, COL3, COL4, COL5) VALUES ('A', '1', 'C', 'C', 'E');

COMMIT;
--��� �۾��� ��� �͵��� �ǵ�����. (ROLLBACK); ROLLBACK �Ǵ� COMMIT�� �Ҷ��� ������!!!! �ǵ��� ��� ����..
--��� �۾��� ���� Ȯ�� (COMMIT);
--Ʈ����� : ��� �۾��� �ּ��� ���� : DBMS�� �۾��� �س��� Ȯ���Ҳ����� ��ٸ��»���.
SELECT * FROM KGH;

ROLLBACK;

UPDATE KGH SET COL1 = '��ȣ��ٲ�' WHERE COL3= '10000';

DELETE FROM KGH;

--DATA TYPE : NUMBER(int), VARCHAR2 (String)
--CREATE TABLE ���̺��̸� (
--�÷��̸� ������Ÿ��(ũ��), <- �÷��� ��������� �޸��� �������� �÷� �̸� ������Ÿ�Ժκ��� �ݺ�
--);
DROP TABLE KOREA_PEOPLE;
CREATE TABLE KOREA_PEOPLE (
    JUMIN_NUM NUMBER PRIMARY KEY,
    NAME VARCHAR2(20),
    GENDER NUMBER
);
INSERT INTO KOREA_PEOPLE(JUMIN_NUM, NAME, GENDER) VALUES ('2', '�̸�', '2');

SELECT * FROM korea_people;

COMMIT;

--��ȣ�� : �ҳ���, �ָ޴�: ���. �ּ�: ~~~~, ����: 11
--���� ���������� ���п��� ������ �����͸� ���� DB�� ������ �ϰ�ʹٸ� ��� �ؾ��ұ�?
--�ش� ������ ������ ���̺��� �����, INSERT���� �̿��ؼ� �����͸� �־��(2��)
--��ȸ
CREATE TABLE GWANGJU_RESTAURANT (
    SERIAL_NUMBER NUMBER PRIMARY KEY,
    NAME VARCHAR2(1000),
    MAIN_MENU VARCHAR2(1000),
    ADDRESS VARCHAR2 (1000)
);

INSERT INTO gwangju_restaurant(SERIAL_NUMBER, NAME, MAIN_MENU, ADDRESS) VALUES ('2', '�ҳ�', '���', '���� �濭��');

SELECT * FROM gwangju_restaurant;

ROLLBACK;

COMMIT;