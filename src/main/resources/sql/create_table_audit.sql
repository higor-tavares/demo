create table audit(
    id serial not null,
    username varchar(60) not null,
    user_action varchar(20) not null,
    created_at timestamp not null,
    description varchar(255) not null,
    ip varchar(64) not null
)