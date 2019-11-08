package org.apache.custos.rest.gateway.connectors;

import org.apache.custos.client.profile.service.CustosProfileServiceClientFactory;
import org.apache.custos.profile.tenant.cpi.TenantProfileService;
import org.apache.custos.profile.tenant.cpi.exception.TenantProfileServiceException;

public class TenantManager {

    private TenantProfileService.Client profileServiceClient;

    public TenantManager() {
        try {
            profileServiceClient = CustosProfileServiceClientFactory.createCustosTenantProfileServiceClient("locahost",7071);
        } catch (TenantProfileServiceException e) {
            e.printStackTrace();
        }
    }
}
