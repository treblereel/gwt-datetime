package org.jresearch.threetenbp.gwt.client.browser;

import org.jresearch.threetenbp.gwt.client.format.TestDateTimeTextPrinting;

public class BrowserTestDateTimeTextPrinting extends TestDateTimeTextPrinting {

	public void test_print_appendText2arg_french_long() throws Exception {
		super.disable_test_print_appendText2arg_french_long();
	}

	public void test_print_appendText2arg_french_short() throws Exception {
		super.disable_test_print_appendText2arg_french_short();
	}

	public void test_arabicNarrowDayOfWeek() throws Exception {
		super.disable_test_arabicNarrowDayOfWeek();
	}

	public void test_arabicNarrowMonth() throws Exception {
		super.disable_test_arabicNarrowMonth();
	}

	public void test_chineseNarrowDayOfWeek() throws Exception {
		super.disable_test_chineseNarrowDayOfWeek();
	}

	// Test does not reflect CLDR v37
	@Override
	public void disable_test_chineseNarrowMonth() throws Exception {
		super.disable_test_chineseNarrowMonth();
	}

	public void test_japaneseNarrowMonth() throws Exception {
		super.disable_test_japaneseNarrowMonth();
	}

}
