package com.onpoint.copyarchive.field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.onpoint.copyarchive.table.AwareTable;
@Entity
public class Field {
	@Id
	@GeneratedValue
	Integer fieldId;
	String fieldName;
	String fieldAlias;
	Boolean isUnique;
	Boolean isViewable;
	Boolean isDerived;
	Boolean isExportable;
	String dataType;
	Integer order;
	AwareTable table;
	/**
	 * @return the fieldId
	 */
	public Integer getFieldId() {
		return fieldId;
	}
	/**
	 * @param fieldId the fieldId to set
	 */
	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}
	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * @return the fieldAlias
	 */
	public String getFieldAlias() {
		return fieldAlias;
	}
	/**
	 * @param fieldAlias the fieldAlias to set
	 */
	public void setFieldAlias(String fieldAlias) {
		this.fieldAlias = fieldAlias;
	}
	/**
	 * @return the isUnique
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}
	/**
	 * @param isUnique the isUnique to set
	 */
	public void setIsUnique(Boolean isUnique) {
		this.isUnique = isUnique;
	}
	/**
	 * @return the isViewable
	 */
	public Boolean getIsViewable() {
		return isViewable;
	}
	/**
	 * @param isViewable the isViewable to set
	 */
	public void setIsViewable(Boolean isViewable) {
		this.isViewable = isViewable;
	}
	/**
	 * @return the isDerived
	 */
	public Boolean getIsDerived() {
		return isDerived;
	}
	/**
	 * @param isDerived the isDerived to set
	 */
	public void setIsDerived(Boolean isDerived) {
		this.isDerived = isDerived;
	}
	/**
	 * @return the isExportable
	 */
	public Boolean getIsExportable() {
		return isExportable;
	}
	/**
	 * @param isExportable the isExportable to set
	 */
	public void setIsExportable(Boolean isExportable) {
		this.isExportable = isExportable;
	}
	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	/**
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}
	/**
	 * @return the table
	 */
	public AwareTable getTable() {
		return table;
	}
	/**
	 * @param table the table to set
	 */
	public void setTable(AwareTable table) {
		this.table = table;
	}
}


	