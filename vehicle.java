public class vehicle {//1)This is the vehicle class 
    private String brand;//2)The private variables
    private String color;//2)The private variables
    vehicle(String b,String c){//3)This is the public class constructor 
        brand=b;
        color=c;
    }
    void start(){
        System.out.println("Vehicle Brand Name :"+brand);
        System.out.println("Vehicle color Name : "+color);
        System.out.println("The Car is starting !");
    }
}
