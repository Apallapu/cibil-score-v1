package com.poc.service;

import com.poc.model.CibilScoreDetails;

/**
 * The interface Cibil ScoreService.
 */
public interface CibilScoreService {
    /**
     * Find the cibil score for customer.
     *
     * @param panNumber the pan card id
     * @return the list
     */
    CibilScoreDetails findCibilScoreByPanCardNumber(String panNumber);
    /**
     * save the cibil score for customer.
     *
     * @param cibilScoreDetails the pan card id
     * @return the CibilScoreDetails
     */
    CibilScoreDetails saveCibilScore(CibilScoreDetails cibilScoreDetails);
}
