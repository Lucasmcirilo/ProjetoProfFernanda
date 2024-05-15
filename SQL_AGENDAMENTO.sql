CREATE DATABASE AGENDAMENTO_VET;

USE AGENDAMENTO_VET;

SELECT database();

CREATE TABLE Usuarios (
    ID_usuario INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(100),
    Email VARCHAR(100),
    Idade INT,
    Telefone_tutor VARCHAR(15)
);
CREATE TABLE Agendamentos (
    ID_agendamento INT AUTO_INCREMENT PRIMARY KEY,
    Tipo_atendimento VARCHAR(100),
    Data_hora DATETIME,
    Medico_responsavel VARCHAR(100),
    Status_agendamento VARCHAR(50),
    Usuario_id INT,
    Animal_id INT,
    FOREIGN KEY (Usuario_id) REFERENCES Usuarios(ID_usuario),
    FOREIGN KEY (Animal_id) REFERENCES Animais(ID_animal)
);
CREATE TABLE Animais (
    ID_animal INT AUTO_INCREMENT PRIMARY KEY,
    Nome_animal VARCHAR(100),
    Tipo_animal VARCHAR(50),
    Raca VARCHAR(50),
    Idade INT,
    Peso DECIMAL(5,2),
    Usuario_id INT,
    FOREIGN KEY (Usuario_id) REFERENCES Usuarios(ID_usuario)
);
CREATE TABLE Cirurgias (
    ID_cirurgia INT AUTO_INCREMENT PRIMARY KEY,
    Data_cirurgia DATE,
    Tipo_cirurgia VARCHAR(100),
    Medico_responsavel VARCHAR(100),
    Status_cirurgia VARCHAR(50),
    Agendamento_id INT,
    FOREIGN KEY (Agendamento_id) REFERENCES Agendamentos(ID_agendamento)
);

select * from animais;