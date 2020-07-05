package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main (String [] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        sortInOrder(placesToVisit, "Los Angeles");
        sortInOrder(placesToVisit, "Yellow Stone National Park");
        sortInOrder(placesToVisit, "Mt. Rushmore");
        sortInOrder(placesToVisit, "Statue of Liberty");
        sortInOrder(placesToVisit, "Niagara Falls");
        sortInOrder(placesToVisit, "Lincoln Memorial");
        sortInOrder(placesToVisit, "Golden Gate Bridge");
        printList(placesToVisit);

        placesToVisit.add(1," World Trace Center");
        printList(placesToVisit);

        placesToVisit.remove(5);
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> theList) {
        Iterator<String> i = theList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");
    }
    private static boolean sortInOrder(LinkedList<String> lnkedList, String newCity) {
        ListIterator<String> stringIterator = lnkedList.listIterator();
        while(stringIterator.hasNext()) {
            int comparison = stringIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included!");
                return false;
            } else if (comparison > 0) {
                stringIterator.previous();
                stringIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringIterator.add(newCity);
        return true;
    }
}