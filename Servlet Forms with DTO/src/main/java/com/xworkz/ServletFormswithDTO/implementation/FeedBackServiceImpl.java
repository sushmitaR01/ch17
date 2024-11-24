package com.xworkz.ServletFormswithDTO.implementation;

import com.xworkz.ServletFormswithDTO.dto.FeedBackDTO;
import com.xworkz.ServletFormswithDTO.service.FeedBackService;

public class FeedBackServiceImpl implements FeedBackService {

	@Override
	public boolean validateAndSave(FeedBackDTO feedBackDTO) {
		System.out.println("start valaditing feedBackDTO in a service method");

		boolean valid = true;

		if (feedBackDTO != null) {
			System.out.println("feedBackDTO is not null it ill validate the data");
			String name = feedBackDTO.getName();
			if (name != null && !name.isEmpty() && name.length() >= 4 && name.length() <= 30) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is in-valid");
				valid = false;
			}

			String email = feedBackDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith("gmail"))) {
				System.out.println("Email is valid");
			} else {
				System.err.println("Email is in-valid");
				valid = false;
			}

		}
		return true;
	}

}
