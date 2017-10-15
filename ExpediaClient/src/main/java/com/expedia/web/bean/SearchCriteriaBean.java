/**
 * 
 */
package com.expedia.web.bean;

import com.expedia.integration.annotation.QueryKey;
import com.expedia.integration.util.ExpediaConstants;

/**
 * Holding search criteria properties 
 * 
 * @author Hala Odeh
 * @since Oct 14, 2017
 */
public class SearchCriteriaBean {
    
    @QueryKey(ExpediaConstants.DESTINATION)
    private String destination;
    @QueryKey(ExpediaConstants.MINSTARRATE)
    private String minStarRate ;
    @QueryKey(ExpediaConstants.MAXSTARRATE)
    private String maxStarRate ;
    @QueryKey(ExpediaConstants.MINGUESTRATE)
    private String minGuestRate ;
    @QueryKey(ExpediaConstants.MAXGUESTRATE)
    private String maxGuestRate ;
    @QueryKey(ExpediaConstants.MINTOTALRATE)
    private String minTotalRate ;
    @QueryKey(ExpediaConstants.MAXTOTALRATE)
    private String maxTotalRate ;
    @QueryKey(ExpediaConstants.TRIPSTARTDATE)
    private String tripStartDate ;
    @QueryKey(ExpediaConstants.TRIPENDDATE)
    private String tripEndDate;
    @QueryKey(ExpediaConstants.LENGTHOFSTAY)
    private String lengthOfStay;

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }
    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    /**
     * @return the minStarRate
     */
    public String getMinStarRate() {
        return minStarRate;
    }
    /**
     * @param minStarRate the minStarRate to set
     */
    public void setMinStarRate(String minStarRate) {
        this.minStarRate = minStarRate;
    }
    /**
     * @return the maxStarRate
     */
    public String getMaxStarRate() {
        return maxStarRate;
    }
    /**
     * @param maxStarRate the maxStarRate to set
     */
    public void setMaxStarRate(String maxStarRate) {
        this.maxStarRate = maxStarRate;
    }
    /**
     * @return the minGuestRate
     */
    public String getMinGuestRate() {
        return minGuestRate;
    }
    /**
     * @param minGuestRate the minGuestRate to set
     */
    public void setMinGuestRate(String minGuestRate) {
        this.minGuestRate = minGuestRate;
    }
    /**
     * @return the maxGuestRate
     */
    public String getMaxGuestRate() {
        return maxGuestRate;
    }
    /**
     * @param maxGuestRate the maxGuestRate to set
     */
    public void setMaxGuestRate(String maxGuestRate) {
        this.maxGuestRate = maxGuestRate;
    }
    /**
     * @return the minTotalRate
     */
    public String getMinTotalRate() {
        return minTotalRate;
    }
    /**
     * @param minTotalRate the minTotalRate to set
     */
    public void setMinTotalRate(String minTotalRate) {
        this.minTotalRate = minTotalRate;
    }
    /**
     * @return the maxTotalRate
     */
    public String getMaxTotalRate() {
        return maxTotalRate;
    }
    /**
     * @param maxTotalRate the maxTotalRate to set
     */
    public void setMaxTotalRate(String maxTotalRate) {
        this.maxTotalRate = maxTotalRate;
    }
    /**
     * @return the tripStartDate
     */
    public String getTripStartDate() {
        return tripStartDate;
    }
    /**
     * @param tripStartDate the tripStartDate to set
     */
    public void setTripStartDate(String tripStartDate) {
        this.tripStartDate = tripStartDate;
    }
    /**
     * @return the tripEndDate
     */
    public String getTripEndDate() {
        return tripEndDate;
    }
    /**
     * @param tripEndDate the tripEndDate to set
     */
    public void setTripEndDate(String tripEndDate) {
        this.tripEndDate = tripEndDate;
    }
    
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
	/**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuffer sb = new StringBuffer("SearchCriteriaBean: \n");
        sb.append(" destination = ").append(destination).append("\n");
        sb.append(" minStarRate = ").append(minStarRate).append("\n");
        sb.append(" maxStarRate = ").append(maxStarRate).append("\n");
        sb.append(" minGuestRate = ").append(minGuestRate).append("\n");
        sb.append(" maxGuestRate = ").append(maxGuestRate).append("\n");
        sb.append(" maxTotalRate = ").append(maxTotalRate).append("\n");
        sb.append(" minTotalRate = ").append(minTotalRate).append("\n");
        sb.append(" tripStartDate = ").append(tripStartDate).append("\n");
        sb.append(" tripEndDate = ").append(tripEndDate).append("\n");
        sb.append(" lengthOfStay = ").append(lengthOfStay).append("\n");
        
        return sb.toString();
    }

}
