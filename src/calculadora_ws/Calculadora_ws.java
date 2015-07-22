
package calculadora_ws;

import calculadora_ws.wsdlGenerate.*;
import java.io.StringReader;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import calculadora_ws.wsdlGenerate.Add;

public class Calculadora_ws {


    public static void main(String[] args) {
        Calculadora_ws ccws = new Calculadora_ws();
        int cws = ccws.add(500, 980);
        int cwm = ccws.multiply(50, 80);
        
        System.out.println(cws);
        System.out.println(cwm);
    }

    private int add(int a, int b) {
        calculadora_ws.wsdlGenerate.Calculator service = new calculadora_ws.wsdlGenerate.Calculator();
        calculadora_ws.wsdlGenerate.CalculatorSoap port = service.getCalculatorSoap();
        int resultado = port.add(a, b);
        return resultado;
    }
    
        private int multiply(int a, int b) {
        calculadora_ws.wsdlGenerate.Calculator service = new calculadora_ws.wsdlGenerate.Calculator();
        calculadora_ws.wsdlGenerate.CalculatorSoap port = service.getCalculatorSoap12();
        int resultado = port.multiply(a, b);
        return resultado;
    }


    
}
