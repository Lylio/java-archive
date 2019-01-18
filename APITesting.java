import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

public class APITesting {

    public static void main(String[] args) throws IOException {

        System.out.println("---- GET TEST ----\n");
        URL url = new URL("https://jsonplaceholder.typicode.com/todos/3");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        int status_code = con.getResponseCode();
        if(status_code == 200) {
            System.out.println("GET TEST PASSED: "+status_code);
        } else {
            System.out.println("GET TEST FAILED: "+status_code);
        }

        System.out.println("---- POST TEST ----\n");
        final String POST_PARAMS = "{\n" + "\"userId\": 101,\r\n" +
                "    \"id\": 101,\r\n" +
                "    \"title\": \"Test Title\",\r\n" +
                "    \"body\": \"Test Body\"" + "\n}";
        System.out.println(POST_PARAMS);
        URL obj = new URL("https://postb.in/1bwS9DnP");
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");
        postConnection.setRequestProperty("userId", "a1bcdefgh");
        postConnection.setRequestProperty("Content-Type", "application/json");
        postConnection.setDoOutput(true);
        OutputStream os = postConnection.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();
        int responseCode = postConnection.getResponseCode();
        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + postConnection.getResponseMessage());
        if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    postConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();
            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("POST NOT WORKED");
        }
    }
}
