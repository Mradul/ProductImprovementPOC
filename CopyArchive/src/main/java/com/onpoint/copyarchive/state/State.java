package com.onpoint.copyarchive.state;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	@GeneratedValue
	private Integer stateId;
	private String state;
	private String stateAbbr;
	/**
	 * @return the stateId
	 */
	public Integer getStateId() {
		return stateId;
	}
	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the stateAbbr
	 */
	public String getStateAbbr() {
		return stateAbbr;
	}
	/**
	 * @param stateAbbr the stateAbbr to set
	 */
	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}
}
