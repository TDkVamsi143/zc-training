package de.zerocode.jdbc;

import java.util.List;

import com.mysql.cj.util.Util;

public class QueryBuilders {
	public static final String GRAVE = "`";
	public static String getInsertQuery(String schema, String tableName, List<String> columns) {
		String col = "";
		String placeHolders = "";
		for (String column : columns) {
			col += "," + GRAVE + column + GRAVE;
			placeHolders += ",?";
		}
		return "INSERT INTO " + GRAVE + schema + GRAVE + "." + GRAVE + tableName + GRAVE + " (" + col.substring(1) + ")  VALUES (" + placeHolders.substring(1) + ");";
	}



/**
 * this method will returns the query to get the data in the given table
 * @author tdk vamsi 
 * @since 2022-12-22
 * @param schema
 * @param tableName
 * @param columns
 * @return query
 */
public static String getAllQuery(String schema, String tableName, List<String> columns) {
	String col = "";
	for (String column : columns) {
		col += ", "+GRAVE+column+GRAVE;
	}
	return "SELECT " + (col.isEmpty()? " * ":col.substring(1))+ " FROM "+ GRAVE + schema + GRAVE + "." + GRAVE + tableName + GRAVE +";" ;
}


/**
 * this method will returns a query 
 * @param schema
 * @param tableName
 * @param columns
 * @param referenceColmn
 * @param operator
 * @param referenceData
 * @return
 */
public static String getDataQuery(String schema, String tableName, List<String> columns,String referenceColmn,String operator,String referenceData) {
	String col = "";
	for (String column : columns) {
		col += ", "+GRAVE+column+GRAVE;
	}
	return "SELECT " +(Utility.isBlankWithVarArguments(columns) ? " * ":col.substring(1))+ " FROM "+ GRAVE + schema + GRAVE + "." + GRAVE + tableName + GRAVE +" WHERE ( `"+referenceColmn+"` "+operator+" ("+ referenceData +"));" ;
}

/**
 * this method will return a query to update the data with respect to the condition
 * @author tdk vamsi
 * @since 2022-12-22
 * @param schema
 * @param tableName
 * @param columns
 * @param referenceColmn
 * @return query
 */
public static String getUpdateQuery(String schema, String tableName, List<String> columns,String referenceColmn ) {
	String col = "";
	for (String column : columns) {
		col += ","+GRAVE+column+GRAVE+" = ? ";
	}
	return "UPDATE " + GRAVE + schema + GRAVE + "." + GRAVE + tableName + GRAVE + " SET " + col.substring(1) + " WHERE (" +GRAVE+ referenceColmn+ GRAVE+" = ? );";
}


/**
 * this method will return the query to delete the data
 * @author tdk vamsi
 * @since 2022-12-23
 * @param schema
 * @param tableName
 * @param referenceColumn
 * @param referenceData
 * @return query
 */
public static String getDeleteQuery(String schema, String tableName,String referenceColumn,String operator,List<String> referenceData) {
	String refdata = "";
	for (String data : referenceData) {
		refdata+=","+data;
	}
	return "DELETE FROM "+GRAVE+schema+GRAVE+"."+GRAVE+tableName+GRAVE+" WHERE ("+GRAVE+referenceColumn+GRAVE+" "+operator+" (" + refdata.substring(1)+"));";
	
}
