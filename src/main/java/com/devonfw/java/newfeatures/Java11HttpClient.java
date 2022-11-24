package com.devonfw.java.newfeatures;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * Shows <a href="https://openjdk.org/jeps/321">JEP 321</a>: HTTP Client<br>
 */
public class Java11HttpClient {

  public static void main(String[] args) throws Exception {

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder(new URI("https://openjdk.org/jeps/321")).GET().build();
    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println(response.body());
  }

}
