package il.ac.huji.westudy;

import java.util.List;

/**
 * Created by Carmel_2 on 30/04/2015.
 */
public class User {
    private String name;
    private String mail;
    private String password;
    private List<Course> myCourse;
    private List<Group> myGroup;

    /**
     * constructor
     * @param mail
     * @param password
     */
    public User(String name, String mail, String password){
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail){
        this.mail = mail;
    }

    /**
     *
     * @return
     */
    public String getMail(){
        return mail;
    }

    /**
     *
     * @return
     */
    public String getPassword(){
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     *
     * @param group
     */
    public void addGroup(Group group){
        this.myGroup.add(group);
    }

    /**
     *
     * @param group
     */
    public void removeGroup(Group group){
        this.myGroup.remove(group);
    }

    /**
     *
     * @param course
     */
    public void addCourse(Course course){
        this.myCourse.add(course);
    }

    /**
     *
     * @param course
     */
    public void removeCourse(Course course){
        this.myGroup.remove(course);
    }

}
