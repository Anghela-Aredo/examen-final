CREATE TABLE Product(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo_Unico VARCHAR(50),
    nombre_producto VARCHAR(255) NOT NULL,
    tipo_Producto VARCHAR(50) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    balance DECIMAL(15, 2) NOT NULL,
    fecha_Creacion TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Insertar datos iniciales
INSERT INTO Product (codigo_Unico, nombre_producto, tipo_Producto, estado, balance, fecha_Creacion)
VALUES
    ('d0eaf8f0-1b10-4a7f-b93d-f401a507db63', 'Cuenta de Ahorro Premium', 'cuenta_ahorro', 'activo', 1500.75, CURRENT_TIMESTAMP),
    ('d0eaf8f0-1b10-4a7f-b93d-f401a507db63', 'Tarjeta de Crédito Visa Oro', 'tarjeta_credito', 'activo', 500.50, '2024-11-27T15:00:00Z'),
    ('a213d447-29fa-4d0b-b69b-b813057c3d6e', 'Cuenta Corriente Básica', 'cuenta_corriente', 'inactivo', 1000.00, '2024-11-27T16:45:00Z'),
    ('a213d447-29fa-4d0b-b69b-b813057c3d6e', 'Tarjeta de Crédito Mastercard', 'tarjeta_credito', 'activo', 5000.00, '2024-11-27T17:30:00Z'),
    ('a213d447-29fa-4d0b-b69b-b813057c3d6e', 'Cuenta de Ahorro Estándar', 'cuenta_ahorro', 'activo', 1200.00, '2024-11-27T18:00:00Z');
