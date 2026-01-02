
interface A{
    void show(); 
}
class B implements A{
    public void show(){
        System.out.println("in B show"); 
    }
    
}

class Main {
    public static void main(String[] args) {
        A obj = new B(); 
        obj.show(); 
    }
}