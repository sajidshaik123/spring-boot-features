package com.features.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public abstract class BaseEntity extends Object implements Serializable {

	@Column(name = "is_active")
	public Boolean isActive;

	@Column(name = "created_by")
	public Integer createdBy;

	@Column(name = "updated_by")
	public Integer updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on")
	public Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on")
	public Date updatedOn;
	
}
