Create table user_role (
                      user_id varchar(32) not null,
                      role_id varchar(32) not null,
                      CONSTRAINT c_user_id
                       FOREIGN KEY (user_id) REFERENCES user (id),
                      CONSTRAINT c_role_id
                       FOREIGN KEY (role_id) REFERENCES role(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
