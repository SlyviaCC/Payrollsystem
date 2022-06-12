import java.util.*;
import java.lang.*;

public class Faculty extends Employee implements Cloneable{
    Education en;
    /**Enum to initiate Level */
    public enum Level {
        AS,AO,FU
    }
    Level l;
    /**Constructor which initiates the values */
    public Faculty() {
        super();
        en=new Education();
        l=null;
    }

    @Override
    public double monthlyEarning() {
        return 0;
    }

    /** Overloaded constructor method
     * @param ln last name
     * @param fn first name
     * @param ID Employee ID
     * @param sex Sex
     * @param hireDate Hired Date
     * @param l level
     * @param Degree Degree
     * @param Major Major
     * @param Research Number of researches
     */
    public Faculty(String ln, String fn, String ID, String sex, GregorianCalendar hireDate,Level l,String Degree, String Major, int Research) {
        super(ln,fn,ID,sex,hireDate);
        this.l=l;
        en=new Education(Degree, Major,Research);
    }
    /** it returns the level details
     * @return level details
     */
    public String leveldetails() {
        switch(l) {
            case AS:
                return"Assistant professor";
            case AO:
                return"Associate professor";
            case FU:
                return"Professor";
            default:
                return "";

        }
    }
    /**it returns level
     * @param lvl level
     */
    public void setLevel(Level lvl) {
        l=lvl;
    }
    /**it returns monthly earnings */
    public double monthlyEarnings() {
        switch(l) {
            case AS:
                return FACULTY_MONTHLY_SALARY;
            case AO:
                return FACULTY_MONTHLY_SALARY*1.5;
            case FU:
                return FACULTY_MONTHLY_SALARY*2;
            default:
                return 0;
        }
    }
    /**it returns education of employee
     * @return education
     */
    public Education geted() {
        return en;
    }
    /**It replaces the Education
     * @param en Education
     */
    public void seted(Education en) {
        this.en=en;
    }
    /**it returns string of the different Faculty details*/
    public String toString() {
        return super.toString()+""+leveldetails()+" Monthly Salary: $"+monthlyEarnings();
    }
    /**it returns the clones object of faculty */
    public Object clone() throws CloneNotSupportedException{
        Faculty b=(Faculty)super.clone();
        en=(Education) en.clone();
        b.seted(en);
        return b;
    }
}

