package OOP;

public class Test {

    public static void main(String[] args){
        A[] a= new A[10];
        System.out.println(a);
         a[0] = new A();
        a[0].num = 1;
        System.out.println(a[0]);
       // a[0] = ;

      //  a[0] = new A(3);
       // a[1].num =2;
      //  for(int i = 2; i < 10; i++){
      //      a[i].num = a[i-1].num * a[i-2].num;
      //  }
      //  System.out.print(a[9].num);
    }

}
class A{
    public int num;

}
