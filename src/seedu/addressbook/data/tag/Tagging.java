package seedu.addressbook.data.tag;

import java.util.ArrayList;
import java.util.HashMap;

import seedu.addressbook.data.person.Person;

public class Tagging {
	Person person;
	HashMap <Person, ArrayList<String>> mapOfTags;
	static ArrayList <String> tagsDeleted;
	static ArrayList <String> tagsAdded;
	ArrayList<String> tagsToPerson;
	
	
	public Tagging(Person person) {
		tagsToPerson = new ArrayList<String>();
		mapOfTags.put(person, tagsToPerson);
	}
	
	/**
	 * Modifies a tag i.e. add or delete a tag
	 * @param person
	 * @param tag
	 * @param value
	 */
	public void modifyTagging(Person person, String tag, boolean value) {
		ArrayList<String> tagsArrayList = mapOfTags.get(person);
		//add a tag to the person
		if(value == true) {   
			tagsArrayList.add(tag);
			String stringToPrint = person.getName().toString() + "[" + tag + "]";
			tagsAdded.add(stringToPrint);
		}
		
		//delete a tag from the person
		if(value == false) {
			tagsArrayList.remove(tag);
			String stringToPrint = person.getName().toString() + "[" + tag + "]";
			tagsDeleted.add(stringToPrint);
		}	
	}
	
	/**
	 * Returns a string of all the tags added and deleted 
	 * @return String
	 */
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
