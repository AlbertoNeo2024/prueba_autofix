package com.mifel.app.banca.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "itemapp")
public class ItemApp {
	
	@Id
	private Long Id;
	private String work;
	private String state;
	private String assignedto;
	private String title;
	private String tags;

	public ItemApp() {
	}

	public ItemApp(Long Id, String work, String type, String state, String assignedto, String title,
			String tags) {
		super();
		this.Id = Id;
		this.work = work;
		this.state = state;
		this.assignedto = assignedto;
		this.title = title;
		this.tags = tags;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long Id) {
		this.Id = Id;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
