public class HelloWorld {
    public static void main(String[] args) {
        int n = args.length;

        System.out.println("共有"+n+"para");
        if(n>0){
 for(int i=0;i<n;i++){
System.out.println(args[i]);
}
        }
    }
}