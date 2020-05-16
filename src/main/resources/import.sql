INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES (1, 'Duet');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`)VALUES (2, 'Rap');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES (3, 'World/Folk');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(4, 'Soft rock');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(5, 'Christmas');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(6, 'Teen pop');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(7, 'Hard/Metal');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(8, 'Folk');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(9, 'Funk');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(10, 'Rock and Roll');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(11, 'Musical');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(12, 'Oldies');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(13, 'Musette');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(14, 'Traditionnal');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES(15, 'Rock');
INSERT INTO `estilos` (`id_estilo`, `nombre_estilo`) VALUES (16, 'Alternative');

INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (1, 'Queen');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (2, 'Charley Pride');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (3, 'Nina Simone');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (4, 'Seether');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (5, 'Black Eyed Peas');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (6, 'Lady Gaga');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (7, 'Ray Charles');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (8, 'Phil Collins');
INSERT INTO `interpretes` (`id_interprete`, `nombre_interprete`) VALUES (9, 'Stevie Wonder');

INSERT INTO `temas` (`id_tema`, `nombre_tema`, `autor_tema`) VALUES (1, 'Shallow', 'Lady Gaga');
INSERT INTO `temas` (`id_tema`, `nombre_tema`, `autor_tema`) VALUES (2, 'Tarzán', 'Phil Collins');
INSERT INTO `temas` (`id_tema`, `nombre_tema`, `autor_tema`) VALUES (3, 'Superstition', 'Stevie Wonder');
INSERT INTO `temas` (`id_tema`, `nombre_tema`, `autor_tema`) VALUES (4, 'For Once in my Life', 'Stevie Wonder');
INSERT INTO `temas` (`id_tema`, `nombre_tema`, `autor_tema`) VALUES (5, 'Pump It', 'Desconocido');



INSERT INTO `interpretaciones` (`id_interpretacion`, `fecha_interpretacion`, `id_tema`, `id_estilo`) VALUES (1, '2002-02-20', 2, 11);
INSERT INTO `interpretaciones` (`id_interpretacion`, `fecha_interpretacion`, `id_tema`, `id_estilo`) VALUES (2, '2002-02-20', 3, 3);
INSERT INTO `interpretaciones` (`id_interpretacion`, `fecha_interpretacion`, `id_tema`, `id_estilo`) VALUES (3, '2002-02-20', 4, 3);
INSERT INTO `interpretaciones` (`id_interpretacion`, `fecha_interpretacion`, `id_tema`, `id_estilo`) VALUES (4, '2020-03-25', 5, 7);
INSERT INTO `interpretaciones` (`id_interpretacion`, `fecha_interpretacion`, `id_tema`, `id_estilo`) VALUES (5, '2002-02-20', 1, 7);


INSERT INTO `interpretacion_interprete` (`id_interprete`, `id_interpretacion`) VALUES (1, 8);
INSERT INTO `interpretacion_interprete` (`id_interprete`, `id_interpretacion`) VALUES (2, 9);
INSERT INTO `interpretacion_interprete` (`id_interprete`, `id_interpretacion`) VALUES (3, 9);
INSERT INTO `interpretacion_interprete` (`id_interprete`, `id_interpretacion`) VALUES (3, 8);
INSERT INTO `interpretacion_interprete` (`id_interprete`, `id_interpretacion`) VALUES (4, 5);
INSERT INTO `interpretacion_interprete` (`id_interprete`, `id_interpretacion`) VALUES (5, 6);
