package il.ac.huji.westudy;

import java.util.Date;
import java.util.List;

/**
 * Created by Carmel_2 on 30/04/2015.
 */
public class Group {
    private Date date;
    private User groupHad;
    private List<User>  participant;
    private int maxPart;
    private Course course;
    private String place;
    private String name;

    /**
     *
     * @param date
     * @param place
     * @param had
     * @param maxPart
     * @param course
     */
    public Group(Date date,String place, User had, int maxPart, Course course, String name){
        this.course = course;
        this.date = date;
        this.groupHad = had;
        this.maxPart = maxPart;
        this.place = place;
        this.name = name;
        // Jonny is king!
    }

    /**
     * constructor with participant
     * @param date
     * @param place
     * @param had
     * @param MaxPart
     * @param course
     * @param participant
     */
    public Group(Date date,String place, User had, int MaxPart, Course course,
                 List<User> participant, String name){
        this.course = course;
        this.date = date;
        this.groupHad = had;
        this.maxPart = MaxPart;
        this.place = place;
        this.participant = participant;
        this.name = name;
    }

    /**
     *
     * @return Date - the group date
     */
    public Date getDate(){
        return date;
    }
    /**
     * set the date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     *
     * @return User - the had of the course
     */
    public User getHad(){
        return groupHad;
    }

    /**
     *
     * @param had
     */
    public void setHad(User had){
        this.groupHad = had;
    }

    /**
     *
     * @param part
     */
    public void addPart(User part){
        participant.add(part);
    }

    /**
     *
     * @param part
     */
    public void deletePart(User part){
        boolean removed = participant.remove(part);
    }

    /**
     *
     * @param max participant
     */
    public void setMaxPart(int max){
        this.maxPart = max;
    }

    /**
     *
     * @return int - the max participant
     */
    public int getMaxPart(){
        return maxPart;
    }

    /**
     *
     * @return string place
     */
    public String getPlace(){
        return place;
    }

    /**
     *
     * @param place
     */
    public void setPlace(String place){
        this.place = place;
    }

    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @return String - the group name
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the group study course
     */
    public Course getCourse(){
        return this.course;
    }

    /**
     *
     * @param course
     */
    public void setCourse(Course course){
        this.course = course;
    }






}
