package ar.edu.ubp.das.supermercadorest.repository;

import ar.edu.ubp.das.supermercadorest.bean.ListaPrecios;
import ar.edu.ubp.das.supermercadorest.components.SimpleJdbcCallFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ListaPreciosRepository {

    @Autowired
    private SimpleJdbcCallFactory jdbcCallFactory;

    public List<ListaPrecios> getLocalidades() {
        SqlParameterSource params = new MapSqlParameterSource();

        return jdbcCallFactory.executeQuery(
                "get_lista_precios",       // Nombre del procedimiento almacenado
                "dbo",                     // Esquema
                params,                    // Parámetros
                "ListaPrecios",            // Nombre del ResultSet
                ListaPrecios.class    // Clase mapeada
        );
    }
}


