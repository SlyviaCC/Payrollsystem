import java.util.*;

public abstract class Employee implements EmployeeInfo,Comparable<Employee>{
    private String lastName;
    private String firstName;
    private String IDnum;
    private String sex;
    private GregorianCalendar hireDate;
    /**Constructor for Employee */
    public Employee(){
        lastName=" ";
        firstName=" ";
        IDnum=" ";
        sex=" ";
        hireDate=new GregorianCalendar(1957, 5, 25);
    }
    /**Constructor which assign the values in this classwith new values
     * @param ln last name which needs to be replacedwith
     * @param fn last name which needs to be replacedwith
     * @param ID new employee ID
     * @param sex new string sex which needs to be replacedwith the old String
     * @param hireDate hireDate which needs to be replacedwith
     */
    public Employee(String ln, String fn, String ID,String sex, GregorianCalendar hireDate) {
        lastName=ln;
        firstName=fn;
        IDnum=ID;
        this.sex=sex;
        this.hireDate=hireDate;
    }
    /**gets the last name
     * @return last name
     */
    public String getln() {
        return lastName;
    }
    /**gets first name
     * @return first name
     */
    public String getfn() {
        return firstName;
    }
    /**returns Employee ID
     * @return Employee ID
     */
    public String ID() {
        return IDnum;
    }
    /**returns sex
     * @return sex
     */
    public String sex() {
        return sex;
    }
    /**returns hire date
     * @return hire date
     */
    public Calendar gethireDate(){
        return hireDate;
    }
    /**sets Last name with a new value
     * @param ln Last name
     */
    public void setln(String ln) {
        lastName=ln;
    }
    /**sets first name with a new value
     * @param fn First name
     */
    public void setfn(String fn) {
        firstName=fn;
    }
    /**sets Id with a new value
     * @param ID Employee ID
     */
    public void setID(String ID) {
        IDnum=ID;
    }
    /** replaces sex with a new value
     * @param sex
     */
    public void setSex(String sex) {
        this.sex=sex;
    }
    /**replaces hire date with a new value
     * @param date new hire date
     */
    public void sethireDate(GregorianCalendar date){
        hireDate=date;
    }

    public abstract double monthlyEarning();

    /** it returns string of the different employeedetails */
    public String toString() {
        return " ID Employee number:"+IDnum +" Employee Name: "+firstName+" "+lastName+" Hire date:"+hireDate.get(Calendar.MONTH)+"/"+hireDate.get(Calendar.DAY_OF_MONTH)+"/"+hireDate.get(Calendar.YEAR);
    }
    /**Abstract method which calculates and returnsemployee monthly earnings
     * @return employee monthly earning
     */
    public abstract double monthlyEarnings();
    /**method used to compare two objects by lastname*/
    public int compareTo(Employee obj) {
        if(lastName.compareTo(obj.lastName)==0)
            return 0;
        else if(lastName.compareTo(obj.lastName)>0) {
            return -1;
        }
       else {
            return 1;
        }
    }
}

