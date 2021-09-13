package com.hsbc.happytrip.models;

import java.io.Serializable;


/**
 * The persistent class for the classes database table.
 * 
 */

public class FlightClass implements Serializable,Comparable<FlightClass> {
	private static final long serialVersionUID = 1L;


	private long classId;

	private String classType;

	public FlightClass() {
    }

	public long getClassId() {
		return this.classId;
	}

	public void setClassId(long classId) {
		this.classId = classId;
	}

	public String getClassType() {
		return this.classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		if(classType != null){
			result = prime * result
				+ ((classType == null) ? 0 : classType.hashCode());
		}
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
		FlightClass other = (FlightClass) obj;
		if (classType == null) {
			if (other.classType != null)
				return false;
		} else if (!classType.equals(other.classType))
			return false;
		return true;
	}

	@Override
	public int compareTo(FlightClass o) {
		// TODO Auto-generated method stub
		if(o.classType == null){
			return -1;
		}
		if(this.classType != null){
			return this.classType.compareTo(o.classType);
		}else{
			return 0;
		}
	}
	
	
}