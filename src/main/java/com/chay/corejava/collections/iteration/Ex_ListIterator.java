package com.chay.corejava.collections.iteration;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex_ListIterator {

    public static void main(String[] args) {
        LinkedList<String> tools = new LinkedList<>();

        //initialize linked list
        tools.add("Notion");
        tools.add("IntelliJ");
        tools.add("VS-Code");
        tools.add("PyCharm");
        System.out.println(tools); // [Notion, IntelliJ, VS-Code, PyCharm]

        ListIterator<String> list_itr = tools.listIterator();
        while (list_itr.hasNext()) {
            String tool = list_itr.next();

            // remove
            if (tool.equals("Notion")) {
                list_itr.remove();
            }

            //replace
            if (tool.equals("PyCharm")) {
                list_itr.set("Sagemaker");
            }

            //insert
            if (tool.equals("VS-Code")) {
                list_itr.add("CoPilot");
            }
        }
        System.out.println(tools); // [IntelliJ, VS-Code, CoPilot, Sagemaker]

    }
}
