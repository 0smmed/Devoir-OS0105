create database gestionhospital;
use gestionhospital;

-- creation des tables
CREATE TABLE Medicament(
   Code VARCHAR(50),
   Nom VARCHAR(50),
   Dosage VARCHAR(50),
   Prix_parmite INT,
   Stock_disponible VARCHAR(50),
   PRIMARY KEY(Code)
);

CREATE TABLE Patient(
   Id_Patient INT,
   Nom VARCHAR(50),
   Prenom VARCHAR(50),
   Adresse VARCHAR(50),
   NumTel INT,
   PRIMARY KEY(Id_Patient)
);

CREATE TABLE Vente(
   Numero_trans INT,
   Montant_Total INT,
   _date DATE,
   Code VARCHAR(50),
   PRIMARY KEY(Numero_trans),
   FOREIGN KEY(Code) REFERENCES Medicament(Code)
);

CREATE TABLE Medecin(
   Id INT,
   Nom VARCHAR(50),
   Prenom VARCHAR(50),
   Specialite VARCHAR(50),
   Id_Patient INT NOT NULL,
   PRIMARY KEY(Id),
   FOREIGN KEY(Id_Patient) REFERENCES Patient(Id_Patient)
);

CREATE TABLE Pharmacie(
   Nom_Parma VARCHAR(50),
   Emplacement VARCHAR(50),
   Numero_trans INT NOT NULL,
   Code VARCHAR(50) NOT NULL,
   PRIMARY KEY(Nom_Parma),
   UNIQUE(Numero_trans),
   FOREIGN KEY(Numero_trans) REFERENCES Vente(Numero_trans),
   FOREIGN KEY(Code) REFERENCES Medicament(Code)
);

CREATE TABLE Prescrit(
   Code VARCHAR(50),
   Id INT,
   PRIMARY KEY(Code, Id),
   FOREIGN KEY(Code) REFERENCES Medicament(Code),
   FOREIGN KEY(Id) REFERENCES Medecin(Id)
);

-- Insertion des enregistrement dans la table Medicament.
INSERT INTO Medicament (code, Nom, Dosage, Prix_parmite, Stock_disponible )
VALUES ('A12', 'Amoxiciline', '50mg', 100, 'GSG');

-- Insertion des enregistrement dans la table Patient.
-- Insertion des enregistrement dans la table Medecin.
-- Insertion des enregistrement dans la table Prescrit.
-- Insertion des enregistrement dans la table Pharmacie.
-- Insertion des enregistrement dans la table Vente.