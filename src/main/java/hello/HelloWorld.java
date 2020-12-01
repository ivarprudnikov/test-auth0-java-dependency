package hello;

import com.auth0.client.auth.*;
import com.auth0.net.*;
import com.auth0.json.auth.*;
import com.auth0.client.mgmt.*;
import com.auth0.exception.*;

public class HelloWorld {
  public static void main(String[] args) throws Auth0Exception {
  	System.out.println("initialize");
  	AuthAPI authAPI = new AuthAPI("ivarprudnikov.eu.auth0.com", "foo", "bar");
	AuthRequest authRequest = authAPI.requestToken("https://ivarprudnikov.eu.auth0.com/api/v2/");
	TokenHolder holder = authRequest.execute();
	ManagementAPI mgmt = new ManagementAPI("foo.bar", holder.getAccessToken());
  }
}