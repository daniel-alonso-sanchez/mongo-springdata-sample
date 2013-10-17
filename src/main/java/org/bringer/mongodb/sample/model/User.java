/**
 * 
 */
package org.bringer.mongodb.sample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author daniel
 * 
 */
@Document
public class User {
	@Id
	private String id;
	private String name;
	private String mail;

	/**
	 * 
	 * @param id
	 * @param name
	 * @param mail
	 */
	public User(String id, String name, String mail) {
		this.id = id;
		this.name = name;
		this.mail = mail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
}
