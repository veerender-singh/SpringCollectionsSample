package com.veer.sample.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerService {

	private Set<Long> customerIds;
	private List<String> names;
	private Map<String, String> address;
	public Set<Long> getCustomerIds() {
		return customerIds;
	}
	public void setCustomerIds(Set<Long> customerIds) {
		this.customerIds = customerIds;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		System.out.println("CustomerIds:: "+customerIds.toString()+" Names:: "+Arrays.toString(names.toArray())+"Address:: "+address.toString());
		return super.toString();
	}
	
	
}
