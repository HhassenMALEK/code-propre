package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire  pour manipuler des dates
 */
public final class DateUtils {

	/** Pattern de formatage par defaut de l'application */
	public  static final String PATTERN_DEFAUT = "dd/MM/yyyy HH:mm:ss";

	/**
	 * Méthode qui formate une date avec un pattern passé en paramètre
	 * @param pattern patterne de formatage
	 * @param date deta a fomater
	 * @return String
	 */
	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * Méthode qui formate une date avec le pattern dd/MM/yyyy HH:mm:ss
	 * @param date date a formater
	 * @return String
	 */
	public static String formatDefaut(Date date) {
		return format(PATTERN_DEFAUT,date);
	}
}
