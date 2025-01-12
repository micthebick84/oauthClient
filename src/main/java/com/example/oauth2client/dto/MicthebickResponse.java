package com.example.oauth2client.dto;

import java.util.Map;

public class MicthebickResponse implements OAuth2Response {

    private final Map<String, Object> attribute;

    public MicthebickResponse(Map<String, Object> attribute) {

        this.attribute = (Map<String, Object>) attribute.get("response");
    }

    @Override
    public String getProvider() {
        return "micthebick";
    }

    @Override
    public String getProviderId() {
        return "23413241234";
    }

    @Override
    public String getEmail() {
        return attribute.get("email").toString();
    }

    @Override
    public String getName() {
        return attribute.get("username").toString();
    }
}
