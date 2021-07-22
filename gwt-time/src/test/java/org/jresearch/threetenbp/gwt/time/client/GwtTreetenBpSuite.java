package org.jresearch.threetenbp.gwt.time.client;

import org.jresearch.threetenbp.gwt.time.client.chrono.TestChronoLocalDate;
import org.jresearch.threetenbp.gwt.time.client.chrono.TestChronoLocalDateTime;
import org.jresearch.threetenbp.gwt.time.client.chrono.TestChronoZonedDateTime;
import org.jresearch.threetenbp.gwt.time.client.chrono.TestHijrahChronology;
import org.jresearch.threetenbp.gwt.time.client.chrono.TestIsoChronology;
import org.jresearch.threetenbp.gwt.time.client.chrono.TestJapaneseChronology;
import org.jresearch.threetenbp.gwt.time.client.chrono.TestMinguoChronology;
import org.jresearch.threetenbp.gwt.time.client.chrono.TestThaiBuddhistChronology;
import org.jresearch.threetenbp.gwt.time.client.format.TestCharLiteralParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestCharLiteralPrinter;
import org.jresearch.threetenbp.gwt.time.client.format.TestDateTimeBuilderCombinations;
import org.jresearch.threetenbp.gwt.time.client.format.TestDateTimeFormatter;
import org.jresearch.threetenbp.gwt.time.client.format.TestDateTimeFormatterBuilder;
import org.jresearch.threetenbp.gwt.time.client.format.TestDateTimeFormatters;
import org.jresearch.threetenbp.gwt.time.client.format.TestDateTimeParsing;
import org.jresearch.threetenbp.gwt.time.client.format.TestDateTimeTextPrinting;
import org.jresearch.threetenbp.gwt.time.client.format.TestDecimalStyle;
import org.jresearch.threetenbp.gwt.time.client.format.TestFractionPrinterParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestNumberParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestNumberPrinter;
import org.jresearch.threetenbp.gwt.time.client.format.TestPadParserDecorator;
import org.jresearch.threetenbp.gwt.time.client.format.TestPadPrinterDecorator;
import org.jresearch.threetenbp.gwt.time.client.format.TestReducedParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestReducedPrinter;
import org.jresearch.threetenbp.gwt.time.client.format.TestSettingsParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestStringLiteralParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestStringLiteralPrinter;
import org.jresearch.threetenbp.gwt.time.client.format.TestTextParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestTextPrinter;
import org.jresearch.threetenbp.gwt.time.client.format.TestZoneIdParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestZoneOffsetParser;
import org.jresearch.threetenbp.gwt.time.client.format.TestZoneOffsetPrinter;
import org.jresearch.threetenbp.gwt.time.client.locale.TestLocale;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestChronoField;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestChronoUnit;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestIsoFields;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestJulianFields;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestMonthDay;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestTemporalAdjusters;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestValueRange;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestYear;
import org.jresearch.threetenbp.gwt.time.client.temporal.TestYearMonth;
import org.jresearch.threetenbp.gwt.time.client.zone.TestFixedZoneRules;
import org.jresearch.threetenbp.gwt.time.client.zone.TestStandardZoneRules;
import org.jresearch.threetenbp.gwt.time.client.zone.TestZoneOffsetTransition;
import org.jresearch.threetenbp.gwt.time.client.zone.TestZoneOffsetTransitionRule;
import org.jresearch.threetenbp.gwt.time.client.zone.TestZoneRulesProvider;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;

public class GwtTreetenBpSuite {

