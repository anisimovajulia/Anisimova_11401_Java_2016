import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;

/**
 * Created by Юлия on 19.02.2016.
 */
public class FunnyDB {
    public static Connection getConn() throws SQLException {
        Connection connection = mock(Connection.class);
        Statement statement = mock(Statement.class);
        when(connection.createStatement()).thenReturn(statement);
        ResultSet rs = mock(ResultSet.class);
        when(statement.executeQuery(anyString())).thenReturn(rs);
        when(rs.next()).thenReturn(true,true,false);
        when(rs.getString(1)).thenReturn("1","2","3");
        when(rs.getString(2)).thenReturn("roma","lena","nikita");
        return connection;

    }
}
