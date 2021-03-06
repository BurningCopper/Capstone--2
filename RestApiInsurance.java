package com.amfam.reskill.InsuranceApp;

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
    
    @GetMapping("/policies/{id}")
    public Optional<Map<String, Object>> getPolicyById(@PathVariable Integer id) {
        for (Policy policy: Database.policies) {
            for (Policy policy: policy.getPolicies()) {
                if (policy.getID().equals(id)) {
                    return Optional.of(mapPolicy(policy));
                }
            }
        }
        return Optional.empty();
    }

    @GetMapping("policies/claims/{id}")
    public Optional<Map<String, Object>> getClaimById(PathVariable String) {
        for (Policy policy: Database.policies) {
            for (Policy policy: policy.getPolicies()) {
                if (policy.getID().equals(id)) {
                    return Optional.of(mapClaim(claim));
                }
            }
        }
    }
}
