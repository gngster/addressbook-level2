package seedu.addressbook.data.tag;

import java.util.ArrayList;
import java.util.HashMap;

import seedu.addressbook.data.person.UniquePersonList;

public class Tagging {
	UniquePersonList persons;
	HashMap <UniquePersonList, String> mapOfTags;
	static ArrayList <String> tagsDeleted;
	static ArrayList <String> tagsAdded;
	ArrayList<String> tagsToPerson;
	
	public Tagging(UniquePersonList person, String tag, boolean value) {
		if(value == true) {
			tagsToPerson.add(tag);	
		}
		if(value == false) {
			tagsToPerson.remove(tag);
		}	
	}
	
}
