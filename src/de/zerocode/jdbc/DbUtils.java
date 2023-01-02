package de.zerocode.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class DbUtils {
public static void get(Connection connection,String schema,String tablename,String targetColumn,String sourceColumn){
	List<String> tableNames = new ArrayList<>();
	List<String> targetcolumn = new ArrayList<>();
	List<String> sourcecolumn = new ArrayList<>();
	PreparedStatement statement = null;
	PreparedStatement stmt = null;
	
	try {
		statement = connection.prepareStatement(sourceColumn)
		
		
		
		
	} catch (Exception e) {
	
		
		
		
	}
}

}
