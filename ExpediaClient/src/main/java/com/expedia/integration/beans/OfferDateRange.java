package com.expedia.integration.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hala Odeh
 * @since Oct 15, 2017
 */
public class OfferDateRange {

	@JsonProperty("lengthOfStay")
	private String	lengthOfStay;

	/**
	 * @param lengthOfStay the lengthOfStay to set
	 */
	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	/**
	 * @return the lengthOfStay
	 */
	public String getLengthOfStay() {
		return lengthOfStay;
	}

}
