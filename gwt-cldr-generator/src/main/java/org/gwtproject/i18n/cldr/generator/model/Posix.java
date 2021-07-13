package org.gwtproject.i18n.cldr.generator.model;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Posix {

    private Messages messages;

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public static class Messages {

        private String yesstr;
        private String nostr;

        public String getYesstr() {
            return yesstr;
        }

        public void setYesstr(String yesstr) {
            this.yesstr = yesstr;
        }

        public String getNostr() {
            return nostr;
        }

        public void setNostr(String nostr) {
            this.nostr = nostr;
        }
    }
}