	public static Test suite() {
		GWTTestSuite suite = new GWTTestSuite("Tests");

		// $JUnit-BEGIN$
		suite.addTestSuite(GwtTest.class);
		suite.addTestSuite(GwtSupportTest.class);
		suite.addTestSuite(TestClock.class);
		suite.addTestSuite(TestClock_Fixed.class);
		suite.addTestSuite(TestClock_Offset.class);
		suite.addTestSuite(TestClock_System.class);
		suite.addTestSuite(TestClock_Tick.class);
		suite.addTestSuite(TestDayOfWeek.class);
		suite.addTestSuite(TestLocalDate.class);
		suite.addTestSuite(TestLocalTime.class);
		suite.addTestSuite(TestDateTimes_implementation.class);
		suite.addTestSuite(TestDateTimeUtils.class);
		suite.addTestSuite(TestDuration.class);
		suite.addTestSuite(TestInstant.class);
		suite.addTestSuite(TestMonth.class);
		suite.addTestSuite(TestLocalDateTime.class);
		suite.addTestSuite(TestOffsetDateTime_instants.class);
		suite.addTestSuite(TestOffsetDateTime.class);
		suite.addTestSuite(TestOffsetTime.class);
		suite.addTestSuite(TestPeriod.class);
		suite.addTestSuite(TestZonedDateTime.class);
		suite.addTestSuite(TestZoneId.class);
		suite.addTestSuite(TestZoneOffset.class);
		suite.addTestSuite(TestChronoLocalDate.class);
		suite.addTestSuite(TestChronoLocalDateTime.class);
		suite.addTestSuite(TestChronoZonedDateTime.class);
		suite.addTestSuite(TestHijrahChronology.class);
		suite.addTestSuite(TestIsoChronology.class);
		suite.addTestSuite(TestJapaneseChronology.class);
		suite.addTestSuite(TestMinguoChronology.class);
		suite.addTestSuite(TestThaiBuddhistChronology.class);
		suite.addTestSuite(TestChronoField.class);
		suite.addTestSuite(TestChronoUnit.class);
		suite.addTestSuite(TestIsoFields.class);
		suite.addTestSuite(TestJulianFields.class);
		suite.addTestSuite(TestMonthDay.class);
		suite.addTestSuite(TestTemporalAdjusters.class);
		suite.addTestSuite(TestValueRange.class);
		suite.addTestSuite(TestYear.class);
		suite.addTestSuite(TestYearMonth.class);
		suite.addTestSuite(TestFixedZoneRules.class);
		suite.addTestSuite(TestStandardZoneRules.class);
		suite.addTestSuite(TestZoneOffsetTransition.class);
		suite.addTestSuite(TestZoneOffsetTransitionRule.class);
//		suite.addTestSuite(TestZoneRulesBuilder.class);
		suite.addTestSuite(TestZoneRulesProvider.class);
		suite.addTestSuite(TestDateTimeFormatter.class);
		suite.addTestSuite(TestCharLiteralParser.class);
		suite.addTestSuite(TestCharLiteralPrinter.class);
		suite.addTestSuite(TestFractionPrinterParser.class);
		suite.addTestSuite(TestNumberParser.class);
		suite.addTestSuite(TestNumberPrinter.class);
		suite.addTestSuite(TestPadParserDecorator.class);
		suite.addTestSuite(TestPadPrinterDecorator.class);
		suite.addTestSuite(TestReducedParser.class);
		suite.addTestSuite(TestReducedPrinter.class);
		suite.addTestSuite(TestStringLiteralParser.class);
		suite.addTestSuite(TestStringLiteralPrinter.class);
		suite.addTestSuite(TestZoneOffsetParser.class);
		suite.addTestSuite(TestZoneOffsetPrinter.class);
		suite.addTestSuite(TestTextParser.class);
		suite.addTestSuite(TestTextPrinter.class);
		suite.addTestSuite(TestSettingsParser.class);
		suite.addTestSuite(TestZoneIdParser.class);
//		suite.addTestSuite(TestSimpleDateTimeTextProvider.class);
		suite.addTestSuite(TestDateTimeFormatters.class);
		suite.addTestSuite(TestDateTimeBuilderCombinations.class);
		suite.addTestSuite(TestDateTimeFormatterBuilder.class);
		suite.addTestSuite(TestDateTimeParsing.class);
		suite.addTestSuite(TestDateTimeTextPrinting.class);
		suite.addTestSuite(TestDecimalStyle.class);
		suite.addTestSuite(TestLocale.class);
		// $JUnit-END$

		return suite;
	}
}
