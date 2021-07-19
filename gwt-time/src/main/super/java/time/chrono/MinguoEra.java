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
package java.time.chrono;

import static java.time.temporal.ChronoField.ERA;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * An era in the Minguo calendar system.
 * <p>
 * The Minguo calendar system has two eras.
 * The date {@code 0001-01-01 (Minguo)} is equal to {@code 1912-01-01 (ISO)}.
 * <p>
 * <b>Do not use {@code ordinal()} to obtain the numeric representation of {@code MinguoEra}.
 * Use {@code getValue()} instead.</b>
 *
 * <h3>Specification for implementors</h3>
 * This is an immutable and thread-safe enum.
 */
public enum MinguoEra implements Era  {

    /**
     * The singleton instance for the era BEFORE_ROC, 'Before Republic of China'.
     * This has the numeric value of {@code 0}.
     */
    BEFORE_ROC,
    /**
     * The singleton instance for the era ROC, 'Republic of China'.
     * This has the numeric value of {@code 1}.
     */
    ROC;

    //-----------------------------------------------------------------------
    /**
     * Obtains an instance of {@code MinguoEra} from an {@code int} value.
     * <p>
     * {@code MinguoEra} is an enum representing the Minguo eras of BEFORE_ROC/ROC.
     * This factory allows the enum to be obtained from the {@code int} value.
     *
     * @param era  the BEFORE_ROC/ROC value to represent, from 0 (BEFORE_ROC) to 1 (ROC)
     * @return the era singleton, not null
     * @throws DateTimeException if the value is invalid
     */
    public static MinguoEra of(int era) {
        switch (era) {
            case 0:
                return BEFORE_ROC;
            case 1:
                return ROC;
            default:
                throw new DateTimeException("Invalid era: " + era);
        }
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the numeric era {@code int} value.
     * <p>
     * The era BEFORE_ROC has the value 0, while the era ROC has the value 1.
     *
     * @return the era value, from 0 (BEFORE_ROC) to 1 (ROC)
     */
    @Override
    public int getValue() {
        return ordinal();
    }

    /**
     * {@inheritDoc}
     *
     * @param style {@inheritDoc}
     * @param locale {@inheritDoc}
     */
    @Override
    public String getDisplayName(TextStyle style, Locale locale) {
        return new DateTimeFormatterBuilder().appendText(ERA, style).toFormatter(locale).format(this);
    }

}
