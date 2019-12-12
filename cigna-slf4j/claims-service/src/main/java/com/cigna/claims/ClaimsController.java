package com.cigna.claims;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimsController {

    private Logger logger = LoggerFactory.getLogger(ClaimsController.class);

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/claims/{claimId}")
    public String getClaimById(@PathVariable("claimId") String claimId) {
        logger.info("Received claim request. Claim id = {}", claimId);
        return claimId;
    }

}
