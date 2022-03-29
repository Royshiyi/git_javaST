package TypeConversion;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
public class TypeConversion {
    public static void main(String[] args) {
        String st = "20";
        byte bt = Byte.parseByte(st);
        short sh = Short.parseShort(st);
        int in = Integer.parseInt(st);
        System.out.println("bt = " + bt + ";sh = " + sh + ";in = " + in);

        System.out.println("------------------------------------------");
        String st2 = "99.99";
        float fl = Float.parseFloat(st2);
        double dou = Double.parseDouble(st2);
        System.out.println("fl = "+ fl + ";dou = " + dou);
    }
}
