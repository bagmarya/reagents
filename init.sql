create table chemist
(
    chemist_id serial primary key,
    login      varchar(64)  not null,
    password   varchar(128) not null,
    name       varchar(64)  not null,
    surname    varchar(64),
    role       varchar(16)  not null
);

create table target
(
    target_id   serial primary key,
    target_name text,
    creator_id  integer not null REFERENCES chemist (chemist_id),
    active      boolean not null default TRUE
);

create table nomenclature
(
    nomenclature_id serial primary key,
    name            text        not null,
    description     text,
    requirements    text,
    normative_doc   text,
    price           INT,
    unit            varchar(10) not null,
    creator_id      integer     not null REFERENCES chemist (chemist_id)
);


insert into chemist (login, password, name, role)
values ('admin', 'pw', 'Olga', 'ADMIN'),
       ('pavlov', 'pw', 'Slava', 'USER'),
       ('zaurova', 'pw', 'Anna', 'USER');


insert into target (target_name, creator_id)
values ('ПНД Ф 14.1:2:4.50-96', 1),
       ('ГОСТ 18190-72', 1),
       ('Мытьё посуды', 1);

insert into nomenclature (name, requirements, normative_doc, price, unit, creator_id)
values ('Серная кислота', 'ч.д.а.', 'ГОСТ 4204-77', 350, 'кг', 1),
       ('Калия бихромат', 'ч.д.а.', 'ГОСТ 4220-75', 800, 'кг', 1),
       ('Серная кислота', 'х.ч.', 'ГОСТ 4204-77', 520, 'кг', 2),
       ('Азотная кислота', 'ос.ч.', 'ГОСТ 11125-84', 433, 'кг', 2),
       ('Серная кислота', 'ч.д.а.', 'ГОСТ 4204-77', 350, 'кг', 1),
       ('Калия иодид', 'х.ч.', 'ГОСТ 4232-74', 8030, 'кг', 1)
;

