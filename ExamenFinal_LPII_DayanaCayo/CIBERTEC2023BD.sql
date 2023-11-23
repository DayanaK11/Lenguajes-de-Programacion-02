-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS CIBERTEC2023;

-- Seleccionar la base de datos
USE CIBERTEC2023;

-- Tabla de Clientes
CREATE TABLE IF NOT EXISTS clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(20)
    -- Otros campos relevantes para la información del cliente
);

-- Tabla de Habitaciones
CREATE TABLE IF NOT EXISTS habitaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    precio DOUBLE NOT NULL
    -- Otros campos relevantes para las habitaciones
);

-- Tabla de Reservas
CREATE TABLE IF NOT EXISTS reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT NOT NULL,
    habitacion_id INT NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    total DOUBLE NOT NULL,
    estado VARCHAR(20) DEFAULT 'Pendiente', -- Puede ser 'Confirmada', 'Cancelada', etc.
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (habitacion_id) REFERENCES habitaciones(id)
);

-- Ingresar datos en la tabla de Habitaciones
INSERT INTO habitaciones (numero, tipo, precio) VALUES
    (101, 'Individual', 80.00),
    (102, 'Individual', 70.00),
    (202, 'Doble', 120.00),
    (203, 'Doble', 120.00),
    (303, 'VIP', 200.00);
