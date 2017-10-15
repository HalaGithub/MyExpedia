package com.expedia.integration.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hala Odeh
 * @since Oct 15, 2017
 */
public class HotelPricingInfo {

	@JsonProperty("totalPriceValue")
	private String	totalPriceValue;
	@JsonProperty("originalPricePerNight")
	private String	originalPricePerNight;
	@JsonProperty("hotelTotalBaseRate")
	private String	hotelTotalBaseRate;
	@JsonProperty("hotelTotalTaxesAndFees")
	private String	hotelTotalTaxesAndFees;
	@JsonProperty("currency")
	private String	currency;
	@JsonProperty("hotelTotalMandatoryTaxesAndFees")
	private String	hotelTotalMandatoryTaxesAndFees;
	@JsonProperty("percentSavings")
	private String	percentSavings;
	@JsonProperty("drr")
	private String	drr;
	@JsonProperty("averagePriceValue")
	private String	averagePriceValue;
	
	/**
	 * @return the totalPriceValue
	 */
	public String getTotalPriceValue() {
		return totalPriceValue;
	}
	/**
	 * @return the originalPricePerNight
	 */
	public String getOriginalPricePerNight() {
		return originalPricePerNight;
	}
	/**
	 * @return the hotelTotalBaseRate
	 */
	public String getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}
	/**
	 * @return the hotelTotalTaxesAndFees
	 */
	public String getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @return the hotelTotalMandatoryTaxesAndFees
	 */
	public String getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}
	/**
	 * @return the percentSavings
	 */
	public String getPercentSavings() {
		return percentSavings;
	}
	/**
	 * @return the drr
	 */
	public String getDrr() {
		return drr;
	}
	/**
	 * @param totalPriceValue the totalPriceValue to set
	 */
	public void setTotalPriceValue(String totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}
	/**
	 * @param originalPricePerNight the originalPricePerNight to set
	 */
	public void setOriginalPricePerNight(String originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}
	/**
	 * @param hotelTotalBaseRate the hotelTotalBaseRate to set
	 */
	public void setHotelTotalBaseRate(String hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}
	/**
	 * @param hotelTotalTaxesAndFees the hotelTotalTaxesAndFees to set
	 */
	public void setHotelTotalTaxesAndFees(String hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @param hotelTotalMandatoryTaxesAndFees the hotelTotalMandatoryTaxesAndFees to set
	 */
	public void setHotelTotalMandatoryTaxesAndFees(String hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}
	/**
	 * @param percentSavings the percentSavings to set
	 */
	public void setPercentSavings(String percentSavings) {
		this.percentSavings = percentSavings;
	}
	/**
	 * @param drr the drr to set
	 */
	public void setDrr(String drr) {
		this.drr = drr;
	}
	/**
	 * @param averagePriceValue the averagePriceValue to set
	 */
	public void setAveragePriceValue(String averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}
	/**
	 * @return the averagePriceValue
	 */
	public String getAveragePriceValue() {
		return averagePriceValue;
	}


}
