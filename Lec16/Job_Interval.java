package Lec16;
import java.util.Arrays;
public class Job_Interval {
    public static void main(String[] args) {
        int Start[]={10,25,12,40};
        int end[]={26,32,22,50};
        Job(Start,end);
    }
    public static void Job(int Start[],int end[]){
        int n=Start.length;
        Interval interval[]=new Interval[n];
        for(int i=0;i<n;i++){
            interval[i]=new Interval(Start[i],end[i]);
        }
        Arrays.sort(interval,(a,b)->{
          return Integer.compare(a.end,b.end);
        });
        int count=1;
        int Previous=interval[0].end;
        for(int i=1;i<n;i++){
            if(interval[i].Start>Previous){
                count++;
                Previous=interval[i].end;
            }
        }
        System.out.println(count);
    }
    static class Interval{
        int Start;
        int end;
        Interval(int Start,int end){
            this.Start=Start;
            this.end=end;
        }
    }
}
