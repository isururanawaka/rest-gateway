package org.apache.custos.rest.gateway.models;


public class Client {

    private String clientName;

    private String[] redirectURIs;

    private String logoURI;

    private String[] scope;

    private String subjectType;

    private String sectorIdentifierURI;

    private String tokenEndpointAuthMethod;

    private String jwksURI;

    private String userInfoEncryptedResponseAlgo;

    private String userInfoEncryptedResponseEnc;

    private String[] contacts;

    private String[] requestURIs;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String[] getRedirectURIs() {
        return redirectURIs;
    }

    public void setRedirectURIs(String[] redirectURIs) {
        this.redirectURIs = redirectURIs;
    }

    public String getLogoURI() {
        return logoURI;
    }

    public void setLogoURI(String logoURI) {
        this.logoURI = logoURI;
    }

    public String[] getScope() {
        return scope;
    }

    public void setScope(String[] scope) {
        this.scope = scope;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getSectorIdentifierURI() {
        return sectorIdentifierURI;
    }

    public void setSectorIdentifierURI(String sectorIdentifierURI) {
        this.sectorIdentifierURI = sectorIdentifierURI;
    }

    public String getTokenEndpointAuthMethod() {
        return tokenEndpointAuthMethod;
    }

    public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    }

    public String getJwksURI() {
        return jwksURI;
    }

    public void setJwksURI(String jwksURI) {
        this.jwksURI = jwksURI;
    }

    public String getUserInfoEncryptedResponseAlgo() {
        return userInfoEncryptedResponseAlgo;
    }

    public void setUserInfoEncryptedResponseAlgo(String userInfoEncryptedResponseAlgo) {
        this.userInfoEncryptedResponseAlgo = userInfoEncryptedResponseAlgo;
    }

    public String getUserInfoEncryptedResponseEnc() {
        return userInfoEncryptedResponseEnc;
    }

    public void setUserInfoEncryptedResponseEnc(String getUserInfoEncryptedResponseEnc) {
        this.userInfoEncryptedResponseEnc = getUserInfoEncryptedResponseEnc;
    }

    public String[] getContacts() {
        return contacts;
    }

    public void setContacts(String[] contacts) {
        this.contacts = contacts;
    }

    public String[] getRequestURIs() {
        return requestURIs;
    }

    public void setRequestURIs(String[] requestURIs) {
        this.requestURIs = requestURIs;
    }
}
