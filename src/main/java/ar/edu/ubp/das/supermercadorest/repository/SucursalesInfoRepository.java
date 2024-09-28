package ar.edu.ubp.das.supermercadorest.repository;

import ar.edu.ubp.das.supermercadorest.bean.SucursalesRequest;
import ar.edu.ubp.das.supermercadorest.components.SimpleJdbcCallFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SucursalesInfoRepository {

    @Autowired
    private SimpleJdbcCallFactory jdbcCallFactory;

    public List<SucursalesRequest> getSucursales() {
        SqlParameterSource params = new MapSqlParameterSource(); // No hay parámetros en este caso

        // Ejecutar el procedimiento almacenado
        return jdbcCallFactory.executeQuery(
                "get_info_sucursales",    // Nombre del procedimiento almacenado
                "dbo",                    // Esquema
                params,                   // Parámetros (vacío)
                "InfoSucursales",         // Nombre del ResultSet devuelto por el SP
                SucursalesRequest.class   // Clase para mapear el ResultSet
        );
    }
}
