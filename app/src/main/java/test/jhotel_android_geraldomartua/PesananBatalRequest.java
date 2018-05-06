package test.jhotel_android_geraldomartua;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

/**
 * Created by User on 5/6/2018.
 */

public class PesananBatalRequest extends StringRequest {
    private static final String Regis_URL = "http://192.168.0.104:8080/cancelpesanan";
    private Map<String, String> params;

    public PesananBatalRequest(String id_pesanan, Response.Listener<String> listener) {
        super(Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("id_pesanan",id_pesanan);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
