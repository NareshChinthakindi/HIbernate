/**
 * 
 */
package org.naresh.javariders.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Naresh
 *
 */
@Embeddable
public class Address {

	@Column(name="STREET")
	private String street;
	@Column(name="CITY_NAME")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="PIN_CODE")
	private String pinCode;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
