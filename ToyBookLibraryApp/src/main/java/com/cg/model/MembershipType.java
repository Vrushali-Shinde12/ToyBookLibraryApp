package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MembershipType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="membershipType_id")
	private int membershipTypeId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="duration_months")
	private int durationMonths;
	
	@Column(name="price")
	private float price;

	public MembershipType(int membershipTypeId, String description, int durationMonths, float price) {
		super();
		this.membershipTypeId = membershipTypeId;
		this.description = description;
		this.durationMonths = durationMonths;
		this.price = price;
	}

	public int getMembershipTypeId() {
		return membershipTypeId;
	}

	public void setMembershipTypeId(int membershipTypeId) {
		this.membershipTypeId = membershipTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDurationMonths() {
		return durationMonths;
	}

	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MembershipType [membershipTypeId=" + membershipTypeId + ", description=" + description
				+ ", durationMonths=" + durationMonths + ", price=" + price + "]";
	}
	

}
