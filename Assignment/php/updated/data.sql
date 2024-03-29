--data.sql:
CREATE TABLE Property (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    Type TINYINT default 1,
    Title CHAR(255) default '',
    Address TEXT NOT NULL,
    Bedroom INT default 0,
    Living_room INT default 0,
    Diningroom INT default 0,
    Size Decimal(6,2) default 0.0
) ENGINE=MyISAM;

-- HDBBlock must be VARCHAR(5)
CREATE TABLE HDB (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    PID BIGINT NOT NULL,
    HDBBlock VARCHAR(5) NOT NULL,
    INDEX idx_PID (PID), 
    FOREIGN KEY (PID) REFERENCES Property(ID)
) ENGINE=InnoDB;

 -- This ID must be defined as a PRIMARY KEY
 -- PID must be BIGINT
CREATE TABLE Condo (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    PID BIGINT NOT NULL,
    SwimmingPool TINYINT default 0,
    INDEX idx_PID (PID), 
    FOREIGN KEY (PID) REFERENCES Property(ID)
) ENGINE=InnoDB;