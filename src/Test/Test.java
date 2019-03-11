package Test;

public class Test{
    public static Test aTest = null;    
    public Test(){
        System.out.println(aTest);
        aTest = this;
    }
    
    public static Test getInstance() {
        if(aTest == null) {
            new Test();
        }
        return aTest;
    }
    
    public static void main(String []args) {
        
        
        
        System.out.println(getInstance().toString());
        System.out.println(getInstance());
//        Test aTest = new Test();
//        System.out.println(aTest.toString());
//        System.out.println(new Test().toString());
    }
}
