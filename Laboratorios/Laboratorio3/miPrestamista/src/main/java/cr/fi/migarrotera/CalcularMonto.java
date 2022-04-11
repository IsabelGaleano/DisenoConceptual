package cr.fi.migarrotera;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class CalcularMonto implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String monto = (String) delegateExecution.getVariable("montoPrestamo");
        String ingresos =  (String) delegateExecution.getVariable("ingresos");
        int montoCalculado = Integer.parseInt(ingresos) * Integer.parseInt(monto);
        delegateExecution.setVariable("montoCalculado", montoCalculado);
        System.out.println("Monto: " + monto);
    }
}
