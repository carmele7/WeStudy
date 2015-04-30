package il.ac.huji.westudy;

/**
 * Created by Carmel_2 on 30/04/2015.
 */
public class Course {
    private int number;
    private String name;

    /**
     * constructor
     * @param number
     * @param name
     */
    public Course(int number , String name){
        this.name = name;
        this.number = number;
    }

    /**
     *
     * @return number
     */
    public int getNumber(){
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     *
     * @return
     */
    public String getName(){
        return this.name;
    }

}
