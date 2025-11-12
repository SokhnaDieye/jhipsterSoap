package com.groupeisi.m2gl.banqueEndpoint;

import com.groupeisi.m2gl.service.BanqueService;
import com.groupeisi.ms1.entities.GetSoldeRequest;
import com.groupeisi.ms1.entities.SoldeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BanqueEndpoint {

    private static final String NAMESPACE_URI = "http://www.groupeisi.com/banque";

    @Autowired
    private BanqueService banqueService;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSoldeRequest")
    @ResponsePayload
    public SoldeResponse getSolde(@RequestPayload GetSoldeRequest request) {
        SoldeResponse response = new SoldeResponse();
        response.setSolde(banqueService.getSolde(request.getTel()));
        return response;
    }

}
