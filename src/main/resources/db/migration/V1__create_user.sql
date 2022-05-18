Create table user (
    id varchar(32) primary key not null,
    username varchar(30) not null,
    nickname varchar(30) NOT NULL,
    password varchar(30) not null,
    locked INTEGER NOT NULL,
    enabled  INTEGER not null,
    gender varchar(255) not null,
    last_login_ip varchar(64) null,
    last_login_time datetime(6) null,
    create_time datetime(6) not null,
    update_time datetime(6) not null ,
    CONSTRAINT uk_user_name
    UNIQUE (username)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
