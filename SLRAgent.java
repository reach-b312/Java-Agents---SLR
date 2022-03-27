//Autor: Ricardo Avalos
package SLR;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import javax.swing.JOptionPane;

public class SLRAgent extends Agent {
  @Override
  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");
    addBehaviour(new SLRBehaviour());
  } 

  private class SLRBehaviour extends Behaviour {
    int cont=0;
    @Override
    public void action() {
        //double x = Double.parseDouble(JOptionPane.showInputDialog("Valor de x: "));
        System.out.println("Agent's action method is executed");
        DataSet ds = new DataSet();
        HelperArithmetic ha = new HelperArithmetic(ds);
        SimpleLinearRegression slr = new SimpleLinearRegression(ha);
        //slr.regress(ds.getData, ha);
        System.out.printf("y = %.4f + %.4f x",slr.getBeta0(),slr.getBeta1());
        cont+=1;
    } 
    @Override
    public boolean done() {
      if (cont == 1)
        return true;
      else
	return false;
    }
   @Override
    public int onEnd() {
      myAgent.doDelete();
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}