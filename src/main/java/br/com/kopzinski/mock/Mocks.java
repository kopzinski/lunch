package br.com.kopzinski.mock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.JodaTimePermission;

import br.com.kopzinski.beans.Candidate;
import br.com.kopzinski.beans.Election;
import br.com.kopzinski.beans.Place;
import br.com.kopzinski.beans.User;

public class Mocks {

	public static List<Election> populateElections() {
		List<Election> list = new ArrayList<>();
		for (int i = 20; i < 30; i++) {
			Election e = new Election();
			e.setDay(new DateTime(2015, 6, i, 0, 0).toDate());
			e.setCandidates(populateCandidates());
			list.add(e);
		}
		return list;
	}

	public static List<Candidate> populateCandidates() {
		List<Candidate> list = new ArrayList<>();

		for (Place place : populatePlaces()) {
			Candidate c = new Candidate();
			c.setPlace(place);
			c.setVoters(populateVotersByPlace(place));
			list.add(c);
		}
		return list;
	}

	public static List<Place> populatePlaces() {
		List<Place> list = new ArrayList<>();

		list.add(new Place(1, "tia zefa", "rua barao amazonaas, 123"));
		list.add(new Place(2, "riversaides", "av nilo, 124"));
		list.add(new Place(3, "panoramico", "puc"));
		list.add(new Place(4, "pampa burger", "av venancio, 123"));
		list.add(new Place(5, "barranco", "av protasio, 1243"));

		return list;
	}

	public static List<User> populateVotersByPlace(Place place) {
		List<User> list = new ArrayList<>();

		for (int i = 0; i < place.getId(); i++) {
			list.add(populateAllUsers().get(i));
		}

		return list;
	}

	public static List<User> populateAllUsers() {
		List<User> list = new ArrayList<>();

		list.add(new User(1, "paulo", "Paulo Silva"));
		list.add(new User(2, "eduardo", "Eduardo Silva"));
		list.add(new User(3, "Winnie", "Winnie Silva"));
		list.add(new User(4, "MArcos", "MArcos Silva"));
		list.add(new User(5, "Jose", "Jose Silva"));
		list.add(new User(6, "Joao", "Joao Silva"));
		list.add(new User(7, "Jorge", "Jorge Silva"));
		list.add(new User(8, "Jane", "Jane Silva"));

		return list;
	}
	
//	public static void main(String[] args) {
//		DateTime dt = new DateTime(2015, 6, 20, 0, 0);
//		
//		System.out.println(dt.toDate().toString());
//		Date b = new Date(115,5,20);
//		System.out.println(b.toString());
//		
//		if (dt.toDate().equals(b)) {
//			System.out.println("igual");
//		} else {
//			System.out.println("porra");
//		}
//	}

}
