
package com.zippyrate.dsls.md.parser;

public class MD
{
    public static void main(String[] args) 
    {
        MDParser parser = new MDParser(System.in);
        System.out.print("Enter Expression: ");
        System.out.flush();
        try {
            SimpleNode node = parser.expression();
            parser.ReInit(System.in);
        } catch (ParseException e) {
            System.err.println("Parse exception: " + e.getMessage());
        }
    }
}
