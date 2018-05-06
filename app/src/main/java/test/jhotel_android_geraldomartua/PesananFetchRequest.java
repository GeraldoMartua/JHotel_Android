package test.jhotel_android_geraldomartua;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

/**
 * Created by User on 5/6/2018.
 */

public class PesananFetchRequest extends StringRequest {
    private static final String Regis_URL = "http://192.168.0.104:8080/pesanancustomer/";
    private Map<String, String> params;

    public PesananFetchRequest(String id_customer, Response.Listener<String> listener) {
        super(Method.GET, Regis_URL+id_customer, listener, null);
        params = new HashMap<>();
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
