CREATE DATABASE AGENDAMENTO_VET;

USE AGENDAMENTO_VET;

SELECT database();

CREATE TABLE Tutor (
        ID_tutor INT AUTO_INCREMENT PRIMARY KEY,
        Nome VARCHAR(100),
Email VARCHAR(100),
Idade INT,
Telefone_tutor VARCHAR(15)
);

CREATE TABLE Animais (
        ID_animal INT AUTO_INCREMENT PRIMARY KEY,
        Nome_animal VARCHAR(100),
Tipo_animal VARCHAR(50),
Raca VARCHAR(50),
Tutor_id INT,
FOREIGN KEY (Tutor_id) REFERENCES Tutor(ID_tutor)
        );

CREATE TABLE Agendamentos (
        ID_agendamento INT AUTO_INCREMENT PRIMARY KEY,
        Tipo_atendimento VARCHAR(100),
Data_hora DATETIME,
Medico_responsavel VARCHAR(100),
Status_agendamento VARCHAR(50),
Tutor_id INT,
Animal_id INT,
FOREIGN KEY (Tutor_id) REFERENCES Tutor(ID_tutor),
FOREIGN KEY (Animal_id) REFERENCES Animais(ID_animal)
        );