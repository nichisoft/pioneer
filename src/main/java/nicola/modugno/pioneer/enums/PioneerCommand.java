package nicola.modugno.pioneer.enums;


public enum PioneerCommand {
	POWER_ON("PO",  "POWER ON", "power_on", 0L),
	POWER_OFF("PF", "POWER OFF", "power_off", 0L),
	ADVANCED_SURROUND("0100SR", "Adv Surround", "advanced_surround", 0L),
	AUTO_DIRECT("0005SR", "Auto/Direct", "auto_direct", 0L),
	ALC_STANDARD("0010SR", "ALC/Standard", "alc_standard", 0L),
	VOL_UP("VU", "VOL UP", "vol_up", 0L),
	VOL_DOWN("VD", "VOL DOWN", "vol_down", 0L),
	MUTE_ON("MO", "MUTE ON", "mute_on", 0L),
	MUTE_OFF("MF", "MUTE OFF", "mute_off", 0L),
	INPUT_UP("FU", "INPUT UP", "input_up", 0L),
	INPUT_DOWN("FD", "INPUT DOWN", "input_down", 0L),
	TUNER("02FN", "TUNER", "source_tuner", 0L),
	CD("01FN", "CD", "source_cd", 0L),
	CDR_TAPE("03FN", "CD-R/TAPE", "source_cdrtape", 0L),
	PHONO("00FN", "PHONO", "source_phono", 0L),
	IPOD_USB("17FN", "iPod/USB", "source_ipodusb", 0L),
	NETRADIO("38FN", "Netradio", "source_netradio", 0L),
	ADAPTER("33FN", "Adapter", "source_adapter", 0L),
	MEDIA_SERVER("44FN", "Media Server", "source_mediaserver", 0L),
	FAVORITES("45FN", "Favorites", "source_favorites", 0L),
	DVD("04FN", "DVD", "source_dvd", 0L),
	DVR_BDR("15FN", "DVR/BDR", "source_dvrbdr", 0L),
	BD("25FN", "BD", "source_bd", 0L),
	TV("05FN", "TV", "source_tv", 0L),
	SAT_CBL("06FN", "Sat/Cbl", "source_satcbl", 0L),
	VIDEO1("10FN", "VIDEO1", "source_video1", 0L),
	VIDEO2("14FN", "VIDEO2", "source_video2", 0L),
	HDMI1("19FN", "HDMI1", "source_hdmi1", 0L),
	HDMI2("20FN", "HDMI2", "source_hdmi2", 0L),
	HDMI3("21FN", "HDMI3", "source_hdmi3", 0L),
	HDMI4("22FN", "HDMI4", "source_hdmi4", 0L),
	HDMI5("23FN", "HDMI5", "source_hdmi5", 0L),
	HDMI6("24FN", "HDMI6", "source_hdmi6", 0L),
	REWIND("12PB", "REWIND", "ctrl_rewind", 0L),
	FORWARD("13PB", "FORWARD", "ctrl_forward", 0L),
	PLAY("10PB", "PLAY", "ctrl_play", 0L),
	PAUSE("11PB", "PAUSE", "ctrl_pause", 0L),
	STOP("20PB", "STOP", "ctrl_stop", 0L),
	ENTER("30PB", "ENTER", "ctrl_enter", 0L),
	RETURN("31PB", "RETURN", "ctrl_return", 0L),
	QUERY_POWER_STATUS("?P", "QUERY_POWER_STATUS", "query_power_status", 0L), //return PWR2 SPENTO, PWR0 ACCESO
	QUERY_ACTIVE_INPUT("?F", "QUERY_ACTIVE_INPUT", "query_active_function", 0L),
	QUERY_CURRENT_FOLDER("?GAP", "QUERY_CURRENT_FOLDER", "query_current_folder", 750L),
	SELECT_FOLDER_FILE("GHP", "SELECT FOLDER/FILE", "ctrl_select_folder_file", 750L), //00001GHP for first file, 00002GHP for second file etc...
	LIST_CONTENT("?GIA0000100180", "LIST_CONTENT", "list_content", 750L)
	;
	
