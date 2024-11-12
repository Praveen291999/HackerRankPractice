//package hackerRank.swiggy;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class PhoneNumberFormatter {
//
//    public static String getPhonenumbers(String country, String phoneNumber) {
//    	   String baseURL = "https://jsonmock.hackerrank.com/api/countries?name=" + country;
//           try {
//               // Create a URL object
//               URL url = new URL(baseURL);
//               
//               // Open a connection to the URL
//               HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//               connection.setRequestMethod("GET");
//               
//               // Read the response from the server
//               BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//               String inputLine;
//               StringBuilder content = new StringBuilder();
//               while ((inputLine = in.readLine()) != null) {
//                   content.append(inputLine);
//               }
//               in.close();
//               connection.disconnect();
//               
//               // Parse the JSON response
//               JSONObject jsonResponse = new JSONObject(content.toString());
//               JSONArray dataArray = jsonResponse.getJSONArray("data");
//               
//               // Check if the data array is empty (no country found)
//               if (dataArray.length() == 0) {
//                   return "-1";
//               }
//               
//               // Extract the calling code
//               JSONObject countryData = dataArray.getJSONObject(0);
//               JSONArray callingCodes = countryData.getJSONArray("callingCodes");
//               if (callingCodes.length() == 0) {
//                   return "-1";
//               }
//               
//               // Format and return the phone number
//               String callingCode = callingCodes.getString(0);
//               return "+" + callingCode + " " + phoneNumber;
//               
//           } catch (Exception e) {
//               // Return "-1" if an error occurs
//               return "-1";
//           }
//}