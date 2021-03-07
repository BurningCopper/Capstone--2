package com.amfam.reskill.insuranceapp.insuranceapp;

import java.security.Policy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
public class RestApiInsurance {
    @GetMapping
    public Iterable<Policy> getPolicies() {
        return Database.policies;
    }
    
    @GetMapping("/{id}")
    public Optional<Policy>> getPolicyById(@PathVariable Integer id) {
        for (Policy policy: Database.policies) {
            if (policy.getID().equals(id)) {
                return Optional.of(policy));
            }
        }
        return Optional.empty();
    }

    @GetMapping("/claims/{id}")
    public Optional<Map<String, Object>> getClaimById(@PathVariable Integer id) {
        for (Policy policy: Database.policies) {
            for (Policy policy: policy.getPolicies()) {
                if (policy.getID().equals(id)) {
                    return Optional.of(mapClaim(claim));
                }
            }
        }
        return Optional.empty();
    }

    private Map<String, Object> mapPolicy(Policy policy) {
        Map<String, Object> policyMap = new HashMap<>();
        policyMap.put("id", policy.getID());
        policyMap.put("claim", policy.getClaims());
        policyMap.put("paid", policy.getPaid());
        policyMap.put("premium", policy.getPremium());
    }
}
