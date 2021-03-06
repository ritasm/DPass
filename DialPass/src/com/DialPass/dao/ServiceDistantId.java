package com.DialPass.dao;

// Generated 25 f�vr. 2014 21:26:16 by Hibernate Tools 3.4.0.CR1

/**
 * ServiceDistantId generated by hbm2java
 */
public class ServiceDistantId implements java.io.Serializable {

	private String urlPublic;
	private String urlPrive;
	private String urlError;
	private int idService;

	public ServiceDistantId() {
	}

	public ServiceDistantId(String urlPublic, String urlPrive, int idService) {
		this.urlPublic = urlPublic;
		this.urlPrive = urlPrive;
		this.idService = idService;
	}

	public ServiceDistantId(String urlPublic, String urlPrive, String urlError,
			int idService) {
		this.urlPublic = urlPublic;
		this.urlPrive = urlPrive;
		this.urlError = urlError;
		this.idService = idService;
	}

	public String getUrlPublic() {
		return this.urlPublic;
	}

	public void setUrlPublic(String urlPublic) {
		this.urlPublic = urlPublic;
	}

	public String getUrlPrive() {
		return this.urlPrive;
	}

	public void setUrlPrive(String urlPrive) {
		this.urlPrive = urlPrive;
	}

	public String getUrlError() {
		return this.urlError;
	}

	public void setUrlError(String urlError) {
		this.urlError = urlError;
	}

	public int getIdService() {
		return this.idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ServiceDistantId))
			return false;
		ServiceDistantId castOther = (ServiceDistantId) other;

		return ((this.getUrlPublic() == castOther.getUrlPublic()) || (this
				.getUrlPublic() != null && castOther.getUrlPublic() != null && this
				.getUrlPublic().equals(castOther.getUrlPublic())))
				&& ((this.getUrlPrive() == castOther.getUrlPrive()) || (this
						.getUrlPrive() != null
						&& castOther.getUrlPrive() != null && this
						.getUrlPrive().equals(castOther.getUrlPrive())))
				&& ((this.getUrlError() == castOther.getUrlError()) || (this
						.getUrlError() != null
						&& castOther.getUrlError() != null && this
						.getUrlError().equals(castOther.getUrlError())))
				&& (this.getIdService() == castOther.getIdService());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUrlPublic() == null ? 0 : this.getUrlPublic().hashCode());
		result = 37 * result
				+ (getUrlPrive() == null ? 0 : this.getUrlPrive().hashCode());
		result = 37 * result
				+ (getUrlError() == null ? 0 : this.getUrlError().hashCode());
		result = 37 * result + this.getIdService();
		return result;
	}

}