	private String code;
	private String label;
	private String htmlName;
	private Long sleepTimeMillis;
	
	private PioneerCommand(String code, String label, String htmlName, Long sleepTimeMillis) {
		this.setCode(code);
		this.setLabel(label);
		this.setHtmlName(htmlName);
		this.setSleepTimeMillis(sleepTimeMillis);
	} 

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getHtmlName() {
		return htmlName;
	}

	public void setHtmlName(String htmlName) {
		this.htmlName = htmlName;
	}

	public Long getSleepTimeMillis() {
		return sleepTimeMillis;
	}

	public void setSleepTimeMillis(Long sleepTimeMillis) {
		this.sleepTimeMillis = sleepTimeMillis;
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Status");
        sb.append("{code=").append(code);
        sb.append(", label='").append(label).append('\'');
        sb.append(", htmlName='").append(htmlName).append('\'');
        sb.append(", sleepTimeMillis='").append(sleepTimeMillis).append('\'');
        sb.append('}');
        return sb.toString();
    }
	
	public static PioneerCommand getPioneerCommandFromCode(String code) {
		if(code==null)
			return null;
		if(code.equals("PO")) return PioneerCommand.POWER_ON;
		else if(code.equals("PF")) return PioneerCommand.POWER_OFF;
		else if(code.equals("0100SR")) return PioneerCommand.ADVANCED_SURROUND;
		else if(code.equals("0005SR")) return PioneerCommand.AUTO_DIRECT;
		else if(code.equals("0010SR")) return PioneerCommand.ALC_STANDARD;
		else if(code.equals("VU")) return PioneerCommand.VOL_UP;
		else if(code.equals("VD")) return PioneerCommand.VOL_DOWN;
		else if(code.equals("MO")) return PioneerCommand.MUTE_ON;
		else if(code.equals("MF")) return PioneerCommand.MUTE_OFF;
		else if(code.equals("FU")) return PioneerCommand.INPUT_UP;
		else if(code.equals("FD")) return PioneerCommand.INPUT_DOWN;
		else if(code.equals("02FN")) return PioneerCommand.TUNER;
		else if(code.equals("01FN")) return PioneerCommand.CD;
		else if(code.equals("03FN")) return PioneerCommand.CDR_TAPE;
		else if(code.equals("00FN")) return PioneerCommand.PHONO;
		else if(code.equals("17FN")) return PioneerCommand.IPOD_USB;
		else if(code.equals("38FN")) return PioneerCommand.NETRADIO;
		else if(code.equals("33FN")) return PioneerCommand.ADAPTER;
		else if(code.equals("44FN")) return PioneerCommand.MEDIA_SERVER;
		else if(code.equals("45FN")) return PioneerCommand.FAVORITES;
		else if(code.equals("04FN")) return PioneerCommand.DVD;
		else if(code.equals("15FN")) return PioneerCommand.DVR_BDR;
		else if(code.equals("25FN")) return PioneerCommand.BD;
		else if(code.equals("05FN")) return PioneerCommand.TV;
		else if(code.equals("06FN")) return PioneerCommand.SAT_CBL;
		else if(code.equals("10FN")) return PioneerCommand.VIDEO1;
		else if(code.equals("14FN")) return PioneerCommand.VIDEO2;
		else if(code.equals("19FN")) return PioneerCommand.HDMI1;
		else if(code.equals("20FN")) return PioneerCommand.HDMI2;
		else if(code.equals("21FN")) return PioneerCommand.HDMI3;
		else if(code.equals("22FN")) return PioneerCommand.HDMI4;
		else if(code.equals("23FN")) return PioneerCommand.HDMI5;
		else if(code.equals("24FN")) return PioneerCommand.HDMI6;
		else if(code.equals("12PB")) return PioneerCommand.REWIND;
		else if(code.equals("13PB")) return PioneerCommand.FORWARD;
		else if(code.equals("10PB")) return PioneerCommand.PLAY;
		else if(code.equals("11PB")) return PioneerCommand.PAUSE;
		else if(code.equals("20PB")) return PioneerCommand.STOP;
		else if(code.equals("30PB")) return PioneerCommand.ENTER;
		else if(code.equals("31PB")) return PioneerCommand.RETURN;
		else if(code.equals("?P")) return PioneerCommand.QUERY_POWER_STATUS;
		else if(code.equals("?F")) return PioneerCommand.QUERY_ACTIVE_INPUT;
		else if(code.equals("?GAP")) return PioneerCommand.QUERY_CURRENT_FOLDER;
		else if(code.contains("GHP")) return PioneerCommand.SELECT_FOLDER_FILE;
		else if(code.equals("?GIA0000100180")) return PioneerCommand.LIST_CONTENT;
		return null;
	}

