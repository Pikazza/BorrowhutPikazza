package com.borrowhut.ws.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRUST_CIRCLE database table.
 * 
 */
@Embeddable
public class TrustCirclePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PTY_ID", insertable=false, updatable=false, unique=true, nullable=false)
	private int ptyId;

	@Column(name="MTC_CONTACT_PTY_ID", insertable=false, updatable=false, unique=true, nullable=false)
	private int mtcContactPtyId;

	public TrustCirclePK() {
	}
	public int getPtyId() {
		return this.ptyId;
	}
	public void setPtyId(int ptyId) {
		this.ptyId = ptyId;
	}
	public int getMtcContactPtyId() {
		return this.mtcContactPtyId;
	}
	public void setMtcContactPtyId(int mtcContactPtyId) {
		this.mtcContactPtyId = mtcContactPtyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TrustCirclePK)) {
			return false;
		}
		TrustCirclePK castOther = (TrustCirclePK)other;
		return 
			(this.ptyId == castOther.ptyId)
			&& (this.mtcContactPtyId == castOther.mtcContactPtyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ptyId;
		hash = hash * prime + this.mtcContactPtyId;
		
		return hash;
	}
}