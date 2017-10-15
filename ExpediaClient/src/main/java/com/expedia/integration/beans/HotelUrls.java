package com.expedia.integration.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Hala Odeh
 * @since Oct 15, 2017
 */
public class HotelUrls {

	@JsonProperty("hotelSearchResultUrl")
	private String hotelSearchResultUrl;
	@JsonProperty("hotelInfositeUrl")
	private String hotelInfositeUrl;
	
	/**
	 * @return the hotelSearchResultUrl
	 */
	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}
	/**
	 * @param hotelSearchResultUrl the hotelSearchResultUrl to set
	 */
	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}
	/**
	 * @return the hotelInfositeUrl
	 */
	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}
	/**
	 * @param hotelInfositeUrl the hotelInfositeUrl to set
	 */
	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}
}
