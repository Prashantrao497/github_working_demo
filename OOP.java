public class OOP {
    public static void main(String[] args) {
        System.out.println("This is the Main class.");
        //Secondary sec =new Secondary();
       Secondary.printMessage();
    }
}

class Secondary {
    public static void printMessage() {
      
        System.out.println("This is the Secondary class.");
    }
}
