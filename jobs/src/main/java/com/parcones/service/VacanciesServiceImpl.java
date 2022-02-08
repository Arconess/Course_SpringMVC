package com.parcones.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.parcones.model.Vacant;

@Service
public class VacanciesServiceImpl implements IVacanciesService {
	
	private List<Vacant> list = null;

	public VacanciesServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		list = new LinkedList<Vacant>();

		try {
			Vacant vacant1 = new Vacant();
			vacant1.setId(1);
			vacant1.setName("Communications Engineer");
			vacant1.setDescription("Engineer required for intranet support.");
			vacant1.setDate(sdf.parse("08-02-2019"));
			vacant1.setSalary(2000.0);
			vacant1.setHighlated(1);
			vacant1.setImage("icon1.png");

			Vacant vacant2 = new Vacant();
			vacant2.setId(2);
			vacant2.setName("Electrical Engineer");
			vacant2.setDescription("Electrical Engineer description");
			vacant2.setDate(sdf.parse("10-10-2020"));
			vacant2.setSalary(3000.0);
			vacant2.setHighlated(0);
			vacant2.setImage("icon2.png");

			Vacant vacant3 = new Vacant();
			vacant3.setId(3);
			vacant3.setName("Graphic Designer");
			vacant3.setDescription("Graphic Designer description");
			vacant3.setDate(sdf.parse("24-05-2021"));
			vacant3.setSalary(2100.0);
			vacant3.setHighlated(0);

			Vacant vacant4 = new Vacant();
			vacant4.setId(4);
			vacant4.setName("Bookkeeper");
			vacant4.setDescription("Bookkeeper description");
			vacant4.setDate(sdf.parse("17-02-2022"));
			vacant4.setSalary(1500.0);
			vacant4.setHighlated(1);
			vacant4.setImage("icon4.png");

			list.add(vacant1);
			list.add(vacant2);
			list.add(vacant3);
			list.add(vacant4);
		} catch (ParseException e) {
			System.out.println("Error: " + e);
		}
	}

	@Override
	public List<Vacant> searchAll() {

		return list;
	}

}
