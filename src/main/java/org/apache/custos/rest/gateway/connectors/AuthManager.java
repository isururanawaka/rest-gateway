package org.apache.custos.rest.gateway.connectors;

import org.apache.custos.authentication.cpi.CustosAuthenticationService;
import org.apache.custos.client.authentication.service.AuthenticationServiceClient;
import org.apache.custos.client.profile.service.CustosProfileServiceClientFactory;
import org.apache.custos.commons.model.security.AuthzToken;
import org.apache.custos.commons.utils.Constants;
import org.apache.custos.profile.tenant.cpi.TenantProfileService;
import org.apache.thrift.TException;
import org.json.JSONObject;

import java.util.HashMap;

import static org.apache.custos.commons.utils.Constants.GATEWAY_ID;

public class AuthManager {

    private CustosAuthenticationService.Client serviceClient;


    public AuthManager() {
        try {
            serviceClient = AuthenticationServiceClient.createAuthenticationServiceClient("localhost", 7070);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public  boolean isUserAuthenticated(String accessToken, String userName, String gatewayId) {
        AuthzToken authzToken = initializeAuthzToken(accessToken,userName,gatewayId);
        try {
          return  this.serviceClient.isUserAuthenticated(authzToken);
        } catch (TException e) {
            e.printStackTrace();
        }
        return false;
    }




    private AuthzToken  initializeAuthzToken(String accessToken, String userName, String gatewayId ){
        try{
            AuthzToken authzToken = new AuthzToken();
            HashMap<String, String> map = new HashMap<>();
            map.put(Constants.USER_NAME, userName);
            map.put(Constants.GATEWAY_ID, gatewayId);
            authzToken.setClaimsMap(map);
            authzToken.setAccessToken(accessToken);
            return authzToken;
        }catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }
}
