/*------------------------Datos de cliente------------------------*/
INSERT INTO cliente (nombre, direccion, telefono, rfc, saldo) 
VALUES ('Kevin Sosa', 'Acapulco, Gro', '7443380069', 'SONK000710BA3', 800.0);

INSERT INTO cliente (nombre, direccion, telefono, rfc, saldo) 
VALUES ('Joan Mojica', 'Acapulco, Gro', '7442379067', 'JOMA045710BA3', 0.0);

INSERT INTO cliente (nombre, direccion, telefono, rfc, saldo) 
VALUES ('Shavy Puertos', 'Acapulco, Gro', '7442896590', 'SJPR000560BA3', 0.0);

INSERT INTO cliente (nombre, direccion, telefono, rfc, saldo) 
VALUES ('Diana Villagran', 'Acapulco, Gro', '7441280478', 'DIVG000712DA3', 0.0);

/*------------------------Datos de proveedores------------------------*/ 
INSERT INTO proveedor (nombre, editorial, telefono, saldo) 
VALUES ('Graciela Hernandez', 'Planeta', '5589007658', 800.0);

INSERT INTO proveedor (nombre, editorial, telefono, saldo) 
VALUES ('Anelime Salgado', 'Premium', '7556890753', 2105.5);

/*------------------------Datos de titulos------------------------*/
INSERT INTO titulo (id_proveedor, nombre, precio, stock)
VALUES (1, 'montañas de la locura', 33.5, 0);

INSERT INTO titulo (id_proveedor, nombre, precio, stock)
VALUES (1, 'feral', 40.6, 0);

INSERT INTO titulo (id_proveedor, nombre, precio, stock)
VALUES (1, 'necronomicon', 27.4, 0);

INSERT INTO titulo (id_proveedor, nombre, precio, stock)
VALUES (2, 'la odisea', 38.7, 0);

INSERT INTO titulo (id_proveedor, nombre, precio, stock)
VALUES (2, 'la iliada', 33.5, 0);

/*------------------------Generamos algunos movimientos al cliente------------------------*/
INSERT INTO movimientos_c (id_cliente, fecha, movimiento, monto, saldo_actual, saldo_nuevo)
VALUES (1, '2026-09-10', 'Venta', 1905.5, 200, 2105.5);
/*------------------------Generamos algunos movimientos al proveedor------------------------*/
INSERT INTO movimientos_p (id_proveedor, fecha, movimiento, monto, saldo_actual, saldo_nuevo)
VALUES (2, '2026-09-11', 'Compra', 500, 250, 750);
/*------------------------Generamos algunos detalles de los movimientos del cliente------------------------*/
INSERT INTO detalle_movc (idmovc, id_titulo, producto, cantidad, precio);
VALUES (1, 2, 'feral', 12, 40.6);
INSERT INTO detalle_movc (idmovc, id_titulo, producto, cantidad, precio);
VALUES (1, 3, 'necronomicon', 17, 27.4);
INSERT INTO detalle_movc (idmovc, id_titulo, producto, cantidad, precio);
VALUES (1, 4, 'la odisea', 18, 38.7);
/*------------------------Generamos algunos detalles de los movimientos del proveedor------------------------*/
INSERT INTO detalle_movp (idmovp, id_titulo, producto, cantidad, precio)
VALUES (1, 4, 'la odisea', 25, 38.7);
INSERT INTO detalle_movc (idmovp, id_titulo, producto, cantidad, precio)
VALUES (1, 5, 'la iliada', 28, 33.5);
