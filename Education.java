public class Education implements Cloneable{
    private String Degree;
    private String Major;
    private int Research;
    //**Constructor education which initiates the values*/
    public Education() {
        Degree="";
        Major="";
        Research=0;
    }
    /** Overloaded constructor method
     * @param Degree
     * @param Major
     * @param Research
     */
    public Education(String Degree, String Major, int Research) {
        this.Degree=Degree;
        this.Major=Major;
        this.Research=Research;
    }
    /**it returns degree
     * @return degree
     */
    public String getDegree() {
        return Degree;
    }
    /** it returns major
     * @return major
     */
    public String getMajor() {
        return Major;
    }
    /**it returns the number of researches
     * @return research
     */
    public int getResearch() {
        return Research;
    }
    /**replaces the degree with a new value
     * @param Degree
     */
    public void setDegree(String Degree) {
        this.Degree=Degree;
    }
    /**replaces the major with a new value
     * @param Major
     */
    public void setMajor(String Major) {
        this.Major=Major;
    }
    /**replaces the number of researches with a newvalue
     * @param Research
     */
    public void setResearch(int Research) {
        this.Research=Research;
    }
    /**it returns the clones object of faculty */
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

