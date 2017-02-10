package seedu.addressbook.data.tag;

import java.util.ArrayList;
import java.util.HashMap;

import seedu.addressbook.data.person.Person;

public class Tagging {
	Person person;
	HashMap <Person, String> mapOfTags;
	static ArrayList <String> tagsDeleted;
	static ArrayList <String> tagsAdded;
	ArrayList<String> tagsToPerson;
	
	public Tagging(Person person, String tag, boolean value) {
		if(value == true) {
			tagsToPerson.add(tag);
			String stringToPrint = person.getName().toString() + "[" + tag + "]";
			tagsAdded.add(stringToPrint);
		}
		
		if(value == false) {
			tagsToPerson.remove(tag);
			String stringToPrint = person.getName().toString() + "[" + tag + "]";
			tagsDeleted.add(stringToPrint);
		}	
	}
	
	public String getAllTagsModified() {
		String stringOfTags = "";
		for(String ta: tagsAdded) {
			stringOfTags += "+" + ta + "/r/n";
		}
		for(String td: tagsDeleted) {
			stringOfTags += "-" + td + "/r/n";
 		}
		return stringOfTags;
	}
	
	
}
