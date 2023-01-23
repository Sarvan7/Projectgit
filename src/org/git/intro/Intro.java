package org.git.intro;


		public class Intro {
			
			public static void main(String[] args) {
				
				String s = "madam";
				String rev = "";
				
				for (int i = s.length()-1;i>=0; i--) {
<<<<<<< HEAD
					char chs = s.charAt(i);
					rev = rev + chs;
=======
					char ch = s.charAt(i);
					rev = rev + ch;
>>>>>>> 5495b527119352719bd523d577c24a094e8ce0b5
					
				
			}
				
				if (rev.equals(s)) {
					System.out.println("Palindrome");
					
				} else {
					System.out.println("Nor a palindrome");
				}}}

				
				
				

				
					
				

		
