/*
 *
 * Classname Main
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *
 *  Module 3 Task 1
 *
 *  JavaCollectionsFramework. List.
 *
 * 1.  Create ArrayList and LinkedList containing 100 000 Integer elements. Compare time intervals.
 * 2.  Insert  new 1000 elements on the beginning, on  the middle and on the end of ones. Compare time intervals.
 * 3.  Update 1000 elements from the beginning, from  the middle and from the end of ones. Compare time intervals.
 * 4.  Delete 1000 elements from the beginning, from  the middle and from the end of ones. Compare time intervals.
 *
 */

package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // 1.  Create ArrayList and LinkedList containing 100 000 Integer elements. Compare time intervals.

        // Creating ArrayList of 100 000 Integer elements and using LocalDateTime


        LocalDateTime startArrayList = LocalDateTime.now();

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            integers.add(i);
        }

        LocalDateTime finishArrayList = LocalDateTime.now();


        // Creating LinkedList of 100 000 Integer elements and using LocalDateTime


        List<Integer> integersLinked = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            integersLinked.add(i);
        }

        LocalDateTime finishLinkedList = LocalDateTime.now();


        // Comparing creation time


        System.out.println();

        System.out.println("Creating 100 000 Integer elements in ArrayList needs: "
                + ChronoUnit.MILLIS.between(startArrayList,
                finishArrayList) + " milliseconds");
        System.out.println("Creating 100 000 Integer elements in LinkedList needs: "
                + ChronoUnit.MILLIS.between(finishArrayList,
                finishLinkedList) + " milliseconds");
        System.out.println();
        System.out.println();



        // 2.  Insert new 1000 elements  on the beginning, on the middle and on the end of ones. Compare time intervals.

        // Inserting 1000 ArrayList elements on the beginning, on the middle and on the end


        LocalDateTime InsertionBeginningStartArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.add(i, i);
        }

        LocalDateTime InsertionBeginningFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.add(i+60000, i);
        }

        LocalDateTime InsertionMiddleFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++){
            integers.add(i);
        }

        LocalDateTime InsertionEndFinishArrayList = LocalDateTime.now();



        // Inserting 1000 LinkedList elements on the beginning, on the middle and on the end


        LocalDateTime InsertionBeginningStartLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i, i);
        }

        LocalDateTime InsertionBeginningFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i+60000, i);
        }

        LocalDateTime InsertionMiddleFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i);
        }

        LocalDateTime InsertionEndFinishLinkedList = LocalDateTime.now();



        // COMPARING time intervals: insertion in ArrayList and insertion in Linked List


        System.out.println("---------------------------------------------------------------");
        System.out.println();

        System.out.println("Adding 1000 Integer elements on the beginning in ArrayList needs: "
                + ChronoUnit.MILLIS.between(InsertionBeginningStartArrayList, InsertionBeginningFinishArrayList) + " milliseconds");
        System.out.println("Adding 1000 Integer elements on the beginning in LinkedList needs: "
                + ChronoUnit.MILLIS.between(InsertionBeginningStartLinkedList, InsertionBeginningFinishLinkedList) + " milliseconds");


        System.out.println();

        System.out.println("Adding 1000 Integer elements on the middle in ArrayList needs: "
                + ChronoUnit.MILLIS.between(InsertionBeginningFinishArrayList, InsertionMiddleFinishArrayList) + " milliseconds");
        System.out.println("Adding 1000 Integer elements on the middle in LinkedList needs: "
                + ChronoUnit.MILLIS.between(InsertionBeginningFinishLinkedList, InsertionMiddleFinishLinkedList) + " milliseconds");


        System.out.println();

        System.out.println("Adding 1000 Integer elements on the end in ArrayList needs: "
                + ChronoUnit.MILLIS.between(InsertionMiddleFinishArrayList, InsertionEndFinishArrayList) + " milliseconds");
        System.out.println("Adding 1000 Integer elements on the end in LinkedList needs: "
                + ChronoUnit.MILLIS.between(InsertionMiddleFinishLinkedList, InsertionEndFinishLinkedList) + " milliseconds");



        // 3.  Update 1000 elements from the beginning, from the middle and from the end of ones. Compare time intervals.

        // Updating 1000 elements from the beginning, from the middle and from the end of ArrayList


        LocalDateTime UpdatingBeginningStartArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(i, i+100);
        }

        LocalDateTime UpdatingBeginningFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(i+60000, i+100);
        }

        LocalDateTime UpdatingMiddleFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++){
            integers.set(i+102000, i+100);
        }

        LocalDateTime UpdatingEndFinishArrayList = LocalDateTime.now();



        // Updating 1000 elements from the beginning, from the middle and from the end of LinkedList


        LocalDateTime UpdatingBeginningStartLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i, i+100);
        }

        LocalDateTime UpdatingBeginningFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i+60000, i+100);
        }

        LocalDateTime UpdatingMiddleFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i+102000, i+100);
        }

        LocalDateTime UpdatingEndFinishLinkedList = LocalDateTime.now();



        // COMPARING time intervals: updating in ArrayList and updating in Linked List


        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        System.out.println("Updating 1000 Integer elements at the beginning in ArrayList needs: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningStartArrayList, UpdatingBeginningFinishArrayList) + " milliseconds");
        System.out.println("Updating 1000 Integer elements at the beginning in LinkedList needs: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningStartLinkedList, UpdatingBeginningFinishLinkedList) + " milliseconds");

        System.out.println();

        System.out.println("Updating 1000 Integer elements in the middle in ArrayList needs: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningFinishArrayList, UpdatingMiddleFinishArrayList) + " milliseconds");
        System.out.println("Updating 1000 Integer elements in the middle in LinkedList needs: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningFinishLinkedList, UpdatingMiddleFinishLinkedList) + " milliseconds");

        System.out.println();

        System.out.println("Updating 1000 Integer elements in the end in ArrayList needs: "
                + ChronoUnit.MILLIS.between(UpdatingMiddleFinishArrayList, UpdatingEndFinishArrayList) + " milliseconds");
        System.out.println("Updating 1000 Integer elements in the end in LinkedList needs: "
                + ChronoUnit.MILLIS.between(UpdatingMiddleFinishLinkedList, UpdatingEndFinishLinkedList) + " milliseconds");



        // 4.  Delete 1000 elements from the beginning, from the middle and from the end of ones. Compare time intervals.

        // Deleting 1000 elements from the beginning, from the middle and from the end of ArrayList


        LocalDateTime RemovingBeginningStartArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() - 103000 + i);
        }

        LocalDateTime RemovingBeginningFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() - 42000);
        }

        LocalDateTime RemovingMiddleFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++){
            integers.remove(integers.size() - 1000 + i);
        }

        LocalDateTime RemovingEndFinishArrayList = LocalDateTime.now();



        // Deleting 1000 elements from the beginning, from the middle and from the end of LinkedList


        LocalDateTime RemovingBeginningStartLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 103000 + i);
        }

        LocalDateTime RemovingBeginningFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 42000);
        }

        LocalDateTime RemovingMiddleFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 1000 + i);
        }

        LocalDateTime RemovingEndFinishLinkedList = LocalDateTime.now();



        // COMPARING time intervals: removing in ArrayList and removing in Linked List


        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        System.out.println("Removing 1000 Integer elements at the beginning in ArrayList needs: "
                + ChronoUnit.MILLIS.between(RemovingBeginningStartArrayList, RemovingBeginningFinishArrayList) + " milliseconds");
        System.out.println("Removing 1000 Integer elements at the beginning in LinkedList needs: "
                + ChronoUnit.MILLIS.between(RemovingBeginningStartLinkedList, RemovingBeginningFinishLinkedList) + " milliseconds");

        System.out.println();

        System.out.println("Removing 1000 Integer elements in the middle in ArrayList needs: "
                + ChronoUnit.MILLIS.between(RemovingBeginningFinishArrayList, RemovingMiddleFinishArrayList) + " milliseconds");
        System.out.println("Removing 1000 Integer elements in the middle in LinkedList needs: "
                + ChronoUnit.MILLIS.between(RemovingBeginningFinishLinkedList, RemovingMiddleFinishLinkedList) + " milliseconds");

        System.out.println();

        System.out.println("Removing 1000 Integer elements in the end in ArrayList needs: "
                + ChronoUnit.MILLIS.between(RemovingMiddleFinishArrayList, RemovingEndFinishArrayList) + " milliseconds");
        System.out.println("Removing 1000 Integer elements in the end in LinkedList needs: "
                + ChronoUnit.MILLIS.between(RemovingMiddleFinishLinkedList, RemovingEndFinishLinkedList) + " milliseconds");


    }
}
