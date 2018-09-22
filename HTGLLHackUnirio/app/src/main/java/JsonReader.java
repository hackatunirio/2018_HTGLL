import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONparser;

public class JsonReader {
    private JSONObject extrai(String tema) throws JSONException IOException, JsonSyntaxException, IOException {

        // Setting URL
        String link = "http://sistemas.unirio.br/api/"+ tema +"?API_KEY=94ebdcee824a8fc9876c4c0b22580540a8d2330da2ec089d2e396afce2ee20332383a2df43936763358021ef9d163a21";

        // Making Request
        URL url = new URL(link);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JSONParser jp = new JSONParser();
        JSONParser root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JSONObject jsonobj = root.getAsJSONObject();

        // Accessing object
        return jsonobj;

    }
}
