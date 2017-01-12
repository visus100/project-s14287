package map;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IMaper<TEntity>  {
	public TEntity map(ResultSet rs) throws SQLException;
}
