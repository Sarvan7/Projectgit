package org.git.intro;


		public class Intro {
			
			public static void main(String[] args) {
				
				String s = "madam";
				String rev = "";
				
				for (int i = s.length()-1;i>=0; i--) {
					char chs = s.charAt(i);
					rev = rev + chs;
					
				
			}
				
				if (rev.equals(s)) {
					System.out.println("Palindrome");
					
				} else {
					System.out.println("Nor a palindrome");
				}}}

				
				
				

				
					
				

		
