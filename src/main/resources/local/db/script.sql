
CREATE TABLE COMPANIES(
                          id serial primary key,
                          name varchar(255)
);
insert into COMPANIES (id, name) values (1, 'Wisoky and Sons');
insert into COMPANIES (id, name) values (2, 'Larkin and Sons');

CREATE TABLE EMPLOYEES(
                          id serial primary key,
                          fk_company integer,
                          firstname varchar(255),
                          lastname varchar(255),
                          CONSTRAINT fk_company_constraint FOREIGN KEY(fk_company) REFERENCES COMPANIES(id)
);

insert into EMPLOYEES (id, fk_company, firstname, lastname) values (1, 1, 'Troy', 'Bouldon');
insert into EMPLOYEES (id, fk_company, firstname, lastname) values (2, 2, 'Micky', 'Pierson');
insert into EMPLOYEES (id, fk_company, firstname, lastname) values (3, 2, 'Rosemary', 'Verbruggen');
insert into EMPLOYEES (id, fk_company, firstname, lastname) values (4, 2, 'Guillema', 'Streeter');
insert into EMPLOYEES (id, fk_company, firstname, lastname) values (5, 1, 'Ivonne', 'McKeveney');
insert into EMPLOYEES (id, fk_company, firstname, lastname) values (6, 2, 'Carlye', 'Kynder');
