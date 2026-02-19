class EmailAcc {

    private final String username;      // immutable
    private String password;
    private String recoveryEmail;
    private int storageQuota;
    private int emailsSent;             // number of emails sent
    private static int num = 0;         // total accounts

    // Constructor
    public EmailAcc(String username, String password, String recoveryEmail, int storageQuota) {
        this.username = username;
        this.password = password;
        this.recoveryEmail = recoveryEmail;
        this.storageQuota = storageQuota;
        this.emailsSent = 0;   // initially 0
        num++;                 // increase account count
    }

    // Change password (with simple validation)
    public void setPassword(String password) {
        if(password.length() >= 4) {
            this.password = password;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Password must be at least 4 characters");
        }
    }

    // Update recovery email
    public void setRecoveryEmail(String recoveryEmail) {
        this.recoveryEmail = recoveryEmail;
    }

    // Send email (increase count)
    public void sendEmail() {
        emailsSent++;
    }

    // Check remaining storage (simple logic)
    public int checkRemainingStorage() {
        return storageQuota - emailsSent;
    }

    // Static method to show total accounts
    public static void showTotalAccounts() {
        System.out.println("Total Accounts: " + num);
    }

    // Display info (excluding password)
    public void display() {
        System.out.println("\nUsername: " + username +
                "\nRecovery Email: " + recoveryEmail +
                "\nStorage: " + storageQuota +
                "\nEmails Sent: " + emailsSent);
    }
}


public class EmailAccount {
    public static void main(String[] args) {

        EmailAcc e1 = new EmailAcc("Asad", "abcd", "asad@gmail.com", 450);
        EmailAcc e2 = new EmailAcc("Ali", "1234", "ali@gmail.com", 500);

        e1.sendEmail();
        e1.sendEmail();

        e1.setPassword("newpass");
        e1.display();

        EmailAcc.showTotalAccounts();
    }
}
