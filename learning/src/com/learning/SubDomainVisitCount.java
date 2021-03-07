package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisitCount {
	 public List<String> subdomainVisits(String[] cpdomains) {
	 
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < cpdomains.length; i++) {
				System.out.print(cpdomains[i]);
				String[] input = cpdomains[i].split(" ");
				System.out.println("\n");
				int count = 0;
				String[] domainName = null;

				count = Integer.parseInt(input[0].toString());

				domainName = input[1].toString().split("[.]", 0);
				String myString = "";
				boolean firstTime = true;
				for (int j = (domainName.length) - 1; j >= 0; j--) {
					if (firstTime) {
						myString = domainName[j] + myString;
						firstTime = false;
					} else {
						myString = domainName[j] + "." + myString;
					}
					if (map.containsKey(myString)) {
						int temp = map.get(myString);
						map.put(myString, temp + count);
					} else {
						map.put(myString, count);
					}

				}

			}
			
			List<String> answer = new ArrayList<String>();
			for(Map.Entry<String, Integer> he : map.entrySet()) {
				String temp = he.getValue().toString() + " " +he.getKey();
				answer.add(temp);
			}
			return answer;
	 }

	public static void main(String[] args) {
		SubDomainVisitCount sv = new SubDomainVisitCount();
		String[] cpdomains = new String[] { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		List <String> domainVisits = sv.subdomainVisits(cpdomains);
		for(String domain : domainVisits) {
			System.out.println(domain);
		}
	}

}
