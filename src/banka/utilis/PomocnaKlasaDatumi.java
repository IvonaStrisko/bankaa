package banka.utilis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PomocnaKlasaDatumi {

	public static String DATE_TIME_FORMAT = "dd.MM.yyyy. HH:mm";
	public static String DATE_FORMAT = "dd.MM.yyyy.";
	public static String TIME_FORMAT = "HH:mm";
	
	public static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
	public static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
	public static DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);
	
	static Scanner sc = new Scanner(System.in);
	
	//citanje promenljive String
	public static String ocitajTekst(){
		String tekst = "";
		while(tekst == null || tekst.equals(""))
			tekst = sc.nextLine();
		
		return tekst;
	}
		
	//citanje promenljive integer
	public static int ocitajCeoBroj(){
		while (sc.hasNextInt()==false) {
			System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			sc.nextLine();
		}
		int ceoBroj = sc.nextInt();
		sc.nextLine(); //cisti sve sa ulaza sto nije broj ili ostatak teste posla broja
		return ceoBroj;
	}

	public static long ocitajLong(){
		while (sc.hasNextLong() == false) {
			System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			sc.nextLine();
		}
		long value = sc.nextLong();
		sc.nextLine();

		return value;
	}
	
	//citanje promenljive double
	public static float ocitajRealanBroj(){

		while (sc.hasNextFloat()==false) {
			System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			sc.nextLine();
		}
		float realanBroj = sc.nextFloat();
		sc.nextLine(); //cisti sve sa ulaza sto nije broj ili ostatak teste posla broja
		return realanBroj;
	}
		
	//citanje promenljive char
	public static char ocitajKarakter(){
		
		String text;
		while ( (text=sc.next())==null || text.length()!=1) {
			System.out.println("GRESKA - Pogresno unsesena vrednost za karakter, pokusajte ponovo: ");
			sc.nextLine();
		}
		char karakter = text.charAt(0);
		return karakter;
	}
	
	//citanje promenljive char
	public static char ocitajOdlukuOPotvrdi(String tekst){
		System.out.println("Da li zelite " + tekst + " [Y/N]:");
		char odluka = ' ';
		while( !(odluka == 'Y' || odluka == 'N') ){
			odluka = ocitajKarakter();
			if (!(odluka == 'Y' || odluka == 'N')) {
				System.out.println("Opcije su Y ili N");
			}
		}
		return odluka;
	}

	public static LocalDateTime ocitajDatumVreme() {
		LocalDateTime dateTime = null;

		while (dateTime == null) {
			String text = sc.nextLine();
			try {
				dateTime = LocalDateTime.parse(text, DATE_TIME_FORMATTER);
			} catch (Exception ex) {
				System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			}
		}

		return dateTime;
	}

	public static LocalDate ocitajDatum() {
		LocalDate date = null;

		while (date == null) {
			String text = sc.nextLine();
			try {
				date = LocalDate.parse(text, DATE_FORMATTER);
			} catch (Exception ex) {
				System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			}
		}

		return date;
	}

	public static LocalTime ocitajVreme() {
		LocalTime time = null;

		while (time == null) {
			String text = sc.nextLine();
			try {
				time = LocalTime.parse(text, TIME_FORMATTER);
			} catch (Exception ex) {
				System.out.println("GRESKA - Pogresno unsesena vrednost, pokusajte ponovo: ");
			}
		}

		return time;
	}

	static boolean isInteger(String s){
		try {
			Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	static boolean isDouble(String s){
		try {
			Double.parseDouble(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	static boolean isBoolean(String s){
		try {
			Boolean.parseBoolean(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
