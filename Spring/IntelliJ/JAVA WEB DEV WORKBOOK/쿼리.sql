USE webdb;

CREATE TABLE tbl_todo (
tno INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(100) NOT NULL,
dueDate DATE NOT NULL,
finished TINYINT DEFAULT 0
);

INSERT INTO tbl_todo (title, dueDate, finished) VALUES ('Test.....', '2022-12-31', 1);

CREATE TABLE tbl_member (
mid VARCHAR(50) PRIMARY KEY,
mpw VARCHAR(50) NOT NULL,
mname VARCHAR(100) NOT NULL
);

INSERT INTO tbl_member (mid, mpw, mname) VALUES ('user00', '1111','사용자0');
INSERT INTO tbl_member (mid, mpw, mname) VALUES ('user01', '1111','사용자1');
INSERT INTO tbl_member (mid, mpw, mname) VALUES ('user02', '1111','사용자2');

ALTER TABLE tbl_member ADD COLUMN UUID VARCHAR(50);

FLUSH PRIVILEGES;