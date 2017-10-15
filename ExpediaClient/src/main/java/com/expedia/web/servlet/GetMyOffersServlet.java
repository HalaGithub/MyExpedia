package com.expedia.web.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.expedia.integration.beans.Offers;
import com.expedia.web.bean.SearchCriteriaBean;
import com.expedia.web.util.ExpediaClientHelper;

/**
 * Servlet implementation class GetMyOffersServlet
 */
public class GetMyOffersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static Logger logger = Logger.getLogger("GetMyOffersServlet");


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Get the results!");

		try {
			// Read the form parameters
			String destination = request.getParameter("destination");
			String lengthOfStay = request.getParameter("lengthOfStay");
			String minStarRate = request.getParameter("minStarRate");
			String maxStarRate = request.getParameter("maxStarRate");
			String minGuestRate = request.getParameter("minGuestRate");
			String maxGuestRate = request.getParameter("maxGuestRate");
			String minTotalRate = request.getParameter("minTotalRate");
			String maxTotalRate = request.getParameter("maxTotalRate");
			String tripStartDate = request.getParameter("tripStartDate");
			String tripEndDate = request.getParameter("tripEndDate");

			String validTripStartDate = null;
			String validTripEndDate = null;

			// perform some vallidations before passing values
			boolean invalidInput = false;
			String invalidInputErrorMessage = "";
			if(!isEmpty(lengthOfStay) && isNan(lengthOfStay)) {
				invalidInputErrorMessage = "Length of stay should be a number";
				invalidInput = true;
			} else if(!isEmpty(minStarRate) && isNad(minStarRate)) {
				invalidInputErrorMessage = "Rating should be a number";
				invalidInput = true;
			} else if(!isEmpty(maxStarRate) && isNad(maxStarRate)) {
				invalidInputErrorMessage = "Rating should be a number";
				invalidInput = true;
			} else if(!isEmpty(minGuestRate) && isNad(minGuestRate)) {
				invalidInputErrorMessage = "Rating should be a number";
				invalidInput = true;
			}  else if(!isEmpty(maxGuestRate) && isNad(maxGuestRate)) {
				invalidInputErrorMessage = "Rating should be a number";
				invalidInput = true;
			}  else if(!isEmpty(minTotalRate) && isNad(minTotalRate)) {
				invalidInputErrorMessage = "Rating should be a number";
				invalidInput = true;
			}  else if(!isEmpty(maxTotalRate) && isNad(maxTotalRate)) {
				invalidInputErrorMessage = "Rating should be a number";
				invalidInput = true;
			}  
			
			System.out.println("tripStartDate " + tripStartDate);
			if (!isEmpty(tripStartDate)) {
				 validTripStartDate = getValidFormat(tripStartDate);
				
				if(isEmpty(validTripStartDate)) {
					invalidInputErrorMessage = "Dates should be in valid format YYYY-mm-dd";
					invalidInput = true;
				}

			}

			if (!isEmpty(tripEndDate)) {
				 validTripEndDate = getValidFormat(tripEndDate);
				if(isEmpty(validTripEndDate)) {
					invalidInputErrorMessage = "Dates should be in valid format YYYY-mm-dd";
					invalidInput = true;
				}

			}

			if(invalidInput) {
				request.setAttribute("warningMsg",invalidInputErrorMessage);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/GetOffers.jsp");
				dispatcher.forward(request, response);
				return;
			}

			// Fill Search Criteria Bean
			SearchCriteriaBean bean = new SearchCriteriaBean(); 
			bean.setDestination(destination);
			bean.setMaxGuestRate(maxGuestRate);
			bean.setMinGuestRate(minGuestRate);
			bean.setMaxStarRate(maxStarRate);
			bean.setMinStarRate(minStarRate);
			bean.setMaxTotalRate(maxTotalRate);
			bean.setMinTotalRate(minTotalRate);
			bean.setTripEndDate(validTripEndDate);
			bean.setTripStartDate(validTripStartDate);
			bean.setLengthOfStay(lengthOfStay);

			logger.info("Form input Data " +bean.toString());

			try {
				// Send Request to expedia with user preferences
				Offers offers = ExpediaClientHelper.sendRequest(bean);

				if(offers != null) {
					request.setAttribute("offers",offers);
				} else {
					request.setAttribute("warningMsg", "Anormal Error while trying to retrieve offers.");
					RequestDispatcher dispatcher = request.getRequestDispatcher("/GetOffers.jsp");
					dispatcher.forward(request, response);
					return;
				}
			} catch (Exception e) {
				logger.error("Exception while integrating", e);
			}

			request.setAttribute("searchCriteria",bean);

		} catch(Exception e) {
			request.setAttribute("warningMsg","* Abnormal Error, please try again");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/GetOffers.jsp");
			dispatcher.forward(request, response);
			return;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/PresentOffers.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * This method to check if the parameter is decimal or not
	 * 
	 * @param decimalValue
	 * @return true is not a number
	 */
	private boolean isNad(String decimalValue) {
		try {
			Double.parseDouble(decimalValue);
			return false;
		} catch (NumberFormatException nfe) {
			return true;
		}
	}

	/**
	 * @param dateString
	 * @return true is valid
	 */
	private String getValidFormat(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d = sdf.parse(dateString);
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(d);
		} catch (ParseException e) {
			e.printStackTrace(System.out);
			return null;
		}
	}

	/**
	 * Check if the sent value is null, empty, or null as a string.
	 * @param value
	 * @return boolean
	 */
	public static boolean isEmpty(String value) {
		if (value == null || value.trim().equals("") || value.trim().equals("null")) {
			return true;
		}

		return false;
	}

	/**
	 * This method to check if the parameter is integer or not
	 * 
	 * @param str
	 * @return true if it is not a number, false otherwise
	 */
	protected boolean isNan(String str) {
		try {
			Integer.parseInt(str);
			return false;
		} catch (NumberFormatException nfe) {
			return true;
		}

	}
}
