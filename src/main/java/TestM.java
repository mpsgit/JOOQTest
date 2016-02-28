

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.udt.records.TblMastColRecord;
import org.jooq.udt.records.TblOnChangeFiltersRecord;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.jooq.SQLDialect.ORACLE;

/**
 * Created by kollerk on 26/02/2016.
 */
public class TestM  {


    public static void main(String args[]) {
        String userName = "wetrn";
        String password = "wetrn";
        String url = "jdbc:oracle:thin:@ryelxmapsemqdbc.rye.avon.com:1524:emmapsi";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally

        Connection conn =null;

        try {

            conn = DriverManager.getConnection(url, userName, password);
            /*
            DSLContext create = DSL.using(conn, ORACLE);
            TblMastColRecord tblMastColRecord = new TblMastColRecord(create.configuration());
            TblOnChangeFiltersRecord tblOnChangeFiltersRecord = new TblOnChangeFiltersRecord(create.configuration());
            String pOfferId = "223717182";
            org.jooq.Routines.f378Collection(create.configuration(),pOfferId)

             */

                    //.loadEditOffrFilters(create.configuration(),pOfferId,tblMastColRecord,tblOnChangeFiltersRecord);
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }

    }


}
