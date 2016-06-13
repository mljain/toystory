package com.cohifi.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Toy")
@XmlType(propOrder = { "_id", "description", "toyImage" })
public class Toy {

	private String description;
	private int _id;
	private byte[] toyImage;

	public String getDescription() {
		return description;
	}

	public int get_id() {
		return _id;
	}

	public byte[] getToyImage() {
		return toyImage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public void setToyImage(byte[] toyImage) {
		this.toyImage = toyImage;
	}

}
