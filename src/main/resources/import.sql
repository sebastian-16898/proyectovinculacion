INSERT INTO Asignatura(id_asignatura, descripcion, fecha_creacion) VALUES(1, 'Ingles', '01-02-2022');
INSERT INTO Rol(id_rol, descripcion) VALUES(1, 'Administrador');
INSERT INTO Rol(id_rol, descripcion) VALUES(2, 'Gerente');
INSERT INTO Rol(id_rol, descripcion) VALUES(3, 'Secretaria');
INSERT INTO Usuario(id_usuario, contrasena, est_usuario, usuario) VALUES(1, '12345', 'ninguno', 'admin');
INSERT INTO Usuario(id_usuario, contrasena, est_usuario, usuario) VALUES(2, 'hola123', 'ninguno', 'geren');
INSERT INTO Usuario(id_usuario, contrasena, est_usuario, usuario) VALUES(3, 'jhon', 'ninguno', 'secre');
INSERT INTO Rol_Usuario(id_rol_usuario, estado, id_rol, id_usuario) VALUES(1, true, 1, 1);
INSERT INTO Rol_Usuario(id_rol_usuario, estado, id_rol, id_usuario) VALUES(2, true, 2, 2);
INSERT INTO Curso(id_curso, descripcion, fecha_creacion, tipo_curso, id_rol_usuario) VALUES(1, '8VO', '12-12-2022', 'A', 1);
INSERT INTO Horario(id_horario, dia, fecha_creacion, tiempo_fin, tiempo_inicio, id_asignatura, id_rol_usuario) VALUES(1, 12, '01-03-2022','12-12-2022', '11-12-2022', 1, 1);



