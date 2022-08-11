create sequence hibernate_sequence start 1 increment 1;

create table enter_balance
(
    id      bigserial not null,
    active  double precision,
    passive double precision,
    file_id int8,
    account_id int8,
    primary key (id)
);

create table money_flow
(
    id      bigserial not null,
    debit  double precision,
    credit double precision,
    file_id int8,
    account_id int8,
    primary key (id)
);

create table proceed_balance
(
    id      bigserial not null,
    active  double precision,
    passive double precision,
    file_id int8,
    account_id int8,
    primary key (id)
);

create table file
(
    id      bigserial not null,
    file_name varchar(255),
    primary key (id)
);

alter table if exists enter_balance
    add constraint forgein_key_enter_balance_to_file
    foreign key (file_id)
    references enter_balance;

alter table if exists money_flow
    add constraint forgein_key_money_flow_to_file
    foreign key (file_id)
    references money_flow;

alter table if exists proceed_balance
    add constraint forgein_key_proceed_balance_to_file
    foreign key (file_id)
    references proceed_balance;