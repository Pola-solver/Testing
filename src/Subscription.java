import java.sql.SQLOutput;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.SplittableRandom;

public class Subscription {
    private String UserId;
    private String planPrice;
    private String Plan;
    private LocalDate startDate;
    private long DaysBetween;

    public Subscription(String UserId  , String planPrice , String plan ,LocalDate startDate ){
        this.UserId=UserId;
        this.planPrice=planPrice;
        this.Plan=plan;
        this.startDate=startDate;
    }

    public  Subscription( String userId , String planPrice , String plan){
        this.Plan=plan;
        this.planPrice=planPrice;
        this.startDate=LocalDate.now();

    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }

    public void setPlan(String plan) {
        Plan = plan;
    }


    public void setDaysLeft(long DaysBetween) {
        this.DaysBetween = DaysBetween;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getUserId() {
        return UserId;
    }

    public String getPlanPrice() {
        return planPrice;
    }

    public String getPlan() {
        return Plan;
    }


    public long getDaysLeft() {
        return DaysBetween;
    }

    //calculating days left !!
    public void DaysLeft (){
        // LocalDate generatedDate = LocalDate.of(2024, 12, 1); // Example: Nov 15, 2023
        LocalDate tdy = LocalDate.now();
        DaysBetween=ChronoUnit.DAYS.between(startDate, tdy);
    }
// waiting for gui to link subscription and admin.. no 5 and 6 in functionalities
}
