/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.shared.cldr.impl;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "dsb_DE" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_dsb_DE extends DateTimeFormatInfoImpl_dsb {

  @Override
  public String[] ampms() {
    return new String[] {
        "dopołdnja",
        "wótpołdnja"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d. MMMM y";
  }

  @Override
  public String dateFormatLong() {
    return "d. MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "d.M.y";
  }

  @Override
  public String dateFormatShort() {
    return "d.M.yy";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "pśed Kristusowym naroźenim",
        "pó Kristusowem naroźenju"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "pś.Chr.n.",
        "pó Chr.n."
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 1;
  }

  @Override
  public String formatDay() {
    return "d";
  }

  @Override
  public String formatHour12Minute() {
    return "h:mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss a";
  }

  @Override
  public String formatHour24Minute() {
    return "H:mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "H:mm:ss";
  }

  @Override
  public String formatMinuteSecond() {
    return "mm:ss";
  }

  @Override
  public String formatMonthAbbrev() {
    return "LLL";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d. MMM";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "MMMM d";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, d. MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "d.M.";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d. MMM y";
  }

  @Override
  public String formatYearMonthFull() {
    return "y MMMM";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d. MMMM y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M.y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d.M.y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d. MMM y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "januara",
        "februara",
        "měrca",
        "apryla",
        "maja",
        "junija",
        "julija",
        "awgusta",
        "septembra",
        "oktobra",
        "nowembra",
        "decembra"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "januar",
        "februar",
        "měrc",
        "apryl",
        "maj",
        "junij",
        "julij",
        "awgust",
        "september",
        "oktober",
        "nowember",
        "december"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "j",
        "f",
        "m",
        "a",
        "m",
        "j",
        "j",
        "a",
        "s",
        "o",
        "n",
        "d"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "jan.",
        "feb.",
        "měr.",
        "apr.",
        "maj.",
        "jun.",
        "jul.",
        "awg.",
        "sep.",
        "okt.",
        "now.",
        "dec."
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return new String[] {
        "jan",
        "feb",
        "měr",
        "apr",
        "maj",
        "jun",
        "jul",
        "awg",
        "sep",
        "okt",
        "now",
        "dec"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1. kwartal",
        "2. kwartal",
        "3. kwartal",
        "4. kwartal"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "Q1",
        "Q2",
        "Q3",
        "Q4"
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "H:mm:ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "H:mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "H:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "H:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "njeźela",
        "pónjeźele",
        "wałtora",
        "srjoda",
        "stwórtk",
        "pětk",
        "sobota"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "n",
        "p",
        "w",
        "s",
        "s",
        "p",
        "s"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "nje",
        "pón",
        "wał",
        "srj",
        "stw",
        "pět",
        "sob"
    };
  }

  @Override
  public String[] weekdaysShortStandalone() {
    return weekdaysShort();
  }

  @Override
  public int weekendEnd() {
    return 0;
  }

  @Override
  public int weekendStart() {
    return 6;
  }
}
