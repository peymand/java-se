package com.peyman.core.java.syntax.breakloop;

public class LoopBreaking {


    public static void main(String[] args) {
        LoopBreaking loopBreaking = new LoopBreaking();
        String x = loopBreaking.simpleBreak();
        System.out.println(x);
    }

    public String simpleBreak() {
        String result = "";
        for (int outerCounter = 0; outerCounter < 2; outerCounter++) {
            result += "outer" + outerCounter;
            for (int innerCounter = 0; innerCounter < 2; innerCounter++) {
                result += "inner" + innerCounter;
                if (innerCounter == 0) {
                    break;
                }
            }
        }
        return result;
    }

    public String labelBreak() {
        String result = "";
        myBreakLabel:
        for (int outerCounter = 0; outerCounter < 2; outerCounter++) {
            result += "outer" + outerCounter;
            for (int innerCounter = 0; innerCounter < 2; innerCounter++) {
                result += "inner" + innerCounter;
                if (innerCounter == 0) {
                    break myBreakLabel;
                }
            }
        }
        return result;
    }

    public String usingReturn() {
        String result = "";
        for (int outerCounter = 0; outerCounter < 2; outerCounter++) {
            result += "outer" + outerCounter;
            for (int innerCounter = 0; innerCounter < 2; innerCounter++) {
                result += "inner" + innerCounter;
                if (innerCounter == 0) {
                    return result;
                }
            }
        }
        return "failed";
    }
}
