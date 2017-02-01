package seedu.addressbook.ui;


import static seedu.addressbook.common.Messages.*;

public class Formatter {
	
	/** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";
    
    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

	
	 /** returns message(s) to the user */
    public String showToUser(String ...message) {
    	String display = "";
        for (String m : message) {
            display += LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX);
            display += "\r\n";
        }
        return display;
    }
    
    public String showGoodbyeMessage(){
    	return showToUser(MESSAGE_GOODBYE, DIVIDER, DIVIDER);
    }
    
    public String showWelcomeMessage(String version, String storageFileInfo) { 	
    	return showToUser (DIVIDER,
                DIVIDER,
                MESSAGE_WELCOME,
                version,
                MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
                storageFileInfo,
                DIVIDER);
    }
    
    public String showInitFailedMessage() {
    	return showToUser(MESSAGE_INIT_FAILED, DIVIDER, DIVIDER);
    } 
    
    public String showUserCommand(String fullInputLine) {
    	return showToUser("[Command entered:" + fullInputLine + "]");
    }

	public String showResultToUser(String feedbackToUser) {	
		return showToUser(feedbackToUser, DIVIDER);
	}
   

}
