import java.util.ArrayList;

public class BisKota {
    public static void main(String [] args){
        ArrayList <int[]> StopGo = new ArrayList<int[]>();
        StopGo.add(0,new int[] {10,0});//10 orang menaiki bis, 0 orang turun bis
        StopGo.add(1,new int[] {3,5});//3 orang menaiki bis, 5 orang turun bis
        StopGo.add(2,new int[] {2,5});//2 orang menaiki bis, 5 orang turun bis
        System.out.println(GetPassenger(StopGo));
    }
    public static int GetPassenger(ArrayList <int[]> BisKota) {
        //Your Code Here
        return BisKota.get(0)[0] - BisKota.get(0)[1] + BisKota.get(1)[0] - BisKota.get(1)[1] + BisKota.get(2)[0] - BisKota.get(2)[1];
    }
}
