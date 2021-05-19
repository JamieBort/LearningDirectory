package Section19Databases.JDBCInsertUpdateDelete339;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB_Video_339 {

    public void sudoMainMethod() {
        System.out.println("inside the sudoMainMethod()");

        try {
            // NOTE: I've changed the connection location to be in the same directory as this file.
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:/Users/jamiebort/Documents/DevFiles/personal_projects/LearningDirectory/Java/Courses/JavaProgrammingMasterclassForSoftwareDevelopers/CourseFiles/Section19Databases/JDBCInsertUpdateDelete339/testjava.db");

            // Created statement object my calling connection method.
            Statement statement = conn.createStatement();
            // Notice: the semicolen is not added to the end of the sql statement. The
            // driver is set up so that we don't need to do that.
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
            // statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email
            // TEXT)");

            // statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Tim', 65537, 'tim@email.com')");
            // statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Joe', 1239, 'joe@email.com')");
            // statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Jane', 29384, 'Jane@email.com')");
            // statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Fido', 9283, 'dog@email.com')");

            // statement.execute("UPDATE contacts SET phone = 111111 WHERE name = 'Jane'");

            statement.execute("DELETE FROM contacts WHERE name = 'Tim'");

            statement.close();
            conn.close();

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Something went wrong: " + e);
        }
    }

}