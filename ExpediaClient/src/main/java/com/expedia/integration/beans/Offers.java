package com.expedia.integration.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hala Odeh
 * @since Oct 15, 2017
 */
public class Offers{

	@JsonProperty("offers")
	private Hotels				hotel;

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}

	/**
	 * @return the hotel
	 */
	public Hotels getHotel() {
		return hotel;
	}
}
