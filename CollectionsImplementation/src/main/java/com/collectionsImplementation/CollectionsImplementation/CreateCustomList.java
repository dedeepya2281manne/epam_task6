package com.collectionsImplementation.CollectionsImplementation;

import java.util.Scanner;

public class CreateCustomList {
    private static Scanner sc;

	public static void main(String[] args) 
    {
    	sc = new Scanner(System.in);
    	CustomList<Integer> list = new CustomList<Integer>();
    	System.out.println("Initial list:");
    	System.out.println(list);
    	System.out.println("How many number of elements to add to a list : ");
        int noOfAdd=sc.nextInt();
        System.out.println("Enter elements:");
        for (int i=0;i<noOfAdd;i++)
        {
        	int adding=sc.nextInt();
        	list.add(adding);
        }
        System.out.println("List after adding elements : ");
        System.out.println(list);
        System.out.println("Enter index of the List to be removed : ");
        int removeElement;
        removeElement=sc.nextInt();
        list.remove(removeElement);
        System.out.println("List after removing elements : "+list);
        
        System.out.println("value of List at index 0 is : "+ list.fetch(0));

        System.out.println("value of List at index 1 is : "+list.fetch(1));
 
        //List Size
        System.out.println("total size of the List : "+list.size());
    }
}