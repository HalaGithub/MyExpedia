package com.expedia.integration.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hala Odeh
 * @since Oct 15, 2017
 */
public class HotelInfo {

	@JsonProperty("hotelName")
	private String	hotelName;
	
	@JsonProperty("hotelDestination")
	private String	hotelDestination;
	
	@JsonProperty("hotelDestinationRegionID")
	private String	hotelDestinationRegionID;
	
	@JsonProperty("hotelLongDestination")
	private String	hotelLongDestination;
	
	@JsonProperty("hotelStreetAddress")
	private String	hotelStreetAddress;
	
	@JsonProperty("hotelCity")
	private String	hotelCity;
	
	@JsonProperty("hotelProvince")
	private String	hotelProvince;
	
	@JsonProperty("hotelCountryCode")
	private String	hotelCountryCode;
	
	@JsonProperty("hotelLocation")
	private String	hotelLocation;
	
	@JsonProperty("hotelLatitude")
	private String	hotelLatitude;
	
	@JsonProperty("hotelLongitude")
	private String	hotelLongitude;
	
	@JsonProperty("hotelStarRating")
	private String	hotelStarRating;
	
	@JsonProperty("hotelGuestReviewRating")
	private String	hotelGuestReviewRating;
	
	@JsonProperty("travelStartDate")
	private String	travelStartDate;
	
	@JsonProperty("travelEndDate")
	private String	travelEndDate;
	
	@JsonProperty("hotelImageUrl")
	private String	hotelImageUrl;
	
	@JsonProperty("carPackageScore")
	private String	carPackageScore;
	
	@JsonProperty("description")
	private String	description;
	
	@JsonProperty("distanceFromUser")
	private String	distanceFromUser;
	
	@JsonProperty("language")
	private String	language;
	
	@JsonProperty("movingAverageScore")
	private String	movingAverageScore;
	
	@JsonProperty("promotionAmount")
	private String	promotionAmount;
	
	@JsonProperty("promotionDescription")
	private String	promotionDescription;
	
	@JsonProperty("promotionTag")
	private String	promotionTag;
	
	@JsonProperty("rawAppealScore")
	private String	rawAppealScore;
	
	@JsonProperty("relevanceScore")
	private String	relevanceScore;
	
	@JsonProperty("statusCode")
	private String	statusCode;
	
	@JsonProperty("statusDescription")
	private String	statusDescription;
	
	@JsonProperty("carPackage")
	private String	carPackage;
	
	@JsonProperty("allInclusive")
	private String	allInclusive;

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @return the hotelDestination
	 */
	public String getHotelDestination() {
		return hotelDestination;
	}

	/**
	 * @return the hotelDestinationRegionID
	 */
	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	/**
	 * @return the hotelLongDestination
	 */
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	/**
	 * @return the hotelStreetAddress
	 */
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	/**
	 * @return the hotelCity
	 */
	public String getHotelCity() {
		return hotelCity;
	}

	/**
	 * @return the hotelProvince
	 */
	public String getHotelProvince() {
		return hotelProvince;
	}

	/**
	 * @return the hotelCountryCode
	 */
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	/**
	 * @return the hotelLocation
	 */
	public String getHotelLocation() {
		return hotelLocation;
	}

	/**
	 * @return the hotelLatitude
	 */
	public String getHotelLatitude() {
		return hotelLatitude;
	}

	/**
	 * @return the hotelLongitude
	 */
	public String getHotelLongitude() {
		return hotelLongitude;
	}

	/**
	 * @return the hotelStarRating
	 */
	public String getHotelStarRating() {
		return hotelStarRating;
	}

	/**
	 * @return the hotelGuestReviewRating
	 */
	public String getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	/**
	 * @return the travelStartDate
	 */
	public String getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * @return the travelEndDate
	 */
	public String getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * @return the hotelImageUrl
	 */
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	/**
	 * @return the carPackageScore
	 */
	public String getCarPackageScore() {
		return carPackageScore;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the distanceFromUser
	 */
	public String getDistanceFromUser() {
		return distanceFromUser;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @return the movingAverageScore
	 */
	public String getMovingAverageScore() {
		return movingAverageScore;
	}

	/**
	 * @return the promotionAmount
	 */
	public String getPromotionAmount() {
		return promotionAmount;
	}

	/**
	 * @return the promotionDescription
	 */
	public String getPromotionDescription() {
		return promotionDescription;
	}

	/**
	 * @return the promotionTag
	 */
	public String getPromotionTag() {
		return promotionTag;
	}

	/**
	 * @return the rawAppealScore
	 */
	public String getRawAppealScore() {
		return rawAppealScore;
	}

	/**
	 * @return the relevanceScore
	 */
	public String getRelevanceScore() {
		return relevanceScore;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * @return the carPackage
	 */
	public String getCarPackage() {
		return carPackage;
	}

	/**
	 * @return the allInclusive
	 */
	public String getAllInclusive() {
		return allInclusive;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @param hotelDestination the hotelDestination to set
	 */
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	/**
	 * @param hotelDestinationRegionID the hotelDestinationRegionID to set
	 */
	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	/**
	 * @param hotelLongDestination the hotelLongDestination to set
	 */
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	/**
	 * @param hotelStreetAddress the hotelStreetAddress to set
	 */
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	/**
	 * @param hotelCity the hotelCity to set
	 */
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	/**
	 * @param hotelProvince the hotelProvince to set
	 */
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	/**
	 * @param hotelCountryCode the hotelCountryCode to set
	 */
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	/**
	 * @param hotelLocation the hotelLocation to set
	 */
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	/**
	 * @param hotelLatitude the hotelLatitude to set
	 */
	public void setHotelLatitude(String hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	/**
	 * @param hotelLongitude the hotelLongitude to set
	 */
	public void setHotelLongitude(String hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	/**
	 * @param hotelStarRating the hotelStarRating to set
	 */
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	/**
	 * @param hotelGuestReviewRating the hotelGuestReviewRating to set
	 */
	public void setHotelGuestReviewRating(String hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	/**
	 * @param travelStartDate the travelStartDate to set
	 */
	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * @param travelEndDate the travelEndDate to set
	 */
	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	/**
	 * @param hotelImageUrl the hotelImageUrl to set
	 */
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	/**
	 * @param carPackageScore the carPackageScore to set
	 */
	public void setCarPackageScore(String carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param distanceFromUser the distanceFromUser to set
	 */
	public void setDistanceFromUser(String distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @param movingAverageScore the movingAverageScore to set
	 */
	public void setMovingAverageScore(String movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	/**
	 * @param promotionAmount the promotionAmount to set
	 */
	public void setPromotionAmount(String promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	/**
	 * @param promotionDescription the promotionDescription to set
	 */
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	/**
	 * @param promotionTag the promotionTag to set
	 */
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	/**
	 * @param rawAppealScore the rawAppealScore to set
	 */
	public void setRawAppealScore(String rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	/**
	 * @param relevanceScore the relevanceScore to set
	 */
	public void setRelevanceScore(String relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	/**
	 * @param carPackage the carPackage to set
	 */
	public void setCarPackage(String carPackage) {
		this.carPackage = carPackage;
	}

	/**
	 * @param allInclusive the allInclusive to set
	 */
	public void setAllInclusive(String allInclusive) {
		this.allInclusive = allInclusive;
	}

	
}
