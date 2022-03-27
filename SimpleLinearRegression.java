package SLR;

class SimpleLinearRegression {
    double beta1,beta0,Ds;
    SimpleLinearRegression(HelperArithmetic consultar){
        calcularDeterminanteDelSistema(consultar);
        calcularBeta1(consultar);
        calcularBeta0(consultar);
    }
    //Determinante del sistema
    private void calcularDeterminanteDelSistema(HelperArithmetic a){
        this.Ds = (a.getLength()*a.getSumXpow2()) - a.getSumX()*a.getSumX(); 
    }
    private void calcularBeta1(HelperArithmetic a){
        //Determinante 1
        double D1 = (a.getLength()*a.getSumXY()) - a.getSumX()*a.getSumY(); 
        this.beta1 = D1/Ds;
    }
    private void calcularBeta0(HelperArithmetic a){
        this.beta0 = a.getMediaDeY() - beta1*a.getMediaDeX();
    }
//Getters & setters
public double getBeta1(){return beta1;}
public double getBeta0(){return beta0;}
}


