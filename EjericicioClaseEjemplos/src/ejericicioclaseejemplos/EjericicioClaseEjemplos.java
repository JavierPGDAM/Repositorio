
package ejericicioclaseejemplos;


public class EjericicioClaseEjemplos {

 
    public static void main(String[] args) {
       int a=5;
       
        String ab=Integer.toBinaryString(a);
       
        System.out.println(ab);
        
        String bd="101011100";
        
        int d= Integer.parseInt(bd,2);
        System.out.println(d);
     
        
        String[] bin;
        bin=bd.split("");
        int[] w= new int[bin.length];
        int t;
        int total=0;
        for(t=0;t<bin.length;t++){
            w[t]=Integer.parseInt(bin[t]);
            total+=w[t] *(int) Math.pow(2,(w.length-1)-t);
        }
        
        System.out.println(total);
        
    }
        
        
    }
    

