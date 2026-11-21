package com.gpsmapcamera.geotagginglocationonphoto.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import com.ebizzinfotech.amjad.colorselector.zomg.ijzi;
import com.gpsmapcamera.geotagginglocationonphoto.model.ViewModel;
import com.itextpdf.text.pdf.ColumnText;
import defpackage.eo7;
import defpackage.vz6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SP {
    public static final String ACCURACY_COLOR = "ACCURACY_COLOR";
    public static final String ACCURACY_COLOR_CLASSIC = "ACCURACY_COLOR_CLASSIC";
    public static final String ACCURACY_COLOR_NC = "ACCURACY_COLOR_NC";
    public static final String ACCURACY_COLOR_REPORTING = "ACCURACY_COLOR_REPORTING";
    public static final String ACCURACY_SELECT = "accuracy_select";
    public static final String ACCURACY_SELECT_CLASSIC = "accuracy_select_classic";
    public static final String ACCURACY_SELECT_NC = "accuracy_select_nc";
    public static final String ACCURACY_SELECT_REPORTING = "accuracy_select_reporting";
    public static final String ACCURACY_VALUE = "Accuracy_value";
    public static final String ADDRESS_COLOR = "ADDRESS_COLOR";
    public static final String ADDRESS_COLOR_CLASSIC = "ADDRESS_COLOR_CLASSIC";
    public static final String ADDRESS_COLOR_DT = "ADDRESS_COLOR_dt";
    public static final String ADDRESS_COLOR_NC = "ADDRESS_COLOR_NC";
    public static final String ADDRESS_COLOR_QR = "ADDRESS_COLOR_qr";
    public static final String ADDRESS_COLOR_REPORTING = "ADDRESS_COLOR_REPORTING";
    public static final String ADDRESS_INDEX = "address_index";
    public static final String ADS_STATUS = "ads_status";
    public static final String ALARM_TIME_100_PHOTOS = "alarm_time_100_photos";
    public static final String ALARM_TIME_10_TIMES_OPEN = "alarm_time_10_times_open";
    public static final String ALARM_TIME_15_DAYS = "alarm_time_15_days";
    public static final String ALARM_TIME_2ND_DAY = "alarm_time_2nd_day";
    public static final String ALARM_TIME_3_TIME_NO_BUY = "alarm_time_3_time_no_buy";
    public static final String ALARM_TIME_3_TIME_NO_BUY_STAN = "alarm_time_3_time_no_buy_stan";
    public static final String ALARM_TIME_45_PHOTOS = "alarm_time_45_photos";
    public static final String ALARM_TIME_500_PHOTOS = "alarm_time_500_photos";
    public static final String ALARM_TIME_50_PHOTOS_PRO = "alarm_time_50_photos_pro";
    public static final String ALARM_TIME_CAMSET_OPEN_TIME = "alarm_time_camset_open_time";
    public static final String ALARM_TIME_FILE_OPEN_TIME = "alarm_time_file_open_time";
    public static final String ALARM_TIME_FOLD_OPEN_TIME = "alarm_time_fold_open_time";
    public static final String ALARM_TIME_FONT_OPEN_TIME = "alarm_time_font_open_time";
    public static final String ALARM_TIME_MAP_OPEN_TIME = "alarm_time_map_open_time";
    public static final String ALARM_TIME_STAMPPOS_OPEN_TIME = "alarm_time_stamppos_open_time";
    public static final String ALARM_TIME_TEMP_OPEN_TIME = "alarm_time_temp_open_time";
    public static final String ALL_PERMISSION_ACCESS = "all-permisiion_access";
    public static final String ALTITUDE_COLOR = "ALTITUDE_COLOR";
    public static final String ALTITUDE_COLOR_CLASSIC = "ALTITUDE_COLOR_CLASSIC";
    public static final String ALTITUDE_COLOR_DT = "ALTITUDE_COLOR_DT";
    public static final String ALTITUDE_COLOR_NC = "ALTITUDE_COLOR_NC";
    public static final String ALTITUDE_COLOR_REPORTING = "ALTITUDE_COLOR_REPORTING";
    public static final String ALTITUDE_SELECT = "altitude_select";
    public static final String ALTITUDE_SELECT_CLASSIC = "altitude_select_classic";
    public static final String ALTITUDE_SELECT_DT = "altitude_select_dt";
    public static final String ALTITUDE_SELECT_NC = "altitude_select_nc";
    public static final String ALTITUDE_SELECT_REPORTING = "altitude_select_reporting";
    public static final String ALTITUDE_VALUE = "Altitude_value";
    public static final String APP_COUNT = "app_count";
    public static final String APP_THEME = "App_Theme";
    public static final String AQILEVEL_COLOR_NC = "AQILEVEL_COLOR_NC";
    public static final String AQI_LEVEL_VALUE = "AQI_LEVEL_VALUE";
    public static final String AQI_VALUE = "AQI_VALUE";
    public static final String ASK_NOTE_EVERY_TIME = "ask_note_every_time";
    public static final String ASK_NOTE_EVERY_TIME_CLASSIC = "ask_note_every_time_classic";
    public static final String ASK_NOTE_EVERY_TIME_DT = "ask_note_every_time_dt";
    public static final String ASK_NOTE_EVERY_TIME_NC = "ask_note_every_time_nc";
    public static final String ASK_NOTE_EVERY_TIME_QR = "ask_note_every_time_qr";
    public static final String ASK_NOTE_EVERY_TIME_REPORTING = "ask_note_every_time_reporting";
    public static final String AZIMUTH_COLOR_NC = "AZIMUTH_COLOR_NC";
    public static final String BACKGROUND_COLOR = "BACKGROUND_COLOR";
    public static final String BACKGROUND_COLOR_CLASSIC = "BACKGROUND_COLOR_CLASSIC";
    public static final String BACKGROUND_COLOR_DT = "BACKGROUND_COLOR_dt";
    public static final String BACKGROUND_COLOR_NC = "BACKGROUND_COLOR_NC";
    public static final String BACKGROUND_COLOR_QR = "BACKGROUND_COLOR_qr";
    public static final String BACKGROUND_COLOR_REPORTING = "BACKGROUND_COLOR_REPORTING";
    public static final String BACK_RATIO_VALUE = "BACK_RATIO_VALUE";
    public static final String BACK_RATIO_VALUE_VID = "BACK_RATIO_VALUE_VID";
    public static final String BEF_AFT_PDF_COMPANY_NAME = "BEF_AFT_PDF_COMPANY_NAME";
    public static final String BEF_AFT_PDF_LOGO = "m_pdf_bef_aft_logo";
    public static final String BEF_AFT_PDF_PERSON_NAME = "BEF_AFT_PDF_PERSON_NAME";
    public static final String BEF_AFT_PDF_REPORT_NAME = "BEF_AFT_PDF_REPORT_NAME";
    public static final String BEF_AFT_PDF_SUMMARY = "BEF_AFT_PDF_SUMMARY";
    public static String CAM_TRACKING = "Cam_Tracking";
    public static final String COMPASS_COLOR = "COMPASS_COLOR";
    public static final String COMPASS_COLOR_CLASSIC = "COMPASS_COLOR_CLASSIC";
    public static final String COMPASS_COLOR_DT = "COMPASS_COLOR_DT";
    public static final String COMPASS_COLOR_NC = "COMPASS_COLOR_NC";
    public static final String COMPASS_COLOR_REPORTING = "COMPASS_COLOR_REPORTING";
    public static final String COMPASS_FOUND = "compass_found";
    public static final String COMPASS_VALUE = "compass_value";
    public static final String CONTACT_NUMBER = "CONTACT_NUMBER";
    public static final String CONTACT_NUMBER_CLASSIC = "CONTACT_NUMBER_CLASSIC";
    public static final String CONTACT_NUMBER_COLOR = "CONTACT_NUMBER_COLOR";
    public static final String CONTACT_NUMBER_COLOR_CLASSIC = "CONTACT_NUMBER_COLOR_CLASSIC";
    public static final String CONTACT_NUMBER_COLOR_DT = "CONTACT_NUMBER_COLOR_DT";
    public static final String CONTACT_NUMBER_COLOR_NC = "CONTACT_NUMBER_COLOR_NC";
    public static final String CONTACT_NUMBER_COLOR_REPORTING = "CONTACT_NUMBER_COLOR_REPORTING";
    public static final String CONTACT_NUMBER_DT = "CONTACT_NUMBER_DT";
    public static final String CONTACT_NUMBER_NC = "CONTACT_NUMBER_NC";
    public static final String CONTACT_NUMBER_REPORTING = "CONTACT_NUMBER_REPORTING";
    public static final String COUNT_DAYS = "COUNT_DAYS";
    public static final String CUS_1_INDEX = "cus_1_index";
    public static final String CUS_2_INDEX = "cus_2_index";
    public static final String CUS_3_INDEX = "cus_3_index";
    public static final String CUS_VALUE_1 = "cus_1_value";
    public static final String CUS_VALUE_2 = "cus_2_value";
    public static final String CUS_VALUE_3 = "cus_3_value";
    public static final String DATE_FORMAT = "date_format";
    public static final String DATE_FORMAT_CLASSIC = "date_format_classic";
    public static final String DATE_FORMAT_DT = "date_format_dt";
    public static final String DATE_FORMAT_NC = "date_format_nc";
    public static final String DATE_FORMAT_QR = "date_format_qr";
    public static final String DATE_FORMAT_REPORTING = "date_format_reporting";
    public static final String DATE_TIME_COLOR = "DATE_TIME_COLOR";
    public static final String DATE_TIME_COLOR_CLASSIC = "DATE_TIME_COLOR_CLASSIC";
    public static final String DATE_TIME_COLOR_DT = "DATE_TIME_COLOR_DT";
    public static final String DATE_TIME_COLOR_NC = "DATE_TIME_COLOR_NC";
    public static final String DATE_TIME_COLOR_QR = "DATE_TIME_COLOR_QR";
    public static final String DATE_TIME_COLOR_REPORTING = "DATE_TIME_COLOR_REPORTING";
    public static final String DATE_TIME_INDEX = "dt_index";
    public static final String DEFAULT_NOTE = "DEFAULT_NOTE";
    public static final String DRIVE_PROMO_NOTIF_SENT = "drive_promo_notif_sent";
    public static final String DRIVE_PROMO_V1_SENT = "drive_promo_v1_sent";
    public static final String DRIVE_PROMO_V2_SENT = "drive_promo_v2_sent";
    public static final String DRIVE_PROMO_V3_SENT = "drive_promo_v3_sent";
    public static final String DRIVE_PROMO_V4_SENT = "drive_promo_v4_sent";
    public static final String DRIVE_PROMO_VARIATION_INDEX = "drive_promo_variation_index";
    public static final String ELEVATION_COLOR = "ELEVATION_COLOR";
    public static final String ELEVATION_COLOR_CLASSIC = "ELEVATION_COLOR_CLASSIC";
    public static final String ELEVATION_COLOR_NC = "ELEVATION_COLOR_NC";
    public static final String ELEVATION_COLOR_REPORTING = "ELEVATION_COLOR_REPORTING";
    public static final String EMAIL_CONTENT = "email_content";
    public static final String EMAIL_RECIPIENT = "email_recipient";
    public static final String EMAIL_SECONDARY_RECIPIENT = "email_secondary_recipient";
    public static final String EMAIL_SUBJECT = "email_subject";
    public static final String ENT_IMAGE_URI = "ent_image_uri";
    public static final String FILE_ARRAY_LIST = "file_array_list";
    public static final String FLASH_VALUE = "FLASH_VALUE";
    public static final String FLASH_VALUE_FRONT = "FLASH_VALUE_FRONT";
    public static final String FOCUS_VALUE = "FOCUS_VALUE";
    public static final String FOLDER_PATH = "folder_path";
    public static final String FRONT_RATIO_VALUE = "FRONT_RATIO_VALUE";
    public static final String FRONT_RATIO_VALUE_VID = "FRONT_RATIO_VALUE_VID";
    public static final String FULL_FILE_NAME = "full_file_name";
    public static final String GD_FOLDER_PATH = "gd_folder_path";
    public static final String GRID_VALUE = "GRID_VALUE";
    public static final String HEADER_USER_PROPERTY = "header_show";
    public static final String HUMIDITY_COLOR = "HUMIDITY_COLOR";
    public static final String HUMIDITY_COLOR_CLASSIC = "HUMIDITY_COLOR_CLASSIC";
    public static final String HUMIDITY_COLOR_NC = "HUMIDITY_COLOR_NC";
    public static final String HUMIDITY_COLOR_REPORTING = "HUMIDITY_COLOR_REPORTING";
    public static final String HUMIDITY_VALUE = "Humidity_value";
    public static final String IMAGE_QUALITY = "image_quality";
    public static final String IMAGE_URI = "image_uri";
    public static final String IMAGE_URI_PREVIEW = "IMAGE_URI_PREVIEW";
    public static final String IS_24HR = "is_24hr";
    public static final String IS_ACCURACY = "is_accuracy";
    public static final String IS_ACCURACY_CLASSIC = "is_accuracy_classic";
    public static final String IS_ACCURACY_NC = "is_accuracy_nc";
    public static final String IS_ACCURACY_REPORTING = "is_accuracy_reporting";
    public static final String IS_ADDRESS = "is_address";
    public static final String IS_ADDRESS_CITY = "is_address_city";
    public static final String IS_ADDRESS_CITY_CLASSIC = "is_address_city_classic";
    public static final String IS_ADDRESS_CITY_DT = "is_address_city_dt";
    public static final String IS_ADDRESS_CITY_NC = "is_address_city_nc";
    public static final String IS_ADDRESS_CITY_QR = "is_address_city_qr";
    public static final String IS_ADDRESS_CITY_REPORTING = "is_address_city_reporting";
    public static final String IS_ADDRESS_CLASSIC = "is_address_classic";
    public static final String IS_ADDRESS_COUNTRY = "is_address_country";
    public static final String IS_ADDRESS_COUNTRY_CLASSIC = "is_address_country_classic";
    public static final String IS_ADDRESS_COUNTRY_DT = "is_address_country_dt";
    public static final String IS_ADDRESS_COUNTRY_NC = "is_address_country_nc";
    public static final String IS_ADDRESS_COUNTRY_QR = "is_address_country_qr";
    public static final String IS_ADDRESS_COUNTRY_REPORTING = "is_address_country_reporting";
    public static final String IS_ADDRESS_DT = "is_address_dt";
    public static final String IS_ADDRESS_NC = "is_address_nc";
    public static final String IS_ADDRESS_PINCODE = "is_address_pincode";
    public static final String IS_ADDRESS_PINCODE_CLASSIC = "is_address_pincode_classic";
    public static final String IS_ADDRESS_PINCODE_DT = "is_address_pincode_dt";
    public static final String IS_ADDRESS_PINCODE_NC = "is_address_pincode_nc";
    public static final String IS_ADDRESS_PINCODE_QR = "is_address_pincode_qr";
    public static final String IS_ADDRESS_PINCODE_REPORTING = "is_address_pincode_reporting";
    public static final String IS_ADDRESS_QR = "is_address_qr";
    public static final String IS_ADDRESS_REPORTING = "is_address_reporting";
    public static final String IS_ADDRESS_STATE = "is_address_state";
    public static final String IS_ADDRESS_STATE_CLASSIC = "is_address_state_classic";
    public static final String IS_ADDRESS_STATE_DT = "is_address_state_dt";
    public static final String IS_ADDRESS_STATE_NC = "is_address_state_nc";
    public static final String IS_ADDRESS_STATE_QR = "is_address_state_qr";
    public static final String IS_ADDRESS_STATE_REPORTING = "is_address_state_reporting";
    public static final String IS_ALTITUDE = "is_altitude";
    public static final String IS_ALTITUDE_CLASSIC = "is_altitude_classic";
    public static final String IS_ALTITUDE_DT = "is_altitude_dt";
    public static final String IS_ALTITUDE_NC = "is_altitude_nc";
    public static final String IS_ALTITUDE_REPORTING = "is_altitude_reporting";
    public static final String IS_AQI_LEVEL_NC = "is_aqi_level_nc";
    public static final String IS_AZIMUTH_NC = "is_azimuth_nc";
    public static final String IS_BEF_AFT_COMPANY_NAME = "IS_BEF_AFT_COMPANY_NAME";
    public static final String IS_BEF_AFT_LOGO = "IS_BEF_AFT_LOGO";
    public static final String IS_BEF_AFT_PREPARED_BY = "IS_BEF_AFT_PREPARED_BY";
    public static final String IS_BEF_AFT_TITLE = "IS_BEF_AFT_TITLE";
    public static final String IS_CALL_AQI_API = "is_call_aqi_once";
    public static final String IS_CALL_WEATHER_API = "is_weather_once";
    public static final String IS_CAMSET_CHECK = "IS_CAMSET_CHECK";
    public static final String IS_COMPASS = "is_compass";
    public static final String IS_COMPASS_CLASSIC = "is_compass_classic";
    public static final String IS_COMPASS_DT = "is_compass_dt";
    public static final String IS_COMPASS_NC = "is_compass_nc";
    public static final String IS_COMPASS_REPORTING = "is_compass_reporting";
    public static final String IS_CONTACT_NUMBER = "is_contact_number";
    public static final String IS_CONTACT_NUMBER_CLASSIC = "is_contact_number_classic";
    public static final String IS_CONTACT_NUMBER_DT = "is_contact_number_dt";
    public static final String IS_CONTACT_NUMBER_NC = "is_contact_number_nc";
    public static final String IS_CONTACT_NUMBER_REPORTING = "is_contact_number_reporting";
    public static final String IS_CONTACT_SWIPE_TUTORIAL_SHOWN = "is_contact_swipe_tutorial_shown";
    public static final String IS_COUNTRY_FLAG = "IS_COUNTRY_FLAG";
    public static final String IS_COUNTRY_FLAG_CLASSIC = "IS_COUNTRY_FLAG_CLASSIC";
    public static final String IS_COUNTRY_FLAG_DT = "IS_COUNTRY_FLAG_DT";
    public static final String IS_COUNTRY_FLAG_NC = "IS_COUNTRY_FLAG_NC";
    public static final String IS_COUNTRY_FLAG_QR = "IS_COUNTRY_FLAG_QR";
    public static final String IS_COUNTRY_FLAG_REPORTING = "IS_COUNTRY_FLAG_REPORTING";
    public static final String IS_CUS_1 = "is_cus_1";
    public static final String IS_CUS_2 = "is_cus_2";
    public static final String IS_CUS_3 = "is_cus_3";
    public static final String IS_CameraLevel = "is_CameraLevel";
    public static final String IS_DATE_TIME = "is_date_time";
    public static final String IS_DATE_TIME_CLASSIC = "is_date_time_classic";
    public static final String IS_DATE_TIME_DT = "is_date_time_dt";
    public static final String IS_DATE_TIME_NC = "is_date_time_nc";
    public static final String IS_DATE_TIME_QR = "is_date_time_qr";
    public static final String IS_DATE_TIME_REPORTING = "is_date_time_reporting";
    public static final String IS_DECIMAL_FILE = "is_decimal_file";
    public static final String IS_DISPLAY_FOLDER_NAME = "is_display_folder_name";
    public static final String IS_DMS_FILE = "is_dms_file";
    public static final String IS_DT = "is_dt";
    public static final String IS_DTT_CHECK = "IS_DTT_CHECK";
    public static final String IS_DTT_SELECT = "IS_DTT_SELECT";
    public static final String IS_ELEVATION = "is_elevation";
    public static final String IS_ELEVATION_CLASSIC = "is_elevation_classic";
    public static final String IS_ELEVATION_NC = "is_elevation_nc";
    public static final String IS_ELEVATION_REPORTING = "is_elevation_reporting";
    public static final String IS_FILE_DATE_TIME = "is_main_dt";
    public static final String IS_HR_MIN_SEC = "is_hr_min_sec";
    public static final String IS_HUMIDITY = "is_humidity";
    public static final String IS_HUMIDITY_CLASSIC = "is_humidity_classic";
    public static final String IS_HUMIDITY_NC = "is_humidity_nc";
    public static final String IS_HUMIDITY_REPORTING = "is_humidity_reporting";
    public static final String IS_INCREMENT = "is_increment";
    public static final String IS_INCREMENT_CLASSIC = "is_increment_classic";
    public static final String IS_INCREMENT_NC = "is_increment_nc";
    public static final String IS_INCREMENT_REPORTING = "is_increment_reporting";
    public static final String IS_LANGUAGE_EVENT_SEND = "IS_LANGUAGE_EVENT_SEND";
    public static final String IS_LAT_LNG = "is_lat_lng";
    public static final String IS_LAT_LNG_TEMPLATE = "is_lat_lng_template";
    public static final String IS_LAT_LNG_TEMPLATE_CLASSIC = "is_lat_lng_template_classic";
    public static final String IS_LAT_LNG_TEMPLATE_DT = "is_lat_lng_template_dt";
    public static final String IS_LAT_LNG_TEMPLATE_NC = "is_lat_lng_template_nc";
    public static final String IS_LAT_LNG_TEMPLATE_REPORTING = "is_lat_lng_template_reporting";
    public static final String IS_LINE_1 = "is_line_1";
    public static final String IS_LINE_2 = "is_line_2";
    public static final String IS_LINE_3 = "is_line_3";
    public static final String IS_LINE_4 = "is_line_4";
    public static final String IS_LOGO = "is_logo";
    public static final String IS_LOGO_CLASSIC = "is_logo_classic";
    public static final String IS_LOGO_DT = "is_logo_dt";
    public static final String IS_LOGO_NC = "is_logo_nc";
    public static final String IS_LOGO_REPORTING = "is_logo_reporting";
    public static final String IS_MAGNETIC_FIELD = "is_magnetic_field";
    public static final String IS_MAGNETIC_FIELD_CLASSIC = "is_magnetic_field_classic";
    public static final String IS_MAGNETIC_FIELD_NC = "is_magnetic_field_nc";
    public static final String IS_MAGNETIC_FIELD_REPORTING = "is_magnetic_field_reporting";
    public static final String IS_MAIN_ADDRESS = "is_main_address";
    public static final String IS_MAP = "is_map";
    public static final String IS_MAP_CLASSIC = "is_map_classic";
    public static final String IS_MAP_DT = "is_map_dt";
    public static final String IS_MAP_NC = "is_map_nc";
    public static final String IS_MAP_QR = "is_map_qr";
    public static final String IS_MAP_REPORTING = "is_map_reporting";
    public static final String IS_MAP_TOOLTIP_SHOWN = "is_map_tooltip_shown";
    public static final String IS_NOTES = "is_notes";
    public static final String IS_NOTES_CLASSIC = "is_notes_classic";
    public static final String IS_NOTES_DT = "is_notes_dt";
    public static final String IS_NOTES_FILE = "is_notes_file";
    public static final String IS_NOTES_NC = "is_notes_nc";
    public static final String IS_NOTES_QR = "is_notes_qr";
    public static final String IS_NOTES_REPORTING = "is_notes_reporting";
    public static final String IS_NUMBERING = "is_numbering";
    public static final String IS_NUMBERING_CLASSIC = "is_numbering_classic";
    public static final String IS_NUMBERING_NC = "is_numbering_nc";
    public static final String IS_NUMBERING_REPORTING = "is_numbering_reporting";
    public static final String IS_ONBOARD_EVENT_SEND = "IS_ONBOARD_EVENT_SEND";
    public static final String IS_ORIENTATION_LABEL_NC = "is_orientation_label_nc";
    public static final String IS_ORIGINAL_IMAGE = "is_original_image";
    public static final String IS_PDF_COMPANY_NAME = "IS_PDF_COMPANY_NAME";
    public static final String IS_PDF_DATE_TIME = "IS_PDF_DATE_TIME";
    public static final String IS_PDF_LOGO = "IS_PDF_LOGO";
    public static final String IS_PDF_PROJECT_NAME = "IS_PDF_PROJECT_NAME";
    public static final String IS_PDF_REMARK = "IS_PDF_REMARK";
    public static String IS_PDF_REPORTING = "IS_PDF_REPORTING";
    public static final String IS_PDF_REPORT_BY = "IS_PDF_REPORT_BY";
    public static final String IS_PDF_REPORT_SETTING_BADGE = "IS_PDF_REPORT_SETTING_BADGE";
    public static final String IS_PDF_REPORT_TOGGLE_BADGE = "IS_PDF_REPORT_TOGGLE_BADGE";
    public static final String IS_PDF_SUPERVISOR = "IS_PDF_SUPERVISOR";
    public static final String IS_PDF_TITLE = "IS_PDF_TITLE";
    public static final String IS_PERMISSION_EVENT_SEND = "IS_PERMISSION_EVENT_SEND";
    public static final String IS_PERSON_NAME = "is_personname";
    public static final String IS_PERSON_NAME_CLASSIC = "is_personname_classic";
    public static final String IS_PERSON_NAME_DT = "is_personname_dt";
    public static final String IS_PERSON_NAME_NC = "is_personname_nc";
    public static final String IS_PERSON_NAME_REPORTING = "is_personname_reporting";
    public static final String IS_PLUSCODE_FILE = "is_pluscode_file";
    public static final String IS_PLUS_CODE = "is_plus_code";
    public static final String IS_PLUS_CODE_CLASSIC = "is_plus_code_classic";
    public static final String IS_PLUS_CODE_NC = "is_plus_code_nc";
    public static final String IS_PLUS_CODE_REPORTING = "is_plus_code_reporting";
    public static final String IS_PRESSURE = "is_pressure";
    public static final String IS_PRESSURE_CLASSIC = "is_pressure_classic";
    public static final String IS_PRESSURE_NC = "is_pressure_nc";
    public static final String IS_PRESSURE_REPORTING = "is_pressure_reporting";
    public static final String IS_QRT_SELECT = "IS_QRT_SELECT";
    public static String IS_QUCK_SHARE_MODE = "IS_QUCK_SHARE_MODE";
    public static final String IS_SAVE_IN_INTERNAL_STORAGE = "IS_SAVE_IN_INTERNAL_STORAGE";
    public static final String IS_SEND_ADDRESS_TIME = "is_send_address_time";
    public static final String IS_SEND_EMAIL_PHOTOS = "is_send_email_photos";
    public static final String IS_SEQUENCE = "is_sequence";
    public static final String IS_SHORT_ADDRESS = "is_short_address";
    public static final String IS_SHORT_ADDRESS_CLASSIC = "is_short_address_classic";
    public static final String IS_SHORT_ADDRESS_DT = "is_short_address_dt";
    public static final String IS_SHORT_ADDRESS_NC = "is_short_address_nc";
    public static final String IS_SHORT_ADDRESS_REPORTING = "is_short_address_reporting";
    public static final String IS_SHOW_ONBOARDING = "IS_SHOW_ONBOARDING";
    public static final String IS_SOUNDLEVEL = "is_soundlevel";
    public static final String IS_SOUNDLEVEL_CLASSIC = "is_soundlevel_classic";
    public static final String IS_SOUNDLEVEL_NC = "is_soundlevel_nc";
    public static final String IS_SOUNDLEVEL_REPORTING = "is_soundlevel_reporting";
    public static final String IS_TEXT_CHECK = "IS_TEXT_CHECK";
    public static final String IS_TIMEZONE = "is_timezone";
    public static final String IS_TIMEZONE_CLASSIC = "is_timezone_classic";
    public static final String IS_TIMEZONE_FILE = "is_timezone_file";
    public static final String IS_TIMEZONE_NC = "is_timezone_nc";
    public static final String IS_TIMEZONE_REPORTING = "is_timezone_reporting";
    public static final String IS_UPLOAD_ON_GOOGLE_DRIVE = "IS_UPLOAD_ON_GOOGLE_DRIVE";
    public static final String IS_VISIT_STORAGE = "IS_VISIT_STORAGE";
    public static final String IS_WATER_MARK = "is_water_mark";
    public static final String IS_WEATHER = "is_weather";
    public static final String IS_WEATHER_CLASSIC = "is_weather_classic";
    public static final String IS_WEATHER_DT = "is_weather_dt";
    public static final String IS_WEATHER_NC = "is_weather_nc";
    public static final String IS_WEATHER_REPORTING = "is_weather_reporting";
    public static final String IS_WEEK = "is_week";
    public static final String IS_WIND = "is_wind";
    public static final String IS_WIND_CLASSIC = "is_wind_classic";
    public static final String IS_WIND_NC = "is_wind_nc";
    public static final String IS_WIND_REPORTING = "is_wind_reporting";
    public static final String LANGUAGE_COUNT = "language_count";
    public static final String LANGUAGE_POS = "language_pos";
    public static final String LAST_COUNT_DAY = "LAST_COUNT_DAY";
    public static final String LAST_THUMB_PATH = "LAST_THUMB_PATH";
    public static final String LAST_THUMB_URI = "LAST_THUMB_URI";
    public static final String LATITUDE = "latitude_1";
    public static final String LAT_LNG_COLOR = "LAT_LNG_COLOR";
    public static final String LAT_LNG_COLOR_CLASSIC = "LAT_LNG_COLOR_CLASSIC";
    public static final String LAT_LNG_COLOR_DT = "LAT_LNG_COLOR_DT";
    public static final String LAT_LNG_COLOR_NC = "LAT_LNG_COLOR_NC";
    public static final String LAT_LNG_COLOR_QR = "LAT_LNG_COLOR_QR";
    public static final String LAT_LNG_COLOR_REPORTING = "LAT_LNG_COLOR_REPORTING";
    public static final String LAT_LNG_INDEX = "lat_lng_index";
    public static final String LAT_LNG_TYPE = "lat_lng_type_1";
    public static final String LAT_LNG_TYPE_CLASSIC = "lat_lng_type_1_classic";
    public static final String LAT_LNG_TYPE_DT = "lat_lng_type_1_dt";
    public static final String LAT_LNG_TYPE_NC = "lat_lng_type_1_nc";
    public static final String LAT_LNG_TYPE_QR = "lat_lng_type_1_qr";
    public static final String LAT_LNG_TYPE_REPORTING = "lat_lng_type_1_reporting";
    public static final String LOCATION_TYPE = "location_type";
    public static final String LOC_COUNTRY_CODE = "loc_CountryCode";
    public static final String LOC_LINE_1_ADDRESS = "loc_address_line_1";
    public static final String LOC_LINE_2_CITY = "loc_city";
    public static final String LOC_LINE_3_STATE = "loc_state";
    public static final String LOC_LINE_4_COUNTRY = "loc_country";
    public static final String LOC_LINE_5_PINCODE = "loc_pincode";
    public static final String LOGIN_EMAIL = "login_email";
    public static final String LOGO_URI = "logo_uri";
    public static final String LOGO_URI_CLASSIC = "logo_uri_classic";
    public static final String LOGO_URI_DT = "logo_uri_dt";
    public static final String LOGO_URI_NC = "logo_uri_nc";
    public static final String LOGO_URI_REPORTING = "logo_uri_reporting";
    public static final String LONGITUDE = "longitude_1";
    public static final String MAGNETIC_FIELD_COLOR = "MAGNETIC_FIELD_COLOR";
    public static final String MAGNETIC_FIELD_COLOR_CLASSIC = "MAGNETIC_FIELD_COLOR_CLASSIC";
    public static final String MAGNETIC_FIELD_COLOR_NC = "MAGNETIC_FIELD_COLOR_NC";
    public static final String MAGNETIC_FIELD_COLOR_REPORTING = "MAGNETIC_FIELD_COLOR_REPORTING";
    public static final String MAGNETIC_FIELD_VALUE = "magnetic_field_value";
    public static final String MAP_POS = "map_pos";
    public static final String MAP_POS_CLASSIC = "map_pos_CLASSIC";
    public static final String MAP_POS_DT = "map_pos_DT";
    public static final String MAP_POS_NC = "map_pos_NC";
    public static final String MAP_POS_QR = "map_pos_QR";
    public static final String MAP_POS_REPORTING = "map_pos_REPORTING";
    public static final String MAP_POS_TYPE = "map_pos_type";
    public static final String MAP_POS_TYPE_CLASSIC = "map_pos_type_classic";
    public static final String MAP_POS_TYPE_NC = "map_pos_type_nc";
    public static final String MAP_POS_TYPE_QR = "map_pos_type_qr";
    public static final String MAP_POS_TYPE_REPORTING = "map_pos_type_reporting";
    public static final String MAP_TYPE = "map_type";
    public static final String MAP_TYPE_CLUSTER = "Map_Type_Clustering";
    public static final String MAP_TYPE_TEMPLATE = "map_type_template";
    public static final String MAP_TYPE_TEMPLATE_CLASSIC = "map_type_template_classic";
    public static final String MAP_TYPE_TEMPLATE_DT = "map_type_template_dt";
    public static final String MAP_TYPE_TEMPLATE_NC = "map_type_template_nc";
    public static final String MAP_TYPE_TEMPLATE_QR = "map_type_template_qr";
    public static final String MAP_TYPE_TEMPLATE_REPORTING = "map_type_template_reporting";
    public static final String MAP_ZOOM_SCALE = "map_zoom_scale";
    public static final String MAP_ZOOM_SCALE_CLASSIC = "map_zoom_scale_classic";
    public static final String MAP_ZOOM_SCALE_DT = "map_zoom_scale_dt";
    public static final String MAP_ZOOM_SCALE_NC = "map_zoom_scale_nc";
    public static final String MAP_ZOOM_SCALE_QR = "map_zoom_scale_qr";
    public static final String MAP_ZOOM_SCALE_REPORTING = "map_zoom_scale_reporting";
    public static final String MIRROR_VALUE = "MIRROR_VALUE";
    public static final String NOTES_HASHTAG = "notes_hashtag";
    public static final String NOTES_HASHTAG_CLASSIC = "notes_hashtag_classic";
    public static final String NOTES_HASHTAG_COLOR = "NOTES_HASHTAG_COLOR";
    public static final String NOTES_HASHTAG_COLOR_CLASSIC = "NOTES_HASHTAG_COLOR_CLASSIC";
    public static final String NOTES_HASHTAG_COLOR_DT = "NOTES_HASHTAG_COLOR_DT";
    public static final String NOTES_HASHTAG_COLOR_NC = "NOTES_HASHTAG_COLOR_NC";
    public static final String NOTES_HASHTAG_COLOR_QR = "NOTES_HASHTAG_COLOR_QR";
    public static final String NOTES_HASHTAG_COLOR_REPORTING = "NOTES_HASHTAG_COLOR_REPORTING";
    public static final String NOTES_HASHTAG_DT = "notes_hashtag_dt";
    public static final String NOTES_HASHTAG_NC = "notes_hashtag_nc";
    public static final String NOTES_HASHTAG_QR = "notes_hashtag_qr";
    public static final String NOTES_HASHTAG_REPORTING = "notes_hashtag_reporting";
    public static final String NOTES_INDEX = "notes_index";
    public static final String NUMBERING_COLOR = "NUMBERING_COLOR";
    public static final String NUMBERING_COLOR_CLASSIC = "NUMBERING_COLOR_CLASSIC";
    public static final String NUMBERING_COLOR_NC = "NUMBERING_COLOR_NC";
    public static final String NUMBERING_COLOR_REPORTING = "NUMBERING_COLOR_REPORTING";
    public static final String OPEN_TIME = "open_time";
    public static final String ORIENTATION_TYPE = "ORIENTATION_TYPE";
    public static final String ORLABEL_BG_COLOR_NC = "ORLABEL_BG_COLOR_NC";
    public static final String ORLABEL_TEXT_COLOR_NC = "ORLABEL_TEXT_COLOR_NC";
    public static final String PDF_COMPANY_NAME = "pdf_company_name";
    public static final String PDF_DATE_TIME = "pdf_date_time";
    public static final String PDF_LOGO = "pdf_logo";
    public static final String PDF_PROJECT_NAME = "pdf_project_name";
    public static final String PDF_REMARK = "pdf_remark";
    public static final String PDF_REPORT_BY = "pdf_report_by";
    public static final String PDF_SUPERVISOR = "pdf_supervisor";
    public static final String PDF_TITLE = "pdf_title";
    public static final String PERSON_NAME = "PERSON_NAME";
    public static final String PERSON_NAME_CLASSIC = "PERSON_NAME_CLASSIC";
    public static final String PERSON_NAME_COLOR = "PERSON_NAME_COLOR";
    public static final String PERSON_NAME_COLOR_CLASSIC = "PERSON_NAME_COLOR_CLASSIC";
    public static final String PERSON_NAME_COLOR_DT = "PERSON_NAME_COLOR_DT";
    public static final String PERSON_NAME_COLOR_NC = "PERSON_NAME_COLOR_NC";
    public static final String PERSON_NAME_COLOR_REPORTING = "PERSON_NAME_COLOR_REPORTING";
    public static final String PERSON_NAME_DT = "PERSON_NAME_DT";
    public static final String PERSON_NAME_NC = "PERSON_NAME_NC";
    public static final String PERSON_NAME_REPORTING = "PERSON_NAME_REPORTING";
    public static final String PLUSCODE_INDEX = "plus_code_index";
    public static final String PLUS_CODE = "PLUS_CODE";
    public static final String PLUS_CODE_COLOR = "PLUS_CODE_COLOR";
    public static final String PLUS_CODE_COLOR_CLASSIC = "PLUS_CODE_COLOR_CLASSIC";
    public static final String PLUS_CODE_COLOR_NC = "PLUS_CODE_COLOR_NC";
    public static final String PLUS_CODE_COLOR_REPORTING = "PLUS_CODE_COLOR_REPORTING";
    public static final String PLUS_CODE_TYPE = "plusCodeType";
    public static final String PLUS_CODE_TYPE_CLASSIC = "plusCodeType_classic";
    public static final String PLUS_CODE_TYPE_NC = "plusCodeType_nc";
    public static final String PLUS_CODE_TYPE_REPORTING = "plusCodeType_reporting";
    public static final String PREFIX = "PREFIX";
    public static final String PREFIX_CLASSIC = "PREFIX_CLASSIC";
    public static final String PREFIX_NC = "PREFIX_NC";
    public static final String PREFIX_REPORTING = "PREFIX_REPORTING";
    public static final String PRESSURE_COLOR = "PRESSURE_COLOR";
    public static final String PRESSURE_COLOR_CLASSIC = "PRESSURE_COLOR_CLASSIC";
    public static final String PRESSURE_COLOR_NC = "PRESSURE_COLOR_NC";
    public static final String PRESSURE_COLOR_REPORTING = "PRESSURE_COLOR_REPORTING";
    public static final String PRESSURE_SELECT = "pressure_select";
    public static final String PRESSURE_SELECT_CLASSIC = "pressure_select_classic";
    public static final String PRESSURE_SELECT_NC = "pressure_select_nc";
    public static final String PRESSURE_SELECT_REPORTING = "pressure_select_reporting";
    public static final String PRESSURE_VALUE = "Pressure_value";
    public static String QR_SCANNING = "QR_Scanning";
    public static final String REPORT_BACKGROUND_COLOR_REPORTING = "REPORT_BACKGROUND_COLOR_REPORTING";
    public static final String REPORT_COLOR_REPORTING = "REPORT_COLOR_REPORTING";
    public static final String REPORT_TAG_REPORTING = "REPORT_TAG_REPORTING";
    public static final String RVWV = "RVWV";
    public static final String SAF_URI = "saf_gmc_uri";
    public static final String SELECTED_LANGUAGE = "selected_language";
    public static final String SELECTED_LATITUDE = "SELECTED_LATITUDE";
    public static final String SELECTED_LOCATION = "selected_Location";
    public static final String SELECTED_LONGITUDE = "SELECTED_LONGITUDE";
    public static final String SEQUENCE = "SEQUENCE";
    public static final String SEQUENCE_CLASSIC = "SEQUENCE_CLASSIC";
    public static final String SEQUENCE_INDEX = "sn_index";
    public static final String SEQUENCE_NC = "SEQUENCE_NC";
    public static final String SEQUENCE_REPORTING = "SEQUENCE_REPORTING";
    public static final String SEQUENCE_VALUE = "sequence_value";
    public static final String SHORT_ADDRESS_COLOR = "SHORT_ADDRESS_COLOR";
    public static final String SHORT_ADDRESS_COLOR_CLASSIC = "SHORT_ADDRESS_COLOR_CLASSIC";
    public static final String SHORT_ADDRESS_COLOR_DT = "SHORT_ADDRESS_COLOR_dt";
    public static final String SHORT_ADDRESS_COLOR_NC = "SHORT_ADDRESS_COLOR_NC";
    public static final String SHORT_ADDRESS_COLOR_QR = "SHORT_ADDRESS_COLOR_qr";
    public static final String SHORT_ADDRESS_COLOR_REPORTING = "SHORT_ADDRESS_COLOR_REPORTING";
    public static final String SOUNDLEVEL_COLOR = "SOUNDLEVEL_COLOR";
    public static final String SOUNDLEVEL_COLOR_CLASSIC = "SOUNDLEVEL_COLOR_CLASSIC";
    public static final String SOUNDLEVEL_COLOR_NC = "SOUNDLEVEL_COLOR_NC";
    public static final String SOUNDLEVEL_COLOR_REPORTING = "SOUNDLEVEL_COLOR_REPORTING";
    public static final String SOUND_LEVEL = "sound_level";
    public static final String SOUND_VALUE = "SOUND_VALUE";
    public static final String STAMP_FONT_NAME = "stamp_font_name";
    public static final String STAMP_FONT_NAME_CLASSIC = "stamp_font_name_classic";
    public static final String STAMP_FONT_NAME_DT = "stamp_font_name_dt";
    public static final String STAMP_FONT_NAME_NC = "stamp_font_name_nc";
    public static final String STAMP_FONT_NAME_QR = "stamp_font_name_qr";
    public static final String STAMP_FONT_NAME_REPORTING = "stamp_font_name_reporting";
    public static final String STAMP_FONT_STYLE = "stamp_font_style";
    public static final String STAMP_FONT_STYLE_CLASSIC = "stamp_font_style_classic";
    public static final String STAMP_FONT_STYLE_DT = "stamp_font_style_dt";
    public static final String STAMP_FONT_STYLE_NC = "stamp_font_style_nc";
    public static final String STAMP_FONT_STYLE_QR = "stamp_font_style_qr";
    public static final String STAMP_FONT_STYLE_REPORTING = "stamp_font_style_reporting";
    public static final String STAMP_POS = "stamp_pos";
    public static final String STAMP_POS_CLASSIC = "stamp_pos_classic";
    public static final String STAMP_POS_DT = "stamp_pos_dt";
    public static final String STAMP_POS_NC = "stamp_pos_nc";
    public static final String STAMP_POS_QR = "stamp_pos_qr";
    public static final String STAMP_POS_REPORTING = "stamp_pos_reporting";
    public static final String STAMP_SIZE = "stamp_size";
    public static final String STAMP_SIZE_CLASSIC = "stamp_size_classic";
    public static final String STAMP_SIZE_DT = "stamp_size_dt";
    public static final String STAMP_SIZE_NC = "stamp_size_nc";
    public static final String STAMP_SIZE_QR = "stamp_size_qr";
    public static final String STAMP_SIZE_REPORTING = "stamp_size_reporting";
    public static final String SUFFIX = "SUFFIX";
    public static final String SUFFIX_CLASSIC = "SUFFIX_CLASSIC";
    public static final String SUFFIX_NC = "SUFFIX_NC";
    public static final String SUFFIX_REPORTING = "SUFFIX_REPORTING";
    public static final String TEMPLATE_TYPE = "template_type";
    public static final String TEMPRATURE_TYPE = "temprature_type";
    public static final String TEMPRATURE_TYPE_CLASSIC = "temprature_type_classic";
    public static final String TEMPRATURE_TYPE_DT = "temprature_type_dt";
    public static final String TEMPRATURE_TYPE_NC = "temprature_type_nc";
    public static final String TEMPRATURE_TYPE_REPORTING = "temprature_type_reporting";
    public static final String TEMPRETURE_VALUE = "temprature_value";
    public static final String TIMER_VALUE = "TIMER_VALUE";
    public static final String TIMEZONE = "TIME_ZONE";
    public static final String TIMEZONE_CLASSIC = "TIME_ZONE_CLASSIC";
    public static final String TIMEZONE_INDEX = "time_zone_index";
    public static final String TIMEZONE_NC = "TIME_ZONE_NC";
    public static final String TIMEZONE_REPORTING = "TIME_ZONE_REPORTING";
    public static final String TIME_FORMAT_DT = "time_format_dt";
    public static String T_Setting = "T_Setting";
    public static final String USERNAME = "user_name";
    public static String VB_Setting = "VB_Setting";
    public static final String VIDEO_COUNT = "VIDEO_COUNT";
    public static final String VIDEO_QUALITY = "video_quality";
    public static final String WEATHER_COLOR = "WEATHER_COLOR";
    public static final String WEATHER_COLOR_CLASSIC = "WEATHER_COLOR_CLASSIC";
    public static final String WEATHER_COLOR_DT = "WEATHER_COLOR_DT";
    public static final String WEATHER_COLOR_NC = "WEATHER_COLOR_NC";
    public static final String WEATHER_COLOR_REPORTING = "WEATHER_COLOR_REPORTING";
    public static final String WEATHER_ICON = "weather_icon";
    public static final String WHITEBALANCE = "whitebalance";
    public static String WHITEBALANCE_NAME = "WHITEBALANCE_NAME";
    public static final String WIND_COLOR = "WIND_COLOR";
    public static final String WIND_COLOR_CLASSIC = "WIND_COLOR_CLASSIC";
    public static final String WIND_COLOR_NC = "WIND_COLOR_NC";
    public static final String WIND_COLOR_REPORTING = "WIND_COLOR_REPORTING";
    public static final String WIND_SELECT = "wind_select";
    public static final String WIND_SELECT_CLASSIC = "wind_select_classic";
    public static final String WIND_SELECT_NC = "wind_select_nc";
    public static final String WIND_SELECT_REPORTING = "wind_select_reporting";
    public static final String WIND_VALUE = "wind_value";
    public static SharedPreferences myPreference;

    public SP(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context != null) {
            try {
                myPreference = PreferenceManager.getDefaultSharedPreferences(context);
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
    }

    public void clearSharedPreferences(Context context) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public ArrayList<ViewModel> getArrayList(Context context) {
        if (myPreference == null) {
            myPreference = PreferenceManager.getDefaultSharedPreferences(context);
        }
        return (ArrayList) new com.google.gson.a().b(myPreference.getString(FILE_ARRAY_LIST, ""), vz6.get(new vz6<List<ViewModel>>() { // from class: com.gpsmapcamera.geotagginglocationonphoto.helper.SP.1
        }.getType()));
    }

    public ArrayList<String> getArrayList(String str, Context context) {
        int i = myPreference.getInt(str + "_size", 0);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(myPreference.getString(str + "_" + i2, null));
        }
        return arrayList;
    }

    public boolean getBoolean(Context context, String str) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getBoolean(str, false);
    }

    public boolean getBoolean(Context context, String str, boolean z) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getBoolean(str, z);
    }

    public float getFloat(Context context, String str) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getFloat(str, ColumnText.GLOBAL_SPACE_CHAR_RATIO);
    }

    public float getFloat(Context context, String str, float f) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getFloat(str, f);
    }

    public int getInteger(Context context, String str) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getInt(str, 0);
    }

    public int getInteger(Context context, String str, int i) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getInt(str, i);
    }

    public long getLong(Context context, String str, long j) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getLong(str, j);
    }

    public String getString(Context context, String str, String str2) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        return defaultSharedPreferences.getString(str, str2);
    }

    public ArrayList<String> loadImageuriArray(String str, Context context) {
        int i = myPreference.getInt(str + "_size", 0);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(myPreference.getString(str + "_" + i2, null));
        }
        return arrayList;
    }

    public void saveArrayList(Context context, ArrayList<ViewModel> arrayList) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putString(FILE_ARRAY_LIST, new com.google.gson.a().h(arrayList));
        editorEdit.commit();
    }

    public boolean saveImageuriArray(ArrayList<String> arrayList, String str, Context context) {
        SharedPreferences.Editor editorEdit = myPreference.edit();
        editorEdit.putInt(eo7.i(str, ijzi.YIOJAjfk), arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            editorEdit.putString(str + "_" + i, arrayList.get(i));
        }
        return editorEdit.commit();
    }

    public boolean setArrayList(ArrayList<String> arrayList, String str, Context context) {
        SharedPreferences.Editor editorEdit = myPreference.edit();
        editorEdit.putInt(eo7.i(str, "_size"), arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            editorEdit.putString(str + "_" + i, arrayList.get(i));
        }
        return editorEdit.commit();
    }

    public void setBoolean(Context context, String str, boolean z) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public void setFloat(Context context, String str, float f) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putFloat(str, f);
        editorEdit.apply();
    }

    public void setInteger(Context context, String str, int i) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public void setLong(Context context, String str, long j) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public void setString(Context context, String str, String str2) {
        SharedPreferences defaultSharedPreferences = myPreference;
        if (defaultSharedPreferences == null) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            myPreference = defaultSharedPreferences;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}