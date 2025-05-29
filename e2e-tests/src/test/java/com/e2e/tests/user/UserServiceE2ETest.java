package com.e2e.tests.user;

import com.e2e.tests.util.E2ESuite;
import com.e2e.tests.util.TestRestFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = E2ESuite.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class UserServiceE2ETest extends E2ESuite {

    @Autowired
    private TestRestFacade restFacade;

    @Value("${user.service.url}")
    private String userServiceUrl;

    @Test
    void shouldSaveUser() {
        Map<String, Object> credentialPayload = Map.of(
                "username", "e2euser",
                "password", "e2epassword",
                "roleBasedAuthority", "ROLE_USER",
                "isEnabled", true,
                "isAccountNonExpired", true,
                "isAccountNonLocked", true,
                "isCredentialsNonExpired", true
        );

        Map<String, Object> addressPayload = Map.of(
                "fullAddress", "123 E2E Test St",
                "postalCode", "12345",
                "city", "E2E City"
        );

        Map<String, Object> userPayload = Map.of(
                "firstName", "E2E",
                "lastName", "User",
                "imageUrl", "http://placeholder:200",
                "email", "e2euser@example.com",
                "phone", "1234567890",
                "addressDtos", List.of(addressPayload),
                "credential", credentialPayload
        );

        ResponseEntity<String> response = restFacade.post(
                userServiceUrl + "/user-service/api/users",
                userPayload,
                String.class
        );

        System.out.println("Response: " + response.getBody());
        System.out.println("Status Code: " + response.getStatusCode());
        assertTrue(response.getStatusCode().is2xxSuccessful(), "Unexpected status code: " + response.getStatusCode());
    }
    
}