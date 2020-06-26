package com.akshay.java8task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Palindrome{
	static boolean isStringValid(String s)
	{
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
		
	};
}
public class ListPalindrome {

	public static List<String> listPalindromeStrings(List<String> input){
		Predicate<String> check=Palindrome::isStringValid;
		List<String> ans=new ArrayList<>();
		input.stream().forEach(x->{
			if(check.test(x)) {
				ans.add(x);
			}
		});
		return ans;
	}
	
}
