import java.util.*;
public class Testdriver {
    static double parttimetotal=0;
    static double totalsalary=0;
    static Employee employee[]=new Employee[9];
    /**main method which throwsCloneNotSupportedException
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String [] args)throws CloneNotSupportedException {
        employee[0]=new Staff("Allen","Paita","123","M",new GregorianCalendar(2018,2,23),50);
        employee[1]=new Staff("Zapata","Steven","456","F",new GregorianCalendar(2004, 7,12),35);
        employee[2]=new Staff("Rios","Enrique","789","M",new GregorianCalendar(2014, 6,2),40);
        employee[3]=new Faculty("Johnson","Anne", "243", "F", new GregorianCalendar(2018, 4, 27),Faculty.Level.FU,"Ph.D","Engineering",3);
        employee[4]=new Faculty("Bouris","Willian","791","F",new GregorianCalendar(2015, 3,14),Faculty.Level.AO,"Ph.D","English",1);
        employee[5]=new Faculty("Andrade","Christopher","623","F",new GregorianCalendar(1998, 5, 22),Faculty.Level.AS,"MS","PhysicalEducation",0);
        employee[6]=new Partime("Guzman","Augusto", "455", "F", new GregorianCalendar(1987, 8, 10),35,30);
        employee[7]=new Partime("Depirro","Martin", "678", "F", new GregorianCalendar(1997, 9, 15), 30,15);
        employee[8]=new Partime("Aldaco","Marque", "945", "M", new GregorianCalendar(2012, 11, 24), 20,35);
        System.out.println("Staff:");
        for(int i=0;i<3;i++) {
            System.out.println(employee[i].toString());
        }
        System.out.println("Faculty:");
        for(int i=3;i<6;i++) {
            System.out.println(employee[i].toString());
        }
        System.out.println("Part-Time:");
        for(int i=6;i<9;i++) {
            System.out.println(employee[i].toString());
        }
        parttimetotal=totalPartTimeSal();
        totalsalary=totalsal();
        System.out.println("---------------------------------------------------------");
        System.out.println(" The totalmonthly salary for all the Part-Time staff:$"+parttimetotal);
        System.out.println("---------------------------------------------------------");
        System.out.println(" The totalmonthly salary for all employees: $"+totalsalary);
        System.out.println("---------------------------------------------------------");
        System.out.println(" Sorting by IDnumber.... ");
        Arrays.sort(employee,new Comparer());
        int j=0;
        while(j<9) {
            Employee obj=(Employee)employee[j++];
            System.out.println(obj.toString());
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(" Sorting byLast Name.... ");
        Arrays.sort(employee);
        int i=0;
        while(i<9) {
            Employee obj=(Employee)employee[i++];
            System.out.println(obj.toString());
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(" f. Duplicate afaculty object using clone.");
        Faculty fac=new Faculty("Bouris","Willian","791","F",new GregorianCalendar(2015, 3,14),Faculty.Level.AO,"Ph.D","English",1);
        Faculty fac1=(Faculty)fac.clone();
        System.out.println(fac.toString()+"###Cloned Information### "+fac1.toString()+" VerifingDuplication... "+" ###Original Information### "+fac.toString()+"###Cloned Information###");
        fac1.setfn("Ashish");
        fac1.setln("Gare");
        fac1.sethireDate(new GregorianCalendar(1998,4,20));
        fac1.setID("420");
        fac1.setLevel(Faculty.Level.FU);
        System.out.println(fac1.toString());
    }
    /**It returns the total part time salary
     * @return total part time salary
     */
    public static double totalPartTimeSal() {
        for(int i=6;i<9;i++) {
            parttimetotal+=employee[i].monthlyEarnings();
        }
        return parttimetotal;
    }
    /**It returns total salary of the employees
     * @return total employees salary
     */
    public static double totalsal() {
        for(int i=0;i<9;i++) {
            totalsalary+=employee[i].monthlyEarnings();
        }
        return totalsalary;
    }
}