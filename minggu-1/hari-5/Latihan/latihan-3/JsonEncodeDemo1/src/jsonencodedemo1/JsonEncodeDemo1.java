/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonencodedemo1;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.StringWriter;
/**
 *
 * @author HP
 */
public class JsonEncodeDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JSONObject obj= new JSONObject();
        
        obj.put("name","foo");
        obj.put("num", new Integer(100));
        obj.put("balance",new Double(1000.0));
        obj.put("is_vip", new Boolean(true));
        
        StringWriter out = new StringWriter();
        obj.writeJSONString(out);
        
        String jsonText=out.toString();
        System.out.println(jsonText);
        
    }
    
}
