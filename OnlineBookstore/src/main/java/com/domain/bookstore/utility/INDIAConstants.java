package com.domain.bookstore.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class INDIAConstants {

	public final static String INDIA="INDIA";
	
	public final static Map<String, String> mapOfINDIAStates = new HashMap<String,String>(){
		{
			put("AN","Andaman and Nicobar Islands");
			put("AP","Andhra Pradesh");
			put("TS","Telangana");
			put("AR","Arunachal Pradesh");
			put("AS","Assam");
			put("BH","Bihar");
			put("CH","Chandigarh");
			put("CT","Chattisgarh");
			put("DN","Dadra and Nagar Haveli");
			put("DD","Daman and Diu");
			put("DL","Delhi");
			put("GA","Goa");
			put("GJ","Gujarat");
			put("HR","Haryana");
			put("HP","Himachal Pradesh");
			put("JK","Jammu and Kashmir");
			put("JH","Jharkhand");
			put("KA","Karnataka");
			put("KL","Kerala");
			put("LD","Lakshadweep Islands");
			put("MP","Madhya Pradesh");
			put("MH","Maharashtra");
			put("MN","Manipur");
			put("ME","Meghalaya");
			put("MI","Mizoram");
			put("NL","Nagaland");
			put("OR","Odisha");
			put("PY","Pondicherry");
			put("PB","Punjab");
			put("RJ","Rajasthan");
			put("SK","Sikkim");
			put("TN","Tamil Nadu");
			put("TR","Tripura");
			put("UP","Uttar Pradesh");
			put("UT","Uttarakhand");
			put("WB","West Bengal");
			
		}
	};
	
	public final static List<String> listOfINDIAStatesCodes = new ArrayList<>(mapOfINDIAStates.keySet());
	public final static List<String> listOfINDIAStatesName = new ArrayList<>(mapOfINDIAStates.values());
}