	public static PioneerCommand getPioneerCommandFromLabel(String label) {
		if(label==null)
			return null;
		switch (label) {
			case "POWER ON":  return PioneerCommand.POWER_ON;
			case "POWER OFF":  return PioneerCommand.POWER_OFF;
			case "Adv Surround":  return PioneerCommand.ADVANCED_SURROUND;
			case "Auto/Direct":  return PioneerCommand.AUTO_DIRECT;
			case "ALC/Standard":  return PioneerCommand.ALC_STANDARD;
			case "VOL UP":  return PioneerCommand.VOL_UP;
			case "VOL DOWN":  return PioneerCommand.VOL_DOWN;
			case "MUTE ON":  return PioneerCommand.MUTE_ON;
			case "MUTE OFF":  return PioneerCommand.MUTE_OFF;
			case "INPUT UP":  return PioneerCommand.INPUT_UP;
			case "INPUT DOWN":  return PioneerCommand.INPUT_DOWN;
			case "TUNER":  return PioneerCommand.TUNER;
			case "CD":  return PioneerCommand.CD;
			case "CD-R/TAPE":  return PioneerCommand.CDR_TAPE;
			case "PHONO":  return PioneerCommand.PHONO;
			case "iPod/USB":  return PioneerCommand.IPOD_USB;
			case "Netradio":  return PioneerCommand.NETRADIO;
			case "Adapter":  return PioneerCommand.ADAPTER;
			case "Media Server":  return PioneerCommand.MEDIA_SERVER;
			case "Favorites":  return PioneerCommand.FAVORITES;
			case "DVD":  return PioneerCommand.DVD;
			case "DVR/BDR":  return PioneerCommand.DVR_BDR;
			case "BD":  return PioneerCommand.BD;
			case "TV":  return PioneerCommand.TV;
			case "Sat/Cbl":  return PioneerCommand.SAT_CBL;
			case "VIDEO1":  return PioneerCommand.VIDEO1;
			case "VIDEO2":  return PioneerCommand.VIDEO2;
			case "HDMI1":  return PioneerCommand.HDMI1;
			case "HDMI2":  return PioneerCommand.HDMI2;
			case "HDMI3":  return PioneerCommand.HDMI3;
			case "HDMI4":  return PioneerCommand.HDMI4;
			case "HDMI5":  return PioneerCommand.HDMI5;
			case "HDMI6":  return PioneerCommand.HDMI6;
			case "REWIND":  return PioneerCommand.REWIND;
			case "FORWARD":  return PioneerCommand.FORWARD;
			case "PLAY":  return PioneerCommand.PLAY;
			case "PAUSE":  return PioneerCommand.PAUSE;
			case "STOP":  return PioneerCommand.STOP;
			case "ENTER":  return PioneerCommand.ENTER;
			case "RETURN":  return PioneerCommand.RETURN;
			case "QUERY_POWER_STATUS":  return PioneerCommand.QUERY_POWER_STATUS;
			case "QUERY_ACTIVE_INPUT":  return PioneerCommand.QUERY_ACTIVE_INPUT;
			case "QUERY_CURRENT_FOLDER":  return PioneerCommand.QUERY_CURRENT_FOLDER;
			case "SELECT FOLDER/FILE":  return PioneerCommand.SELECT_FOLDER_FILE;
			case "LIST_CONTENT":  return PioneerCommand.LIST_CONTENT;
			default: return null;
		}
	}
	
