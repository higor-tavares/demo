create table users(
    id serial not null,
    name varchar(60) not null,
    email varchar(60) unique not null,
    birthday timestamp not null,
    created_at timestamp not null default now(),
    deleted_at timestamp null,
    is_deleted boolean default false
)