package com.poc.service;

import com.poc.entity.CibilScoreEntity;
import com.poc.model.CibilScoreDetails;
import com.poc.repository.CibilScoreRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Cibil Service Test.
 */
@ExtendWith(MockitoExtension.class)
public class CibilServiceTest {

	@Mock
	CibilScoreRepository cibilScoreRepository;

	@InjectMocks
	CibilScoreServiceImpl cibilScoreServiceImpl;



	@Test
	public void createCibilTest() {
		CibilScoreEntity cuCibilScoreEntity=new CibilScoreEntity();
		cuCibilScoreEntity.setPanCardNo("BGHDSS877233");
		cuCibilScoreEntity.setName("Johan");
		cuCibilScoreEntity.setCibilScore(800.0);

		when(cibilScoreRepository.save(Mockito.any())).thenReturn(cuCibilScoreEntity);
		CibilScoreDetails cibilScoreDetailsResponse=cibilScoreServiceImpl.saveCibilScore(new CibilScoreDetails("firstName4", 800.0,"BGHDSS877233"));
		verify(cibilScoreRepository).save(Mockito.any());
		assertThat(cibilScoreDetailsResponse).isNotNull();

	}


	/**
	 * Find credit score by pan number validation test.
	 */
	@Test
	public void getCibilScoreByPanNoTest() {
		CibilScoreEntity cibilScoreDetailsEntity=new CibilScoreEntity();
		cibilScoreDetailsEntity.setCibilScore(860.0);
		cibilScoreDetailsEntity.setName("Johan");
		cibilScoreDetailsEntity.setPanCardNo("BIH9898998");
		when(cibilScoreRepository.findByPanCardNo(Mockito.anyString())).thenReturn(cibilScoreDetailsEntity);
		CibilScoreDetails cibilScoreDetails=cibilScoreServiceImpl.findCibilScoreByPanCardNumber(cibilScoreDetailsEntity.getPanCardNo());
		verify(cibilScoreRepository).findByPanCardNo(Mockito.anyString());
		assertThat(cibilScoreDetails).isNotNull();
		assertThat(cibilScoreDetails.getPanCard()).isEqualTo("BIH9898998");
		assertThat(cibilScoreDetails.getCibilScore()).isEqualTo(860.0);

	}

	/**
	 * Find credit score by no pan number validation test.
	 *//*
	@Test()
	public void getCibilScoreByPanNo_Not_foundTest() {
		Long userId=1l;
		when(cibilScoreRepository.findByPanCardNo(Mockito.anyString())).thenThrow(ResourceNotFoundException.class);
		CibilScoreDetails cibilScoreDetails=cibilScoreServiceImpl.findCibilScoreByPanCardNumber("BIH9898998");
		verify(cibilScoreRepository).findByPanCardNo(Mockito.anyString());
		assertThat(cibilScoreDetails).isNull();
	}
*/
}
