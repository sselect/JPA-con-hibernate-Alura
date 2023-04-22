package com.alura.jdbc.persistencia;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

import java.sql.*;

public class ProductoDAO {

    final private Connection con;

    public ProductoDAO(Connection con){
        this.con = con;
    }

    public void guardarProducto (Producto producto) throws SQLException {
        try (con) {
            con.setAutoCommit(false);

            final PreparedStatement statement = con.prepareStatement(
                    "INSERT INTO PRODUCTO " +
                            "(nombre, descripcion, cantidad)"
                            + "VALUES(?, ?, ? )",
                    Statement.RETURN_GENERATED_KEYS);

            try (statement) {
                ejecutarRegistro(producto, statement);
                //garantiza que todos los comandos del loop funcionaron correctamente
                con.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            System.out.println("ROLLBACK");
        }
    }

    private static void ejecutarRegistro(Producto producto, PreparedStatement statement)
            throws SQLException {
        statement.setString(1, producto.getNombre());
        statement.setString(2, producto.getDescripcion());
        statement.setInt(3, producto.getCantidad());

        statement.execute();

        final ResultSet resultSet = statement.getGeneratedKeys();

        try (resultSet) {
            while (resultSet.next()) {
                producto.setId(resultSet.getInt(1));
                System.out.println(
                        String.format(
                                "Fue insertado el producto de ID %s", producto));


            }
        }
    }

}
