package ch6demo4a_company_starter;

public class Main
{
    public static void main(String[] args)
    {
        GoogleEmployee joe = new GoogleEmployee("Joe"); // Joe is an employee of Google        
        GoogleEmployee jane = new GoogleEmployee("Jane"); // Jane is an employee of Google
        MicrosoftEmployee jesse = new MicrosoftEmployee("Jesse");
        MicrosoftEmployee joy = new MicrosoftEmployee("Joy");
        AdobeEmployee bill = new AdobeEmployee("Bill");
        AdobeEmployee brianna = new AdobeEmployee("Bill");

        Company<GoogleEmployee> google = new Company<>("Google");
        google.addEmployee(joe);
        google.addEmployee(jane);
//        google.addEmployee(jesse);
//        google.addEmployee(joy);
//        google.addEmployee(bill);
        System.out.println("Google employee list:");
        System.out.println(google);

        Company<AdobeEmployee> adobe = new Company("Adobe");
//        adobe.addEmployee(jane); //jane is an object of Google not Adobe but still you can pass joe in addEmployee().
//        adobe.addEmployee(jesse);
//        adobe.addEmployee(joy);
        adobe.addEmployee(bill);
        adobe.addEmployee(brianna);
        System.out.println("Adobe employee list:");
        System.out.println(adobe);
    }
}



