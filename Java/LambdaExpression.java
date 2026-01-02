interface A {
    int add( int a , int b ); 
}

class Main {
    public static void main(String[] args) {
        A obj = ( int a , int b) -> a+b;

        System.out.println(obj.add(23,23)); 
        
    }
}
