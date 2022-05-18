Create table role (
                      id varchar(32) primary key not null,
                      name varchar(128) not null,
                      title varchar(128) NOT NULL,
                      create_time datetime(6) not null,
                      update_time datetime(6) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
