package com.expedia.integration.util;

import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;

import org.apache.log4j.Logger;

import com.expedia.integration.annotation.QueryKey;
import com.google.common.collect.Lists;

/**
 * offering methods to build integration messages
 * @author Hala Odeh
 * @since Oct 14, 2017
 */
public class MessageBuilder {
	private final static Logger logger = Logger.getLogger("MessageBuilder");


	/**
	 * will build query string from provided objects , only properties annotated with QueryKey will be added 
	 * @param bean containg query parameters
	 * @return query string 
	 */
	public static String buildQueryString(Object bean) {
		StringBuffer sb = new StringBuffer();
		try {
			// first parameter is added with out "&"
			boolean firstParam = true;

			for (Field field : getFieldsUpTo(bean.getClass(), Object.class)) {
				field.setAccessible(true);
				// checks if there is annotation present of the type QueryKey
				if (field.isAnnotationPresent(QueryKey.class)) {
					QueryKey key = field.getAnnotation(QueryKey.class);
					String val = (String) field.get(bean);
					if(!isEmpty(val)) {
						if (!firstParam) {
							sb.append("&");
						} else {
							firstParam = false;
						}
						sb.append(key.value());
						sb.append("=");
						sb.append(URLEncoder.encode(val, "UTF-8"));
					}
				} 
			}
		} catch (Exception ex) {
			logger.error("Error while building query string" ,ex);
		} catch (Throwable t) {
			logger.error("Error while building query string");
		}
		return sb.toString();
	}

	/**
	 * Get all the field of the desired class up to the desired parent class
	 * @param startClass
	 * @param parent
	 * @return fields list
	 */
	private static Iterable<Field> getFieldsUpTo(Class<?> startClass, Class<?> parent) {

		List<Field> currentClassFields = Lists.newArrayList(startClass.getDeclaredFields());
		Class<?> parentClass = startClass.getSuperclass();

		if (parentClass != null && (parent == null || !(parentClass.equals(parent)))) {
			List<Field> parentClassFields = (List<Field>) getFieldsUpTo(parentClass, parent);
			currentClassFields.addAll(parentClassFields);
		}

		return currentClassFields;
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


}
