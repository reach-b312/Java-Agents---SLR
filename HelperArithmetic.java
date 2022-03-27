package SLR;

/**
 *
 * @author Ricardo
 */
class HelperArithmetic {
//Atributos
double sumX,sumY,sumXY,sumXpow2;
double mediaDeY,mediaDeX;
int n;
//Constructor
HelperArithmetic(DataSet ds){
n = ds.getAdvertising().length;
sumX = calcularSumatoria(ds.getAdvertising());
sumY = calcularSumatoria(ds.getSales());
sumXY = calcularSumatoriaXY(ds.getSales(),ds.getAdvertising());
sumXpow2 = calcularSumatoriaCuadrada(ds.getAdvertising());
mediaDeY = sumY/ds.getSales().length;
mediaDeX = sumX/ds.getAdvertising().length;
}
//Calculos comunes
private double calcularSumatoria(double [] columna){
double resultado = 0;
for(double campo : columna){
resultado+=campo;
}
return resultado;
}
private double calcularSumatoriaXY(double [] columna1, double [] columna2){
double resultado=0;
for(int i=0;i<columna1.length;i++){
resultado+=columna1[i]*columna2[i];
}
return resultado;
}
private double calcularSumatoriaCuadrada(double [] columna){
double resultado = 0;
for(double campo : columna){
resultado+=campo*campo;
}
return resultado;
}

//Getters & setters
public double getSumX(){return sumX;}
public double getSumY(){return sumY;}
public double getSumXY(){return sumXY;}
public double getSumXpow2(){return sumXpow2;}
public double getMediaDeY(){return mediaDeY;}
public double getMediaDeX(){return mediaDeX;}
int getLength(){return n;}
}
