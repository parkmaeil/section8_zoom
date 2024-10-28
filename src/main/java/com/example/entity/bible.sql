    create table bible(
       bible_num int not null auto_increment,
       customer_id varchar(50) not null, -- FK(X)
       bible_word varchar(50) not null,
       bible_repent varchar(100) not null,
       bible_things varchar(100) not null,
       bible_implement varchar(100) not null,
       bible_date datetime default now(),
       primary key(bible_num)
    );