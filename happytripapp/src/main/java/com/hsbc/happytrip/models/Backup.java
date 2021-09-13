package com.hsbc.happytrip.models;

public class Backup {

	
	private long backupId;

	
	private String name;

	private byte[] data;

	public long getBackupId() {
		return backupId;
	}

	public void setBackupId(long backupId) {
		this.backupId = backupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}
