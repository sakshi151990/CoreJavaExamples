package cololectionexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ssnnumbervalidator {

	public static void main(String[] args) {
		
		String ssn="123-85-346";
		String email="tomjerry@tom.com";
		
		Pattern regex=Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
		Pattern emailregex=Pattern.compile("(\\w+.^[$#&*]+)+@{1}(\\w+.)+");
		Matcher m=regex.matcher(ssn);
		Matcher m2=emailregex.matcher(email);
		System.out.println(m2.matches());
	}
}
