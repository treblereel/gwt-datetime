package org.jresearch.threetenbp.gwt.client.cldr;

import static org.jresearch.threetenbp.gwt.client.base.Chrono.*;
import static org.jresearch.threetenbp.gwt.client.cldr.ImmutablePatternCoordinates.*;
import static org.jresearch.threetenbp.gwt.client.cldr.LocaleInfo.*;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class PatternInfo {
	public static final Map<String, PatternCoordinates[]> DATE_FULL_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> DATE_LONG_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> DATE_MEDIUM_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> DATE_SHORT_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> DATE_TIME_FULL_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> DATE_TIME_LONG_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> DATE_TIME_MEDIUM_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> DATE_TIME_SHORT_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> TIME_FULL_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> TIME_LONG_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> TIME_MEDIUM_PATTERNS = new HashMap<>();

	public static final Map<String, PatternCoordinates[]> TIME_SHORT_PATTERNS = new HashMap<>();

	static {
		DATE_FULL_PATTERNS.put("EEEE d MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, BR),
				of(JAPANESE, BR),
				of(MINGUO, BR),
				of(THAI_BUDDHIST, FR),
				of(JAPANESE, FR),
				of(JAPANESE, IT),
				of(THAI_BUDDHIST, FY),
				of(JAPANESE, FY),
				of(MINGUO, FY),
				of(THAI_BUDDHIST, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				of(THAI_BUDDHIST, GA),
				});
		DATE_FULL_PATTERNS.put("EEEE, d 'ta'’ MMMM y", new PatternCoordinates[] {
				of(ISO, MT),
				});
		DATE_FULL_PATTERNS.put("EEEE d MMMM y", new PatternCoordinates[] {
				of(ISO, SHI_LATN),
				of(ISO, FF),
				of(ISO, EN_IE),
				of(ISO, BM),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, MUA),
				of(ISO, KOK),
				of(ISO, EWO),
				of(ISO, KAB),
				of(ISO, TO),
				of(ISO, BR),
				of(ISO, SE_FI),
				of(ISO, RN),
				of(ISO, KSF),
				of(ISO, MFE),
				of(ISO, MG),
				of(ISO, DUA),
				of(ISO, SHI),
				of(ISO, KM),
				of(ISO, SV),
				of(ISO, BAS),
				of(ISO, AF_NA),
				of(ISO, FR),
				of(ISO, FR_CA),
				of(ISO, SES),
				of(ISO, IT),
				of(ISO, NMG),
				of(ISO, FY),
				of(ISO, KW),
				of(ISO, YAV),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, LN),
				of(ISO, LU),
				of(ISO, ZGH),
				of(ISO, DJE),
				of(ISO, SG),
				of(ISO, FA),
				of(ISO, NUS),
				of(ISO, NL),
				of(ISO, GA),
				});
		DATE_FULL_PATTERNS.put("y MMMMའི་ཚེས་d, EEEE", new PatternCoordinates[] {
				of(ISO, BO),
				});
		DATE_FULL_PATTERNS.put("dd MMMM y", new PatternCoordinates[] {
				of(ISO, MS_BN),
				});
		DATE_FULL_PATTERNS.put("Gy年M月d日 EEEE", new PatternCoordinates[] {
				of(MINGUO, YUE),
				of(MINGUO, ZH_HANT),
				});
		DATE_FULL_PATTERNS.put("EEEE, སྤྱི་ལོ་y MMMM ཚེས་dd", new PatternCoordinates[] {
				of(ISO, DZ),
				});
		DATE_FULL_PATTERNS.put("d MMMM y, EEEE", new PatternCoordinates[] {
				of(ISO, AZ),
				of(ISO, AZ_CYRL),
				});
		DATE_FULL_PATTERNS.put("d MMMM y EEEE", new PatternCoordinates[] {
				of(ISO, TK),
				of(ISO, TR),
				});
		DATE_FULL_PATTERNS.put("EEEE, dd MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ID),
				of(JAPANESE, ID),
				of(MINGUO, ID),
				of(THAI_BUDDHIST, CA),
				});
		DATE_FULL_PATTERNS.put("y年M月d日EEEE", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, ZH_HANT_HK),
				of(ISO, ZH),
				of(ISO, JA),
				});
		DATE_FULL_PATTERNS.put("EEEEที่ d MMMM ปีGที่ y", new PatternCoordinates[] {
				of(JAPANESE, TH),
				of(MINGUO, TH),
				});
		DATE_FULL_PATTERNS.put("EEEE, dd MMMM, y", new PatternCoordinates[] {
				of(ISO, KA),
				of(ISO, UZ_CYRL),
				});
		DATE_FULL_PATTERNS.put("EEEE d MMMM, y", new PatternCoordinates[] {
				of(ISO, HA_NE),
				of(ISO, HA),
				});
		DATE_FULL_PATTERNS.put("EEEE, d'mh' MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, GD),
				of(JAPANESE, GD),
				of(MINGUO, GD),
				});
		DATE_FULL_PATTERNS.put("EEEE d MMMM 'de' y G", new PatternCoordinates[] {
				of(MINGUO, CA),
				});
		DATE_FULL_PATTERNS.put("EEEE، d MMMM، y", new PatternCoordinates[] {
				of(ISO, UR),
				});
		DATE_FULL_PATTERNS.put("y թ. MMMM d, EEEE", new PatternCoordinates[] {
				of(ISO, HY),
				});
		DATE_FULL_PATTERNS.put("EEEE, y 'mettas' d. MMMM", new PatternCoordinates[] {
				of(ISO, PRG),
				});
		DATE_FULL_PATTERNS.put("Gy年M月d日EEEE", new PatternCoordinates[] {
				of(THAI_BUDDHIST, YUE_HANS),
				of(JAPANESE, YUE_HANS),
				of(MINGUO, YUE_HANS),
				of(THAI_BUDDHIST, YUE),
				of(JAPANESE, YUE),
				of(THAI_BUDDHIST, ZH_HANT),
				of(JAPANESE, ZH_HANT),
				of(THAI_BUDDHIST, ZH),
				of(JAPANESE, ZH),
				of(MINGUO, ZH),
				of(JAPANESE, JA),
				of(MINGUO, JA),
				});
		DATE_FULL_PATTERNS.put("y年M月d日 EEEE", new PatternCoordinates[] {
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				});
		DATE_FULL_PATTERNS.put("cccc, MMMM d. y", new PatternCoordinates[] {
				of(ISO, SMN),
				});
		DATE_FULL_PATTERNS.put("EEEE d. MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, CS),
				of(MINGUO, CS),
				of(THAI_BUDDHIST, GSW),
				of(JAPANESE, DA),
				of(THAI_BUDDHIST, NB),
				of(JAPANESE, NB),
				of(MINGUO, NB),
				});
		DATE_FULL_PATTERNS.put("EEEE, dd. MMMM y.", new PatternCoordinates[] {
				of(ISO, SR),
				of(ISO, SR_LATN),
				of(ISO, BS_CYRL),
				});
		DATE_FULL_PATTERNS.put("y 'ж'. d MMMM, EEEE", new PatternCoordinates[] {
				of(ISO, KK),
				});
		DATE_FULL_PATTERNS.put("EEEE, MMMM dd 'lia', G y", new PatternCoordinates[] {
				of(JAPANESE, EE),
				of(MINGUO, EE),
				});
		DATE_FULL_PATTERNS.put("EEEE, d. MMMM y.", new PatternCoordinates[] {
				of(ISO, HR),
				of(ISO, BS),
				});
		DATE_FULL_PATTERNS.put("y, MMMM d, EEEE", new PatternCoordinates[] {
				of(ISO, ML),
				});
		DATE_FULL_PATTERNS.put("y 'оны' MMMM'ын' d, EEEE 'гараг'", new PatternCoordinates[] {
				of(ISO, MN),
				});
		DATE_FULL_PATTERNS.put("EEEE, MMMM dd, y", new PatternCoordinates[] {
				of(ISO, SO),
				});
		DATE_FULL_PATTERNS.put("cccc d. MMMM y", new PatternCoordinates[] {
				of(ISO, FI),
				});
		DATE_FULL_PATTERNS.put("EEEE 'le' d 'de' MMMM y", new PatternCoordinates[] {
				of(ISO, IA),
				});
		DATE_FULL_PATTERNS.put("G y. MMMM d., EEEE", new PatternCoordinates[] {
				of(JAPANESE, HU),
				});
		DATE_FULL_PATTERNS.put("EEEE, d. MMMM y. G", new PatternCoordinates[] {
				of(JAPANESE, HR),
				});
		DATE_FULL_PATTERNS.put("EEEE dd MMMM y", new PatternCoordinates[] {
				of(ISO, AF),
				of(ISO, GV),
				of(ISO, KL),
				of(ISO, KKJ),
				});
		DATE_FULL_PATTERNS.put("EEEE፣ dd MMMM መዓልቲ y G", new PatternCoordinates[] {
				of(ISO, TI),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM y 'р'.", new PatternCoordinates[] {
				of(ISO, UK),
				});
		DATE_FULL_PATTERNS.put("y MMMM d, EEEE", new PatternCoordinates[] {
				of(ISO, SI),
				of(ISO, AM),
				of(ISO, SE),
				of(ISO, XH),
				of(ISO, ROOT),
				of(ISO, SN),
				of(ISO, RW),
				of(ISO, II),
				of(ISO, NE),
				of(ISO, LRC),
				of(ISO, SD),
				of(ISO, CKB),
				});
		DATE_FULL_PATTERNS.put("EEEE, d-MMMM, y", new PatternCoordinates[] {
				of(ISO, UZ),
				});
		DATE_FULL_PATTERNS.put("EEEE, d-'a' 'de' MMMM y", new PatternCoordinates[] {
				of(ISO, EO),
				});
		DATE_FULL_PATTERNS.put("EEEE د y د MMMM d", new PatternCoordinates[] {
				of(ISO, PS),
				});
		DATE_FULL_PATTERNS.put("EEEE, MMMM d 'lia' y", new PatternCoordinates[] {
				of(ISO, EE),
				});
		DATE_FULL_PATTERNS.put("EEEE, dd MMMM y 'г'. G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, MK),
				});
		DATE_FULL_PATTERNS.put("EEEE, dd MMMM 'de' y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, AST),
				of(MINGUO, AST),
				});
		DATE_FULL_PATTERNS.put("y('e')'ko' MMMM'ren' d('a'), EEEE", new PatternCoordinates[] {
				of(ISO, EU),
				});
		DATE_FULL_PATTERNS.put("EEEE، d MMMM y", new PatternCoordinates[] {
				of(ISO, AR),
				});
		DATE_FULL_PATTERNS.put("d, MMMM y, EEEE", new PatternCoordinates[] {
				of(ISO, TE),
				});
		DATE_FULL_PATTERNS.put("G y MMMM d, EEEE", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				});
		DATE_FULL_PATTERNS.put("EEEE, d 'de' MMMM 'de' y", new PatternCoordinates[] {
				of(ISO, PT_PT),
				of(ISO, SEH),
				of(ISO, GL),
				of(ISO, PT),
				of(ISO, ES_419),
				of(ISO, ES),
				});
		DATE_FULL_PATTERNS.put("EEEE, dטן MMMM y", new PatternCoordinates[] {
				of(ISO, YI),
				});
		DATE_FULL_PATTERNS.put("EEEE, 'dä' d. MMMM y", new PatternCoordinates[] {
				of(ISO, KSH),
				});
		DATE_FULL_PATTERNS.put("EEEE, y. 'gada' d. MMMM", new PatternCoordinates[] {
				of(ISO, LV),
				});
		DATE_FULL_PATTERNS.put("y d-MMMM، EEEE", new PatternCoordinates[] {
				of(ISO, UG),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM y 'г'.", new PatternCoordinates[] {
				of(ISO, BG),
				of(ISO, RU),
				of(ISO, BE),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM, y 'аз'", new PatternCoordinates[] {
				of(ISO, OS),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM, y G", new PatternCoordinates[] {
				of(JAPANESE, EL),
				});
		DATE_FULL_PATTERNS.put("y-'ж'., d-MMMM, EEEE", new PatternCoordinates[] {
				of(ISO, KY),
				});
		DATE_FULL_PATTERNS.put("EEEE , 'lyɛ'̌ʼ d 'na' MMMM, y", new PatternCoordinates[] {
				of(ISO, NNH),
				});
		DATE_FULL_PATTERNS.put("EEEE, d 'di' MMMM 'di' y", new PatternCoordinates[] {
				of(ISO, KEA),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM 'de' y", new PatternCoordinates[] {
				of(ISO, AST),
				of(ISO, CA),
				});
		DATE_FULL_PATTERNS.put("EEEE, y MMMM dd", new PatternCoordinates[] {
				of(ISO, MGO),
				of(ISO, JGO),
				of(ISO, AK),
				});
		DATE_FULL_PATTERNS.put("y MMMM'a' 'd'. d'id'", new PatternCoordinates[] {
				of(ISO, VO),
				});
		DATE_FULL_PATTERNS.put("EEEE, 'ngày' dd MMMM 'năm' y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, VI),
				of(JAPANESE, VI),
				of(MINGUO, VI),
				});
		DATE_FULL_PATTERNS.put("cccc d. MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FI),
				of(JAPANESE, FI),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMM y", new PatternCoordinates[] {
				of(ISO, YO_BJ),
				of(ISO, YO),
				});
		DATE_FULL_PATTERNS.put("EEEE, d. MMMM y", new PatternCoordinates[] {
				of(ISO, DSB),
				of(ISO, ET),
				of(ISO, FO),
				of(ISO, GSW),
				of(ISO, IS),
				of(ISO, HSB),
				of(ISO, WAE),
				of(ISO, LB),
				of(ISO, DE),
				});
		DATE_FULL_PATTERNS.put("EEEE ທີ d MMMM G y", new PatternCoordinates[] {
				of(ISO, LO),
				});
		DATE_FULL_PATTERNS.put("EEEE, MMMM d، y G", new PatternCoordinates[] {
				of(JAPANESE, UG),
				});
		DATE_FULL_PATTERNS.put("y년 M월 d일 EEEE", new PatternCoordinates[] {
				of(ISO, KO),
				});
		DATE_FULL_PATTERNS.put("EEEE, 'de' d. MMMM y", new PatternCoordinates[] {
				of(ISO, NDS),
				});
		DATE_FULL_PATTERNS.put("EEEE, d'mh' MMMM y", new PatternCoordinates[] {
				of(ISO, GD),
				});
		DATE_FULL_PATTERNS.put("y 'm'. MMMM d 'd'., EEEE", new PatternCoordinates[] {
				of(ISO, LT),
				});
		DATE_FULL_PATTERNS.put("d MMMM, y 'ел', EEEE", new PatternCoordinates[] {
				of(ISO, TT),
				});
		DATE_FULL_PATTERNS.put("EEEE d. MMMM y", new PatternCoordinates[] {
				of(ISO, CS),
				of(ISO, NN),
				of(ISO, SK),
				of(ISO, NB),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM y", new PatternCoordinates[] {
				of(ISO, IT_CH),
				of(ISO, HI),
				of(ISO, MAI),
				of(ISO, LAG),
				of(ISO, EN_AE),
				of(ISO, BEM),
				of(ISO, HAW),
				of(ISO, VAI),
				of(ISO, EBU),
				of(ISO, NAQ),
				of(ISO, RO),
				of(ISO, MAS),
				of(ISO, ASA),
				of(ISO, VUN),
				of(ISO, VAI_LATN),
				of(ISO, DAV),
				of(ISO, FR_CH),
				of(ISO, JMC),
				of(ISO, PL),
				of(ISO, RWK),
				of(ISO, SAQ),
				of(ISO, LUO),
				of(ISO, KDE),
				of(ISO, SW),
				of(ISO, MGH),
				of(ISO, PA),
				of(ISO, PCM),
				of(ISO, MI),
				of(ISO, EN_GB),
				of(ISO, GUZ),
				of(ISO, EL),
				of(ISO, LUY),
				of(ISO, JV),
				of(ISO, NYN),
				of(ISO, SAT),
				of(ISO, MER),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, CY),
				of(ISO, ND),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, XOG),
				of(ISO, SBP),
				of(ISO, LG),
				of(ISO, SD_DEVA),
				of(ISO, CGG),
				of(ISO, KI),
				of(ISO, TZM),
				of(ISO, EN_001),
				of(ISO, IG),
				of(ISO, TEO),
				of(ISO, SU),
				of(ISO, SQ),
				of(ISO, MK),
				of(ISO, KAM),
				of(ISO, MS),
				});
		DATE_FULL_PATTERNS.put("GGGGy年M月d日EEEE", new PatternCoordinates[] {
				of(THAI_BUDDHIST, JA),
				});
		DATE_FULL_PATTERNS.put("EEEE dd 'de' MMMM 'de' y", new PatternCoordinates[] {
				of(ISO, ES_HN),
				});
		DATE_FULL_PATTERNS.put("EEEE, MMMM d, y", new PatternCoordinates[] {
				of(ISO, CEB),
				of(ISO, ZU),
				of(ISO, OR),
				of(ISO, KN),
				of(ISO, KS),
				of(ISO, CHR),
				of(ISO, EN_CA),
				of(ISO, FIL),
				of(ISO, EN),
				of(ISO, OM),
				of(ISO, LKT),
				of(ISO, BRX),
				});
		DATE_FULL_PATTERNS.put("y၊ MMMM d၊ EEEE", new PatternCoordinates[] {
				of(ISO, MY),
				});
		DATE_FULL_PATTERNS.put("EEEEที่ d MMMM G y", new PatternCoordinates[] {
				of(THAI_BUDDHIST, TH),
				of(ISO, TH),
				});
		DATE_FULL_PATTERNS.put("d MMMM y G EEEE", new PatternCoordinates[] {
				of(JAPANESE, TR),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM, y", new PatternCoordinates[] {
				of(ISO, VI),
				of(ISO, TA),
				of(ISO, GU),
				of(ISO, BN),
				of(ISO, AS),
				of(ISO, CCP),
				of(ISO, QU),
				of(ISO, EN_IN),
				of(ISO, MR),
				});
		DATE_FULL_PATTERNS.put("EEEE, 'ils' d MMMM y", new PatternCoordinates[] {
				of(ISO, RM),
				});
		DATE_FULL_PATTERNS.put("EEEE, d בMMMM y", new PatternCoordinates[] {
				of(ISO, HE),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM 'л'. y.", new PatternCoordinates[] {
				of(ISO, CU),
				});
		DATE_FULL_PATTERNS.put("y 'сыл' MMMM d 'күнэ', EEEE", new PatternCoordinates[] {
				of(ISO, SAH),
				});
		DATE_FULL_PATTERNS.put("EEEE, dd MMMM y", new PatternCoordinates[] {
				of(ISO, ID),
				of(ISO, EN_BW),
				of(ISO, PA_ARAB),
				of(ISO, EN_ZA),
				of(ISO, EN_ZW),
				of(ISO, EN_BZ),
				of(ISO, MS_ID),
				of(ISO, TG),
				});
		DATE_FULL_PATTERNS.put("EEEE፣ d MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, AM),
				});
		DATE_FULL_PATTERNS.put("EEEE d 'di' MMMM 'dal' y", new PatternCoordinates[] {
				of(ISO, FUR),
				});
		DATE_FULL_PATTERNS.put("EEEE, d. MMMM y G", new PatternCoordinates[] {
				of(JAPANESE, CS),
				of(THAI_BUDDHIST, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				of(THAI_BUDDHIST, KSH),
				of(JAPANESE, LB),
				of(JAPANESE, DE),
				});
		DATE_FULL_PATTERNS.put("EEEE, MMMM d, y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FIL),
				of(MINGUO, FIL),
				of(JAPANESE, EN),
				of(JAPANESE, SR),
				of(JAPANESE, SR_LATN),
				of(JAPANESE, BS_CYRL),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMM, y", new PatternCoordinates[] {
				of(ISO, WO),
				});
		DATE_FULL_PATTERNS.put("EEEE, dd. MMMM y", new PatternCoordinates[] {
				of(ISO, SL),
				});
		DATE_FULL_PATTERNS.put("EEEE, d MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, RO),
				of(JAPANESE, PL),
				of(THAI_BUDDHIST, EL),
				of(THAI_BUDDHIST, BE),
				of(JAPANESE, MS),
				});
		DATE_FULL_PATTERNS.put("y نچی ییل d نچی MMMM EEEE کونی", new PatternCoordinates[] {
				of(ISO, UZ_ARAB),
				});
		DATE_FULL_PATTERNS.put("EEEE 'den' d. MMMM y", new PatternCoordinates[] {
				of(ISO, DA),
				});
		DATE_FULL_PATTERNS.put("MMMM d, y, EEEE", new PatternCoordinates[] {
				of(ISO, MNI),
				});
		DATE_FULL_PATTERNS.put("EEEE, d 'de' MMMM 'de' y G", new PatternCoordinates[] {
				of(JAPANESE, PT),
				of(JAPANESE, ES),
				});
		DATE_FULL_PATTERNS.put("y. MMMM d., EEEE", new PatternCoordinates[] {
				of(ISO, HU),
				});
		DATE_LONG_PATTERNS.put("'Ngày' dd 'tháng' M 'năm' y G", new PatternCoordinates[] {
				of(JAPANESE, VI),
				});
		DATE_LONG_PATTERNS.put("d MMMM y 'г'.", new PatternCoordinates[] {
				of(ISO, BG),
				of(ISO, RU),
				of(ISO, BE),
				});
		DATE_LONG_PATTERNS.put("d نچی MMMM y", new PatternCoordinates[] {
				of(ISO, UZ_ARAB),
				});
		DATE_LONG_PATTERNS.put("d MMMM, y G", new PatternCoordinates[] {
				of(JAPANESE, EL),
				});
		DATE_LONG_PATTERNS.put("y. 'gada' d. MMMM", new PatternCoordinates[] {
				of(ISO, LV),
				});
		DATE_LONG_PATTERNS.put("dd MMMM y", new PatternCoordinates[] {
				of(ISO, EN_BW),
				of(ISO, TI),
				of(ISO, EN_MT),
				of(ISO, AF),
				of(ISO, EN_ZA),
				of(ISO, GV),
				of(ISO, KL),
				of(ISO, EN_ZW),
				of(ISO, OM),
				of(ISO, EN_BZ),
				of(ISO, SO),
				of(ISO, TG),
				});
		DATE_LONG_PATTERNS.put("d-MMMM, y", new PatternCoordinates[] {
				of(ISO, UZ),
				});
		DATE_LONG_PATTERNS.put("d. MMMM y", new PatternCoordinates[] {
				of(ISO, DSB),
				of(ISO, CS),
				of(ISO, FI),
				of(ISO, ET),
				of(ISO, NDS),
				of(ISO, NN),
				of(ISO, FO),
				of(ISO, GSW),
				of(ISO, SK),
				of(ISO, IS),
				of(ISO, DA),
				of(ISO, HSB),
				of(ISO, KSH),
				of(ISO, WAE),
				of(ISO, NB),
				of(ISO, LB),
				of(ISO, DE),
				});
		DATE_LONG_PATTERNS.put("y年M月d日", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				of(ISO, ZH),
				of(ISO, JA),
				});
		DATE_LONG_PATTERNS.put("d 'ta'’ MMMM y", new PatternCoordinates[] {
				of(ISO, MT),
				});
		DATE_LONG_PATTERNS.put("d 'de' MMMM 'de' y", new PatternCoordinates[] {
				of(ISO, PT_PT),
				of(ISO, SEH),
				of(ISO, GL),
				of(ISO, PT),
				of(ISO, ES_419),
				of(ISO, ES),
				});
		DATE_LONG_PATTERNS.put("d MMMM، y", new PatternCoordinates[] {
				of(ISO, UR),
				});
		DATE_LONG_PATTERNS.put("d 'de' MMMM y", new PatternCoordinates[] {
				of(ISO, IA),
				});
		DATE_LONG_PATTERNS.put("y၊ d MMMM", new PatternCoordinates[] {
				of(ISO, MY),
				});
		DATE_LONG_PATTERNS.put("dd MMMM, y թ.", new PatternCoordinates[] {
				of(ISO, HY),
				});
		DATE_LONG_PATTERNS.put("d MMMM 'de' y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, AST),
				of(MINGUO, AST),
				of(MINGUO, CA),
				});
		DATE_LONG_PATTERNS.put("dd. MMMM y", new PatternCoordinates[] {
				of(ISO, SL),
				});
		DATE_LONG_PATTERNS.put("d 'de' MMMM 'de' y G", new PatternCoordinates[] {
				of(JAPANESE, PT),
				of(JAPANESE, ES),
				});
		DATE_LONG_PATTERNS.put("د y د MMMM d", new PatternCoordinates[] {
				of(ISO, PS),
				});
		DATE_LONG_PATTERNS.put("y-MMMM-dd", new PatternCoordinates[] {
				of(ISO, EO),
				});
		DATE_LONG_PATTERNS.put("d בMMMM y", new PatternCoordinates[] {
				of(ISO, HE),
				});
		DATE_LONG_PATTERNS.put("MMMM d، y G", new PatternCoordinates[] {
				of(JAPANESE, UG),
				});
		DATE_LONG_PATTERNS.put("G y MMMM d", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				});
		DATE_LONG_PATTERNS.put("y 'оны' MMMM'ын' d", new PatternCoordinates[] {
				of(ISO, MN),
				});
		DATE_LONG_PATTERNS.put("dd MMMM y 'г'. G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, MK),
				});
		DATE_LONG_PATTERNS.put("d MMMM y 'р'.", new PatternCoordinates[] {
				of(ISO, UK),
				});
		DATE_LONG_PATTERNS.put("d MMMM, y 'ел'", new PatternCoordinates[] {
				of(ISO, TT),
				});
		DATE_LONG_PATTERNS.put("སྤྱི་ལོ་y MMMMའི་ཚེས་d", new PatternCoordinates[] {
				of(ISO, BO),
				});
		DATE_LONG_PATTERNS.put("dی MMMMی y", new PatternCoordinates[] {
				of(ISO, CKB),
				});
		DATE_LONG_PATTERNS.put("GGGGy年M月d日", new PatternCoordinates[] {
				of(THAI_BUDDHIST, JA),
				});
		DATE_LONG_PATTERNS.put("dd. MMMM y.", new PatternCoordinates[] {
				of(ISO, SR),
				of(ISO, SR_LATN),
				of(ISO, BS_CYRL),
				});
		DATE_LONG_PATTERNS.put("MMMM d 'lia' y", new PatternCoordinates[] {
				of(ISO, EE),
				});
		DATE_LONG_PATTERNS.put("Gy年M月d日", new PatternCoordinates[] {
				of(THAI_BUDDHIST, YUE_HANS),
				of(JAPANESE, YUE_HANS),
				of(MINGUO, YUE_HANS),
				of(THAI_BUDDHIST, YUE),
				of(JAPANESE, YUE),
				of(MINGUO, YUE),
				of(THAI_BUDDHIST, ZH_HANT),
				of(JAPANESE, ZH_HANT),
				of(MINGUO, ZH_HANT),
				of(THAI_BUDDHIST, ZH),
				of(JAPANESE, ZH),
				of(MINGUO, ZH),
				of(JAPANESE, JA),
				of(MINGUO, JA),
				});
		DATE_LONG_PATTERNS.put("dטן MMMM y", new PatternCoordinates[] {
				of(ISO, YI),
				});
		DATE_LONG_PATTERNS.put("སྤྱི་ལོ་y MMMM ཚེས་ dd", new PatternCoordinates[] {
				of(ISO, DZ),
				});
		DATE_LONG_PATTERNS.put("y 'm'. MMMM d 'd'.", new PatternCoordinates[] {
				of(ISO, LT),
				});
		DATE_LONG_PATTERNS.put("y-'ж'., d-MMMM", new PatternCoordinates[] {
				of(ISO, KY),
				});
		DATE_LONG_PATTERNS.put("MMMM d 'lia', G y", new PatternCoordinates[] {
				of(JAPANESE, EE),
				of(MINGUO, EE),
				});
		DATE_LONG_PATTERNS.put("G y. MMMM d.", new PatternCoordinates[] {
				of(JAPANESE, HU),
				});
		DATE_LONG_PATTERNS.put("d-MMMM، y", new PatternCoordinates[] {
				of(ISO, UG),
				});
		DATE_LONG_PATTERNS.put("y 'mettas' d. MMMM", new PatternCoordinates[] {
				of(ISO, PRG),
				});
		DATE_LONG_PATTERNS.put("d. MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, CS),
				of(JAPANESE, CS),
				of(MINGUO, CS),
				of(THAI_BUDDHIST, FI),
				of(JAPANESE, FI),
				of(THAI_BUDDHIST, GSW),
				of(THAI_BUDDHIST, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				of(JAPANESE, DA),
				of(THAI_BUDDHIST, NB),
				of(JAPANESE, NB),
				of(MINGUO, NB),
				of(JAPANESE, LB),
				of(JAPANESE, DE),
				});
		DATE_LONG_PATTERNS.put("d MMMM y", new PatternCoordinates[] {
				of(ISO, SHI_LATN),
				of(ISO, FF),
				of(ISO, HI),
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, LO),
				of(ISO, BM),
				of(ISO, ID),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, MUA),
				of(ISO, MAI),
				of(ISO, LAG),
				of(ISO, KOK),
				of(ISO, EWO),
				of(ISO, KAB),
				of(ISO, EN_AE),
				of(ISO, BEM),
				of(ISO, TO),
				of(ISO, BR),
				of(ISO, HAW),
				of(ISO, VAI),
				of(ISO, EBU),
				of(ISO, SE_FI),
				of(ISO, NAQ),
				of(ISO, PA_ARAB),
				of(ISO, RO),
				of(ISO, RN),
				of(ISO, MAS),
				of(ISO, ASA),
				of(ISO, AM),
				of(ISO, VUN),
				of(ISO, KSF),
				of(ISO, MFE),
				of(ISO, VAI_LATN),
				of(ISO, DAV),
				of(ISO, MG),
				of(ISO, JMC),
				of(ISO, PL),
				of(THAI_BUDDHIST, TH),
				of(ISO, RWK),
				of(ISO, DUA),
				of(ISO, SAQ),
				of(ISO, LUO),
				of(ISO, SHI),
				of(ISO, KDE),
				of(ISO, KM),
				of(ISO, SV),
				of(ISO, BAS),
				of(ISO, SW),
				of(ISO, MGH),
				of(ISO, PA),
				of(ISO, PCM),
				of(ISO, AF_NA),
				of(ISO, FR),
				of(ISO, MI),
				of(ISO, FR_CA),
				of(ISO, EN_GB),
				of(ISO, GUZ),
				of(ISO, SES),
				of(ISO, EL),
				of(ISO, IT),
				of(ISO, LUY),
				of(ISO, NMG),
				of(ISO, FY),
				of(ISO, JV),
				of(ISO, KW),
				of(ISO, NYN),
				of(ISO, SAT),
				of(ISO, MER),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, CY),
				of(ISO, ND),
				of(ISO, AZ_CYRL),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, XOG),
				of(ISO, SBP),
				of(ISO, YAV),
				of(ISO, LG),
				of(ISO, QU),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, SD_DEVA),
				of(ISO, RM),
				of(ISO, LN),
				of(ISO, CGG),
				of(ISO, LU),
				of(ISO, KKJ),
				of(ISO, KI),
				of(ISO, TZM),
				of(ISO, TR),
				of(ISO, EN_001),
				of(ISO, ZGH),
				of(ISO, AR),
				of(ISO, DJE),
				of(ISO, SG),
				of(ISO, FA),
				of(ISO, IG),
				of(ISO, TEO),
				of(ISO, NUS),
				of(ISO, SU),
				of(ISO, SQ),
				of(ISO, MK),
				of(ISO, KAM),
				of(ISO, NL),
				of(ISO, MS),
				of(ISO, GA),
				});
		DATE_LONG_PATTERNS.put("d MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ID),
				of(JAPANESE, ID),
				of(MINGUO, ID),
				of(THAI_BUDDHIST, BR),
				of(JAPANESE, BR),
				of(MINGUO, BR),
				of(THAI_BUDDHIST, RO),
				of(THAI_BUDDHIST, AM),
				of(JAPANESE, PL),
				of(THAI_BUDDHIST, FR),
				of(JAPANESE, FR),
				of(THAI_BUDDHIST, EL),
				of(THAI_BUDDHIST, FY),
				of(JAPANESE, FY),
				of(MINGUO, FY),
				of(THAI_BUDDHIST, CA),
				of(JAPANESE, TR),
				of(THAI_BUDDHIST, BE),
				of(THAI_BUDDHIST, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				of(JAPANESE, MS),
				of(THAI_BUDDHIST, GA),
				});
		DATE_LONG_PATTERNS.put("d MMMM G y", new PatternCoordinates[] {
				of(ISO, TH),
				});
		DATE_LONG_PATTERNS.put("d. MMMM y. G", new PatternCoordinates[] {
				of(JAPANESE, HR),
				});
		DATE_LONG_PATTERNS.put("dd MMMM y G", new PatternCoordinates[] {
				of(JAPANESE, IT),
				});
		DATE_LONG_PATTERNS.put("d MMM y", new PatternCoordinates[] {
				of(ISO, YO_BJ),
				of(ISO, YO),
				});
		DATE_LONG_PATTERNS.put("dd 'de' MMMM 'de' y", new PatternCoordinates[] {
				of(ISO, ES_HN),
				});
		DATE_LONG_PATTERNS.put("MMMM d, y", new PatternCoordinates[] {
				of(ISO, CEB),
				of(ISO, ZU),
				of(ISO, OR),
				of(ISO, KN),
				of(ISO, KS),
				of(ISO, CHR),
				of(ISO, EN_CA),
				of(ISO, FIL),
				of(ISO, EN),
				of(ISO, MNI),
				of(ISO, LKT),
				of(ISO, BRX),
				});
		DATE_LONG_PATTERNS.put("y('e')'ko' MMMM'ren' d('a')", new PatternCoordinates[] {
				of(ISO, EU),
				});
		DATE_LONG_PATTERNS.put("MMMM d. y", new PatternCoordinates[] {
				of(ISO, SMN),
				});
		DATE_LONG_PATTERNS.put("y, MMMM d", new PatternCoordinates[] {
				of(ISO, ML),
				of(ISO, SAH),
				});
		DATE_LONG_PATTERNS.put("d MMMM 'de' y", new PatternCoordinates[] {
				of(ISO, AST),
				of(ISO, CA),
				});
		DATE_LONG_PATTERNS.put("y 'ж'. d MMMM", new PatternCoordinates[] {
				of(ISO, KK),
				});
		DATE_LONG_PATTERNS.put("'lyɛ'̌ʼ d 'na' MMMM, y", new PatternCoordinates[] {
				of(ISO, NNH),
				});
		DATE_LONG_PATTERNS.put("d MMMM, y", new PatternCoordinates[] {
				of(ISO, TE),
				of(ISO, VI),
				of(ISO, TA),
				of(ISO, WO),
				of(ISO, KA),
				of(ISO, GU),
				of(ISO, BN),
				of(ISO, AS),
				of(ISO, CCP),
				of(ISO, HA_NE),
				of(ISO, HA),
				of(ISO, UZ_CYRL),
				of(ISO, MR),
				});
		DATE_LONG_PATTERNS.put("y MMMM d", new PatternCoordinates[] {
				of(ISO, SI),
				of(ISO, MGO),
				of(ISO, JGO),
				of(ISO, SE),
				of(ISO, CU),
				of(ISO, XH),
				of(ISO, ROOT),
				of(ISO, SN),
				of(ISO, RW),
				of(ISO, AK),
				of(ISO, VO),
				of(ISO, II),
				of(ISO, NE),
				of(ISO, LRC),
				of(ISO, SD),
				});
		DATE_LONG_PATTERNS.put("MMMM d, y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FIL),
				of(MINGUO, FIL),
				of(JAPANESE, EN),
				of(JAPANESE, SR),
				of(JAPANESE, SR_LATN),
				of(JAPANESE, BS_CYRL),
				});
		DATE_LONG_PATTERNS.put("y. MMMM d.", new PatternCoordinates[] {
				of(ISO, HU),
				});
		DATE_LONG_PATTERNS.put("d MMMM, y 'аз'", new PatternCoordinates[] {
				of(ISO, OS),
				});
		DATE_LONG_PATTERNS.put("d 'di' MMMM 'di' y", new PatternCoordinates[] {
				of(ISO, KEA),
				});
		DATE_LONG_PATTERNS.put("y년 M월 d일", new PatternCoordinates[] {
				of(ISO, KO),
				});
		DATE_LONG_PATTERNS.put("d. MMMM y.", new PatternCoordinates[] {
				of(ISO, HR),
				of(ISO, BS),
				});
		DATE_LONG_PATTERNS.put("d'mh' MMMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, GD),
				of(JAPANESE, GD),
				of(MINGUO, GD),
				});
		DATE_LONG_PATTERNS.put("d 'di' MMMM 'dal' y", new PatternCoordinates[] {
				of(ISO, FUR),
				});
		DATE_LONG_PATTERNS.put("d'mh' MMMM y", new PatternCoordinates[] {
				of(ISO, GD),
				});
		DATE_LONG_PATTERNS.put("d MMMM ปีG y", new PatternCoordinates[] {
				of(JAPANESE, TH),
				of(MINGUO, TH),
				});
		DATE_MEDIUM_PATTERNS.put("d. MMM y.", new PatternCoordinates[] {
				of(ISO, HR),
				of(ISO, BS),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM, y G", new PatternCoordinates[] {
				of(JAPANESE, EL),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM 'de' y", new PatternCoordinates[] {
				of(ISO, ES_BO),
				});
		DATE_MEDIUM_PATTERNS.put("d. MMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, GSW),
				of(JAPANESE, DA),
				of(THAI_BUDDHIST, NB),
				of(JAPANESE, NB),
				of(MINGUO, NB),
				});
		DATE_MEDIUM_PATTERNS.put("y MMM d", new PatternCoordinates[] {
				of(ISO, SI),
				of(ISO, MGO),
				of(ISO, JGO),
				of(ISO, SE),
				of(ISO, MG),
				of(ISO, CU),
				of(ISO, XH),
				of(ISO, ROOT),
				of(ISO, SN),
				of(ISO, RW),
				of(ISO, AK),
				of(ISO, II),
				of(ISO, NE),
				of(ISO, PS),
				of(ISO, LRC),
				of(ISO, SD),
				of(ISO, CKB),
				});
		DATE_MEDIUM_PATTERNS.put("y. M. d.", new PatternCoordinates[] {
				of(ISO, KO),
				});
		DATE_MEDIUM_PATTERNS.put("dd MMM y 'аз'", new PatternCoordinates[] {
				of(ISO, OS),
				});
		DATE_MEDIUM_PATTERNS.put("y-MM-dd", new PatternCoordinates[] {
				of(ISO, LT),
				});
		DATE_MEDIUM_PATTERNS.put("dd.MM.y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, RO),
				of(JAPANESE, LB),
				of(JAPANESE, DE),
				});
		DATE_MEDIUM_PATTERNS.put("MMM dd, y", new PatternCoordinates[] {
				of(ISO, GV),
				});
		DATE_MEDIUM_PATTERNS.put("y 'оны' MMM'ын' d", new PatternCoordinates[] {
				of(ISO, MN),
				});
		DATE_MEDIUM_PATTERNS.put("dd-MM-y", new PatternCoordinates[] {
				of(ISO, KOK),
				of(ISO, ES_CL),
				of(ISO, AS),
				of(ISO, RM),
				});
		DATE_MEDIUM_PATTERNS.put("d.MM.y 'г'.", new PatternCoordinates[] {
				of(ISO, BG),
				});
		DATE_MEDIUM_PATTERNS.put("y年M月d日", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				of(ISO, ZH),
				});
		DATE_MEDIUM_PATTERNS.put("y. MMM d.", new PatternCoordinates[] {
				of(ISO, HU),
				});
		DATE_MEDIUM_PATTERNS.put("MMM d, y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FIL),
				of(MINGUO, FIL),
				of(JAPANESE, EN),
				of(JAPANESE, SR),
				of(JAPANESE, SR_LATN),
				of(JAPANESE, BS_CYRL),
				});
		DATE_MEDIUM_PATTERNS.put("d.M.y", new PatternCoordinates[] {
				of(ISO, DSB),
				of(ISO, FI),
				of(ISO, HSB),
				of(ISO, MK),
				});
		DATE_MEDIUM_PATTERNS.put("dd.MM.y", new PatternCoordinates[] {
				of(ISO, FO),
				of(ISO, GSW),
				of(ISO, DE),
				});
		DATE_MEDIUM_PATTERNS.put("d 'de' MMM 'de' y", new PatternCoordinates[] {
				of(ISO, SEH),
				of(ISO, GL),
				of(ISO, PT),
				});
		DATE_MEDIUM_PATTERNS.put("dטן MMM y", new PatternCoordinates[] {
				of(ISO, YI),
				});
		DATE_MEDIUM_PATTERNS.put("G y MMM d", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				});
		DATE_MEDIUM_PATTERNS.put("d. MMM y", new PatternCoordinates[] {
				of(ISO, ET),
				of(ISO, NDS),
				of(ISO, NN),
				of(ISO, IS),
				of(ISO, DA),
				of(ISO, WAE),
				of(ISO, NB),
				of(ISO, LB),
				of(ISO, SL),
				});
		DATE_MEDIUM_PATTERNS.put("d. M. y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, CS),
				of(JAPANESE, CS),
				of(MINGUO, CS),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM y 'г'.", new PatternCoordinates[] {
				of(ISO, RU),
				});
		DATE_MEDIUM_PATTERNS.put("MMM d، y G", new PatternCoordinates[] {
				of(JAPANESE, UG),
				});
		DATE_MEDIUM_PATTERNS.put("dd MMM, y թ.", new PatternCoordinates[] {
				of(ISO, HY),
				});
		DATE_MEDIUM_PATTERNS.put("d.MM.y", new PatternCoordinates[] {
				of(ISO, BE),
				});
		DATE_MEDIUM_PATTERNS.put("y 'ж'. dd MMM", new PatternCoordinates[] {
				of(ISO, KK),
				});
		DATE_MEDIUM_PATTERNS.put("MMM d 'lia', G y", new PatternCoordinates[] {
				of(JAPANESE, EE),
				of(MINGUO, EE),
				});
		DATE_MEDIUM_PATTERNS.put("d בMMM y", new PatternCoordinates[] {
				of(ISO, HE),
				});
		DATE_MEDIUM_PATTERNS.put("dd.MM.y.", new PatternCoordinates[] {
				of(ISO, SR),
				of(ISO, SR_LATN),
				of(ISO, BS_CYRL),
				});
		DATE_MEDIUM_PATTERNS.put("dd.MM 'st'. y", new PatternCoordinates[] {
				of(ISO, PRG),
				});
		DATE_MEDIUM_PATTERNS.put("dd/MM/y", new PatternCoordinates[] {
				of(ISO, PT_PT),
				of(ISO, FUR),
				});
		DATE_MEDIUM_PATTERNS.put("d MM y", new PatternCoordinates[] {
				of(ISO, YO_BJ),
				of(ISO, YO),
				});
		DATE_MEDIUM_PATTERNS.put("dd-MM-y G", new PatternCoordinates[] {
				of(JAPANESE, VI),
				});
		DATE_MEDIUM_PATTERNS.put("Gy年M月d日", new PatternCoordinates[] {
				of(THAI_BUDDHIST, YUE_HANS),
				of(JAPANESE, YUE_HANS),
				of(MINGUO, YUE_HANS),
				of(THAI_BUDDHIST, YUE),
				of(JAPANESE, YUE),
				of(MINGUO, YUE),
				of(THAI_BUDDHIST, ZH_HANT),
				of(JAPANESE, ZH_HANT),
				of(MINGUO, ZH_HANT),
				of(THAI_BUDDHIST, ZH),
				of(JAPANESE, ZH),
				of(MINGUO, ZH),
				of(JAPANESE, JA),
				});
		DATE_MEDIUM_PATTERNS.put("dd-MMM-y", new PatternCoordinates[] {
				of(ISO, EN_PK),
				of(ISO, TI),
				of(ISO, OM),
				of(ISO, EN_IN),
				of(ISO, EN_BZ),
				of(ISO, SO),
				});
		DATE_MEDIUM_PATTERNS.put("dd MMM y", new PatternCoordinates[] {
				of(ISO, EN_BW),
				of(ISO, EN_MT),
				of(ISO, AF),
				of(ISO, EN_ZA),
				of(ISO, KL),
				of(ISO, MT),
				of(ISO, EN_BE),
				of(ISO, TG),
				});
		DATE_MEDIUM_PATTERNS.put("Gy/MM/dd", new PatternCoordinates[] {
				of(THAI_BUDDHIST, JA),
				of(MINGUO, JA),
				});
		DATE_MEDIUM_PATTERNS.put("d/MM/y", new PatternCoordinates[] {
				of(ISO, EN_NZ),
				of(ISO, ES_GT),
				of(ISO, ES_CO),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM، y", new PatternCoordinates[] {
				of(ISO, UR),
				});
		DATE_MEDIUM_PATTERNS.put("dd MMM y G", new PatternCoordinates[] {
				of(JAPANESE, IT),
				});
		DATE_MEDIUM_PATTERNS.put("y('e')'ko' MMM d('a')", new PatternCoordinates[] {
				of(ISO, EU),
				});
		DATE_MEDIUM_PATTERNS.put("y-'ж'., d-MMM", new PatternCoordinates[] {
				of(ISO, KY),
				});
		DATE_MEDIUM_PATTERNS.put("dd/MM/y G", new PatternCoordinates[] {
				of(JAPANESE, PT),
				of(MINGUO, CA),
				of(JAPANESE, ES),
				of(JAPANESE, MS),
				});
		DATE_MEDIUM_PATTERNS.put("MM/dd/y", new PatternCoordinates[] {
				of(ISO, ES_PR),
				of(ISO, ES_PA),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM, y 'ел'", new PatternCoordinates[] {
				of(ISO, TT),
				});
		DATE_MEDIUM_PATTERNS.put("y MMM. d", new PatternCoordinates[] {
				of(ISO, VO),
				});
		DATE_MEDIUM_PATTERNS.put("y, MMM d", new PatternCoordinates[] {
				of(ISO, ML),
				of(ISO, SAH),
				});
		DATE_MEDIUM_PATTERNS.put("y-MMM-dd", new PatternCoordinates[] {
				of(ISO, EO),
				});
		DATE_MEDIUM_PATTERNS.put("y ལོའི་MMMཚེས་d", new PatternCoordinates[] {
				of(ISO, BO),
				});
		DATE_MEDIUM_PATTERNS.put("G y.MM.dd.", new PatternCoordinates[] {
				of(JAPANESE, HU),
				});
		DATE_MEDIUM_PATTERNS.put("y/MM/dd", new PatternCoordinates[] {
				of(ISO, JA),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM y", new PatternCoordinates[] {
				of(ISO, KEA),
				of(ISO, HI),
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, LO),
				of(ISO, ID),
				of(ISO, MUA),
				of(ISO, MAI),
				of(ISO, LAG),
				of(ISO, EWO),
				of(ISO, EN_AE),
				of(ISO, ES_US),
				of(ISO, BEM),
				of(ISO, TO),
				of(ISO, BR),
				of(ISO, HAW),
				of(ISO, VAI),
				of(ISO, EBU),
				of(ISO, SE_FI),
				of(ISO, NAQ),
				of(ISO, PA_ARAB),
				of(ISO, RO),
				of(ISO, RN),
				of(ISO, MAS),
				of(ISO, ASA),
				of(ISO, AM),
				of(ISO, VUN),
				of(ISO, KSF),
				of(ISO, VAI_LATN),
				of(ISO, DAV),
				of(ISO, JMC),
				of(ISO, AST),
				of(ISO, PL),
				of(THAI_BUDDHIST, TH),
				of(ISO, TH),
				of(ISO, RWK),
				of(ISO, DUA),
				of(ISO, SAQ),
				of(ISO, LUO),
				of(ISO, KDE),
				of(ISO, KM),
				of(ISO, SV),
				of(ISO, SW),
				of(ISO, MGH),
				of(ISO, PA),
				of(ISO, PCM),
				of(ISO, AF_NA),
				of(ISO, FR),
				of(ISO, MI),
				of(ISO, EN_GB),
				of(ISO, GUZ),
				of(ISO, EL),
				of(ISO, IT),
				of(ISO, ES_419),
				of(ISO, LUY),
				of(ISO, NMG),
				of(ISO, GD),
				of(ISO, FY),
				of(ISO, JV),
				of(ISO, KW),
				of(ISO, NYN),
				of(ISO, SAT),
				of(ISO, MER),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, CY),
				of(ISO, ND),
				of(ISO, AZ_CYRL),
				of(ISO, CA),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, XOG),
				of(ISO, IA),
				of(ISO, SBP),
				of(ISO, YAV),
				of(ISO, LG),
				of(ISO, QU),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, SD_DEVA),
				of(ISO, ES),
				of(ISO, LN),
				of(ISO, CGG),
				of(ISO, UZ_ARAB),
				of(ISO, LU),
				of(ISO, KKJ),
				of(ISO, KI),
				of(ISO, TZM),
				of(ISO, TR),
				of(ISO, EN_001),
				of(ISO, FA),
				of(ISO, IG),
				of(ISO, TEO),
				of(ISO, NUS),
				of(ISO, SU),
				of(ISO, SQ),
				of(ISO, KAM),
				of(ISO, NL),
				of(ISO, MS),
				of(ISO, GA),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ID),
				of(JAPANESE, ID),
				of(MINGUO, ID),
				of(THAI_BUDDHIST, BR),
				of(JAPANESE, BR),
				of(MINGUO, BR),
				of(THAI_BUDDHIST, AM),
				of(THAI_BUDDHIST, AST),
				of(MINGUO, AST),
				of(JAPANESE, PL),
				of(THAI_BUDDHIST, FR),
				of(JAPANESE, FR),
				of(THAI_BUDDHIST, EL),
				of(THAI_BUDDHIST, FY),
				of(JAPANESE, FY),
				of(MINGUO, FY),
				of(THAI_BUDDHIST, CA),
				of(JAPANESE, TR),
				of(THAI_BUDDHIST, BE),
				of(THAI_BUDDHIST, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				of(THAI_BUDDHIST, GA),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM G y", new PatternCoordinates[] {
				of(JAPANESE, TH),
				of(MINGUO, TH),
				});
		DATE_MEDIUM_PATTERNS.put("d. M. y", new PatternCoordinates[] {
				of(ISO, CS),
				of(ISO, SK),
				});
		DATE_MEDIUM_PATTERNS.put("MMM d, y", new PatternCoordinates[] {
				of(ISO, CEB),
				of(ISO, ZU),
				of(ISO, OR),
				of(ISO, KN),
				of(ISO, KS),
				of(ISO, CHR),
				of(ISO, EN_CA),
				of(ISO, FIL),
				of(ISO, EN),
				of(ISO, MNI),
				of(ISO, LKT),
				of(ISO, BRX),
				});
		DATE_MEDIUM_PATTERNS.put("MMM d. y", new PatternCoordinates[] {
				of(ISO, SMN),
				});
		DATE_MEDIUM_PATTERNS.put("dd.M.y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, MK),
				});
		DATE_MEDIUM_PATTERNS.put("སྤྱི་ལོ་y ཟླ་MMM ཚེས་dd", new PatternCoordinates[] {
				of(ISO, DZ),
				});
		DATE_MEDIUM_PATTERNS.put("d-MMM، y", new PatternCoordinates[] {
				of(ISO, UG),
				});
		DATE_MEDIUM_PATTERNS.put("y၊ MMM d", new PatternCoordinates[] {
				of(ISO, MY),
				});
		DATE_MEDIUM_PATTERNS.put("MMM d 'lia', y", new PatternCoordinates[] {
				of(ISO, EE),
				});
		DATE_MEDIUM_PATTERNS.put("d. MMM. y", new PatternCoordinates[] {
				of(ISO, KSH),
				});
		DATE_MEDIUM_PATTERNS.put("d-MMM, y", new PatternCoordinates[] {
				of(ISO, UZ),
				});
		DATE_MEDIUM_PATTERNS.put("d.M.y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FI),
				of(JAPANESE, FI),
				of(THAI_BUDDHIST, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM. y", new PatternCoordinates[] {
				of(ISO, KA),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM, y", new PatternCoordinates[] {
				of(ISO, SHI_LATN),
				of(ISO, FF),
				of(ISO, BM),
				of(ISO, TE),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, KAB),
				of(ISO, VI),
				of(ISO, TA),
				of(ISO, MFE),
				of(ISO, WO),
				of(ISO, SHI),
				of(ISO, BAS),
				of(ISO, GU),
				of(ISO, SES),
				of(ISO, BN),
				of(ISO, CCP),
				of(ISO, HA_NE),
				of(ISO, HA),
				of(ISO, ZGH),
				of(ISO, NNH),
				of(ISO, DJE),
				of(ISO, SG),
				of(ISO, UZ_CYRL),
				of(ISO, MR),
				});
		DATE_MEDIUM_PATTERNS.put("dd MMM,y", new PatternCoordinates[] {
				of(ISO, EN_ZW),
				});
		DATE_MEDIUM_PATTERNS.put("dd‏/MM‏/y", new PatternCoordinates[] {
				of(ISO, AR),
				});
		DATE_MEDIUM_PATTERNS.put("y. 'gada' d. MMM", new PatternCoordinates[] {
				of(ISO, LV),
				});
		DATE_MEDIUM_PATTERNS.put("d MMM y 'р'.", new PatternCoordinates[] {
				of(ISO, UK),
				});
		DATE_MEDIUM_PATTERNS.put("d. M. y. G", new PatternCoordinates[] {
				of(JAPANESE, HR),
				});
		DATE_SHORT_PATTERNS.put("dd.MM.yy", new PatternCoordinates[] {
				of(ISO, IT_CH),
				of(ISO, AZ),
				of(ISO, CS),
				of(ISO, ET),
				of(ISO, UK),
				of(ISO, KK),
				of(ISO, FO),
				of(ISO, FR_CH),
				of(ISO, KA),
				of(ISO, HY),
				of(ISO, GSW),
				of(ISO, LV),
				of(ISO, AZ_CYRL),
				of(ISO, PRG),
				of(ISO, OS),
				of(ISO, LB),
				of(ISO, DE),
				});
		DATE_SHORT_PATTERNS.put("M/d/yy", new PatternCoordinates[] {
				of(ISO, EE),
				of(ISO, CEB),
				of(ISO, ZU),
				of(ISO, OR),
				of(ISO, KS),
				of(ISO, CHR),
				of(ISO, FIL),
				of(ISO, EN),
				of(ISO, LKT),
				of(ISO, BRX),
				});
		DATE_SHORT_PATTERNS.put("y-MM-dd", new PatternCoordinates[] {
				of(ISO, SI),
				of(ISO, MGO),
				of(ISO, BO),
				of(ISO, JGO),
				of(ISO, DZ),
				of(ISO, SE),
				of(ISO, MG),
				of(ISO, SV),
				of(ISO, EN_CA),
				of(ISO, XH),
				of(ISO, ROOT),
				of(ISO, FR_CA),
				of(ISO, AF),
				of(ISO, SN),
				of(ISO, RW),
				of(ISO, LT),
				of(ISO, VO),
				of(ISO, EN_SE),
				of(ISO, KL),
				of(ISO, II),
				of(ISO, LRC),
				of(ISO, SD),
				of(ISO, CKB),
				of(ISO, UG),
				});
		DATE_SHORT_PATTERNS.put("d-M-y", new PatternCoordinates[] {
				of(ISO, AS),
				});
		DATE_SHORT_PATTERNS.put("d/MM/yy", new PatternCoordinates[] {
				of(ISO, EN_NZ),
				of(ISO, FR_BE),
				of(ISO, ES_PE),
				of(ISO, ES_GT),
				of(ISO, ES_CO),
				of(ISO, MS),
				});
		DATE_SHORT_PATTERNS.put("dd.MM.y G", new PatternCoordinates[] {
				of(JAPANESE, PL),
				});
		DATE_SHORT_PATTERNS.put("yy/M/d", new PatternCoordinates[] {
				of(ISO, EU),
				of(ISO, NE),
				of(ISO, SAH),
				});
		DATE_SHORT_PATTERNS.put("dd-MM-y", new PatternCoordinates[] {
				of(ISO, WO),
				of(ISO, MI),
				of(ISO, JV),
				of(ISO, IA),
				of(ISO, NL),
				});
		DATE_SHORT_PATTERNS.put("yy-MM-dd", new PatternCoordinates[] {
				of(ISO, EO),
				});
		DATE_SHORT_PATTERNS.put("GGGGG y.MM.dd.", new PatternCoordinates[] {
				of(JAPANESE, HU),
				});
		DATE_SHORT_PATTERNS.put("dd.MM.y", new PatternCoordinates[] {
				of(ISO, TK),
				of(ISO, SE_FI),
				of(ISO, NN),
				of(ISO, RO),
				of(ISO, PL),
				of(ISO, DA),
				of(ISO, RU),
				of(ISO, NB),
				of(ISO, TT),
				});
		DATE_SHORT_PATTERNS.put("d.M.y", new PatternCoordinates[] {
				of(ISO, SMN),
				of(ISO, FI),
				of(ISO, HE),
				of(THAI_BUDDHIST, GSW),
				of(ISO, IS),
				});
		DATE_SHORT_PATTERNS.put("d/M/y", new PatternCoordinates[] {
				of(ISO, SHI_LATN),
				of(ISO, FF),
				of(ISO, LO),
				of(ISO, BM),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, EN_HK),
				of(ISO, MUA),
				of(ISO, EWO),
				of(ISO, KAB),
				of(ISO, ES_US),
				of(ISO, RN),
				of(ISO, KSF),
				of(ISO, MFE),
				of(ISO, SEH),
				of(ISO, DUA),
				of(ISO, SHI),
				of(ISO, BAS),
				of(ISO, YO_BJ),
				of(ISO, ZH_HANT_HK),
				of(ISO, SES),
				of(ISO, NMG),
				of(JAPANESE, DA),
				of(ISO, YAV),
				of(ISO, EN_ZW),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, YO),
				of(ISO, LN),
				of(ISO, LU),
				of(ISO, ZGH),
				of(ISO, DJE),
				of(ISO, SG),
				});
		DATE_SHORT_PATTERNS.put("d.MM.yy 'г'.", new PatternCoordinates[] {
				of(ISO, BG),
				});
		DATE_SHORT_PATTERNS.put("dd-MM-yy GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FY),
				of(JAPANESE, FY),
				of(MINGUO, FY),
				of(THAI_BUDDHIST, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				});
		DATE_SHORT_PATTERNS.put("d.M.yy.", new PatternCoordinates[] {
				of(ISO, SR),
				of(ISO, SR_LATN),
				of(ISO, BS_CYRL),
				});
		DATE_SHORT_PATTERNS.put("yy. M. d.", new PatternCoordinates[] {
				of(ISO, KO),
				});
		DATE_SHORT_PATTERNS.put("d.MM.y", new PatternCoordinates[] {
				of(ISO, TR),
				});
		DATE_SHORT_PATTERNS.put("dd/MM/y GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, AM),
				of(THAI_BUDDHIST, FR),
				of(JAPANESE, FR),
				of(THAI_BUDDHIST, CA),
				of(MINGUO, CA),
				of(THAI_BUDDHIST, GA),
				});
		DATE_SHORT_PATTERNS.put("d-M-yy", new PatternCoordinates[] {
				of(ISO, KOK),
				});
		DATE_SHORT_PATTERNS.put("dd/MM/y GGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, BR),
				of(JAPANESE, BR),
				of(MINGUO, BR),
				});
		DATE_SHORT_PATTERNS.put("Gyy/M/d", new PatternCoordinates[] {
				of(MINGUO, YUE_HANS),
				of(MINGUO, ZH),
				});
		DATE_SHORT_PATTERNS.put("d/M/yy", new PatternCoordinates[] {
				of(ISO, HI),
				of(ISO, MAI),
				of(ISO, TO),
				of(ISO, EN_JM),
				of(ISO, TA),
				of(ISO, HAW),
				of(ISO, KN),
				of(ISO, AST),
				of(THAI_BUDDHIST, TH),
				of(ISO, TH),
				of(ISO, KM),
				of(ISO, GU),
				of(ISO, PA),
				of(ISO, BN),
				of(ISO, EL),
				of(JAPANESE, EL),
				of(ISO, ZH_HANS_MO),
				of(ISO, ML),
				of(ISO, SAT),
				of(ISO, CCP),
				of(ISO, CA),
				of(ISO, MNI),
				of(ISO, SD_DEVA),
				of(ISO, ES),
				of(ISO, EN_SG),
				of(ISO, EN_AU),
				of(ISO, HA_NE),
				of(ISO, UR),
				of(ISO, KY),
				of(ISO, HA),
				of(ISO, IG),
				of(ISO, SU),
				of(ISO, ZH_HANS_HK),
				of(ISO, MR),
				});
		DATE_SHORT_PATTERNS.put("y/M/d", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				of(ISO, UZ_ARAB),
				of(ISO, PS),
				of(ISO, ZH),
				of(ISO, FA),
				});
		DATE_SHORT_PATTERNS.put("y. MM. dd.", new PatternCoordinates[] {
				of(ISO, HU),
				});
		DATE_SHORT_PATTERNS.put("dd/MM/y", new PatternCoordinates[] {
				of(ISO, KEA),
				of(ISO, LAG),
				of(ISO, VI),
				of(ISO, EN_AE),
				of(ISO, BEM),
				of(ISO, BR),
				of(ISO, VAI),
				of(ISO, EBU),
				of(ISO, NAQ),
				of(ISO, PA_ARAB),
				of(ISO, MAS),
				of(ISO, ASA),
				of(ISO, AM),
				of(ISO, VUN),
				of(ISO, VAI_LATN),
				of(ISO, DAV),
				of(ISO, JMC),
				of(ISO, RWK),
				of(ISO, SAQ),
				of(ISO, LUO),
				of(ISO, KDE),
				of(ISO, SW),
				of(ISO, MGH),
				of(ISO, PCM),
				of(ISO, FR),
				of(ISO, EN_GB),
				of(ISO, PT),
				of(ISO, GUZ),
				of(ISO, LUY),
				of(ISO, GD),
				of(ISO, KW),
				of(ISO, NYN),
				of(ISO, MER),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, ND),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, XOG),
				of(ISO, SBP),
				of(ISO, LG),
				of(ISO, QU),
				of(ISO, CGG),
				of(ISO, KI),
				of(ISO, TZM),
				of(ISO, EN_001),
				of(ISO, MT),
				of(ISO, TEO),
				of(ISO, KAM),
				of(ISO, GA),
				});
		DATE_SHORT_PATTERNS.put("d.M y G", new PatternCoordinates[] {
				of(JAPANESE, NB),
				});
		DATE_SHORT_PATTERNS.put("d. MM. yy", new PatternCoordinates[] {
				of(ISO, SL),
				});
		DATE_SHORT_PATTERNS.put("dd. MM. y.", new PatternCoordinates[] {
				of(ISO, HR),
				});
		DATE_SHORT_PATTERNS.put("d/M/yy G", new PatternCoordinates[] {
				of(JAPANESE, TH),
				});
		DATE_SHORT_PATTERNS.put("d. M. y. GGGGG", new PatternCoordinates[] {
				of(JAPANESE, HR),
				});
		DATE_SHORT_PATTERNS.put("MM/dd/yy", new PatternCoordinates[] {
				of(ISO, ES_PR),
				of(ISO, ES_PA),
				});
		DATE_SHORT_PATTERNS.put("d‏/M‏/y", new PatternCoordinates[] {
				of(ISO, AR),
				});
		DATE_SHORT_PATTERNS.put("d. M. y.", new PatternCoordinates[] {
				of(ISO, BS),
				});
		DATE_SHORT_PATTERNS.put("Gyy-MM-dd", new PatternCoordinates[] {
				of(JAPANESE, YUE_HANS),
				of(JAPANESE, ZH),
				});
		DATE_SHORT_PATTERNS.put("Gy/M/d", new PatternCoordinates[] {
				of(THAI_BUDDHIST, YUE),
				of(JAPANESE, YUE),
				of(MINGUO, YUE),
				of(THAI_BUDDHIST, ZH_HANT),
				of(JAPANESE, ZH_HANT),
				of(MINGUO, ZH_HANT),
				});
		DATE_SHORT_PATTERNS.put("dd/MM/yy GGGGG", new PatternCoordinates[] {
				of(JAPANESE, PT),
				of(JAPANESE, IT),
				of(JAPANESE, ES),
				});
		DATE_SHORT_PATTERNS.put("d/M/y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, PT_PT),
				of(JAPANESE, PT_PT),
				of(MINGUO, PT_PT),
				of(MINGUO, TH),
				});
		DATE_SHORT_PATTERNS.put("dd.MM.y GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, RO),
				});
		DATE_SHORT_PATTERNS.put("d/M/y GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ID),
				of(JAPANESE, ID),
				of(MINGUO, ID),
				of(THAI_BUDDHIST, EL),
				});
		DATE_SHORT_PATTERNS.put("Gy/MM/dd", new PatternCoordinates[] {
				of(THAI_BUDDHIST, JA),
				of(MINGUO, JA),
				});
		DATE_SHORT_PATTERNS.put("d/MM/y", new PatternCoordinates[] {
				of(ISO, NL_BE),
				of(ISO, NUS),
				});
		DATE_SHORT_PATTERNS.put("Gd/M/yy", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ZH_HANS_SG),
				of(JAPANESE, ZH_HANS_SG),
				of(MINGUO, ZH_HANS_SG),
				of(MINGUO, ZH_HANS_MO),
				of(THAI_BUDDHIST, ZH_HANS_HK),
				of(JAPANESE, ZH_HANS_HK),
				of(MINGUO, ZH_HANS_HK),
				});
		DATE_SHORT_PATTERNS.put("dd/MM/y G", new PatternCoordinates[] {
				of(JAPANESE, VI),
				});
		DATE_SHORT_PATTERNS.put("Gy-M-d", new PatternCoordinates[] {
				of(THAI_BUDDHIST, YUE_HANS),
				of(THAI_BUDDHIST, ZH),
				});
		DATE_SHORT_PATTERNS.put("d.MM.y G", new PatternCoordinates[] {
				of(JAPANESE, TR),
				});
		DATE_SHORT_PATTERNS.put("dd/MM/yy", new PatternCoordinates[] {
				of(ISO, PT_PT),
				of(ISO, ID),
				of(ISO, EN_BW),
				of(ISO, YI),
				of(ISO, TI),
				of(ISO, UZ),
				of(ISO, ZH_HANS_SG),
				of(ISO, GL),
				of(ISO, IT),
				of(ISO, GV),
				of(ISO, CY),
				of(ISO, OM),
				of(ISO, EN_IN),
				of(ISO, EN_BZ),
				of(ISO, MS_ID),
				of(ISO, NNH),
				of(ISO, SO),
				of(ISO, ES_MX),
				of(ISO, EN_BE),
				of(ISO, UZ_CYRL),
				of(ISO, TG),
				of(ISO, FUR),
				});
		DATE_SHORT_PATTERNS.put("y/MM/dd", new PatternCoordinates[] {
				of(ISO, EN_ZA),
				of(ISO, JA),
				});
		DATE_SHORT_PATTERNS.put("d/MM/y GGGGG", new PatternCoordinates[] {
				of(JAPANESE, MS),
				});
		DATE_SHORT_PATTERNS.put("GGGGG y-MM-dd", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				});
		DATE_SHORT_PATTERNS.put("d. M. y", new PatternCoordinates[] {
				of(ISO, SK),
				of(ISO, KSH),
				});
		DATE_SHORT_PATTERNS.put("dd/MM y", new PatternCoordinates[] {
				of(ISO, KKJ),
				});
		DATE_SHORT_PATTERNS.put("M/d/yy G", new PatternCoordinates[] {
				of(JAPANESE, SR),
				of(JAPANESE, SR_LATN),
				of(JAPANESE, BS_CYRL),
				});
		DATE_SHORT_PATTERNS.put("y.MM.dd", new PatternCoordinates[] {
				of(ISO, CU),
				of(ISO, MN),
				});
		DATE_SHORT_PATTERNS.put("dd.MM.yy GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, CS),
				of(JAPANESE, CS),
				of(MINGUO, CS),
				of(JAPANESE, LB),
				of(JAPANESE, DE),
				});
		DATE_SHORT_PATTERNS.put("d.MM.yy", new PatternCoordinates[] {
				of(ISO, NDS),
				of(ISO, BE),
				});
		DATE_SHORT_PATTERNS.put("dd-MM-GGGGG yy", new PatternCoordinates[] {
				of(JAPANESE, EE),
				});
		DATE_SHORT_PATTERNS.put("GGGGGy/M/d", new PatternCoordinates[] {
				of(JAPANESE, JA),
				});
		DATE_SHORT_PATTERNS.put("dd-MM-yy", new PatternCoordinates[] {
				of(ISO, TE),
				of(ISO, ES_CL),
				of(ISO, FY),
				of(ISO, MY),
				of(ISO, RM),
				});
		DATE_SHORT_PATTERNS.put("d. M. yy.", new PatternCoordinates[] {
				of(ISO, HR_BA),
				});
		DATE_SHORT_PATTERNS.put("dd-MM-GGGGG y", new PatternCoordinates[] {
				of(MINGUO, EE),
				});
		DATE_SHORT_PATTERNS.put("yy/MM/dd", new PatternCoordinates[] {
				of(ISO, AK),
				});
		DATE_SHORT_PATTERNS.put("d.M.y G", new PatternCoordinates[] {
				of(THAI_BUDDHIST, NB),
				of(MINGUO, NB),
				});
		DATE_SHORT_PATTERNS.put("d/M/yy GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, AST),
				of(MINGUO, AST),
				});
		DATE_SHORT_PATTERNS.put("d.M.yy", new PatternCoordinates[] {
				of(ISO, DSB),
				of(ISO, HSB),
				of(THAI_BUDDHIST, BE),
				of(ISO, SQ),
				of(ISO, MK),
				});
		DATE_SHORT_PATTERNS.put("M/d/y GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FIL),
				of(MINGUO, FIL),
				of(JAPANESE, EN),
				of(JAPANESE, UG),
				});
		DATE_SHORT_PATTERNS.put("dd.M.y GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, MK),
				});
		DATE_SHORT_PATTERNS.put("d.M.y GGGGG", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FI),
				of(JAPANESE, FI),
				of(THAI_BUDDHIST, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				});
		DATE_TIME_FULL_PATTERNS.put("{1}, {0}", new PatternCoordinates[] {
				of(ISO, KEA),
				of(ISO, LO),
				of(ISO, TO),
				of(ISO, KK),
				of(ISO, NDS),
				of(ISO, BG),
				of(ISO, RO),
				of(ISO, UZ),
				of(ISO, KA),
				of(ISO, HY),
				of(ISO, SK),
				of(THAI_BUDDHIST, CA),
				of(ISO, RU),
				of(ISO, ES),
				of(ISO, OS),
				of(ISO, TT),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'kl'. {0}", new PatternCoordinates[] {
				of(ISO, FO),
				of(THAI_BUDDHIST, IS),
				of(ISO, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				of(ISO, DA),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} को {0}", new PatternCoordinates[] {
				of(ISO, HI),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'af' {0}", new PatternCoordinates[] {
				of(ISO, KAB),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} {0}కి", new PatternCoordinates[] {
				of(ISO, TE),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'da' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, BR),
				of(ISO, BR),
				of(JAPANESE, BR),
				of(MINGUO, BR),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'о' {0}", new PatternCoordinates[] {
				of(ISO, UK),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} នៅ​ម៉ោង {0}", new PatternCoordinates[] {
				of(ISO, KM),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'a' 'las' {0}", new PatternCoordinates[] {
				of(ISO, ES_419),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'na' {0}", new PatternCoordinates[] {
				of(ISO, IG),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'um' {0}", new PatternCoordinates[] {
				of(ISO, DE),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} के {0}", new PatternCoordinates[] {
				of(ISO, MAI),
				});
		DATE_TIME_FULL_PATTERNS.put("{1}{0}", new PatternCoordinates[] {
				of(ISO, FF_ADLM),
				of(THAI_BUDDHIST, ZH_HANT),
				of(MINGUO, ZH_HANT),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'às' {0}", new PatternCoordinates[] {
				of(ISO, PT_PT),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'sa' {0}", new PatternCoordinates[] {
				of(ISO, CEB),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'klo' {0}", new PatternCoordinates[] {
				of(ISO, FI),
				});
		DATE_TIME_FULL_PATTERNS.put("{0} 'do' {1}", new PatternCoordinates[] {
				of(ISO, GL),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} એ {0} વાગ્યે", new PatternCoordinates[] {
				of(ISO, GU),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} - {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, EL),
				of(ISO, EL),
				});
		DATE_TIME_FULL_PATTERNS.put("{0} ਵਿਖੇ {1}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, PA),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'u' {0}", new PatternCoordinates[] {
				of(ISO, HR),
				of(ISO, BS),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'у' {0}", new PatternCoordinates[] {
				of(ISO, BE),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'à' {0}", new PatternCoordinates[] {
				of(ISO, FR),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} ᎤᎾᎢ {0}", new PatternCoordinates[] {
				of(ISO, CHR),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'om' {0}", new PatternCoordinates[] {
				of(ISO, FY),
				of(THAI_BUDDHIST, NL),
				of(ISO, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} {0}", new PatternCoordinates[] {
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DSB),
				of(ISO, KO),
				of(THAI_BUDDHIST, CS),
				of(ISO, CS),
				of(JAPANESE, CS),
				of(MINGUO, CS),
				of(ISO, KOK),
				of(ISO, MGO),
				of(ISO, YI),
				of(ISO, ET),
				of(ISO, HAW),
				of(ISO, ZU),
				of(ISO, NN),
				of(ISO, JGO),
				of(ISO, DZ),
				of(ISO, YUE_HANS),
				of(JAPANESE, YUE_HANS),
				of(ISO, TI),
				of(THAI_BUDDHIST, AM),
				of(ISO, AM),
				of(ISO, SE),
				of(ISO, KN),
				of(ISO, KS),
				of(ISO, MG),
				of(ISO, PL),
				of(ISO, TH),
				of(JAPANESE, TH),
				of(ISO, SV),
				of(JAPANESE, SV),
				of(ISO, SW),
				of(ISO, YO_BJ),
				of(ISO, CU),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, PA),
				of(JAPANESE, FR),
				of(ISO, MI),
				of(ISO, PT),
				of(JAPANESE, HR),
				of(ISO, AF),
				of(ISO, BN),
				of(ISO, IT),
				of(ISO, YUE),
				of(JAPANESE, YUE),
				of(ISO, SN),
				of(ISO, EU),
				of(ISO, GD),
				of(JAPANESE, FY),
				of(ISO, LV),
				of(ISO, JV),
				of(ISO, RW),
				of(ISO, ML),
				of(ISO, HU),
				of(ISO, AS),
				of(ISO, LT),
				of(ISO, HSB),
				of(ISO, MY),
				of(ISO, CCP),
				of(ISO, KL),
				of(ISO, PRG),
				of(ISO, QU),
				of(ISO, OM),
				of(ISO, YO),
				of(ISO, RM),
				of(ISO, SR),
				of(ISO, II),
				of(ISO, NE),
				of(ISO, ZH_HANT),
				of(ISO, SR_LATN),
				of(ISO, MN),
				of(ISO, PS),
				of(ISO, UR),
				of(ISO, LRC),
				of(ISO, KKJ),
				of(ISO, ZH),
				of(JAPANESE, ZH),
				of(ISO, SD),
				of(ISO, KY),
				of(ISO, TR),
				of(ISO, ZGH),
				of(ISO, AR),
				of(ISO, MT),
				of(ISO, CKB),
				of(ISO, UZ_CYRL),
				of(ISO, JA),
				of(JAPANESE, JA),
				of(THAI_BUDDHIST, NB),
				of(ISO, NB),
				of(JAPANESE, NB),
				of(MINGUO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, LB),
				of(ISO, UG),
				of(ISO, MS),
				of(THAI_BUDDHIST, GA),
				of(ISO, GA),
				of(ISO, SL),
				});
		DATE_TIME_FULL_PATTERNS.put("{1}، ساعت {0}", new PatternCoordinates[] {
				of(ISO, FA),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} בשעה {0}", new PatternCoordinates[] {
				of(ISO, HE),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'fọ' {0}", new PatternCoordinates[] {
				of(ISO, PCM),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'pukul' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ID),
				of(ISO, SU),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'aig' {0}", new PatternCoordinates[] {
				of(JAPANESE, GD),
				of(MINGUO, GD),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'tme' {0}", new PatternCoordinates[] {
				of(ISO, SMN),
				});
		DATE_TIME_FULL_PATTERNS.put("{0} ଠାରେ {1}", new PatternCoordinates[] {
				of(ISO, OR),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} रोजी {0}", new PatternCoordinates[] {
				of(ISO, MR),
				});
		DATE_TIME_FULL_PATTERNS.put("{1},{0}", new PatternCoordinates[] {
				of(ISO, NNH),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'at' {0}", new PatternCoordinates[] {
				of(ISO, EN_GB),
				of(ISO, EN),
				of(ISO, SD_DEVA),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'a' {0}", new PatternCoordinates[] {
				of(ISO, IA),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'a' 'les' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, AST),
				of(ISO, AST),
				of(JAPANESE, AST),
				of(MINGUO, AST),
				of(ISO, CA),
				});
		DATE_TIME_FULL_PATTERNS.put("{0} {1}", new PatternCoordinates[] {
				of(ISO, EE),
				of(ISO, VI),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'la' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, RO),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} ’அன்று’ {0}", new PatternCoordinates[] {
				of(ISO, TA),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'në' {0}", new PatternCoordinates[] {
				of(ISO, SQ),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} গী {0} দা", new PatternCoordinates[] {
				of(ISO, MNI),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'nang' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FIL),
				of(ISO, FIL),
				of(MINGUO, FIL),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'am' {0}", new PatternCoordinates[] {
				of(ISO, CY),
				});
		DATE_TIME_FULL_PATTERNS.put("{1} 'ci' {0}", new PatternCoordinates[] {
				of(ISO, WO),
				});
		DATE_TIME_LONG_PATTERNS.put("{1}, {0}", new PatternCoordinates[] {
				of(ISO, KEA),
				of(ISO, LO),
				of(ISO, TO),
				of(ISO, KK),
				of(ISO, NDS),
				of(ISO, BG),
				of(ISO, RO),
				of(ISO, UZ),
				of(ISO, KA),
				of(ISO, HY),
				of(ISO, SK),
				of(THAI_BUDDHIST, CA),
				of(ISO, RU),
				of(ISO, ES),
				of(ISO, NNH),
				of(ISO, OS),
				of(ISO, TT),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'kl'. {0}", new PatternCoordinates[] {
				of(ISO, NN),
				of(ISO, FO),
				of(THAI_BUDDHIST, IS),
				of(ISO, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				of(ISO, DA),
				of(ISO, NB),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} को {0}", new PatternCoordinates[] {
				of(ISO, HI),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'af' {0}", new PatternCoordinates[] {
				of(ISO, KAB),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} {0}కి", new PatternCoordinates[] {
				of(ISO, TE),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'da' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, BR),
				of(ISO, BR),
				of(JAPANESE, BR),
				of(MINGUO, BR),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'о' {0}", new PatternCoordinates[] {
				of(ISO, UK),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} នៅ​ម៉ោង {0}", new PatternCoordinates[] {
				of(ISO, KM),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'a' 'las' {0}", new PatternCoordinates[] {
				of(ISO, ES_419),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'na' {0}", new PatternCoordinates[] {
				of(ISO, IG),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'um' {0}", new PatternCoordinates[] {
				of(ISO, DE),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} के {0}", new PatternCoordinates[] {
				of(ISO, MAI),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'às' {0}", new PatternCoordinates[] {
				of(ISO, PT_PT),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'sa' {0}", new PatternCoordinates[] {
				of(ISO, CEB),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'klo' {0}", new PatternCoordinates[] {
				of(ISO, FI),
				});
		DATE_TIME_LONG_PATTERNS.put("{0} 'do' {1}", new PatternCoordinates[] {
				of(ISO, GL),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} એ {0} વાગ્યે", new PatternCoordinates[] {
				of(ISO, GU),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} - {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, EL),
				of(ISO, EL),
				});
		DATE_TIME_LONG_PATTERNS.put("{0} ਵਿਖੇ {1}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, PA),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'u' {0}", new PatternCoordinates[] {
				of(ISO, HR),
				of(ISO, BS),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'у' {0}", new PatternCoordinates[] {
				of(ISO, BE),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'à' {0}", new PatternCoordinates[] {
				of(ISO, FR),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} ᎤᎾᎢ {0}", new PatternCoordinates[] {
				of(ISO, CHR),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'om' {0}", new PatternCoordinates[] {
				of(ISO, FY),
				of(THAI_BUDDHIST, NL),
				of(ISO, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} {0}", new PatternCoordinates[] {
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DSB),
				of(ISO, KO),
				of(THAI_BUDDHIST, CS),
				of(ISO, CS),
				of(JAPANESE, CS),
				of(MINGUO, CS),
				of(ISO, KOK),
				of(ISO, MGO),
				of(ISO, YI),
				of(ISO, ET),
				of(ISO, HAW),
				of(ISO, ZU),
				of(ISO, JGO),
				of(ISO, DZ),
				of(ISO, YUE_HANS),
				of(JAPANESE, YUE_HANS),
				of(ISO, TI),
				of(THAI_BUDDHIST, AM),
				of(ISO, AM),
				of(ISO, SE),
				of(ISO, KN),
				of(ISO, KS),
				of(ISO, MG),
				of(ISO, PL),
				of(ISO, TH),
				of(JAPANESE, TH),
				of(ISO, SV),
				of(JAPANESE, SV),
				of(ISO, SW),
				of(ISO, YO_BJ),
				of(ISO, CU),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, PA),
				of(JAPANESE, FR),
				of(ISO, MI),
				of(ISO, PT),
				of(JAPANESE, HR),
				of(ISO, AF),
				of(ISO, BN),
				of(ISO, IT),
				of(ISO, YUE),
				of(JAPANESE, YUE),
				of(ISO, SN),
				of(ISO, EU),
				of(ISO, GD),
				of(JAPANESE, FY),
				of(ISO, LV),
				of(ISO, JV),
				of(ISO, RW),
				of(ISO, ML),
				of(ISO, HU),
				of(ISO, AS),
				of(ISO, LT),
				of(ISO, HSB),
				of(ISO, MY),
				of(ISO, CCP),
				of(ISO, KL),
				of(ISO, PRG),
				of(ISO, OM),
				of(ISO, YO),
				of(ISO, RM),
				of(ISO, SR),
				of(ISO, II),
				of(ISO, NE),
				of(THAI_BUDDHIST, ZH_HANT),
				of(ISO, ZH_HANT),
				of(JAPANESE, ZH_HANT),
				of(MINGUO, ZH_HANT),
				of(ISO, SR_LATN),
				of(ISO, MN),
				of(ISO, UR),
				of(ISO, LRC),
				of(ISO, KKJ),
				of(ISO, ZH),
				of(JAPANESE, ZH),
				of(ISO, SD),
				of(ISO, KY),
				of(ISO, TR),
				of(ISO, ZGH),
				of(ISO, AR),
				of(ISO, MT),
				of(ISO, CKB),
				of(ISO, UZ_CYRL),
				of(ISO, JA),
				of(JAPANESE, JA),
				of(THAI_BUDDHIST, NB),
				of(JAPANESE, NB),
				of(MINGUO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, LB),
				of(ISO, UG),
				of(ISO, MS),
				of(THAI_BUDDHIST, GA),
				of(ISO, GA),
				of(ISO, SL),
				});
		DATE_TIME_LONG_PATTERNS.put("{1}، ساعت {0}", new PatternCoordinates[] {
				of(ISO, FA),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} בשעה {0}", new PatternCoordinates[] {
				of(ISO, HE),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'fọ' {0}", new PatternCoordinates[] {
				of(ISO, PCM),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'pukul' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, ID),
				of(ISO, SU),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'aig' {0}", new PatternCoordinates[] {
				of(JAPANESE, GD),
				of(MINGUO, GD),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'tme' {0}", new PatternCoordinates[] {
				of(ISO, SMN),
				});
		DATE_TIME_LONG_PATTERNS.put("{0} ଠାରେ {1}", new PatternCoordinates[] {
				of(ISO, OR),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} रोजी {0}", new PatternCoordinates[] {
				of(ISO, MR),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'at' {0}", new PatternCoordinates[] {
				of(ISO, EN_GB),
				of(ISO, EN),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'a' {0}", new PatternCoordinates[] {
				of(ISO, IA),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'a' 'les' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, AST),
				of(ISO, AST),
				of(JAPANESE, AST),
				of(MINGUO, AST),
				of(ISO, CA),
				});
		DATE_TIME_LONG_PATTERNS.put("{0} {1}", new PatternCoordinates[] {
				of(ISO, EE),
				of(ISO, VI),
				of(ISO, QU),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'la' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, RO),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} ’அன்று’ {0}", new PatternCoordinates[] {
				of(ISO, TA),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'në' {0}", new PatternCoordinates[] {
				of(ISO, SQ),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} গী {0} দা", new PatternCoordinates[] {
				of(ISO, MNI),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'nang' {0}", new PatternCoordinates[] {
				of(THAI_BUDDHIST, FIL),
				of(ISO, FIL),
				of(MINGUO, FIL),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'am' {0}", new PatternCoordinates[] {
				of(ISO, CY),
				});
		DATE_TIME_LONG_PATTERNS.put("{1} 'ci' {0}", new PatternCoordinates[] {
				of(ISO, WO),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1}, {0}", new PatternCoordinates[] {
				of(ISO, KEA),
				of(ISO, HI),
				of(ISO, PT_PT),
				of(ISO, LO),
				of(THAI_BUDDHIST, ID),
				of(ISO, MAI),
				of(ISO, KAB),
				of(ISO, CEB),
				of(ISO, YI),
				of(ISO, TO),
				of(ISO, TA),
				of(THAI_BUDDHIST, BR),
				of(ISO, BR),
				of(JAPANESE, BR),
				of(MINGUO, BR),
				of(ISO, UK),
				of(ISO, KK),
				of(ISO, NDS),
				of(ISO, NN),
				of(ISO, BG),
				of(THAI_BUDDHIST, RO),
				of(ISO, RO),
				of(ISO, OR),
				of(ISO, FO),
				of(ISO, HE),
				of(ISO, UZ),
				of(THAI_BUDDHIST, AST),
				of(ISO, AST),
				of(JAPANESE, AST),
				of(MINGUO, AST),
				of(ISO, PL),
				of(ISO, KA),
				of(ISO, HY),
				of(ISO, KM),
				of(ISO, CHR),
				of(THAI_BUDDHIST, FIL),
				of(ISO, FIL),
				of(MINGUO, FIL),
				of(THAI_BUDDHIST, PA),
				of(ISO, PA),
				of(ISO, EN_GB),
				of(ISO, SK),
				of(ISO, EN),
				of(THAI_BUDDHIST, EL),
				of(ISO, EL),
				of(ISO, IT),
				of(THAI_BUDDHIST, IS),
				of(ISO, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				of(ISO, JV),
				of(THAI_BUDDHIST, CA),
				of(ISO, CA),
				of(ISO, RU),
				of(ISO, MNI),
				of(ISO, SD_DEVA),
				of(ISO, NE),
				of(ISO, OS),
				of(ISO, ES_CO),
				of(ISO, BE),
				of(ISO, IG),
				of(ISO, NB),
				of(ISO, SU),
				of(ISO, SQ),
				of(ISO, FR_ML),
				of(ISO, MR),
				of(ISO, MS),
				of(ISO, TT),
				of(ISO, DE),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1} {0}", new PatternCoordinates[] {
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, TE),
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DSB),
				of(ISO, KO),
				of(THAI_BUDDHIST, CS),
				of(ISO, CS),
				of(JAPANESE, CS),
				of(MINGUO, CS),
				of(ISO, KOK),
				of(ISO, MGO),
				of(ISO, ET),
				of(ISO, HAW),
				of(ISO, ZU),
				of(ISO, JGO),
				of(ISO, DZ),
				of(ISO, YUE_HANS),
				of(JAPANESE, YUE_HANS),
				of(ISO, TI),
				of(THAI_BUDDHIST, AM),
				of(ISO, AM),
				of(ISO, SE),
				of(ISO, KN),
				of(ISO, KS),
				of(ISO, MG),
				of(ISO, TH),
				of(JAPANESE, TH),
				of(ISO, SV),
				of(JAPANESE, SV),
				of(ISO, SW),
				of(ISO, GU),
				of(ISO, YO_BJ),
				of(ISO, CU),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, PCM),
				of(JAPANESE, FR),
				of(ISO, MI),
				of(ISO, FR_CA),
				of(ISO, PT),
				of(ISO, HR),
				of(JAPANESE, HR),
				of(ISO, AF),
				of(ISO, BN),
				of(ISO, YUE),
				of(JAPANESE, YUE),
				of(ISO, ES_419),
				of(ISO, SN),
				of(ISO, EU),
				of(ISO, GD),
				of(MINGUO, GD),
				of(ISO, FY),
				of(JAPANESE, FY),
				of(ISO, LV),
				of(ISO, RW),
				of(ISO, DA),
				of(ISO, ML),
				of(ISO, HU),
				of(ISO, AS),
				of(ISO, LT),
				of(ISO, HSB),
				of(ISO, BS),
				of(ISO, CY),
				of(ISO, MY),
				of(ISO, CCP),
				of(ISO, KL),
				of(ISO, IA),
				of(ISO, PRG),
				of(ISO, QU),
				of(ISO, OM),
				of(ISO, ES),
				of(ISO, YO),
				of(ISO, RM),
				of(ISO, SR),
				of(ISO, II),
				of(THAI_BUDDHIST, ZH_HANT),
				of(ISO, ZH_HANT),
				of(JAPANESE, ZH_HANT),
				of(MINGUO, ZH_HANT),
				of(ISO, SR_LATN),
				of(ISO, MN),
				of(ISO, PS),
				of(ISO, UR),
				of(ISO, LRC),
				of(ISO, KKJ),
				of(ISO, ZH),
				of(JAPANESE, ZH),
				of(ISO, SD),
				of(ISO, KY),
				of(ISO, TR),
				of(ISO, ZGH),
				of(ISO, AR),
				of(ISO, MT),
				of(ISO, CKB),
				of(ISO, UZ_CYRL),
				of(ISO, JA),
				of(JAPANESE, JA),
				of(THAI_BUDDHIST, NB),
				of(JAPANESE, NB),
				of(MINGUO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, LB),
				of(THAI_BUDDHIST, NL),
				of(ISO, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				of(THAI_BUDDHIST, GA),
				of(ISO, GA),
				of(ISO, SL),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1} 'tme' {0}", new PatternCoordinates[] {
				of(ISO, SMN),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{0}, {1}", new PatternCoordinates[] {
				of(ISO, VI),
				of(ISO, GL),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1}،‏ {0}", new PatternCoordinates[] {
				of(ISO, FA),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1} 'klo' {0}", new PatternCoordinates[] {
				of(ISO, FI),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{0} {1}", new PatternCoordinates[] {
				of(ISO, EE),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1} - {0}", new PatternCoordinates[] {
				of(ISO, WO),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1} 'à' {0}", new PatternCoordinates[] {
				of(ISO, FR),
				});
		DATE_TIME_MEDIUM_PATTERNS.put("{1}، {0}", new PatternCoordinates[] {
				of(ISO, UG),
				});
		DATE_TIME_SHORT_PATTERNS.put("{1}, {0}", new PatternCoordinates[] {
				of(ISO, KEA),
				of(ISO, HI),
				of(ISO, PT_PT),
				of(ISO, LO),
				of(THAI_BUDDHIST, ID),
				of(ISO, MAI),
				of(ISO, KAB),
				of(ISO, CEB),
				of(ISO, TA),
				of(ISO, UK),
				of(ISO, KK),
				of(ISO, NDS),
				of(ISO, NN),
				of(ISO, BG),
				of(THAI_BUDDHIST, RO),
				of(ISO, RO),
				of(ISO, OR),
				of(ISO, FO),
				of(ISO, HE),
				of(ISO, UZ),
				of(THAI_BUDDHIST, AST),
				of(ISO, PL),
				of(ISO, KA),
				of(ISO, HY),
				of(ISO, KM),
				of(ISO, CHR),
				of(THAI_BUDDHIST, FIL),
				of(ISO, FIL),
				of(MINGUO, FIL),
				of(THAI_BUDDHIST, PA),
				of(ISO, PA),
				of(ISO, EN_GB),
				of(ISO, EN),
				of(THAI_BUDDHIST, EL),
				of(ISO, EL),
				of(ISO, IT),
				of(THAI_BUDDHIST, IS),
				of(ISO, IS),
				of(JAPANESE, IS),
				of(MINGUO, IS),
				of(ISO, JV),
				of(THAI_BUDDHIST, CA),
				of(ISO, RU),
				of(ISO, MNI),
				of(ISO, SD_DEVA),
				of(ISO, NE),
				of(ISO, OS),
				of(ISO, ES_CO),
				of(ISO, BE),
				of(ISO, IG),
				of(ISO, NB),
				of(ISO, SU),
				of(ISO, SQ),
				of(ISO, FR_ML),
				of(ISO, MR),
				of(ISO, MS),
				of(ISO, TT),
				of(ISO, DE),
				});
		DATE_TIME_SHORT_PATTERNS.put("{1} {0}", new PatternCoordinates[] {
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, TE),
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DSB),
				of(ISO, KO),
				of(ISO, SMN),
				of(THAI_BUDDHIST, CS),
				of(ISO, CS),
				of(JAPANESE, CS),
				of(MINGUO, CS),
				of(ISO, KOK),
				of(ISO, MGO),
				of(ISO, FI),
				of(ISO, YI),
				of(ISO, TO),
				of(ISO, ET),
				of(ISO, BR),
				of(ISO, HAW),
				of(ISO, ZU),
				of(ISO, JGO),
				of(ISO, DZ),
				of(ISO, YUE_HANS),
				of(JAPANESE, YUE_HANS),
				of(ISO, TI),
				of(THAI_BUDDHIST, AM),
				of(ISO, AM),
				of(ISO, SE),
				of(ISO, KN),
				of(ISO, KS),
				of(ISO, MG),
				of(ISO, AST),
				of(MINGUO, AST),
				of(ISO, TH),
				of(JAPANESE, TH),
				of(ISO, SV),
				of(JAPANESE, SV),
				of(ISO, SW),
				of(ISO, GU),
				of(ISO, YO_BJ),
				of(ISO, CU),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, PCM),
				of(ISO, FR),
				of(JAPANESE, FR),
				of(ISO, MI),
				of(ISO, FR_CA),
				of(ISO, PT),
				of(ISO, HR),
				of(JAPANESE, HR),
				of(ISO, AF),
				of(ISO, BN),
				of(ISO, SK),
				of(ISO, YUE),
				of(JAPANESE, YUE),
				of(ISO, SN),
				of(ISO, EU),
				of(ISO, GD),
				of(MINGUO, GD),
				of(ISO, FY),
				of(JAPANESE, FY),
				of(ISO, LV),
				of(ISO, RW),
				of(ISO, DA),
				of(ISO, ML),
				of(ISO, HU),
				of(ISO, AS),
				of(ISO, LT),
				of(ISO, HSB),
				of(ISO, BS),
				of(ISO, CY),
				of(ISO, MY),
				of(ISO, CCP),
				of(ISO, CA),
				of(ISO, KL),
				of(ISO, IA),
				of(ISO, PRG),
				of(ISO, QU),
				of(ISO, OM),
				of(ISO, ES),
				of(ISO, YO),
				of(ISO, RM),
				of(ISO, SR),
				of(ISO, II),
				of(THAI_BUDDHIST, ZH_HANT),
				of(ISO, ZH_HANT),
				of(JAPANESE, ZH_HANT),
				of(MINGUO, ZH_HANT),
				of(ISO, SR_LATN),
				of(ISO, MN),
				of(ISO, PS),
				of(ISO, UR),
				of(ISO, LRC),
				of(ISO, KKJ),
				of(ISO, ZH),
				of(JAPANESE, ZH),
				of(ISO, SD),
				of(ISO, KY),
				of(ISO, TR),
				of(ISO, ZGH),
				of(ISO, AR),
				of(ISO, MT),
				of(ISO, CKB),
				of(ISO, UZ_CYRL),
				of(ISO, JA),
				of(JAPANESE, JA),
				of(THAI_BUDDHIST, NB),
				of(JAPANESE, NB),
				of(MINGUO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, LB),
				of(THAI_BUDDHIST, NL),
				of(ISO, NL),
				of(JAPANESE, NL),
				of(MINGUO, NL),
				of(THAI_BUDDHIST, GA),
				of(ISO, GA),
				of(ISO, SL),
				});
		DATE_TIME_SHORT_PATTERNS.put("{0}, {1}", new PatternCoordinates[] {
				of(ISO, VI),
				of(ISO, GL),
				});
		DATE_TIME_SHORT_PATTERNS.put("{1}،‏ {0}", new PatternCoordinates[] {
				of(ISO, FA),
				});
		DATE_TIME_SHORT_PATTERNS.put("{0} {1}", new PatternCoordinates[] {
				of(ISO, EE),
				});
		DATE_TIME_SHORT_PATTERNS.put("{1} - {0}", new PatternCoordinates[] {
				of(ISO, WO),
				});
		DATE_TIME_SHORT_PATTERNS.put("{1}، {0}", new PatternCoordinates[] {
				of(ISO, UG),
				});
		TIME_FULL_PATTERNS.put("H:mm:ss zzzz", new PatternCoordinates[] {
				of(ISO, DSB),
				of(ISO, CS),
				of(ISO, BG),
				of(ISO, AR_IL),
				of(ISO, HE),
				of(ISO, SK),
				of(ISO, HU),
				of(ISO, HSB),
				of(ISO, EN_IL),
				of(ISO, CA),
				of(ISO, ES_MX),
				of(ISO, TT),
				});
		TIME_FULL_PATTERNS.put("ah:mm:ss [zzzz]", new PatternCoordinates[] {
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				});
		TIME_FULL_PATTERNS.put("H ໂມງ m ນາທີ ss ວິນາທີ zzzz", new PatternCoordinates[] {
				of(ISO, LO),
				});
		TIME_FULL_PATTERNS.put("'kl'. HH:mm:ss zzzz", new PatternCoordinates[] {
				of(ISO, NN),
				of(ISO, SV),
				});
		TIME_FULL_PATTERNS.put("zzzz HH:mm:ss", new PatternCoordinates[] {
				of(ISO, MY),
				});
		TIME_FULL_PATTERNS.put("h:mm:ss a zzzz", new PatternCoordinates[] {
				of(ISO, NE_IN),
				of(ISO, HI),
				of(ISO, PS_PK),
				of(ISO, TE),
				of(ISO, FR_TD),
				of(ISO, MAI),
				of(ISO, FF_LATN_SL),
				of(ISO, KOK),
				of(ISO, FF_ADLM_SL),
				of(ISO, KAB),
				of(ISO, CEB),
				of(ISO, ES_US),
				of(ISO, BEM),
				of(ISO, TO),
				of(ISO, TR_CY),
				of(ISO, HAW),
				of(ISO, VAI),
				of(ISO, NAQ),
				of(ISO, BO),
				of(ISO, FF_LATN_GH),
				of(ISO, PA_ARAB),
				of(ISO, OR),
				of(ISO, TI),
				of(ISO, ES_PR),
				of(ISO, FF_LATN_MR),
				of(ISO, AM),
				of(ISO, FF_ADLM_GH),
				of(ISO, VAI_LATN),
				of(ISO, ES_PH),
				of(ISO, KS),
				of(ISO, HA_GH),
				of(ISO, KM),
				of(ISO, ES_VE),
				of(ISO, CHR),
				of(ISO, FIL),
				of(ISO, ES_DO),
				of(ISO, PA),
				of(ISO, AF_NA),
				of(ISO, MI),
				of(ISO, FF_LATN_GM),
				of(ISO, FR_DJ),
				of(ISO, BN),
				of(ISO, ES_PA),
				of(ISO, FR_MR),
				of(ISO, EN),
				of(ISO, EL),
				of(ISO, FF_LATN_LR),
				of(ISO, FR_VU),
				of(ISO, ML),
				of(ISO, AK),
				of(ISO, FR_TN),
				of(ISO, LRC_IQ),
				of(ISO, SAT),
				of(ISO, FF_ADLM_LR),
				of(ISO, CCP),
				of(ISO, PT_MO),
				of(ISO, FR_DZ),
				of(ISO, MNI),
				of(ISO, OM),
				of(ISO, FR_SY),
				of(ISO, LKT),
				of(ISO, II),
				of(ISO, UR),
				of(ISO, FF_ADLM_MR),
				of(ISO, SD),
				of(ISO, AR),
				of(ISO, BRX),
				of(ISO, CKB),
				of(ISO, SO),
				of(ISO, ES_CO),
				of(ISO, FF_ADLM_GM),
				of(ISO, MR),
				of(ISO, UG),
				of(ISO, MS),
				});
		TIME_FULL_PATTERNS.put("H.mm.ss zzzz", new PatternCoordinates[] {
				of(ISO, SMN),
				of(ISO, FI),
				of(ISO, EN_FI),
				of(ISO, SU),
				});
		TIME_FULL_PATTERNS.put("H 'h' mm 'min' ss 's' zzzz", new PatternCoordinates[] {
				of(ISO, FR_BE),
				});
		TIME_FULL_PATTERNS.put("H นาฬิกา mm นาที ss วินาที zzzz", new PatternCoordinates[] {
				of(ISO, TH),
				});
		TIME_FULL_PATTERNS.put("HH.mm.ss zzzz", new PatternCoordinates[] {
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DA),
				of(ISO, KL),
				of(ISO, EN_DK),
				of(ISO, MS_ID),
				});
		TIME_FULL_PATTERNS.put("'Klock' H.mm:ss (zzzz)", new PatternCoordinates[] {
				of(ISO, NDS),
				});
		TIME_FULL_PATTERNS.put("H:mm:ss (zzzz)", new PatternCoordinates[] {
				of(ISO, UZ),
				of(ISO, ES),
				of(ISO, UZ_ARAB),
				of(ISO, PS),
				of(ISO, FA),
				});
		TIME_FULL_PATTERNS.put("h:mm:ss a, zzzz", new PatternCoordinates[] {
				of(ISO, SQ),
				});
		TIME_FULL_PATTERNS.put("HH:mm:ss zzzz", new PatternCoordinates[] {
				of(ISO, EN_SC),
				of(ISO, SO_KE),
				of(ISO, AR_MA),
				of(ISO, CKB_IR),
				of(ISO, KEA),
				of(ISO, FF),
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, PT_PT),
				of(ISO, EN_IE),
				of(ISO, BM),
				of(ISO, SR_LATN_BA),
				of(ISO, EN_PN),
				of(ISO, EN_TK),
				of(ISO, EN_NG),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, EN_UG),
				of(ISO, MUA),
				of(ISO, EN_NF),
				of(ISO, LAG),
				of(ISO, MGO),
				of(ISO, EWO),
				of(ISO, EN_BW),
				of(ISO, VI),
				of(ISO, YI),
				of(ISO, EN_DG),
				of(ISO, ET),
				of(ISO, EN_NU),
				of(ISO, BR),
				of(ISO, EBU),
				of(ISO, UK),
				of(ISO, KK),
				of(ISO, ZU),
				of(ISO, JGO),
				of(ISO, EN_BI),
				of(ISO, RO),
				of(ISO, RN),
				of(ISO, MAS),
				of(ISO, EN_AI),
				of(ISO, FO),
				of(ISO, ASA),
				of(ISO, EN_CC),
				of(ISO, EN_MS),
				of(ISO, VUN),
				of(ISO, EN_MT),
				of(ISO, SE),
				of(ISO, KSF),
				of(ISO, SQ_MK),
				of(ISO, MFE),
				of(ISO, SEH),
				of(ISO, DAV),
				of(ISO, MG),
				of(ISO, SR_CYRL_BA),
				of(ISO, JMC),
				of(ISO, AST),
				of(ISO, PL),
				of(ISO, WO),
				of(ISO, KA),
				of(ISO, RWK),
				of(ISO, DUA),
				of(ISO, SAQ),
				of(ISO, EN_IO),
				of(ISO, HY),
				of(ISO, LUO),
				of(ISO, KDE),
				of(ISO, BAS),
				of(ISO, EN_CM),
				of(ISO, SW),
				of(ISO, GL),
				of(ISO, GSW),
				of(ISO, YO_BJ),
				of(ISO, CU),
				of(ISO, MGH),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, PCM),
				of(ISO, FR),
				of(ISO, EN_GB),
				of(ISO, PT),
				of(ISO, GUZ),
				of(ISO, SES),
				of(ISO, AF),
				of(ISO, EN_ZA),
				of(ISO, TA_LK),
				of(ISO, EN_150),
				of(ISO, IT),
				of(ISO, ES_419),
				of(ISO, LUY),
				of(ISO, SN),
				of(ISO, NMG),
				of(ISO, GD),
				of(ISO, IS),
				of(ISO, FY),
				of(ISO, EN_CX),
				of(ISO, LV),
				of(ISO, JV),
				of(ISO, RW),
				of(ISO, KW),
				of(ISO, EN_JE),
				of(ISO, EN_GI),
				of(ISO, GV),
				of(ISO, LT),
				of(ISO, NYN),
				of(ISO, EN_TV),
				of(ISO, MER),
				of(ISO, VO),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, KSH),
				of(ISO, BS),
				of(ISO, CY),
				of(ISO, SQ_XK),
				of(ISO, ND),
				of(ISO, AZ_CYRL),
				of(ISO, EN_NR),
				of(ISO, EE_TG),
				of(ISO, EN_FK),
				of(ISO, EN_SX),
				of(ISO, EN_IM),
				of(ISO, EN_CK),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, EN_SH),
				of(ISO, RU),
				of(ISO, XOG),
				of(ISO, EN_KE),
				of(ISO, IA),
				of(ISO, PRG),
				of(ISO, SBP),
				of(ISO, YAV),
				of(ISO, LG),
				of(ISO, EN_ZW),
				of(ISO, QU),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, EN_GG),
				of(ISO, YO),
				of(ISO, RM),
				of(ISO, AR_KM),
				of(ISO, SR),
				of(ISO, LN),
				of(ISO, NE),
				of(ISO, SR_LATN),
				of(ISO, CGG),
				of(ISO, HA_NE),
				of(ISO, EN_BZ),
				of(ISO, LU),
				of(ISO, OM_KE),
				of(ISO, EN_MU),
				of(ISO, LRC),
				of(ISO, KY),
				of(ISO, KI),
				of(ISO, TR),
				of(ISO, HA),
				of(ISO, ZGH),
				of(ISO, EN_RW),
				of(ISO, MT),
				of(ISO, EN_MG),
				of(ISO, DJE),
				of(ISO, BS_CYRL),
				of(ISO, OS),
				of(ISO, SG),
				of(ISO, TEO),
				of(ISO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, FUR),
				of(ISO, LB),
				of(ISO, KAM),
				of(ISO, NL),
				of(ISO, EN_TZ),
				of(ISO, DE),
				of(ISO, GA),
				of(ISO, SL),
				});
		TIME_FULL_PATTERNS.put("a h시 m분 s초 zzzz", new PatternCoordinates[] {
				of(ISO, KO),
				});
		TIME_FULL_PATTERNS.put("HH.mm:ss 'h' zzzz", new PatternCoordinates[] {
				of(ISO, FR_CH),
				});
		TIME_FULL_PATTERNS.put("H-'a' 'horo' 'kaj' m:ss zzzz", new PatternCoordinates[] {
				of(ISO, EO),
				});
		TIME_FULL_PATTERNS.put("ཆུ་ཚོད་ h སྐར་མ་ mm:ss a zzzz", new PatternCoordinates[] {
				of(ISO, DZ),
				});
		TIME_FULL_PATTERNS.put("a h.mm.ss zzzz", new PatternCoordinates[] {
				of(ISO, AS),
				});
		TIME_FULL_PATTERNS.put("HH:mm:ss (zzzz)", new PatternCoordinates[] {
				of(ISO, HR),
				of(ISO, EU),
				of(ISO, MN),
				of(ISO, UZ_CYRL),
				});
		TIME_FULL_PATTERNS.put("a 'ga' h:mm:ss zzzz", new PatternCoordinates[] {
				of(ISO, EE),
				});
		TIME_FULL_PATTERNS.put("zzzz ah:mm:ss", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, ZH),
				});
		TIME_FULL_PATTERNS.put("a h:mm:ss zzzz", new PatternCoordinates[] {
				of(ISO, TA),
				of(ISO, SD_DEVA),
				});
		TIME_FULL_PATTERNS.put("HH:mm:ss, zzzz", new PatternCoordinates[] {
				of(ISO, BE),
				});
		TIME_FULL_PATTERNS.put("hh:mm:ss a zzzz", new PatternCoordinates[] {
				of(ISO, KN),
				of(ISO, GU),
				});
		TIME_FULL_PATTERNS.put("zzzz h:mm:ss a", new PatternCoordinates[] {
				of(ISO, NUS),
				});
		TIME_FULL_PATTERNS.put("HH 'h' mm 'min' ss 's' zzzz", new PatternCoordinates[] {
				of(ISO, FR_CA),
				});
		TIME_FULL_PATTERNS.put("H時mm分ss秒 zzzz", new PatternCoordinates[] {
				of(ISO, JA),
				});
		TIME_LONG_PATTERNS.put("HH:mm:ss z", new PatternCoordinates[] {
				of(ISO, EN_SC),
				of(ISO, SO_KE),
				of(ISO, AR_MA),
				of(ISO, CKB_IR),
				of(ISO, KEA),
				of(ISO, FF),
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, PT_PT),
				of(ISO, EN_IE),
				of(ISO, BM),
				of(ISO, SR_LATN_BA),
				of(ISO, EN_PN),
				of(ISO, EN_TK),
				of(ISO, EN_NG),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, EN_UG),
				of(ISO, MUA),
				of(ISO, EN_NF),
				of(ISO, LAG),
				of(ISO, MGO),
				of(ISO, EWO),
				of(ISO, EN_BW),
				of(ISO, VI),
				of(ISO, YI),
				of(ISO, EN_DG),
				of(ISO, ET),
				of(ISO, EN_NU),
				of(ISO, BR),
				of(ISO, EBU),
				of(ISO, UK),
				of(ISO, KK),
				of(ISO, ZU),
				of(ISO, NN),
				of(ISO, JGO),
				of(ISO, EN_BI),
				of(ISO, RO),
				of(ISO, RN),
				of(ISO, MAS),
				of(ISO, EN_AI),
				of(ISO, FO),
				of(ISO, ASA),
				of(ISO, EN_CC),
				of(ISO, EN_MS),
				of(ISO, VUN),
				of(ISO, EN_MT),
				of(ISO, SE),
				of(ISO, KSF),
				of(ISO, SQ_MK),
				of(ISO, MFE),
				of(ISO, SEH),
				of(ISO, DAV),
				of(ISO, MG),
				of(ISO, SR_CYRL_BA),
				of(ISO, JMC),
				of(ISO, AST),
				of(ISO, PL),
				of(ISO, WO),
				of(ISO, KA),
				of(ISO, RWK),
				of(ISO, DUA),
				of(ISO, SAQ),
				of(ISO, EN_IO),
				of(ISO, HY),
				of(ISO, LUO),
				of(ISO, KDE),
				of(ISO, SV),
				of(ISO, BAS),
				of(ISO, EN_CM),
				of(ISO, SW),
				of(ISO, GL),
				of(ISO, GSW),
				of(ISO, CU),
				of(ISO, MGH),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, FR),
				of(ISO, EN_GB),
				of(ISO, PT),
				of(ISO, GUZ),
				of(ISO, HR),
				of(ISO, SES),
				of(ISO, AF),
				of(ISO, EN_ZA),
				of(ISO, TA_LK),
				of(ISO, EN_150),
				of(ISO, IT),
				of(ISO, ES_419),
				of(ISO, LUY),
				of(ISO, SN),
				of(ISO, NMG),
				of(ISO, GD),
				of(ISO, IS),
				of(ISO, FY),
				of(ISO, EN_CX),
				of(ISO, LV),
				of(ISO, JV),
				of(ISO, RW),
				of(ISO, KW),
				of(ISO, EN_JE),
				of(ISO, EN_GI),
				of(ISO, GV),
				of(ISO, LT),
				of(ISO, NYN),
				of(ISO, EN_TV),
				of(ISO, MER),
				of(ISO, VO),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, KSH),
				of(ISO, BS),
				of(ISO, CY),
				of(ISO, SQ_XK),
				of(ISO, ND),
				of(ISO, AZ_CYRL),
				of(ISO, EN_NR),
				of(ISO, EE_TG),
				of(ISO, EN_FK),
				of(ISO, EN_SX),
				of(ISO, EN_IM),
				of(ISO, EN_CK),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, EN_SH),
				of(ISO, RU),
				of(ISO, XOG),
				of(ISO, EN_KE),
				of(ISO, IA),
				of(ISO, PRG),
				of(ISO, SBP),
				of(ISO, YAV),
				of(ISO, LG),
				of(ISO, EN_ZW),
				of(ISO, QU),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, EN_GG),
				of(ISO, EO),
				of(ISO, RM),
				of(ISO, AR_KM),
				of(ISO, SR),
				of(ISO, LN),
				of(ISO, NE),
				of(ISO, SR_LATN),
				of(ISO, CGG),
				of(ISO, HA_NE),
				of(ISO, EN_BZ),
				of(ISO, LU),
				of(ISO, OM_KE),
				of(ISO, EN_MU),
				of(ISO, LRC),
				of(ISO, KY),
				of(ISO, KI),
				of(ISO, TR),
				of(ISO, HA),
				of(ISO, ZGH),
				of(ISO, EN_RW),
				of(ISO, MT),
				of(ISO, EN_MG),
				of(ISO, DJE),
				of(ISO, BS_CYRL),
				of(ISO, OS),
				of(ISO, SG),
				of(ISO, BE),
				of(ISO, TEO),
				of(ISO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, FUR),
				of(ISO, LB),
				of(ISO, KAM),
				of(ISO, NL),
				of(ISO, EN_TZ),
				of(ISO, DE),
				of(ISO, GA),
				of(ISO, SL),
				});
		TIME_LONG_PATTERNS.put("H ໂມງ m ນາທີ ss ວິນາທີ z", new PatternCoordinates[] {
				of(ISO, LO),
				});
		TIME_LONG_PATTERNS.put("'Klock' H.mm:ss (z)", new PatternCoordinates[] {
				of(ISO, NDS),
				});
		TIME_LONG_PATTERNS.put("z HH:mm:ss", new PatternCoordinates[] {
				of(ISO, MY),
				});
		TIME_LONG_PATTERNS.put("z h:mm:ss a", new PatternCoordinates[] {
				of(ISO, NUS),
				});
		TIME_LONG_PATTERNS.put("HH:mm:ss (z)", new PatternCoordinates[] {
				of(ISO, EU),
				of(ISO, MN),
				of(ISO, UZ_CYRL),
				});
		TIME_LONG_PATTERNS.put("HH 'h' mm 'min' ss 's' z", new PatternCoordinates[] {
				of(ISO, FR_CA),
				});
		TIME_LONG_PATTERNS.put("a 'ga' h:mm:ss z", new PatternCoordinates[] {
				of(ISO, EE),
				});
		TIME_LONG_PATTERNS.put("ah:mm:ss [z]", new PatternCoordinates[] {
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				});
		TIME_LONG_PATTERNS.put("H:mm:ss z", new PatternCoordinates[] {
				of(ISO, DSB),
				of(ISO, CS),
				of(ISO, BG),
				of(ISO, AR_IL),
				of(ISO, HE),
				of(ISO, YO_BJ),
				of(ISO, PCM),
				of(ISO, SK),
				of(ISO, HU),
				of(ISO, HSB),
				of(ISO, EN_IL),
				of(ISO, CA),
				of(ISO, ES),
				of(ISO, YO),
				of(ISO, ES_MX),
				of(ISO, JA),
				of(ISO, TT),
				});
		TIME_LONG_PATTERNS.put("a h:mm:ss z", new PatternCoordinates[] {
				of(ISO, TA),
				of(ISO, SD_DEVA),
				});
		TIME_LONG_PATTERNS.put("H นาฬิกา mm นาที ss วินาที z", new PatternCoordinates[] {
				of(ISO, TH),
				});
		TIME_LONG_PATTERNS.put("a h시 m분 s초 z", new PatternCoordinates[] {
				of(ISO, KO),
				});
		TIME_LONG_PATTERNS.put("HH.mm.ss z", new PatternCoordinates[] {
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DA),
				of(ISO, KL),
				of(ISO, EN_DK),
				of(ISO, MS_ID),
				});
		TIME_LONG_PATTERNS.put("H.mm.ss z", new PatternCoordinates[] {
				of(ISO, SMN),
				of(ISO, FI),
				of(ISO, EN_FI),
				of(ISO, SU),
				});
		TIME_LONG_PATTERNS.put("h:mm:ss a z", new PatternCoordinates[] {
				of(ISO, NE_IN),
				of(ISO, HI),
				of(ISO, PS_PK),
				of(ISO, TE),
				of(ISO, FR_TD),
				of(ISO, MAI),
				of(ISO, FF_LATN_SL),
				of(ISO, KOK),
				of(ISO, FF_ADLM_SL),
				of(ISO, KAB),
				of(ISO, CEB),
				of(ISO, ES_US),
				of(ISO, BEM),
				of(ISO, TO),
				of(ISO, TR_CY),
				of(ISO, HAW),
				of(ISO, VAI),
				of(ISO, NAQ),
				of(ISO, BO),
				of(ISO, FF_LATN_GH),
				of(ISO, PA_ARAB),
				of(ISO, OR),
				of(ISO, TI),
				of(ISO, ES_PR),
				of(ISO, FF_LATN_MR),
				of(ISO, AM),
				of(ISO, FF_ADLM_GH),
				of(ISO, VAI_LATN),
				of(ISO, ES_PH),
				of(ISO, KS),
				of(ISO, HA_GH),
				of(ISO, KM),
				of(ISO, ES_VE),
				of(ISO, CHR),
				of(ISO, FIL),
				of(ISO, ES_DO),
				of(ISO, PA),
				of(ISO, AF_NA),
				of(ISO, MI),
				of(ISO, FF_LATN_GM),
				of(ISO, FR_DJ),
				of(ISO, BN),
				of(ISO, ES_PA),
				of(ISO, FR_MR),
				of(ISO, EN),
				of(ISO, EL),
				of(ISO, FF_LATN_LR),
				of(ISO, FR_VU),
				of(ISO, ML),
				of(ISO, AK),
				of(ISO, FR_TN),
				of(ISO, LRC_IQ),
				of(ISO, SAT),
				of(ISO, FF_ADLM_LR),
				of(ISO, CCP),
				of(ISO, PT_MO),
				of(ISO, FR_DZ),
				of(ISO, MNI),
				of(ISO, OM),
				of(ISO, FR_SY),
				of(ISO, LKT),
				of(ISO, II),
				of(ISO, UR),
				of(ISO, FF_ADLM_MR),
				of(ISO, SD),
				of(ISO, AR),
				of(ISO, BRX),
				of(ISO, CKB),
				of(ISO, SO),
				of(ISO, ES_CO),
				of(ISO, FF_ADLM_GM),
				of(ISO, MR),
				of(ISO, UG),
				of(ISO, MS),
				});
		TIME_LONG_PATTERNS.put("ཆུ་ཚོད་ h སྐར་མ་ mm:ss a z", new PatternCoordinates[] {
				of(ISO, DZ),
				});
		TIME_LONG_PATTERNS.put("H:mm:ss (z)", new PatternCoordinates[] {
				of(ISO, UZ),
				of(ISO, UZ_ARAB),
				of(ISO, PS),
				of(ISO, FA),
				});
		TIME_LONG_PATTERNS.put("h:mm:ss a, z", new PatternCoordinates[] {
				of(ISO, SQ),
				});
		TIME_LONG_PATTERNS.put("hh:mm:ss a z", new PatternCoordinates[] {
				of(ISO, KN),
				of(ISO, GU),
				});
		TIME_LONG_PATTERNS.put("a h.mm.ss z", new PatternCoordinates[] {
				of(ISO, AS),
				});
		TIME_LONG_PATTERNS.put("z ah:mm:ss", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, ZH),
				});
		TIME_MEDIUM_PATTERNS.put("HH:mm:ss", new PatternCoordinates[] {
				of(ISO, EN_SC),
				of(ISO, SO_KE),
				of(ISO, AR_MA),
				of(ISO, CKB_IR),
				of(ISO, KEA),
				of(ISO, FF),
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, PT_PT),
				of(ISO, EN_IE),
				of(ISO, BM),
				of(ISO, SR_LATN_BA),
				of(ISO, EN_PN),
				of(ISO, EN_TK),
				of(ISO, EN_NG),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, EN_UG),
				of(ISO, MUA),
				of(ISO, EN_NF),
				of(ISO, LAG),
				of(ISO, MGO),
				of(ISO, EWO),
				of(ISO, EN_BW),
				of(ISO, VI),
				of(ISO, YI),
				of(ISO, EN_DG),
				of(ISO, ET),
				of(ISO, EN_NU),
				of(ISO, BR),
				of(ISO, EBU),
				of(ISO, UK),
				of(ISO, KK),
				of(ISO, ZU),
				of(ISO, NN),
				of(ISO, JGO),
				of(ISO, EN_BI),
				of(ISO, RO),
				of(ISO, RN),
				of(ISO, MAS),
				of(ISO, EN_AI),
				of(ISO, FO),
				of(ISO, ASA),
				of(ISO, EN_CC),
				of(ISO, EN_MS),
				of(ISO, VUN),
				of(ISO, EN_MT),
				of(ISO, SE),
				of(ISO, KSF),
				of(ISO, UZ),
				of(ISO, SQ_MK),
				of(ISO, MFE),
				of(ISO, SEH),
				of(ISO, DAV),
				of(ISO, MG),
				of(ISO, SR_CYRL_BA),
				of(ISO, JMC),
				of(ISO, AST),
				of(ISO, PL),
				of(ISO, WO),
				of(ISO, KA),
				of(ISO, TH),
				of(ISO, RWK),
				of(ISO, DUA),
				of(ISO, SAQ),
				of(ISO, EN_IO),
				of(ISO, HY),
				of(ISO, LUO),
				of(ISO, KDE),
				of(ISO, SV),
				of(ISO, BAS),
				of(ISO, EN_CM),
				of(ISO, SW),
				of(ISO, GL),
				of(ISO, GSW),
				of(ISO, CU),
				of(ISO, MGH),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, PCM),
				of(ISO, FR),
				of(ISO, EN_GB),
				of(ISO, PT),
				of(ISO, GUZ),
				of(ISO, HR),
				of(ISO, SES),
				of(ISO, AF),
				of(ISO, EN_ZA),
				of(ISO, TA_LK),
				of(ISO, EN_150),
				of(ISO, IT),
				of(ISO, ES_419),
				of(ISO, LUY),
				of(ISO, SN),
				of(ISO, EU),
				of(ISO, NMG),
				of(ISO, GD),
				of(ISO, IS),
				of(ISO, FY),
				of(ISO, EN_CX),
				of(ISO, LV),
				of(ISO, JV),
				of(ISO, RW),
				of(ISO, KW),
				of(ISO, EN_JE),
				of(ISO, EN_GI),
				of(ISO, GV),
				of(ISO, LT),
				of(ISO, NYN),
				of(ISO, EN_TV),
				of(ISO, MER),
				of(ISO, VO),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, KSH),
				of(ISO, BS),
				of(ISO, CY),
				of(ISO, SQ_XK),
				of(ISO, ND),
				of(ISO, AZ_CYRL),
				of(ISO, EN_NR),
				of(ISO, EE_TG),
				of(ISO, EN_FK),
				of(ISO, EN_SX),
				of(ISO, EN_IM),
				of(ISO, EN_CK),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, EN_SH),
				of(ISO, RU),
				of(ISO, XOG),
				of(ISO, EN_KE),
				of(ISO, IA),
				of(ISO, PRG),
				of(ISO, SBP),
				of(ISO, YAV),
				of(ISO, LG),
				of(ISO, EN_ZW),
				of(ISO, QU),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, EN_GG),
				of(ISO, EO),
				of(ISO, RM),
				of(ISO, AR_KM),
				of(ISO, SR),
				of(ISO, LN),
				of(ISO, NE),
				of(ISO, SR_LATN),
				of(ISO, CGG),
				of(ISO, HA_NE),
				of(ISO, EN_BZ),
				of(ISO, MN),
				of(ISO, LU),
				of(ISO, OM_KE),
				of(ISO, EN_MU),
				of(ISO, LRC),
				of(ISO, KKJ),
				of(ISO, KY),
				of(ISO, KI),
				of(ISO, TR),
				of(ISO, HA),
				of(ISO, ZGH),
				of(ISO, EN_RW),
				of(ISO, MT),
				of(ISO, EN_MG),
				of(ISO, DJE),
				of(ISO, BS_CYRL),
				of(ISO, OS),
				of(ISO, SG),
				of(ISO, BE),
				of(ISO, TEO),
				of(ISO, UZ_CYRL),
				of(ISO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, FUR),
				of(ISO, LB),
				of(ISO, KAM),
				of(ISO, NL),
				of(ISO, EN_TZ),
				of(ISO, DE),
				of(ISO, GA),
				of(ISO, SL),
				});
		TIME_MEDIUM_PATTERNS.put("ah:mm:ss", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				of(ISO, ZH),
				});
		TIME_MEDIUM_PATTERNS.put("B HH:mm:ss", new PatternCoordinates[] {
				of(ISO, MY),
				});
		TIME_MEDIUM_PATTERNS.put("H:mm:ss", new PatternCoordinates[] {
				of(ISO, LO),
				of(ISO, DSB),
				of(ISO, CS),
				of(ISO, BG),
				of(ISO, AR_IL),
				of(ISO, HE),
				of(ISO, SK),
				of(ISO, HU),
				of(ISO, HSB),
				of(ISO, EN_IL),
				of(ISO, CA),
				of(ISO, ES),
				of(ISO, UZ_ARAB),
				of(ISO, PS),
				of(ISO, ES_MX),
				of(ISO, FA),
				of(ISO, JA),
				of(ISO, TT),
				});
		TIME_MEDIUM_PATTERNS.put("a h.mm.ss", new PatternCoordinates[] {
				of(ISO, AS),
				});
		TIME_MEDIUM_PATTERNS.put("HH.mm.ss", new PatternCoordinates[] {
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DA),
				of(ISO, KL),
				of(ISO, EN_DK),
				of(ISO, MS_ID),
				});
		TIME_MEDIUM_PATTERNS.put("H:m:s", new PatternCoordinates[] {
				of(ISO, YO_BJ),
				of(ISO, YO),
				});
		TIME_MEDIUM_PATTERNS.put("h:mm:ss a", new PatternCoordinates[] {
				of(ISO, NE_IN),
				of(ISO, HI),
				of(ISO, PS_PK),
				of(ISO, TE),
				of(ISO, FR_TD),
				of(ISO, MAI),
				of(ISO, FF_LATN_SL),
				of(ISO, KOK),
				of(ISO, FF_ADLM_SL),
				of(ISO, KAB),
				of(ISO, CEB),
				of(ISO, ES_US),
				of(ISO, BEM),
				of(ISO, TO),
				of(ISO, TR_CY),
				of(ISO, HAW),
				of(ISO, VAI),
				of(ISO, NAQ),
				of(ISO, BO),
				of(ISO, FF_LATN_GH),
				of(ISO, PA_ARAB),
				of(ISO, OR),
				of(ISO, TI),
				of(ISO, ES_PR),
				of(ISO, FF_LATN_MR),
				of(ISO, AM),
				of(ISO, FF_ADLM_GH),
				of(ISO, VAI_LATN),
				of(ISO, ES_PH),
				of(ISO, KS),
				of(ISO, HA_GH),
				of(ISO, KM),
				of(ISO, ES_VE),
				of(ISO, CHR),
				of(ISO, FIL),
				of(ISO, ES_DO),
				of(ISO, PA),
				of(ISO, AF_NA),
				of(ISO, MI),
				of(ISO, FF_LATN_GM),
				of(ISO, FR_DJ),
				of(ISO, BN),
				of(ISO, ES_PA),
				of(ISO, FR_MR),
				of(ISO, EN),
				of(ISO, EL),
				of(ISO, FF_LATN_LR),
				of(ISO, FR_VU),
				of(ISO, ML),
				of(ISO, AK),
				of(ISO, FR_TN),
				of(ISO, LRC_IQ),
				of(ISO, SAT),
				of(ISO, FF_ADLM_LR),
				of(ISO, CCP),
				of(ISO, PT_MO),
				of(ISO, FR_DZ),
				of(ISO, MNI),
				of(ISO, OM),
				of(ISO, FR_SY),
				of(ISO, LKT),
				of(ISO, II),
				of(ISO, UR),
				of(ISO, FF_ADLM_MR),
				of(ISO, SD),
				of(ISO, AR),
				of(ISO, BRX),
				of(ISO, CKB),
				of(ISO, SO),
				of(ISO, ES_CO),
				of(ISO, NUS),
				of(ISO, SQ),
				of(ISO, FF_ADLM_GM),
				of(ISO, MR),
				of(ISO, UG),
				of(ISO, MS),
				});
		TIME_MEDIUM_PATTERNS.put("a h:mm:ss", new PatternCoordinates[] {
				of(ISO, KO),
				of(ISO, TA),
				of(ISO, SD_DEVA),
				});
		TIME_MEDIUM_PATTERNS.put("'Klock' H.mm:ss", new PatternCoordinates[] {
				of(ISO, NDS),
				});
		TIME_MEDIUM_PATTERNS.put("hh:mm:ss a", new PatternCoordinates[] {
				of(ISO, KN),
				of(ISO, GU),
				});
		TIME_MEDIUM_PATTERNS.put("a 'ga' h:mm:ss", new PatternCoordinates[] {
				of(ISO, EE),
				});
		TIME_MEDIUM_PATTERNS.put("H.mm.ss", new PatternCoordinates[] {
				of(ISO, SMN),
				of(ISO, FI),
				of(ISO, EN_FI),
				of(ISO, SU),
				});
		TIME_MEDIUM_PATTERNS.put("ཆུ་ཚོད་h:mm:ss a", new PatternCoordinates[] {
				of(ISO, DZ),
				});
		TIME_MEDIUM_PATTERNS.put("HH 'h' mm 'min' ss 's'", new PatternCoordinates[] {
				of(ISO, FR_CA),
				});
		TIME_SHORT_PATTERNS.put("HH:mm", new PatternCoordinates[] {
				of(ISO, EN_SC),
				of(ISO, SO_KE),
				of(ISO, AR_MA),
				of(ISO, CKB_IR),
				of(ISO, KEA),
				of(ISO, FF),
				of(ISO, TK),
				of(ISO, AZ),
				of(ISO, PT_PT),
				of(ISO, EN_IE),
				of(ISO, BM),
				of(ISO, SR_LATN_BA),
				of(ISO, EN_PN),
				of(ISO, EN_TK),
				of(ISO, EN_NG),
				of(ISO, KHQ),
				of(ISO, AGQ),
				of(ISO, EN_UG),
				of(ISO, MUA),
				of(ISO, EN_NF),
				of(ISO, LAG),
				of(ISO, MGO),
				of(ISO, EWO),
				of(ISO, EN_BW),
				of(ISO, VI),
				of(ISO, YI),
				of(ISO, EN_DG),
				of(ISO, ET),
				of(ISO, EN_NU),
				of(ISO, BR),
				of(ISO, EBU),
				of(ISO, UK),
				of(ISO, KK),
				of(ISO, ZU),
				of(ISO, NN),
				of(ISO, JGO),
				of(ISO, EN_BI),
				of(ISO, RO),
				of(ISO, RN),
				of(ISO, MAS),
				of(ISO, EN_AI),
				of(ISO, FO),
				of(ISO, ASA),
				of(ISO, EN_CC),
				of(ISO, EN_MS),
				of(ISO, VUN),
				of(ISO, EN_MT),
				of(ISO, SE),
				of(ISO, KSF),
				of(ISO, UZ),
				of(ISO, SQ_MK),
				of(ISO, MFE),
				of(ISO, SEH),
				of(ISO, DAV),
				of(ISO, MG),
				of(ISO, SR_CYRL_BA),
				of(ISO, JMC),
				of(ISO, AST),
				of(ISO, PL),
				of(ISO, WO),
				of(ISO, KA),
				of(ISO, TH),
				of(ISO, RWK),
				of(ISO, DUA),
				of(ISO, SAQ),
				of(ISO, EN_IO),
				of(ISO, HY),
				of(ISO, LUO),
				of(ISO, KDE),
				of(ISO, SV),
				of(ISO, BAS),
				of(ISO, EN_CM),
				of(ISO, SW),
				of(ISO, GL),
				of(ISO, GSW),
				of(ISO, CU),
				of(ISO, MGH),
				of(ISO, XH),
				of(THAI_BUDDHIST, ROOT),
				of(ISO, ROOT),
				of(HIJRAH_UMALQURA, ROOT),
				of(JAPANESE, ROOT),
				of(MINGUO, ROOT),
				of(ISO, PCM),
				of(ISO, FR),
				of(ISO, EN_GB),
				of(ISO, PT),
				of(ISO, GUZ),
				of(ISO, HR),
				of(ISO, SES),
				of(ISO, AF),
				of(ISO, EN_ZA),
				of(ISO, TA_LK),
				of(ISO, EN_150),
				of(ISO, IT),
				of(ISO, ES_419),
				of(ISO, LUY),
				of(ISO, SN),
				of(ISO, EU),
				of(ISO, NMG),
				of(ISO, GD),
				of(ISO, IS),
				of(ISO, FY),
				of(ISO, EN_CX),
				of(ISO, LV),
				of(ISO, JV),
				of(ISO, RW),
				of(ISO, KW),
				of(ISO, EN_JE),
				of(ISO, EN_GI),
				of(ISO, GV),
				of(ISO, LT),
				of(ISO, NYN),
				of(ISO, EN_TV),
				of(ISO, MER),
				of(ISO, VO),
				of(ISO, KLN),
				of(ISO, BEZ),
				of(ISO, KSH),
				of(ISO, BS),
				of(ISO, CY),
				of(ISO, SQ_XK),
				of(ISO, ND),
				of(ISO, AZ_CYRL),
				of(ISO, EN_NR),
				of(ISO, EE_TG),
				of(ISO, EN_FK),
				of(ISO, EN_SX),
				of(ISO, EN_IM),
				of(ISO, EN_CK),
				of(ISO, KSB),
				of(ISO, ROF),
				of(ISO, EN_SH),
				of(ISO, RU),
				of(ISO, XOG),
				of(ISO, EN_KE),
				of(ISO, IA),
				of(ISO, PRG),
				of(ISO, SBP),
				of(ISO, YAV),
				of(ISO, LG),
				of(ISO, EN_ZW),
				of(ISO, QU),
				of(ISO, DYO),
				of(ISO, TWQ),
				of(ISO, EN_GG),
				of(ISO, EO),
				of(ISO, RM),
				of(ISO, AR_KM),
				of(ISO, SR),
				of(ISO, LN),
				of(ISO, NE),
				of(ISO, SR_LATN),
				of(ISO, CGG),
				of(ISO, HA_NE),
				of(ISO, EN_BZ),
				of(ISO, MN),
				of(ISO, LU),
				of(ISO, OM_KE),
				of(ISO, EN_MU),
				of(ISO, LRC),
				of(ISO, KKJ),
				of(ISO, KY),
				of(ISO, KI),
				of(ISO, TR),
				of(ISO, HA),
				of(ISO, ZGH),
				of(ISO, EN_RW),
				of(ISO, MT),
				of(ISO, EN_MG),
				of(ISO, DJE),
				of(ISO, BS_CYRL),
				of(ISO, OS),
				of(ISO, SG),
				of(ISO, BE),
				of(ISO, TEO),
				of(ISO, UZ_CYRL),
				of(ISO, NB),
				of(ISO, SAH),
				of(ISO, MK),
				of(ISO, TG),
				of(ISO, FUR),
				of(ISO, LB),
				of(ISO, KAM),
				of(ISO, NL),
				of(ISO, EN_TZ),
				of(ISO, DE),
				of(ISO, GA),
				of(ISO, SL),
				});
		TIME_SHORT_PATTERNS.put("'Kl'. H.mm", new PatternCoordinates[] {
				of(ISO, NDS),
				});
		TIME_SHORT_PATTERNS.put("H.mm", new PatternCoordinates[] {
				of(ISO, SMN),
				of(ISO, FI),
				of(ISO, EN_FI),
				of(ISO, SU),
				});
		TIME_SHORT_PATTERNS.put("a h:mm", new PatternCoordinates[] {
				of(ISO, KO),
				of(ISO, TA),
				of(ISO, SD_DEVA),
				});
		TIME_SHORT_PATTERNS.put("HH 'h' mm", new PatternCoordinates[] {
				of(ISO, FR_CA),
				});
		TIME_SHORT_PATTERNS.put("h:mm a", new PatternCoordinates[] {
				of(ISO, NE_IN),
				of(ISO, HI),
				of(ISO, PS_PK),
				of(ISO, TE),
				of(ISO, FR_TD),
				of(ISO, MAI),
				of(ISO, FF_LATN_SL),
				of(ISO, KOK),
				of(ISO, FF_ADLM_SL),
				of(ISO, KAB),
				of(ISO, CEB),
				of(ISO, ES_US),
				of(ISO, BEM),
				of(ISO, TO),
				of(ISO, TR_CY),
				of(ISO, HAW),
				of(ISO, VAI),
				of(ISO, NAQ),
				of(ISO, BO),
				of(ISO, FF_LATN_GH),
				of(ISO, PA_ARAB),
				of(ISO, OR),
				of(ISO, TI),
				of(ISO, ES_PR),
				of(ISO, FF_LATN_MR),
				of(ISO, AM),
				of(ISO, FF_ADLM_GH),
				of(ISO, VAI_LATN),
				of(ISO, ES_PH),
				of(ISO, KS),
				of(ISO, HA_GH),
				of(ISO, KM),
				of(ISO, ES_VE),
				of(ISO, CHR),
				of(ISO, FIL),
				of(ISO, ES_DO),
				of(ISO, PA),
				of(ISO, AF_NA),
				of(ISO, MI),
				of(ISO, FF_LATN_GM),
				of(ISO, FR_DJ),
				of(ISO, BN),
				of(ISO, ES_PA),
				of(ISO, FR_MR),
				of(ISO, EN),
				of(ISO, EL),
				of(ISO, FF_LATN_LR),
				of(ISO, FR_VU),
				of(ISO, ML),
				of(ISO, AK),
				of(ISO, FR_TN),
				of(ISO, LRC_IQ),
				of(ISO, SAT),
				of(ISO, FF_ADLM_LR),
				of(ISO, CCP),
				of(ISO, PT_MO),
				of(ISO, FR_DZ),
				of(ISO, MNI),
				of(ISO, OM),
				of(ISO, FR_SY),
				of(ISO, LKT),
				of(ISO, II),
				of(ISO, UR),
				of(ISO, FF_ADLM_MR),
				of(ISO, SD),
				of(ISO, AR),
				of(ISO, BRX),
				of(ISO, CKB),
				of(ISO, SO),
				of(ISO, ES_CO),
				of(ISO, NUS),
				of(ISO, SQ),
				of(ISO, FF_ADLM_GM),
				of(ISO, MR),
				of(ISO, UG),
				of(ISO, MS),
				});
		TIME_SHORT_PATTERNS.put("H:mm 'hodź'.", new PatternCoordinates[] {
				of(ISO, HSB),
				});
		TIME_SHORT_PATTERNS.put("H:mm", new PatternCoordinates[] {
				of(ISO, LO),
				of(ISO, DSB),
				of(ISO, CS),
				of(ISO, BG),
				of(ISO, AR_IL),
				of(ISO, HE),
				of(ISO, SK),
				of(ISO, HU),
				of(ISO, EN_IL),
				of(ISO, CA),
				of(ISO, ES),
				of(ISO, UZ_ARAB),
				of(ISO, PS),
				of(ISO, ES_MX),
				of(ISO, FA),
				of(ISO, JA),
				of(ISO, TT),
				});
		TIME_SHORT_PATTERNS.put("ah:mm", new PatternCoordinates[] {
				of(ISO, YUE_HANS),
				of(ISO, YUE),
				of(ISO, ZH_HANT),
				of(ISO, ZH),
				});
		TIME_SHORT_PATTERNS.put("B H:mm", new PatternCoordinates[] {
				of(ISO, MY),
				});
		TIME_SHORT_PATTERNS.put("a 'ga' h:mm", new PatternCoordinates[] {
				of(ISO, EE),
				});
		TIME_SHORT_PATTERNS.put("HH.mm", new PatternCoordinates[] {
				of(ISO, ID),
				of(ISO, SI),
				of(ISO, DA),
				of(ISO, KL),
				of(ISO, EN_DK),
				of(ISO, MS_ID),
				});
		TIME_SHORT_PATTERNS.put("ཆུ་ཚོད་ h སྐར་མ་ mm a", new PatternCoordinates[] {
				of(ISO, DZ),
				});
		TIME_SHORT_PATTERNS.put("H:m", new PatternCoordinates[] {
				of(ISO, YO_BJ),
				of(ISO, YO),
				});
		TIME_SHORT_PATTERNS.put("a h.mm", new PatternCoordinates[] {
				of(ISO, AS),
				});
		TIME_SHORT_PATTERNS.put("hh:mm a", new PatternCoordinates[] {
				of(ISO, KN),
				of(ISO, GU),
				});
	}
}
