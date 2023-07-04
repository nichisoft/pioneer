package nicola.modugno.pioneer.jstl;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Prof. Nicola Modugno
 *
 */
public class JstlUtil {
	
	public static boolean contains(Collection<?> coll, Object o) {
		if(coll == null)
			return false;
	    
		return coll.contains(o);
	  }

	public static String escapeHTML(String s) {
		StringBuffer sb = new StringBuffer();

		int n = s.length();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			switch (c) {
			case '<': sb.append("&lt;"); break;
			case '>': sb.append("&gt;"); break;
			case '&': sb.append("&amp;"); break;
			case 'â': sb.append("&acirc;");break;
			case 'Â': sb.append("&Acirc;");break;
			case 'ä': sb.append("&auml;");break;
			case 'Ä': sb.append("&Auml;");break;
			case 'å': sb.append("&aring;");break;
			case 'Å': sb.append("&Aring;");break;
			case 'æ': sb.append("&aelig;");break;
			case 'Æ': sb.append("&AElig;");break;
			case 'ç': sb.append("&ccedil;");break;
			case 'Ç': sb.append("&Ccedil;");break;
			case 'ê': sb.append("&ecirc;");break;
			case 'Ê': sb.append("&Ecirc;");break;
			case 'ë': sb.append("&euml;");break;
			case 'Ë': sb.append("&Euml;");break;
			case 'ï': sb.append("&iuml;");break;
			case 'Ï': sb.append("&Iuml;");break;
			case 'ô': sb.append("&ocirc;");break;
			case 'Ô': sb.append("&Ocirc;");break;
			case 'ö': sb.append("&ouml;");break;
			case 'Ö': sb.append("&Ouml;");break;
			case 'ø': sb.append("&oslash;");break;
			case 'Ø': sb.append("&Oslash;");break;
			case 'ß': sb.append("&szlig;");break;
			case 'û': sb.append("&ucirc;");break;
			case 'Û': sb.append("&Ucirc;");break;
			case 'ü': sb.append("&uuml;");break;
			case 'Ü': sb.append("&Uuml;");break;
			case '®': sb.append("&reg;");break;
			case '©': sb.append("&copy;");break;
			case '€': sb.append("&euro;"); break;
			default:  sb.append(c); break;
			}
		}
		return sb.toString();
	}

	public static String secondsToDDhhMMss(Integer seconds) {
        int day = (int)TimeUnit.SECONDS.toDays(seconds);        
        long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);
        return day+":"+hours+":"+minute+":"+second;
	}
	
	public static String crypt(String toCrypt) {
		byte[] bytesEncoded = Base64.getEncoder().encode(toCrypt.getBytes());//encoding part
		String crypted=new String(bytesEncoded);
		return crypted;
	}
	
	public static String cryptDate(Date dateToCrypt) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		String toCrypt=sdf.format(dateToCrypt);
		
		byte[] bytesEncoded = Base64.getEncoder().encode(toCrypt.getBytes());//encoding part
		String crypted=new String(bytesEncoded);
		return crypted;
	}
	
	public static String padLeftZeros(String inputString, int length) {
	    if (inputString.length() >= length) {
	        return inputString;
	    }
	    StringBuilder sb = new StringBuilder();
	    while (sb.length() < length - inputString.length()) {
	        sb.append('0');
	    }
	    sb.append(inputString);

	    return sb.toString();
	}
	
	public static String zeroPadding(Integer yournumber) {
		return String.format("%05d", yournumber);
	}
	
	public static Integer indexOfFromIndex(String string, String charToFind, Integer fromIndex) {
		return string.indexOf(charToFind, fromIndex);
	}
}
