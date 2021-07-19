package org.jresearch.threetenbp.gwt.client.cldr;

import static java.time.DayOfWeek.*;
import static org.jresearch.threetenbp.gwt.client.cldr.Region.*;

import java.lang.Integer;
import java.time.DayOfWeek;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class WeekInfo {
	public static final Map<Integer, EnumSet<Region>> MIN_DAYS = new HashMap<>();

	public static final Map<DayOfWeek, EnumSet<Region>> FIRST_DAY = new HashMap<>();

	public static final DayOfWeek DEFAULT_FIRST_DAY = MONDAY;

	public static final Integer DEFAULT_MIN_DAYS = Integer.valueOf(1);

	static {
		FIRST_DAY.put(FRIDAY, EnumSet.of(MV));
		FIRST_DAY.put(SATURDAY, EnumSet.of(AE, AF, BH, DJ, DZ, EG, IQ, IR, JO, KW, LY, OM, QA, SD, SY));
		FIRST_DAY.put(SUNDAY, EnumSet.of(AG, AS, AU, BD, BR, BS, BT, BW, BZ, CA, CN, CO, DM, DO, ET, GT, GU, HK, HN, ID, IL, IN, JM, JP, KE, KH, KR, LA, MH, MM, MO, MT, MX, MZ, NI, NP, PA, PE, PH, PK, PR, PT, PY, SA, SG, SV, TH, TT, TW, UM, US, VE, VI, WS, YE, ZA, ZW));
		MIN_DAYS.put(Integer.valueOf(4), EnumSet.of(AD, AN, AT, AX, BE, BG, CH, CZ, DE, DK, EE, ES, FI, FJ, FO, FR, GB, GF, GG, GI, GP, GR, HU, IE, IM, IS, IT, JE, LI, LT, LU, MC, MQ, NL, NO, PL, PT, RE, RU, SE, SJ, SK, SM, VA));
	}
}
