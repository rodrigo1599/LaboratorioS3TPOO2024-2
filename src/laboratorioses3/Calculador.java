/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioses3;

/**
 *
 * @author rodrigo
 */
public class Calculador {
    private double n1;
    private double n2;
   

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double resultado(int i)
    {
        double r;
        switch(i)
        {
            case 0:
                r=(n1+n2);
                        break;
                        
            case 1:
                r=(n1-n2);
                        break;
            case 2:
                r=(n1*n2);
                        break;
            default:if(n1==0)
            {return 0;
                
            }
            else{
                r=(n1/n2);
            }
        }
        return r;
    }
}
    
        
        
        
    
    
    

