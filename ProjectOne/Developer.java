package Week4.ProjectOne;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Developer {
     ResultSet loadDevelopers() throws SQLException;
}
