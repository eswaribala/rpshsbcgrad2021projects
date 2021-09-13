package com.hsbc.happytrip.models;

import java.io.Serializable;


/**
 * The persistent class for the states database table.
 * 
 */

public class State implements Serializable,Comparable<State> {

	
	private long stateId;


	private String stateName;

	public State() {
    }

	public long getStateId() {
		return this.stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public int hashCode() {
	
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((stateName == null) ? 0 : stateName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + "]";
	}

	@Override
	public int compareTo(State o) {
		// TODO Auto-generated method stub
	
		// TODO Auto-generated method stub
		if(o.stateName == null){
			return -1;
		}
		if(this.stateName != null){
			return this.stateName.compareTo(o.stateName);
		}else{
			return 0;
		}
	}
}