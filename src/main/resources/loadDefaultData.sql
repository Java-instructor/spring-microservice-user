create table users (id bigint generated by default as identity, department_id varchar(255), email varchar(255) not null, first_name varchar(255), last_name varchar(255), primary key (id));
insert into users ( department_id, email, first_name, last_name) values ( 1, 'sasi@gmail.com', 'sasikumar', 'periyasamy');