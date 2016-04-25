package com.onpoint.copyarchive.infosets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.onpoint.copyarchive.state.State;

@Entity
public class Infoset {
		
	@Id
	@GeneratedValue
	private Integer infosetId;
	@Column(length=10)
	private String mainframePrefix;

	@Column(name="anyProbles",columnDefinition="BIT")
	private Boolean anyProblems;

	private String infosetName;

	private int priority;

	private String status;

	private int subPriorityLevel;

	private String summeryOfSegment;

	private String tableName;

	private String uniqueColumn;

	@Column(columnDefinition="BIT")
	private Boolean isSchema;
	
	@ManyToOne
	private State state; 
	
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
	 * @return the anyProblems
	 */
	public Boolean getAnyProblems() {
		return anyProblems;
	}

	/**
	 * @param anyProblems the anyProblems to set
	 */
	public void setAnyProblems(Boolean anyProblems) {
		this.anyProblems = anyProblems;
	}

	/**
	 * @return the infosetName
	 */
	public String getInfosetName() {
		return infosetName;
	}

	/**
	 * @param infosetName the infosetName to set
	 */
	public void setInfosetName(String infosetName) {
		this.infosetName = infosetName;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the subPriorityLevel
	 */
	public int getSubPriorityLevel() {
		return subPriorityLevel;
	}

	/**
	 * @param subPriorityLevel the subPriorityLevel to set
	 */
	public void setSubPriorityLevel(int subPriorityLevel) {
		this.subPriorityLevel = subPriorityLevel;
	}

	/**
	 * @return the summeryOfSegment
	 */
	public String getSummeryOfSegment() {
		return summeryOfSegment;
	}

	/**
	 * @param summeryOfSegment the summeryOfSegment to set
	 */
	public void setSummeryOfSegment(String summeryOfSegment) {
		this.summeryOfSegment = summeryOfSegment;
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
	public String getUniqueColumn() {
		return uniqueColumn;
	}

	/**
	 * @param uniqueColumn the uniqueColumn to set
	 */
	public void setUniqueColumn(String uniqueColumn) {
		this.uniqueColumn = uniqueColumn;
	}

	/**
	 * @return the infosetId
	 */
	public Integer getInfosetId() {
		return infosetId;
	}

	/**
	 * @param infosetId the infosetId to set
	 */
	public void setInfosetId(Integer infosetId) {
		this.infosetId = infosetId;
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
