import com.sun.net.httpserver.Authenticator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by ���� on 19.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Result rs = JUnitCore.runClasses(Vector2DTest.class);
        for (Failure f : rs.getFailures()){
            System.out.println(f);
        }

    }
}
