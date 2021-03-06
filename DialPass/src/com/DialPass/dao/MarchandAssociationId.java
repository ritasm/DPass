package com.DialPass.dao;

// Generated 25 f�vr. 2014 21:26:16 by Hibernate Tools 3.4.0.CR1

/**
 * MarchandAssociationId generated by hbm2java
 */
public class MarchandAssociationId implements java.io.Serializable {

	private int idMarchand;
	private String nomAssociation;
	private String paysAssociation;
	private String addressAssociation;
	private String typeActivite;
	private String numeroEnregistrement;
	private String site;
	private String app;

	public MarchandAssociationId() {
	}

	public MarchandAssociationId(int idMarchand, String nomAssociation,
			String paysAssociation, String addressAssociation,
			String typeActivite, String numeroEnregistrement, String site,
			String app) {
		this.idMarchand = idMarchand;
		this.nomAssociation = nomAssociation;
		this.paysAssociation = paysAssociation;
		this.addressAssociation = addressAssociation;
		this.typeActivite = typeActivite;
		this.numeroEnregistrement = numeroEnregistrement;
		this.site = site;
		this.app = app;
	}

	public int getIdMarchand() {
		return this.idMarchand;
	}

	public void setIdMarchand(int idMarchand) {
		this.idMarchand = idMarchand;
	}

	public String getNomAssociation() {
		return this.nomAssociation;
	}

	public void setNomAssociation(String nomAssociation) {
		this.nomAssociation = nomAssociation;
	}

	public String getPaysAssociation() {
		return this.paysAssociation;
	}

	public void setPaysAssociation(String paysAssociation) {
		this.paysAssociation = paysAssociation;
	}

	public String getAddressAssociation() {
		return this.addressAssociation;
	}

	public void setAddressAssociation(String addressAssociation) {
		this.addressAssociation = addressAssociation;
	}

	public String getTypeActivite() {
		return this.typeActivite;
	}

	public void setTypeActivite(String typeActivite) {
		this.typeActivite = typeActivite;
	}

	public String getNumeroEnregistrement() {
		return this.numeroEnregistrement;
	}

	public void setNumeroEnregistrement(String numeroEnregistrement) {
		this.numeroEnregistrement = numeroEnregistrement;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MarchandAssociationId))
			return false;
		MarchandAssociationId castOther = (MarchandAssociationId) other;

		return (this.getIdMarchand() == castOther.getIdMarchand())
				&& ((this.getNomAssociation() == castOther.getNomAssociation()) || (this
						.getNomAssociation() != null
						&& castOther.getNomAssociation() != null && this
						.getNomAssociation().equals(
								castOther.getNomAssociation())))
				&& ((this.getPaysAssociation() == castOther
						.getPaysAssociation()) || (this.getPaysAssociation() != null
						&& castOther.getPaysAssociation() != null && this
						.getPaysAssociation().equals(
								castOther.getPaysAssociation())))
				&& ((this.getAddressAssociation() == castOther
						.getAddressAssociation()) || (this
						.getAddressAssociation() != null
						&& castOther.getAddressAssociation() != null && this
						.getAddressAssociation().equals(
								castOther.getAddressAssociation())))
				&& ((this.getTypeActivite() == castOther.getTypeActivite()) || (this
						.getTypeActivite() != null
						&& castOther.getTypeActivite() != null && this
						.getTypeActivite().equals(castOther.getTypeActivite())))
				&& ((this.getNumeroEnregistrement() == castOther
						.getNumeroEnregistrement()) || (this
						.getNumeroEnregistrement() != null
						&& castOther.getNumeroEnregistrement() != null && this
						.getNumeroEnregistrement().equals(
								castOther.getNumeroEnregistrement())))
				&& ((this.getSite() == castOther.getSite()) || (this.getSite() != null
						&& castOther.getSite() != null && this.getSite()
						.equals(castOther.getSite())))
				&& ((this.getApp() == castOther.getApp()) || (this.getApp() != null
						&& castOther.getApp() != null && this.getApp().equals(
						castOther.getApp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdMarchand();
		result = 37
				* result
				+ (getNomAssociation() == null ? 0 : this.getNomAssociation()
						.hashCode());
		result = 37
				* result
				+ (getPaysAssociation() == null ? 0 : this.getPaysAssociation()
						.hashCode());
		result = 37
				* result
				+ (getAddressAssociation() == null ? 0 : this
						.getAddressAssociation().hashCode());
		result = 37
				* result
				+ (getTypeActivite() == null ? 0 : this.getTypeActivite()
						.hashCode());
		result = 37
				* result
				+ (getNumeroEnregistrement() == null ? 0 : this
						.getNumeroEnregistrement().hashCode());
		result = 37 * result
				+ (getSite() == null ? 0 : this.getSite().hashCode());
		result = 37 * result
				+ (getApp() == null ? 0 : this.getApp().hashCode());
		return result;
	}

}
