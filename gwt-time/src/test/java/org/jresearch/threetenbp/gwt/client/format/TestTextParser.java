/*
 * Copyright (c) 2007-present, Stephen Colebourne & Michael Nascimento Santos
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  * Neither the name of JSR-310 nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.jresearch.threetenbp.gwt.client.format;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.DAY_OF_WEEK;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;

import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQueries;
import java.util.Locale;

import org.jresearch.threetenbp.gwt.client.format.wrap.DateTimeParseContextTestWrapper;
import org.jresearch.threetenbp.gwt.client.format.wrap.DateTimeTextProviderTestWrapper;
import org.jresearch.threetenbp.gwt.client.format.wrap.TextPrinterParserTestWrapper;
import org.junit.Test;

/**
 * Test TextPrinterParserTestWrapper.
 */
//@Test
public class TestTextParser extends AbstractTestPrinterParser {

	// GWT specific
	private static DateTimeTextProviderTestWrapper PROVIDER;

	@Override
	public void gwtSetUp() throws Exception {
		super.gwtSetUp();
		PROVIDER = new DateTimeTextProviderTestWrapper();
	}

	// -----------------------------------------------------------------------
	// @DataProvider(name="error")
	Object[][] data_error() {
		return new Object[][] {
				{ new TextPrinterParserTestWrapper(DAY_OF_WEEK, TextStyle.FULL, PROVIDER), "Monday", -1,
						IndexOutOfBoundsException.class },
				{ new TextPrinterParserTestWrapper(DAY_OF_WEEK, TextStyle.FULL, PROVIDER), "Monday", 7,
						IndexOutOfBoundsException.class }, };
	}

	@Test(/* dataProvider="error" */)
	public void test_parse_error() throws Exception {
		Object[][] data = data_error();
		for (int i = 0; i < data.length; i++) {
			Object[] objects = data[i];
			gwtSetUp();
			test_parse_error((TextPrinterParserTestWrapper) objects[0], (String) objects[1], (int) objects[2],
					(Class<?>) objects[3]);
		}
	}

	public void test_parse_error(TextPrinterParserTestWrapper pp, String text, int pos, Class<?> expected) {
		try {
			pp.parse(parseContext, text, pos);
		} catch (RuntimeException ex) {
			// GWT Specific
			assertEquals(expected.getName(), ex.getClass().getName());
			assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
			assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
		}
	}

	// -----------------------------------------------------------------------
	public void test_parse_midStr() throws Exception {
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(DAY_OF_WEEK, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "XxxMondayXxx", 3);
		assertEquals(newPos, 9);
		assertParsed(parseContext, DAY_OF_WEEK, 1L);
	}

	public void test_parse_remainderIgnored() throws Exception {
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(DAY_OF_WEEK, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "Wednesday", 0);
		assertEquals(newPos, 3);
		assertParsed(parseContext, DAY_OF_WEEK, 3L);
	}

