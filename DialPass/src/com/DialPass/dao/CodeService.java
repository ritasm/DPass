package com.DialPass.dao;

// Generated 25 f�vr. 2014 21:26:16 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * CodeService generated by hbm2java
 */
public class CodeService implements java.io.Serializable {

	private Integer idCodeservice;
	private String codeservice;
	private Set services = new HashSet(0);

	public CodeService() {
	}

	public CodeService(String codeservice) {
		this.codeservice = codeservice;
	}

	public CodeService(String codeservice, Set services) {
		this.codeservice = codeservice;
		this.services = services;
	}

	public Integer getIdCodeservice() {
		return this.idCodeservice;
	}

	public void setIdCodeservice(Integer idCodeservice) {
		this.idCodeservice = idCodeservice;
	}

	public String getCodeservice() {
		return this.codeservice;
	}

	public void setCodeservice(String codeservice) {
		this.codeservice = codeservice;
	}

	public Set getServices() {
		return this.services;
	}

	public void setServices(Set services) {
		this.services = services;
	}

}
