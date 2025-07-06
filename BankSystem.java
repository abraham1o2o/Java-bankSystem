import java.util.Scanner;
public class BankSystem {
public static void main(String[]args) {
Scanner user = new Scanner (System.in);
banksys accounts = new banksys();
String[] Username = accounts.Username(); 
String[] Password = accounts.Password(); 
int userID = accounts.userName(user, Username);
accounts.password(user,userID,Password);
accounts.ActionChoice(userID);
int input = user.nextInt();
accounts.Execution(user, input, userID);
}
}
class banksys {
public int userName(Scanner user, String[] Username) {
    String input;
    while (true) {
    System.out.println("Enter Your Username");
    input = user.next();
    for (int i = 0; i < Username.length; i++) {
    if (input.equals(Username[i])) {
        return i;
    }
    }
    }
}

public void password(Scanner user, int userID, String[] Password) {
String input;
System.out.println("Hello Again ");
while (true) {
System.out.println("Please Enter Your Password");
input = user.next();
if (input.equals(Password[userID])) {
    System.out.println("Welcome back");
    break;
}
else {
    System.out.println("Wrong password try again");
}
}
}

public void Execution(Scanner user, int input, int userID) {
switch (input) {
    case 1:
    System.out.println("How Much Would You Like To Deposit Into Your Account");
     double input2 = user.nextDouble();
     balance[userID] += input2;
     System.out.println("Updated Balance is " +balance[userID]);
     break;
     case 2:
    System.out.println("How Much Would You Like To withdraw From Your Account");
     double input3 = user.nextDouble();
     balance[userID] -=input3;
     System.out.println("Updated Balance is " +balance[userID]);
     break;  
     case 3:
        System.out.println("Logging off....");
        break;
    default:
    break;

}
}

public void ActionChoice(int userID) {
System.out.println("________________________________");
System.out.println("Your Bank Account");
System.out.println("Balance = " +balance[userID]);
System.out.println("What would you like to Do Today");
System.out.println("1.Deposit");
System.out.println("2.withdraw");
System.out.println("3.Log out");
}

public String[] Username() {
String[] Username = {"romeo","james","ben"};
return Username;
}
public String[] Password() {
String[] Password = {"123","abc","1987"};
return Password;
}
private double[] balance = {10000, 2000, 18381};
}

