/*
 

This program showcases a clean design with :
  abstraction, 
  polymorphism,
  flexibility,  
  easy to extend or modify in future ( DYNAMIC DESIGN )

For future requirements. It provides a strong foundation for implementing notification systems in real-world applications.


 */



import  java.util.Scanner;

abstract class  MessageSend{


   protected abstract void sendNow();
}


class GeneralMsg extends MessageSend{

    private String message;

    GeneralMsg(String message){
        this.message=message;
    }

    protected void sendNow(){

            System.out.println(message+"(GeneralSms)....");

        }


}



class MailSender extends MessageSend{

    private String message;

    MailSender(String message){
        this.message=message;
    }

    protected void sendNow(){

        System.out.println(message+"(MailSenderSms)....");

    }


}



class Employee{

    private String name;
    private String Empid;


    void Setprovider(String name,String Empid){

        this.name  =  name  ;
        this.Empid  =  Empid  ;
        

    }

    void result( MessageSend  msgService){


        msgService.sendNow();
        System.out.println(name+" "+Empid);


    }

}

public class Notification{


    public static void main(String args[]){



     // Writing custom message   
     System.out.println("ENTER MESSAGE TO SEND:> ");   
     Scanner scan = new Scanner(System.in);
     String message = scan.nextLine();

    // TYPES OF MESSAGES :

    GeneralMsg normalmsg = new GeneralMsg(message);
    MailSender Mailmsg = new  MailSender(message);

    
    // DYNAMIC BINDING USING METHOD OVERRIDING 



    System.out.println("Choose message type: 1 for General, 2 for Mail");
    int choice = scan.nextInt();
    scan.close();

    MessageSend msg;

    if (choice == 1) {
        msg = new GeneralMsg(message);
    } 
    
    else {
        msg = new MailSender(message);
    }

    

    // create employee object 

    Employee emp = new Employee();
    
    emp.Setprovider("Ankush verma","34993-xcv-oteo-192891");
    emp.result(msg);


        



    }
}