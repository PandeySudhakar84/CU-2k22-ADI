package Lec2;
public class Time_And_Space_Complexity {
   public static void main(String[] args) {
//        long start=System.currentTimeMillis();
//        for(int i=1;i<=1000000;i++){
//
//        }
//        long end=System.currentTimeMillis();
//        System.out.println(end-start);


       int n=10000;
       for(int i=1;i<=n;i++){
           System.out.println("hello");
       }

       for(int i=n;i>=0;i--){
           System.out.println("hii");
       }

       for(int i=1;i<=n;i=i*2){
           System.out.println("hii");
       }
       int i = 0;
       while (i < n) {
           System.out.println("Hey");
           // O(N)
           i++;
       }

       while (i <= n) {
           System.out.println("Hey");
           i *= 2;
           // O(Log N) base 2;
       }

       while (n > 0) {
           System.out.println("Hey");
           n /= 2;
           // O(Log N) base 2;
       }

       while (i <= n) {
           System.out.println("Hey");
           // O(N)
           i += 2;
           i += 3;
       }
       while (i <= n) {
           System.out.println("Hey");
           // O(Log N) base 6;
           i *= 2;
           i *= 3;
       }
       while (n > 0) {
           System.out.println("Hey");
           // O(Log N) base 6;
           n /= 2;
           n /= 3;
       }
       int k = 3;
       while (i <= n) {
           System.out.println("Hey");
           // O(N/k)
           i += k;
       }
       while (i <= n) {
           System.out.println("Hey");
           // O(Log N) base k;
           i *= k;
       }

       for (i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
               // O(N^2)
               System.out.println("hey");
           }
       }

       for (i = 1; i * i <= n; i++) {
           System.out.println("hey");
           // O(Sqrt(N))
       }

       for(i=n;i>=1;i=i/2){
           System.out.println("hii");
       }

       for(i=1;i<=n;){
           System.out.println("hii");
           i=i+2;
           i=i+3;
       }
       for(i=1;i<=n;){
           System.out.println("hii");
           i=i*2;
           i=i+3;

       }
       k=100000000;
       for(i=1;i<=n;){
           System.out.println("hello");
           i=i+k;
           // O(N/K)
       }
       for(i=1;i*i<=n;i++){
           System.out.println("hello");
       }

       for(i=1;i<=n;i=i*k){
           System.out.println("hello");
       }

       for(i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               System.out.println("hiii");
           }
       }
       for(i=1;i<=n;i++) {
           for (int j = i; j <= n; j++) {
               System.out.println("hiii");
           }
       }
       for(i=n/2;i<=n;i++){
           for(int j=1;j<=n/2;j++){
               for(k=1;k<=n;k=k*2){

               }
           }
       }
       for(i=1;i<=n;i++){
           for(int j=1;j<i*i;j++){
               for(int k1=1;k1<n/2;k1++){

               }
           }
       }

    }
}
