package com.xworkz.ServletFormswithDTO.service;

import com.xworkz.ServletFormswithDTO.dto.CollegeAdmissionDTO;
import com.xworkz.ServletFormswithDTO.dto.FeedBackDTO;

public interface FeedBackService {
	
	boolean validateAndSave(FeedBackDTO feedBackDTO);

}
