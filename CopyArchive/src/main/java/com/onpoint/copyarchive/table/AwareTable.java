package com.onpoint.copyarchive.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.onpoint.copyarchive.state.State;



@Entity
public class AwareTable {
	@Id
	@GeneratedValue
	Integer tableId;
	String tableName;
	String tableAlias;
	String tablePrefix;
	Boolean skipTable;
	Boolean isSchema;
	
	State state;

	/**
	 * @return the tableId
	 */
	public Integer getTableId() {
		return tableId;
	}

	/**
	 * @param tableId the tableId to set
	 */
	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return the tableAlias
	 */
	public String getTableAlias() {
		return tableAlias;
	}

	/**
	 * @param tableAlias the tableAlias to set
	 */
	public void setTableAlias(String tableAlias) {
		this.tableAlias = tableAlias;
	}

	/**
	 * @return the tablePrefix
	 */
	public String getTablePrefix() {
		return tablePrefix;
	}

	/**
	 * @param tablePrefix the tablePrefix to set
	 */
	public void setTablePrefix(String tablePrefix) {
		this.tablePrefix = tablePrefix;
	}

	/**
	 * @return the skipTable
	 */
	public Boolean getSkipTable() {
		return skipTable;
	}

	/**
	 * @param skipTable the skipTable to set
	 */
	public void setSkipTable(Boolean skipTable) {
		this.skipTable = skipTable;
	}

	/**
	 * @return the isSchema
	 */
	public Boolean getIsSchema() {
		return isSchema;
	}

	/**
	 * @param isSchema the isSchema to set
	 */
	public void setIsSchema(Boolean isSchema) {
		this.isSchema = isSchema;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}
	
}
