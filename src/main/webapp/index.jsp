<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Pioneer</title>
<link
	href="css/pioneer.css"
	rel="stylesheet" type="text/css">
</head>
<body>
<h2>Pioneer Web Remote Controller</h2>
<h3><a href="https://modugnon-house.dynu.net/nicolamodugno/" target="_blank">Nicola Modugno</a></h3>
<form action="pioneerservlet" method="post">
		<div class="power_mode">
			<div class="inner">
				<label>Power mode</label><br />
				<input type="submit" name="command" id="power_on" value="POWER ON">
				<input type="submit" name="command" id="power_off" value="POWER OFF">
			</div>
		</div>

		<br />

		<div class="surround_mode">
			<div class="inner">
				<label>Surround mode</label><br />
				<input type="submit" name="command" id="advanced_surround" value="Adv Surround">
				<input type="submit" name="command" id="auto_direct" value="Auto/Direct">
				<input type="submit" name="command" id="alc_standard" value="ALC/Standard">
			</div>
		</div>

		<br />

		<div class="volume">
			<div class="inner">
				<label>Volume</label><br />
				<input type="submit" name="command" id="vol_up" value="VOL UP">
				<input type="submit" name="command" id="vol_down" value="VOL DOWN">
				<input type="submit" name="command" id="mute_on" value="MUTE ON">
				<input type="submit" name="command" id="mute_off" value="MUTE OFF">
				<input type="submit" name="command" id="input_up" value="INPUT UP">
				<input type="submit" name="command" id="input_down"
					value="INPUT DOWN">
			</div>
		</div>

		<br />

		<div class="audio_source">
			<div class="inner">
				<label>Audio source</label><br />
				<input type="submit" name="command" id="source_tuner" value="TUNER">
				<input type="submit" name="command" id="source_cd" value="CD">
				<input type="submit" name="command" id="source_cdrtape" value="CD-R/TAPE">
				<input type="submit" name="command" id="source_phono" value="PHONO">
				<input type="submit" name="command" id="source_ipodusb" value="iPod/USB">
				<input type="submit" name="command" id="source_netradio" value="Netradio">
				<input type="submit" name="command" id="source_adapter" value="Adapter">
				<input type="submit" name="command" id="source_mediaserver" value="Media Server">
				<input type="submit" name="command" id="source_favorites" value="Favorites">
			</div>
		</div>

		<br />

		<div class="video_source">
			<div class="inner">
				<label>Video source</label><br />
				<input type="submit" name="command" id="source_dvd" value="DVD">
				<input type="submit" name="command" id="source_dvrbdr" value="DVR/BDR">
				<input type="submit" name="command" id="source_bd" value="BD">
				<input type="submit" name="command" id="source_tv" value="TV">
				<input type="submit" name="command" id="source_satcbl" value="Sat/Cbl">
				<input type="submit" name="command" id="source_video1" value="VIDEO1">
				<input type="submit" name="command" id="source_video2" value="VIDEO2">
			</div>
		</div>

		<br />

		<div class="hdmi_source">
			<div class="inner">
				<label>Hdmi source</label><br />
				<input type="submit" name="command" id="source_hdmi1" value="HDMI1">
				<input type="submit" name="command" id="source_hdmi2" value="HDMI2">
				<input type="submit" name="command" id="source_hdmi3" value="HDMI3">
				<input type="submit" name="command" id="source_hdmi4" value="HDMI4">
				<input type="submit" name="command" id="source_hdmi5" value="HDMI5">
				<input type="submit" name="command" id="source_hdmi6" value="HDMI6">
			</div>
		</div>

		<br />

		<div class="play_mode">
			<div class="inner">
				<label>Play mode</label><br />
				<input type="submit" name="command" id="ctrl_rewind" value="REWIND">
				<input type="submit" name="command" id="ctrl_forward" value="FORWARD">
				<input type="submit" name="command" id="ctrl_play" value="PLAY">
				<input type="submit" name="command" id="ctrl_pause" value="PAUSE">
				<input type="submit" name="command" id="ctrl_stop" value="STOP">
				<input type="submit" name="command" id="ctrl_enter" value="ENTER">
				<input type="submit" name="command" id="ctrl_return" value="RETURN">
			</div>
		</div>
		
		<br />
		
		<div class="display">
			<div class="inner">
				<label>Display</label><br />
				<textarea id="display" name="display" rows="4" cols="50" disabled>${output }</textarea>
			</div>
		</div>

	</form>
</body>
</html>