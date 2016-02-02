package com.borrowhut.ws.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARTY_AUTH_MECH database table.
 * 
 */
@Entity
@Table(name="PARTY_AUTH_MECH")
@NamedQuery(name="PartyAuthMech.findAll", query="SELECT p FROM PartyAuthMech p")
@IdClass(PartyAuthMechPK.class)
public class PartyAuthMech implements Serializable {
	private static final long serialVersionUID = 1L;

	/*@EmbeddedId
	private PartyAuthMechPK id;
*/
	
	/*@Column(name="PTY_ID", insertable=false, updatable=false, unique=true, nullable=false)
	private int ptyId;

	@Column(name="AMH_ID", insertable=false, updatable=false, unique=true, nullable=false, length=10)
	private String amhId;*/
	
	@Id
	private int ptyId;
	
	@Id
	private String amhId;
	
	@Column(name="PAM_AUTH_ID", length=45)
	private String pamAuthId;

	@Column(name="PAM_AUTH_TOKEN", length=45)
	private String pamAuthToken;

	//bi-directional many-to-one association to AuthMech
	@ManyToOne
	@JoinColumn(name="AMH_ID", nullable=false, insertable=false, updatable=false)
	private AuthMech authMech;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="PTY_ID", nullable=false, insertable=false, updatable=false)
	private Party party;

	public PartyAuthMech() {
	}

	/*public PartyAuthMechPK getId() {
		return this.id;
	}

	public void setId(PartyAuthMechPK id) {
		this.id = id;
	}*/
	
	public int getPtyId() {
		return this.ptyId;
	}
	public void setPtyId(int ptyId) {
		this.ptyId = ptyId;
	}
	public String getAmhId() {
		return this.amhId;
	}
	public void setAmhId(String amhId) {
		this.amhId = amhId;
	}

	public String getPamAuthId() {
		return this.pamAuthId;
	}

	public void setPamAuthId(String pamAuthId) {
		this.pamAuthId = pamAuthId;
	}

	public String getPamAuthToken() {
		return this.pamAuthToken;
	}

	public void setPamAuthToken(String pamAuthToken) {
		this.pamAuthToken = pamAuthToken;
	}

	public AuthMech getAuthMech() {
		return this.authMech;
	}

	public void setAuthMech(AuthMech authMech) {
		this.authMech = authMech;
	}

	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

}