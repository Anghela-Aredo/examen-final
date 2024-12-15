CREATE TABLE Client (
    codigo_unico VARCHAR(250) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    tipo_documento VARCHAR(50) NOT NULL,
    numero_documento VARCHAR(50) NOT NULL
);

-- Inserción de dos registros
INSERT INTO client (codigo_unico, nombre, apellido, tipo_documento, numero_documento)
VALUES ('d0eaf8f0-1b10-4a7f-b93d-f401a507db63', 'Jhan', 'Gutierrez', 'PASAPORTE', 'A12345678');

INSERT INTO Client (codigo_unico, nombre, apellido, tipo_documento, numero_documento)
VALUES ('a213d447-29fa-4d0b-b69b-b813057c3d6e', 'Jeyson', 'flores', 'DNI', '76070690');
