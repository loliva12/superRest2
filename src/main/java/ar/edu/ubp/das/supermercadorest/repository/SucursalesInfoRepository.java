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
        return jdbcCallFactory.executeQuery(
                "get_info_sucursales",  // Nombre del procedimiento
                "dbo",                   // Esquema
                "InfoSucursales",        // Nombre del ResultSet
                SucursalesRequest.class
        );
    }

}
