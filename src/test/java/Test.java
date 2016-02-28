import junit.framework.TestCase;
import org.jooq.DSLContext;
import org.jooq.Routines;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.packages.AppEditOffr;
import org.jooq.packages.app_edit_offr.LoadEditOffrFilters;
import org.jooq.routines.F378Collection;
import org.jooq.udt.records.TblMastColRecord;
import org.jooq.udt.records.TblOnChangeFiltersRecord;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.jooq.SQLDialect.ORACLE;

/**
 * Created by kollerk on 26/02/2016.
 */
public class Test extends TestCase {


    public void test3() {
        String userName = "wetrn";
        String password = "wetrn";
        String url = "jdbc:oracle:thin:@ryelxmapsemqdbc.rye.avon.com:1524:emmapsi";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally

        Connection conn =null;

        try {

            conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, ORACLE);
            String pOfferId = "223717182";

            LoadEditOffrFilters loadEditOffrFilters = AppEditOffr.loadEditOffrFilters(create.configuration(),pOfferId);

            System.out.println("*-->"+loadEditOffrFilters.getPTblMastCol().size());
            System.out.println("*-->"+loadEditOffrFilters.getPTblOnChangeFilters().size());
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
            assertEquals("1", "3");
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace(System.err);
                assertEquals("1", "3");
            }
        }
        assertEquals("1", "1");

    }

    public void test2() {
        String userName = "wetrn";
        String password = "wetrn";
        String url = "jdbc:oracle:thin:@ryelxmapsemqdbc.rye.avon.com:1524:emmapsi";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally

        Connection conn =null;

        try {

            conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, ORACLE);
            String pOfferId = "223717182";
            TblMastColRecord tblMastColRecord = new TblMastColRecord();
            TblOnChangeFiltersRecord tblOnChangeFiltersRecord = new TblOnChangeFiltersRecord();

            org.jooq.routines.LoadEditOffrFilters loadEditOffrFilters = org.jooq.Routines.loadEditOffrFilters(create.configuration(),pOfferId,tblMastColRecord,tblOnChangeFiltersRecord);

            System.out.println("*-->"+loadEditOffrFilters.getPTblMastCol().size());
            System.out.println("*-->"+loadEditOffrFilters.getPTblOnChangeFilters().size());
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
            assertEquals("1", "3");
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace(System.err);
                assertEquals("1", "3");
            }
        }
        assertEquals("1", "1");

    }

    public void test() {
        String userName = "wetrn";
        String password = "wetrn";
        String url = "jdbc:oracle:thin:@ryelxmapsemqdbc.rye.avon.com:1524:emmapsi";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally

        Connection conn =null;

        try {
            conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, ORACLE);
            Long number = new Long(0);
            F378Collection result = Routines.f378Collection(create.configuration(),number);
            System.out.println("---->"+result.getO1().size());
            System.out.println("---->"+result.getO2().size());

        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
            assertEquals("1", "3");
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace(System.err);
                assertEquals("1", "2");
            }
        }

        assertEquals("1", "1");
    }


}
