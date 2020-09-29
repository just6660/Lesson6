
package employee;

public class Employee {
    private String name; 
    private int type; //1 or 2
    private double rate;
    private double hours;
    
    public Employee(){
        name = "";
        type = 0;
        rate = 0;
        hours = 0;
    }
    
    public boolean setName(String nm){
        boolean blank = (nm.equals(""));
        if(blank){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean setType(int t){
        boolean oneortwo = (t==1 || t==2);
        if(oneortwo){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean setRate(double rt){
        boolean rateok = (t==1 || t==2);
        if(rateok){
            return true;
        }
        else
            return false;
    }
    
    public boolean setHours(int hrs){
        boolean hoursok = hrs >=1 && hrs<=60);
        
    }
    
    public String getName(){
        return name;
    }
    public double getPay(){
        double pay;
        boolean noovertime = hours <=40 || type ==2;
        if(noovertime)
            pay = rate*hours;
    }
    
}
