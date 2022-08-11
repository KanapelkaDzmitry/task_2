create sequence hibernate_sequence start 1 increment 1;

create table enter_balance
(
    id                 bigserial not null,
    active             double precision,
    passive            double precision,
    account_id         int8,
    summary_balance_id int8,
    primary key (id)
);

create table money_flow
(
    id                 bigserial not null,
    debit              double precision,
    credit             double precision,
    account_id         int8,
    summary_balance_id int8,
    primary key (id)
);

create table proceed_balance
(
    id                 bigserial not null,
    active             double precision,
    passive            double precision,
    account_id         int8,
    summary_balance_id int8,
    primary key (id)
);

create table summary_balance
(
    id         bigserial not null,
    file_id    int8,
    account_id int8,
    primary key (id)
);

create table file
(
    id        bigserial not null,
    file_name varchar(255),
    primary key (id)
);

alter table if exists enter_balance
    add constraint forgein_key_enter_balance_to_summary_balance
    foreign key (summary_balance_id)
    references summary_balance;

alter table if exists money_flow
    add constraint forgein_key_money_flow_to_summary_balance
    foreign key (summary_balance_id)
    references summary_balance;

alter table if exists proceed_balance
    add constraint forgein_key_proceed_balance_to_summary_balance
    foreign key (summary_balance_id)
    references summary_balance;

alter table if exists summary_balance
    add constraint forgein_key_summary_balance_to_file
    foreign key (file_id)
    references file;