package com.trax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Lead;
import com.trax.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLeadInfo(Lead lead) throws RuntimeException {
		leadRepo.save(lead);
	}

}