	public static PioneerCommand getPioneerCommandFromHtmlName(String htmlName) {
		if(htmlName==null)
			return null;
		switch (htmlName) {
			case "power_on":  return PioneerCommand.POWER_ON;
			case "power_off":  return PioneerCommand.POWER_OFF;
			case "advanced_surround":  return PioneerCommand.ADVANCED_SURROUND;
			case "auto_direct":  return PioneerCommand.AUTO_DIRECT;
			case "alc_standard":  return PioneerCommand.ALC_STANDARD;
			case "vol_up":  return PioneerCommand.VOL_UP;
			case "vol_down":  return PioneerCommand.VOL_DOWN;
			case "mute_on":  return PioneerCommand.MUTE_ON;
			case "mute_off":  return PioneerCommand.MUTE_OFF;
			case "input_up":  return PioneerCommand.INPUT_UP;
			case "input_down":  return PioneerCommand.INPUT_DOWN;
			case "source_tuner":  return PioneerCommand.TUNER;
			case "source_cd":  return PioneerCommand.CD;
			case "source_cdrtape":  return PioneerCommand.CDR_TAPE;
			case "source_phono":  return PioneerCommand.PHONO;
			case "source_ipodusb":  return PioneerCommand.IPOD_USB;
			case "source_netradio":  return PioneerCommand.NETRADIO;
			case "source_adapter":  return PioneerCommand.ADAPTER;
			case "source_mediaserver":  return PioneerCommand.MEDIA_SERVER;
			case "source_favorites":  return PioneerCommand.FAVORITES;
			case "source_dvd":  return PioneerCommand.DVD;
			case "source_dvrbdr":  return PioneerCommand.DVR_BDR;
			case "source_bd":  return PioneerCommand.BD;
			case "source_tv":  return PioneerCommand.TV;
			case "source_satcbl":  return PioneerCommand.SAT_CBL;
			case "source_video1":  return PioneerCommand.VIDEO1;
			case "source_video2":  return PioneerCommand.VIDEO2;
			case "source_hdmi1":  return PioneerCommand.HDMI1;
			case "source_hdmi2":  return PioneerCommand.HDMI2;
			case "source_hdmi3":  return PioneerCommand.HDMI3;
			case "source_hdmi4":  return PioneerCommand.HDMI4;
			case "source_hdmi5":  return PioneerCommand.HDMI5;
			case "source_hdmi6":  return PioneerCommand.HDMI6;
			case "ctrl_rewind":  return PioneerCommand.REWIND;
			case "ctrl_forward":  return PioneerCommand.FORWARD;
			case "ctrl_play": return PioneerCommand.PLAY;
			case "ctrl_pause":  return PioneerCommand.PAUSE;
			case "ctrl_stop":  return PioneerCommand.STOP;
			case "ctrl_enter":  return PioneerCommand.ENTER;
			case "ctrl_return":  return PioneerCommand.RETURN;
			case "query_power_status":  return PioneerCommand.QUERY_POWER_STATUS;
			case "query_active_function":  return PioneerCommand.QUERY_ACTIVE_INPUT;
			case "query_current_folder":  return PioneerCommand.QUERY_CURRENT_FOLDER;
			case "ctrl_select_folder_file":  return PioneerCommand.SELECT_FOLDER_FILE;
			case "list_content":  return PioneerCommand.LIST_CONTENT;
			default: return null;
		}
	}

}
