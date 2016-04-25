package com.onpoint.copyarchive.infosetcolumns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.onpoint.copyarchive.infosets.Infoset;

@Entity
public class InfosetColumn {

	@Id
	@GeneratedValue
	private Integer id;

	private String alias;

	private String clarifications;

	private String cleanUpDiagrame;

	private String dataType;

	private String decription;
	
	@Column(columnDefinition="BIT")
	private Boolean derived;
	
	@Column(columnDefinition="BIT")
	private Boolean excludeField;
	
	@Column(columnDefinition="BIT")
	private Boolean exportColumn;

	private String infobaseFieldname;

	private int linkColumn1;

	private int linkColumn2;

	private int linkColumn3;

	private int linkColumn4;

	private int linkColumn5;

	private String mainframeCOlumnName;

	private String mainframeDataType;

	private String mainframePrefix;

	private int orderOfColumn;

	private String tableName;
	
	@Column(columnDefinition="BIT")
	private Boolean uniqueColumn;

	@Column(columnDefinition="BIT")
	private Boolean usedInPlumberForOneClickAudit;

	@Column(columnDefinition="BIT")
	private Boolean viewColumn;
	@ManyToOne
	private Infoset infoset;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * @return the clarifications
	 */
	public String getClarifications() {
		return clarifications;
	}
	/**
	 * @param clarifications the clarifications to set
	 */
	public void setClarifications(String clarifications) {
		this.clarifications = clarifications;
	}
	/**
	 * @return the cleanUpDiagrame
	 */
	public String getCleanUpDiagrame() {
		return cleanUpDiagrame;
	}
	/**
	 * @param cleanUpDiagrame the cleanUpDiagrame to set
	 */
	public void setCleanUpDiagrame(String cleanUpDiagrame) {
		this.cleanUpDiagrame = cleanUpDiagrame;
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
	 * @return the decription
	 */
	public String getDecription() {
		return decription;
	}
	/**
	 * @param decription the decription to set
	 */
	public void setDecription(String decription) {
		this.decription = decription;
	}
	/**
	 * @return the derived
	 */
	public Boolean getDerived() {
		return derived;
	}
	/**
	 * @param derived the derived to set
	 */
	public void setDerived(Boolean derived) {
		this.derived = derived;
	}
	/**
	 * @return the excludeField
	 */
	public Boolean getExcludeField() {
		return excludeField;
	}
	/**
	 * @param excludeField the excludeField to set
	 */
	public void setExcludeField(Boolean excludeField) {
		this.excludeField = excludeField;
	}
	/**
	 * @return the exportColumn
	 */
	public Boolean getExportColumn() {
		return exportColumn;
	}
	/**
	 * @param exportColumn the exportColumn to set
	 */
	public void setExportColumn(Boolean exportColumn) {
		this.exportColumn = exportColumn;
	}
	/**
	 * @return the infobaseFieldname
	 */
	public String getInfobaseFieldname() {
		return infobaseFieldname;
	}
	/**
	 * @param infobaseFieldname the infobaseFieldname to set
	 */
	public void setInfobaseFieldname(String infobaseFieldname) {
		this.infobaseFieldname = infobaseFieldname;
	}
	/**
	 * @return the linkColumn1
	 */
	public int getLinkColumn1() {
		return linkColumn1;
	}
	/**
	 * @param linkColumn1 the linkColumn1 to set
	 */
	public void setLinkColumn1(int linkColumn1) {
		this.linkColumn1 = linkColumn1;
	}
	/**
	 * @return the linkColumn2
	 */
	public int getLinkColumn2() {
		return linkColumn2;
	}
	/**
	 * @param linkColumn2 the linkColumn2 to set
	 */
	public void setLinkColumn2(int linkColumn2) {
		this.linkColumn2 = linkColumn2;
	}
	/**
	 * @return the linkColumn3
	 */
	public int getLinkColumn3() {
		return linkColumn3;
	}
	/**
	 * @param linkColumn3 the linkColumn3 to set
	 */
	public void setLinkColumn3(int linkColumn3) {
		this.linkColumn3 = linkColumn3;
	}
	/**
	 * @return the linkColumn4
	 */
	public int getLinkColumn4() {
		return linkColumn4;
	}
	/**
	 * @param linkColumn4 the linkColumn4 to set
	 */
	public void setLinkColumn4(int linkColumn4) {
		this.linkColumn4 = linkColumn4;
	}
	/**
	 * @return the linkColumn5
	 */
	public int getLinkColumn5() {
		return linkColumn5;
	}
	/**
	 * @param linkColumn5 the linkColumn5 to set
	 */
	public void setLinkColumn5(int linkColumn5) {
		this.linkColumn5 = linkColumn5;
	}
	/**
	 * @return the mainframeCOlumnName
	 */
	public String getMainframeCOlumnName() {
		return mainframeCOlumnName;
	}
	/**
	 * @param mainframeCOlumnName the mainframeCOlumnName to set
	 */
	public void setMainframeCOlumnName(String mainframeCOlumnName) {
		this.mainframeCOlumnName = mainframeCOlumnName;
	}
	/**
	 * @return the mainframeDataType
	 */
	public String getMainframeDataType() {
		return mainframeDataType;
	}
	/**
	 * @param mainframeDataType the mainframeDataType to set
	 */
	public void setMainframeDataType(String mainframeDataType) {
		this.mainframeDataType = mainframeDataType;
	}
	/**
	 * @return the mainframePrefix
	 */
	public String getMainframePrefix() {
		return mainframePrefix;
	}
	/**
	 * @param mainframePrefix the mainframePrefix to set
	 */
	public void setMainframePrefix(String mainframePrefix) {
		this.mainframePrefix = mainframePrefix;
	}
	/**
	 * @return the orderOfColumn
	 */
	public int getOrderOfColumn() {
		return orderOfColumn;
	}
	/**
	 * @param orderOfColumn the orderOfColumn to set
	 */
	public void setOrderOfColumn(int orderOfColumn) {
		this.orderOfColumn = orderOfColumn;
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
	 * @return the uniqueColumn
	 */
	public Boolean getUniqueColumn() {
		return uniqueColumn;
	}
	/**
	 * @param uniqueColumn the uniqueColumn to set
	 */
	public void setUniqueColumn(Boolean uniqueColumn) {
		this.uniqueColumn = uniqueColumn;
	}
	/**
	 * @return the usedInPlumberForOneClickAudit
	 */
	public Boolean getUsedInPlumberForOneClickAudit() {
		return usedInPlumberForOneClickAudit;
	}
	/**
	 * @param usedInPlumberForOneClickAudit the usedInPlumberForOneClickAudit to set
	 */
	public void setUsedInPlumberForOneClickAudit(
			Boolean usedInPlumberForOneClickAudit) {
		this.usedInPlumberForOneClickAudit = usedInPlumberForOneClickAudit;
	}
	/**
	 * @return the viewColumn
	 */
	public Boolean getViewColumn() {
		return viewColumn;
	}
	/**
	 * @param viewColumn the viewColumn to set
	 */
	public void setViewColumn(Boolean viewColumn) {
		this.viewColumn = viewColumn;
	}
	/**
	 * @return the infoset
	 */
	public Infoset getInfoset() {
		return infoset;
	}
	/**
	 * @param infoset the infoset to set
	 */
	public void setInfoset(Infoset infoset) {
		this.infoset = infoset;
	}
	
}
