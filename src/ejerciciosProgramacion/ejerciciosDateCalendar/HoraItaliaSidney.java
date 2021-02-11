package ejerciciosDateCalendar;
import java.util.Calendar;
import java.util.TimeZone;


public class HoraItaliaSidney {
	
	public static void main(String[] args) {
		Calendar horaEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar horaEnSidney = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		System.out.println("Hora en Roma: " + horaEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en Sidney: " + horaEnSidney.get(Calendar.HOUR_OF_DAY));
		System.out.println("La diferencia horaria entre Roma y Sidney es de: " + (horaEnRoma.get(Calendar.HOUR_OF_DAY)-horaEnSidney.get(Calendar.HOUR_OF_DAY)) + " horas.");
	}
}

