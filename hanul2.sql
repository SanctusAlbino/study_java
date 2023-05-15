drop table TBL_BOARD;

create table BOARD (
    BOARD_NO number primary KEY,
    Board_title varchar2(100) not null,
    board_content varchar2(2000) not null,
    write varchar2(100),
    write_date VARCHAR2(20)
);

insert into board (BOARD_NO, Board_title, board_content, write, write_date )
            values (6, 'title7','content2', null, null);

select max(board_no)+1 from board;


rollback;
commit;
select * from board order by board_no asc;

select * from board where Board_title like '%2%' or BOARD_NO  like '%2%';
--update table¸í set ¹Ù²ÜÄÃ·³ = ¹Ù²Ü°ª where Á¶°Ç
update board set board_title = 'titleAA' where board_no=1;
delete from board where board_no = 2;