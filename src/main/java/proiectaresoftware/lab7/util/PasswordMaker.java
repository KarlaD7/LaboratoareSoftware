package proiectaresoftware.lab7.util;

public class PasswordMaker {

        private static final int MAGIC_NUMBER = 3;
        private static final String MAGIC_STRING;
        private String name;

        private static PasswordMaker instance;

        static {
            instance = new PasswordMaker("default");
            MAGIC_STRING = "abcdefghijklmnopqrst";
        }

        private static int callingCount = 0;

        private PasswordMaker(String name) {
            this.name = name;
        }

        public static PasswordMaker getInstance() {
            callingCount++;
            return instance;
        }

        public static int getCallingCounts() {
            return callingCount;
        }

        public String getPassword() {
            java.util.Random r = new java.util.Random();
            String ln = "" + name.length();
            ln += r.nextInt(101);
            return MAGIC_STRING.substring(0, MAGIC_NUMBER) + MAGIC_STRING.substring(0, 10) + ln;
        }
    }

