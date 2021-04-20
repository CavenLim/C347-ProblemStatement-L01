package sg.edu.rp.c346.id19020620.problemstatement;

public class Holiday {


    private String holidayName;
    private String holidayImage;
    private String holidayDate;
    public Holiday( String holidayName, String holidayImage,String holidayDate) {
        this.holidayName = holidayName;
        this.holidayImage=holidayImage;
        this.holidayDate=holidayDate;
    }

    public String getHolidayName() {
        return holidayName;
    }
    public String getIsImage(){
        return holidayImage;
    }
    public String getHolidayDate(){
        return holidayDate;
    }
}
