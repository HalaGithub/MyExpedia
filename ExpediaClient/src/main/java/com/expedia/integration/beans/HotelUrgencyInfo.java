package com.expedia.integration.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hala Odeh
 * @since Oct 15, 2017
 */
public class HotelUrgencyInfo {
	@JsonProperty("numberOfPeopleViewing")
	private String			numberOfPeopleViewing;
	@JsonProperty("numberOfPeopleBooked")
	private String			numberOfPeopleBooked;
	@JsonProperty("numberOfRoomsLeft")
	private String			numberOfRoomsLeft;
	@JsonProperty("lastBookedTime")
	private String			lastBookedTime;
	@JsonProperty("almostSoldStatus")
	private String			almostSoldStatus;
	@JsonProperty("almostSoldOutRoomTypeInfoCollection")
	private List<String>	almostSoldOutRoomTypeInfoCollection;
	@JsonProperty("airAttachEnabled")
	private String			airAttachEnabled;
	@JsonProperty("link")
	private String			link;
	
	/**
	 * @return the numberOfPeopleViewing
	 */
	public String getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}
	/**
	 * @param numberOfPeopleViewing the numberOfPeopleViewing to set
	 */
	public void setNumberOfPeopleViewing(String numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}
	/**
	 * @return the numberOfPeopleBooked
	 */
	public String getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}
	/**
	 * @param numberOfPeopleBooked the numberOfPeopleBooked to set
	 */
	public void setNumberOfPeopleBooked(String numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}
	/**
	 * @return the numberOfRoomsLeft
	 */
	public String getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}
	/**
	 * @param numberOfRoomsLeft the numberOfRoomsLeft to set
	 */
	public void setNumberOfRoomsLeft(String numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}
	/**
	 * @return the lastBookedTime
	 */
	public String getLastBookedTime() {
		return lastBookedTime;
	}
	/**
	 * @param lastBookedTime the lastBookedTime to set
	 */
	public void setLastBookedTime(String lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}
	/**
	 * @return the almostSoldStatus
	 */
	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}
	/**
	 * @param almostSoldStatus the almostSoldStatus to set
	 */
	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the almostSoldOutRoomTypeInfoCollection
	 */
	public List<String> getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}
	/**
	 * @param almostSoldOutRoomTypeInfoCollection the almostSoldOutRoomTypeInfoCollection to set
	 */
	public void setAlmostSoldOutRoomTypeInfoCollection(List<String> almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}
	/**
	 * @return the airAttachEnabled
	 */
	public String getAirAttachEnabled() {
		return airAttachEnabled;
	}
	/**
	 * @param airAttachEnabled the airAttachEnabled to set
	 */
	public void setAirAttachEnabled(String airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

	
}
