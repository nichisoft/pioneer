package nicola.modugno.pioneer.enums;


public enum PioneerCommand  {
	POWER_ON("PO",  "POWER ON", "power_on"),
	POWER_OFF("PF", "POWER OFF", "power_off"),
	ADVANCED_SURROUND("0100SR", "Adv Surround", "advanced_surround"),
	AUTO_DIRECT("0005SR", "Auto/Direct", "auto_direct"),
	ALC_STANDARD("0010SR", "ALC/Standard", "alc_standard"),
	VOL_UP("VU", "VOL UP", "vol_up"),
	VOL_DOWN("VD", "VOL DOWN", "vol_down"),
	MUTE_ON("MO", "MUTE ON", "mute_on"),
	MUTE_OFF("MF", "MUTE OFF", "mute_off"),
	INPUT_UP("FU", "INPUT UP", "input_up"),
	INPUT_DOWN("FD", "INPUT DOWN", "input_down"),
	TUNER("02FN", "TUNER", "source_tuner"),
	CD("01FN", "CD", "source_cd"),
	CDR_TAPE("03FN", "CD-R/TAPE", "source_cdrtape"),
	PHONO("00FN", "PHONO", "source_phono"),
	IPOD_USB("17FN", "iPod/USB", "source_ipodusb"),
	NETRADIO("38FN", "Netradio", "source_netradio"),
	ADAPTER("33FN", "Adapter", "source_adapter"),
	MEDIA_SERVER("44FN", "Media Server", "source_mediaserver"),
	FAVORITES("45FN", "Favorites", "source_favorites"),
	DVD("04FN", "DVD", "source_dvd"),
	DVR_BDR("15FN", "DVR/BDR", "source_dvrbdr"),
	BD("25FN", "BD", "source_bd"),
	TV("05FN", "TV", "source_tv"),
	SAT_CBL("06FN", "Sat/Cbl", "source_satcbl"),
	VIDEO1("10FN", "VIDEO1", "source_video1"),
	VIDEO2("14FN", "VIDEO2", "source_video2"),
	HDMI1("19FN", "HDMI1", "source_hdmi1"),
	HDMI2("20FN", "HDMI2", "source_hdmi2"),
	HDMI3("21FN", "HDMI3", "source_hdmi3"),
	HDMI4("22FN", "HDMI4", "source_hdmi4"),
	HDMI5("23FN", "HDMI5", "source_hdmi5"),
	HDMI6("24FN", "HDMI6", "source_hdmi6"),
	REWIND("12PB", "REWIND", "ctrl_rewind"),
	FORWARD("13PB", "FORWARD", "ctrl_forward"),
	PLAY("10PB", "PLAY", "ctrl_play"),
	PAUSE("11PB", "PAUSE", "ctrl_pause"),
	STOP("20PB", "STOP", "ctrl_stop"),
	ENTER("30PB", "ENTER", "ctrl_enter"),
	RETURN("31PB", "RETURN", "ctrl_return"),
	;
	
	private String code;
	private String label;
	private String htmlName;
	
	private PioneerCommand(String code, String label, String htmlName) {
		this.setCode(code);
		this.setLabel(label);
		this.setHtmlName(htmlName);
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

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Status");
        sb.append("{code=").append(code);
        sb.append(", label='").append(label).append('\'');
        sb.append(", htmlName='").append(htmlName).append('\'');
        sb.append('}');
        return sb.toString();
    }
	
	public static PioneerCommand getPioneerCommandFromCode(String code) {
		if(code==null)
			return null;
		switch (code) {
			case "PO": return PioneerCommand.POWER_ON;
			case "PF": return PioneerCommand.POWER_OFF;
			case "0100SR": return PioneerCommand.ADVANCED_SURROUND;
			case "0005SR": return PioneerCommand.AUTO_DIRECT;
			case "0010SR": return PioneerCommand.ALC_STANDARD;
			case "VU": return PioneerCommand.VOL_UP;
			case "VD": return PioneerCommand.VOL_DOWN;
			case "MO": return PioneerCommand.MUTE_ON;
			case "MF": return PioneerCommand.MUTE_OFF;
			case "FU": return PioneerCommand.INPUT_UP;
			case "FD": return PioneerCommand.INPUT_DOWN;
			case "02FN": return PioneerCommand.TUNER;
			case "01FN": return PioneerCommand.CD;
			case "03FN": return PioneerCommand.CDR_TAPE;
			case "00FN": return PioneerCommand.PHONO;
			case "17FN": return PioneerCommand.IPOD_USB;
			case "38FN": return PioneerCommand.NETRADIO;
			case "33FN": return PioneerCommand.ADAPTER;
			case "44FN": return PioneerCommand.MEDIA_SERVER;
			case "45FN": return PioneerCommand.FAVORITES;
			case "04FN": return PioneerCommand.DVD;
			case "15FN": return PioneerCommand.DVR_BDR;
			case "25FN": return PioneerCommand.BD;
			case "05FN": return PioneerCommand.TV;
			case "06FN": return PioneerCommand.SAT_CBL;
			case "10FN": return PioneerCommand.VIDEO1;
			case "14FN": return PioneerCommand.VIDEO2;
			case "19FN": return PioneerCommand.HDMI1;
			case "20FN": return PioneerCommand.HDMI2;
			case "21FN": return PioneerCommand.HDMI3;
			case "22FN": return PioneerCommand.HDMI4;
			case "23FN": return PioneerCommand.HDMI5;
			case "24FN": return PioneerCommand.HDMI6;
			case "12PB": return PioneerCommand.REWIND;
			case "13PB": return PioneerCommand.FORWARD;
			case "10PB": return PioneerCommand.PLAY;
			case "11PB": return PioneerCommand.PAUSE;
			case "20PB": return PioneerCommand.STOP;
			case "30PB": return PioneerCommand.ENTER;
			case "31PB": return PioneerCommand.RETURN;
			default: return null;
		}
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
			default: return null;
		}
	}

}
