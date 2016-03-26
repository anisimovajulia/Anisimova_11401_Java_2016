/**
 * Created by Юлия on 19.02.2016.
 */
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoExample {

    public static void main(String[] args) throws IOException, SQLException {
        InputStream is = mock(InputStream.class);
        when(is.available()).thenReturn(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1);
        when(is.read()).thenReturn(5,3,3,4,34,3,4);

        int s = 0;
        while (is.available()!=-1){
            s+=is.read();
        }
        System.out.println(s);




        Connection conn=FunnyDB.getConn();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select something");
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
    }
}
