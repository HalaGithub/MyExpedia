package com.expedia.integration.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hala Odeh
 * @since Oct 15, 2017
 */
public class Hotel{
	@JsonProperty("offerDateRange")
	private OfferDateRange		offerDateRange;
	@JsonProperty("destination")
	private Destination			destination;
	@JsonProperty("hotelInfo")
	private HotelInfo			hotelInfo;
	@JsonProperty("hotelUrgencyInfo")
	private HotelUrgencyInfo	hotelUrgencyInfo;
	@JsonProperty("hotelPricingInfo")
	private HotelPricingInfo	hotelPricingInfo;
	@JsonProperty("hotelUrls")
	private HotelUrls			hotelUrls;
	
	/**
	 * @return the offerDateRange
	 */
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}
	/**
	 * @return the destination
	 */
	public Destination getDestination() {
		return destination;
	}
	/**
	 * @return the hotelInfo
	 */
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}
	/**
	 * @return the hotelUrgencyInfo
	 */
	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}
	/**
	 * @return the hotelPricingInfo
	 */
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}
	/**
	 * @return the hotelUrls
	 */
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}
	/**
	 * @param offerDateRange the offerDateRange to set
	 */
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	/**
	 * @param hotelInfo the hotelInfo to set
	 */
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}
	/**
	 * @param hotelUrgencyInfo the hotelUrgencyInfo to set
	 */
	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}
	/**
	 * @param hotelPricingInfo the hotelPricingInfo to set
	 */
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}
	/**
	 * @param hotelUrls the hotelUrls to set
	 */
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	
}
