import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author James Fu
 * @version 8/29/18
 */

public class JamesFu extends Student implements SpecialInterestOrHobby
{
    private String apMeme, jacobVoice;

    // can be initialized by default as this number will likely not change, if need be change, setter methods can be used
    private int numSiblings, numSisters, numBrothers;
    
    /*
     * Constructor for the JamesFu class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public JamesFu(String f, String l, int r, int s) {
        firstName = f;
        lastName = l;
        myRow = r;
        mySeat = s;
        imgFile = f.toLowerCase() + l.toLowerCase() + ".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile = f.toLowerCase() + l.toLowerCase() + ".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        apMeme = "apmeme.jpg";
        jacobVoice = "sweatshirt.wav";
        setImage(imgFile);
        setNumSiblings(1);
        setNumSisters(1);
        setNumBrothers(0);
    }
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public JamesFu() {
        firstName = "James";
        lastName = "Fu";
        myRow = 1;
        mySeat = 2;
        imgFile = firstName.toLowerCase() + lastName.toLowerCase() + ".jpg";
        soundFile = firstName.toLowerCase() + lastName.toLowerCase() + ".wav";
        apMeme = "apmeme.jpg";
        jacobVoice = "sweatshirt.wav";
        setImage(imgFile);
        setNumSiblings(1);
        setNumSisters(1);
        setNumBrothers(0);
    }
    
     /**
     * Act - do whatever the JamesFu actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            
            myHobby("I like Jacob Sartorius and his music");
            System.out.println("I have " + numSiblings " siblings," numSisters " sister"  , 
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            Greenfoot.delay(100);
            jacobSing();  // Special method to. Please write one of your own. You can use this, but please modify it and be creative.
          
        }
    } 
    
    
    /**
     * Prints the first and last name to the console
     */
    
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    /**
     * Additional setter and getter methods
     */

    public int getNumSiblings() {
        return numSiblings;
    }
    
    public void setNumSiblings(int s) {
        numSiblings = s;
    }
    
    public int getNumSisters() {
        return numSisters;
    }
    
    public void setNumSisters(int s) {
        numSisters = s;
    }
    
    public int getNumBrothers() {
        return numBrothers;
    }
    
    public void setNumBrothers(int b) {
        numBrothers = b;
    }
    
    public void jacobSing(){
        setImage(apMeme);
        Greenfoot.playSound(jacobVoice);
        Greenfoot.delay(1300);
        setImage(imgFile);
        sitDown();
    }
    
    public void myHobby(String s) {
         System.out.println(s);
    }
    
}