	// -----------------------------------------------------------------------
	public void test_parse_noMatch1() throws Exception {
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(DAY_OF_WEEK, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "Munday", 0);
		assertEquals(newPos, ~0);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	public void test_parse_noMatch2() throws Exception {
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(DAY_OF_WEEK, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "Monday", 3);
		assertEquals(newPos, ~3);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	public void test_parse_noMatch_atEnd() throws Exception {
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(DAY_OF_WEEK, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "Monday", 6);
		assertEquals(newPos, ~6);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	// -----------------------------------------------------------------------
	// @DataProvider(name="parseText")
	Object[][] provider_text() {
		return new Object[][] { { DAY_OF_WEEK, TextStyle.FULL, 1, "Monday" },
				{ DAY_OF_WEEK, TextStyle.FULL, 2, "Tuesday" }, { DAY_OF_WEEK, TextStyle.FULL, 3, "Wednesday" },
				{ DAY_OF_WEEK, TextStyle.FULL, 4, "Thursday" }, { DAY_OF_WEEK, TextStyle.FULL, 5, "Friday" },
				{ DAY_OF_WEEK, TextStyle.FULL, 6, "Saturday" }, { DAY_OF_WEEK, TextStyle.FULL, 7, "Sunday" },

				{ DAY_OF_WEEK, TextStyle.SHORT, 1, "Mon" }, { DAY_OF_WEEK, TextStyle.SHORT, 2, "Tue" },
				{ DAY_OF_WEEK, TextStyle.SHORT, 3, "Wed" }, { DAY_OF_WEEK, TextStyle.SHORT, 4, "Thu" },
				{ DAY_OF_WEEK, TextStyle.SHORT, 5, "Fri" }, { DAY_OF_WEEK, TextStyle.SHORT, 6, "Sat" },
				{ DAY_OF_WEEK, TextStyle.SHORT, 7, "Sun" },

				{ MONTH_OF_YEAR, TextStyle.FULL, 1, "January" }, { MONTH_OF_YEAR, TextStyle.FULL, 12, "December" },

				{ MONTH_OF_YEAR, TextStyle.SHORT, 1, "Jan" }, { MONTH_OF_YEAR, TextStyle.SHORT, 12, "Dec" }, };
	}

	// @DataProvider(name="parseNumber")
	Object[][] provider_number() {
		return new Object[][] { { DAY_OF_MONTH, TextStyle.FULL, 1, "1" }, { DAY_OF_MONTH, TextStyle.FULL, 2, "2" },
				{ DAY_OF_MONTH, TextStyle.FULL, 30, "30" }, { DAY_OF_MONTH, TextStyle.FULL, 31, "31" },

				{ DAY_OF_MONTH, TextStyle.SHORT, 1, "1" }, { DAY_OF_MONTH, TextStyle.SHORT, 2, "2" },
				{ DAY_OF_MONTH, TextStyle.SHORT, 30, "30" }, { DAY_OF_MONTH, TextStyle.SHORT, 31, "31" }, };
	}

	@Test(/* dataProvider="parseText" */)
	public void test_parseText() throws Exception {
		Object[][] data = provider_text();
		for (int i = 0; i < data.length; i++) {
			Object[] objects = data[i];
			gwtSetUp();
			test_parseText((TemporalField) objects[0], (TextStyle) objects[1], (int) objects[2], (String) objects[3]);
		}
	}

	public void test_parseText(TemporalField field, TextStyle style, int value, String input) throws Exception {
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(field, style, PROVIDER);
		int newPos = pp.parse(parseContext, input, 0);
		assertEquals(newPos, input.length());
		assertParsed(parseContext, field, (long) value);
	}

	@Test(/* dataProvider="parseNumber" */)
	public void test_parseNumber() throws Exception {
		Object[][] data = provider_number();
		for (int i = 0; i < data.length; i++) {
			Object[] objects = data[i];
			gwtSetUp();
			test_parseNumber((TemporalField) objects[0], (TextStyle) objects[1], (int) objects[2], (String) objects[3]);
		}
	}

	public void test_parseNumber(TemporalField field, TextStyle style, int value, String input) throws Exception {
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(field, style, PROVIDER);
		int newPos = pp.parse(parseContext, input, 0);
		assertEquals(newPos, input.length());
		assertParsed(parseContext, field, (long) value);
	}

	// -----------------------------------------------------------------------
	@Test(/* dataProvider="parseText" */)
	public void test_parse_strict_caseSensitive_parseUpper() throws Exception {
		Object[][] data = provider_text();
		for (int i = 0; i < data.length; i++) {
			Object[] objects = data[i];
			gwtSetUp();
			test_parse_strict_caseSensitive_parseUpper((TemporalField) objects[0], (TextStyle) objects[1],
					(int) objects[2], (String) objects[3]);
		}
	}

	public void test_parse_strict_caseSensitive_parseUpper(TemporalField field, TextStyle style, int value,
			String input) throws Exception {
		parseContext.setCaseSensitive(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(field, style, PROVIDER);
		int newPos = pp.parse(parseContext, input.toUpperCase(), 0);
		assertEquals(newPos, ~0);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	@Test(/* dataProvider="parseText" */)
	public void test_parse_strict_caseInsensitive_parseUpper() throws Exception {
		Object[][] data = provider_text();
		for (int i = 0; i < data.length; i++) {
			Object[] objects = data[i];
			gwtSetUp();
			test_parse_strict_caseInsensitive_parseUpper((TemporalField) objects[0], (TextStyle) objects[1],
					(int) objects[2], (String) objects[3]);
		}
	}

	public void test_parse_strict_caseInsensitive_parseUpper(TemporalField field, TextStyle style, int value,
			String input) throws Exception {
		parseContext.setCaseSensitive(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(field, style, PROVIDER);
		int newPos = pp.parse(parseContext, input.toUpperCase(), 0);
		assertEquals(newPos, input.length());
		assertParsed(parseContext, field, (long) value);
	}

	// -----------------------------------------------------------------------
	@Test(/* dataProvider="parseText" */)
	public void test_parse_strict_caseSensitive_parseLower() throws Exception {
		Object[][] data = provider_text();
		for (int i = 0; i < data.length; i++) {
			Object[] objects = data[i];
			gwtSetUp();
			test_parse_strict_caseSensitive_parseLower((TemporalField) objects[0], (TextStyle) objects[1],
					(int) objects[2], (String) objects[3]);
		}
	}

	public void test_parse_strict_caseSensitive_parseLower(TemporalField field, TextStyle style, int value,
			String input) throws Exception {
		parseContext.setCaseSensitive(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(field, style, PROVIDER);
		int newPos = pp.parse(parseContext, input.toLowerCase(), 0);
		assertEquals(newPos, ~0);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	@Test(/* dataProvider="parseText" */)
	public void test_parse_strict_caseInsensitive_parseLower() throws Exception {
		Object[][] data = provider_text();
		for (int i = 0; i < data.length; i++) {
			Object[] objects = data[i];
			gwtSetUp();
			test_parse_strict_caseInsensitive_parseLower((TemporalField) objects[0], (TextStyle) objects[1],
					(int) objects[2], (String) objects[3]);
		}
	}

	public void test_parse_strict_caseInsensitive_parseLower(TemporalField field, TextStyle style, int value,
			String input) throws Exception {
		parseContext.setCaseSensitive(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(field, style, PROVIDER);
		int newPos = pp.parse(parseContext, input.toLowerCase(), 0);
		assertEquals(newPos, input.length());
		assertParsed(parseContext, field, (long) value);
	}

	// -----------------------------------------------------------------------
	// -----------------------------------------------------------------------
	// -----------------------------------------------------------------------
	public void test_parse_full_strict_full_match() throws Exception {
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "January", 0);
		assertEquals(newPos, 7);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	public void test_parse_full_strict_short_noMatch() throws Exception {
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "Janua", 0);
		assertEquals(newPos, ~0);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	public void test_parse_full_strict_number_noMatch() throws Exception {
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "1", 0);
		assertEquals(newPos, ~0);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	// -----------------------------------------------------------------------
	public void test_parse_short_strict_full_match() throws Exception {
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "January", 0);
		assertEquals(newPos, 3);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	public void test_parse_short_strict_short_match() throws Exception {
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "Janua", 0);
		assertEquals(newPos, 3);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	public void test_parse_short_strict_number_noMatch() throws Exception {
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "1", 0);
		assertEquals(newPos, ~0);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	// -----------------------------------------------------------------------
	public void test_parse_french_short_strict_full_noMatch() throws Exception {
		parseContext.setLocale(Locale.FRENCH);
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "janvier", 0); // correct short form is 'janv.'
		assertEquals(newPos, ~0);
		assertEquals(parseContext.toParsed().query(TemporalQueries.chronology()), null);
		assertEquals(parseContext.toParsed().query(TemporalQueries.zoneId()), null);
	}

	public void disable_test_parse_french_short_strict_short_match() throws Exception {
		parseContext.setLocale(Locale.FRENCH);
		parseContext.setStrict(true);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "janv.", 0);
		assertEquals(5, newPos);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	// -----------------------------------------------------------------------
	public void test_parse_full_lenient_full_match() throws Exception {
		parseContext.setStrict(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "January", 0);
		assertEquals(newPos, 7);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	public void test_parse_full_lenient_short_match() throws Exception {
		parseContext.setStrict(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "Janua", 0);
		assertEquals(newPos, 3);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	public void test_parse_full_lenient_number_match() throws Exception {
		parseContext.setStrict(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.FULL, PROVIDER);
		int newPos = pp.parse(parseContext, "1", 0);
		assertEquals(newPos, 1);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	// -----------------------------------------------------------------------
	public void test_parse_short_lenient_full_match() throws Exception {
		parseContext.setStrict(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "January", 0);
		assertEquals(newPos, 7);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	public void test_parse_short_lenient_short_match() throws Exception {
		parseContext.setStrict(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "Janua", 0);
		assertEquals(newPos, 3);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	public void test_parse_short_lenient_number_match() throws Exception {
		parseContext.setStrict(false);
		TextPrinterParserTestWrapper pp = new TextPrinterParserTestWrapper(MONTH_OF_YEAR, TextStyle.SHORT, PROVIDER);
		int newPos = pp.parse(parseContext, "1", 0);
		assertEquals(newPos, 1);
		assertParsed(parseContext, MONTH_OF_YEAR, 1L);
	}

	private void assertParsed(DateTimeParseContextTestWrapper context, TemporalField field, Long value) {
		if (value == null) {
			assertEquals(context.getParsed(field), null);
		} else {
			assertEquals(context.getParsed(field), value);
		}
	}

}
