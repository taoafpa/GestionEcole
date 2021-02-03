CREATE DATABASE `ecolesup` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

use ecolesup ;

create table ADRESSE (
   ADRESSE_ID integer not null auto_increment,
   NUM_RUE integer not null,
   NOM_RUE varchar(50) not null,
   CODE_POSTALE integer not null,
   VILLE varchar(50) not null,
   PAYS varchar(50) not null,
   primary key (ADRESSE_ID)
);


create table ELEVE (
   ELEVE_ID integer not null auto_increment,
   NOM varchar(255) not null,
   PRENOM varchar(20) not null,
   DATE_NAISSANCE date,
   AGE integer not null,
   ID_ADRESSE integer not null,
   primary key ( ELEVE_ID),  
   unique (ELEVE_ID),
   CONSTRAINT `fk_id-adress`
        FOREIGN KEY (`ID_ADRESSE`)
        REFERENCES `ADRESSE` (`ADRESSE_ID`)
);
 
create table SALLE (
   SALLE_ID integer not null auto_increment,
   CODE varchar(50) not null,
   LIBELLE varchar(20) not null,
   primary key (SALLE_ID),
   unique (SALLE_ID)
);

SELECT * FROM adresse ;
SELECT * FROM salle ;
SELECT * FROM eleve ;

Insert into ADRESSE (NUM_RUE, NOM_RUE, CODE_POSTALE,VILLE,PAYS )Values ('12','Rue Des Acacias','92222','Neuilly','France');