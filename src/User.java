
import java.time.LocalDate;
import java.time.Period;

public class User extends Person {
    private static int ID = 11;
    private String UserName;
    private String UserId;
    Account account;
    Subscription subscription;
    //UserWatchRecord

    public User(String username, String password, String userId, String firstName, String lastName, String gender,LocalDate subscriptionStartDate , String plan , String planPrice , String Email) {
        super(firstName, lastName, gender);
        this.UserName = username;
        this.UserId = userId;
        subscription = new Subscription(userId , planPrice , plan , subscriptionStartDate);
        account = new Account(Email , password);
    }

    String IDtoString()
    {
        String ans = "";
        int k = ID;
        do
        {
            int push = k%10;
            ans+=k+'0';
            k/=10;
        }
        while(k != 0);
        return ans;
    }

    public User(String userName , String password , String firstName , String lastName , String gender  ,  String plan , String planprice , String Email)
    {
        super(firstName , lastName , gender);
        this.UserId = IDtoString();
        ID++;
        this.UserName=userName;
        account=new Account(Email , password);
        subscription=new Subscription(this.UserId ,planprice , plan);
    }

    public void setUserId(String userId) {
        this.UserId = userId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }
    public int CalculateAge (LocalDate dateOfBirth){
        LocalDate CurrentDate=LocalDate.now();
        Period age=Period.between(dateOfBirth,CurrentDate);
        return age.getYears();
    }
}