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

import static java.time.temporal.ChronoField.MONTH_OF_YEAR;

import java.time.DateTimeException;
import java.time.format.SignStyle;
import java.time.temporal.TemporalField;

import org.jresearch.threetenbp.gwt.client.format.wrap.CharLiteralPrinterParserTestWrapper;
import org.jresearch.threetenbp.gwt.client.format.wrap.NumberPrinterParserTestWrapper;
import org.jresearch.threetenbp.gwt.client.format.wrap.PadPrinterParserDecoratorTestWrapper;
import org.junit.Test;

/**
 * Test PadPrinterParserDecoratorTestWrapper.
 */
//@Test
public class TestPadParserDecorator extends AbstractTestPrinterParser {

	// -----------------------------------------------------------------------
	@Test(expected = IndexOutOfBoundsException.class)
	public void test_parse_negativePosition() throws Exception {
		try {
			PadPrinterParserDecoratorTestWrapper pp = new PadPrinterParserDecoratorTestWrapper(
					new CharLiteralPrinterParserTestWrapper('Z'), 3, '-');
			pp.parse(parseContext, "--Z", -1);
			fail("Missing exception");
		} catch (IndexOutOfBoundsException e) {
			// expected
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void test_parse_offEndPosition() throws Exception {
		try {
			PadPrinterParserDecoratorTestWrapper pp = new PadPrinterParserDecoratorTestWrapper(
					new CharLiteralPrinterParserTestWrapper('Z'), 3, '-');
			pp.parse(parseContext, "--Z", 4);
			fail("Missing exception");
		} catch (IndexOutOfBoundsException e) {
			// expected
		}
	}

	// -----------------------------------------------------------------------
	public void test_parse() throws Exception {
		PadPrinterParserDecoratorTestWrapper pp = new PadPrinterParserDecoratorTestWrapper(
				new NumberPrinterParserTestWrapper(MONTH_OF_YEAR, 1, 3, SignStyle.NEVER), 3, '-');
		int result = pp.parse(parseContext, "--2", 0);
		assertEquals(result, 3);
		assertParsed(MONTH_OF_YEAR, 2L);
	}

	public void test_parse_noReadBeyond() throws Exception {
		PadPrinterParserDecoratorTestWrapper pp = new PadPrinterParserDecoratorTestWrapper(
				new NumberPrinterParserTestWrapper(MONTH_OF_YEAR, 1, 3, SignStyle.NEVER), 3, '-');
		int result = pp.parse(parseContext, "--22", 0);
		assertEquals(result, 3);
		assertParsed(MONTH_OF_YEAR, 2L);
	}

	public void test_parse_textLessThanPadWidth() throws Exception {
		PadPrinterParserDecoratorTestWrapper pp = new PadPrinterParserDecoratorTestWrapper(
				new NumberPrinterParserTestWrapper(MONTH_OF_YEAR, 1, 3, SignStyle.NEVER), 3, '-');
		int result = pp.parse(parseContext, "-1", 0);
		assertEquals(result, ~0);
	}

	public void test_parse_decoratedErrorPassedBack() throws Exception {
		PadPrinterParserDecoratorTestWrapper pp = new PadPrinterParserDecoratorTestWrapper(
				new NumberPrinterParserTestWrapper(MONTH_OF_YEAR, 1, 3, SignStyle.NEVER), 3, '-');
		int result = pp.parse(parseContext, "--A", 0);
		assertEquals(result, ~2);
	}

	public void test_parse_decoratedDidNotParseToPadWidth() throws Exception {
		PadPrinterParserDecoratorTestWrapper pp = new PadPrinterParserDecoratorTestWrapper(
				new NumberPrinterParserTestWrapper(MONTH_OF_YEAR, 1, 3, SignStyle.NEVER), 3, '-');
		int result = pp.parse(parseContext, "-1X", 0);
		assertEquals(result, ~1);
	}

	// -----------------------------------------------------------------------
	private void assertParsed(TemporalField field, Long value) {
		if (value == null) {
			assertEquals(parseContext.getParsed(field), null);
		} else {
			assertEquals(parseContext.getParsed(field), value);
		}
	}

}
