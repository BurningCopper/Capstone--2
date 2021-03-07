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
    public Iterable<InsurancePolicy> getPolicies() {
        return Database.policies;
    }
    
    @GetMapping("/{id}")
    public Optional<InsurancePolicy> getPolicyById(@PathVariable Integer id) {
        for (InsurancePolicy policy: Database.policies) {
            if (policy.getId().equals(id)) {
                return Optional.of(policy);
            }
        }
        return Optional.empty();
    }

    @GetMapping("/claims/{id}")
    public Optional<Map<String, Object>> getClaimById(@PathVariable Integer id) {
        for (InsurancePolicy policy: Database.policies) {
            for (InsuranceClaim claim: policy.getClaims()) {
                if (claim.getId().equals(id)) {
                    return Optional.of(mapPolicy(policy));
                }
            }
        }
        return Optional.empty();
    }

    private Map<String, Object> mapPolicy(InsurancePolicy policy) {
        Map<String, Object> policyMap = new HashMap<>();
        policyMap.put("id", policy.getId());
        policyMap.put("claim", policy.getClaims());
        // policyMap.put("paid", policy.getPaid());
        policyMap.put("premium", policy.getPremium());
        return policyMap;
    }
}
