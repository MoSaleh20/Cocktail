//
//
///*
//  To change this license header, choose License Headers in Project Properties.
//  To change this template file, choose Tools | Templates
//  and open the template in the editor.
// */
//
//package cocktail1;
//
//import Fruit.Orange;
//import Fruit.Mango;
//import Fruit.Watermelon;
//import Fruit.Strawberry;
//import Fruit.Banana;
//import Fruit.Pineapple;
//import java.io.DataOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.Scanner;
//
///**
// *
// * @authors AhmadHoryzat & MohammadSaleh
// */
//public class Cocktail1 {
//
//    /**
//     * @param args the command line arguments
//     * @throws java.io.FileNotFoundException
//     * @throws java.lang.ClassNotFoundException
//     */
//    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
//        System.out.println("Resources for Volume, Calories and Color: www.schemecolor.com, www.aqua-calc.com");
//        DataOutputStream dos = null;
//        FileOutputStream fos = null;       
//        Scanner in = new Scanner(System.in);
//        Scanner file = null;
//        try{
//        fos = new    FileOutputStream("output.txt");
//        dos = new DataOutputStream(fos);
//        file = new Scanner(new File("input.txt"));
//        } catch (Exception e){
//            e.printStackTrace();
//        } 
//
//        
////        System.out.println("Enter blender capacity:");
//        Blender blender = new Blender();
////        System.out.println("Enter cup capacity: ");
//        Cup cup=new Cup();
//        
//        read(file,blender,cup);
//            
//        
////                case 1:   
////                    
////                    
////                    
////                    
////                    
////                    int count=0;
////                            do{
////                                count++;
////                            menu1();
////                            choice1 = in.nextInt();
////                            switch(file.next()){
////                                                  case "banana": case "Banana": 
////                                                            System.out.println("How many Grams? "); 
////                                                            Fruits fruit2=new Banana(Double.parseDouble(file.next()));
////                                                            blender.Add(fruit2);
////                                                            break;
////                                                  case "Mango": case "mango":
////                                                            System.out.println("How many Grams? ");
////                                                            Fruits fruit4=new Mango(Double.parseDouble(file.next()));
////                                                            blender.Add(fruit4);
////                                                            break;
////                                                  case "Orange": case "orange":   
////                                                            System.out.println("How many Grams? ");
////                                                            Fruits fruit7=new Orange(Double.parseDouble(file.next()));
////                                                            blender.Add(fruit7);
////                                                            break;
////                                                  case "Pineapple": case "pineapple":
////                                                            System.out.println("How many Grams? ");
////                                                            Fruits fruit10=new Pineapple(Double.parseDouble(file.next()));
////                                                            blender.Add(fruit10);
////                                                            break;
////                                                  case "Watermelon": case "watermelon":
////                                                           System.out.println("How many Grams? ");
////                                                            Fruits fruit12=new Watermelon(Double.parseDouble(file.next()));
////                                                            blender.Add(fruit12);
////                                                            break;
////                                                  case "Strawberry": case "strawberry":   
////                                                              System.out.println("How many Grams? ");
////                                                            Fruits fruit14=new Strawberry(Double.parseDouble(file.next()));
////                                                            blender.Add(fruit14);
////                                                            break;
////                                                                                                  
////                                                  case 0: count=10;}                                           
////                                        } while(count!=10);
////                                        break;
////                                                          
////                case 2:
////                    System.out.println("How mush in millilitres? ");
////                    Milk milk = new Milk(Double.parseDouble(file.next()));               
////                    blender.add(milk);
////                                                                                                                    
////                    break;
////                case 3:
////                    Sugar sugar=new Sugar();
////                    blender.add(sugar);
////                                        
////                    break;
//int choice;
//        do{
//            menu();
//            choice = in.nextInt();
//            switch(choice){
//                case 4:
//                        blender.Blend();
//                        System.out.println("before"+blender.getInfo());
//                        dos.writeChars("before\n"+blender.getInfo());
//                        
//                    break;
//                case 5:                  
//                    blender.Pour(cup);
//                        System.out.println("aftre"+blender.getInfo());
//                        System.out.println("before"+cup.getInfo());
//                        dos.writeChars("\nafter\n"+blender.getInfo()+"\nCup\n"+cup.getInfo());                      
//                    break;
//                case 0:
//                    
//                if ( dos != null )
//                    try{
//                        dos.close();
//                    } catch (IOException e ){
//                        e.printStackTrace();                    
//                    }
//                    System.exit(0);
//        }} while(true);
//    
//    }
//    public static void menu(){
//        System.out.println("Please Enter your choice");
////        System.out.println("1. Add Fruit");
////        System.out.println("2. Add Milk");
////        System.out.println("3. Add Sugar");
//        System.out.println("4. Blend");
//        System.out.println("5. Pour");
//        System.out.println("0. Exit");
//        
//    }
//
//    public static void menu1(){
//        System.out.println("Please Enter your choice");     
//        System.out.println("1. Add Bananas");      
//        System.out.println("2. Add Mango");      
//        System.out.println("3. Add Orange");  
//        System.out.println("4. Add Pineapple");
//        System.out.println("5. Add Watermelon");      
//        System.out.println("6. Add Strawberry");
//        System.out.println("0. Enough Fruits");
//    }
//
//    public static void read(Scanner file,Blender blender,Cup cup){   
//        do{
//            switch(file.next()){
//                                                  case "Blender": case "blender":
//                                                            blender.setCapacity(Double.parseDouble(file.next()));
//                                                            break;
//                                                  case "Cup": case "cup":
//                                                            cup.setCapacity(Double.parseDouble(file.next()));
//                                                            break;
//                                                  case "banana": case "Banana": 
//                                                            Fruits fruit2=new Banana(Double.parseDouble(file.next()));
//                                                            blender.Add(fruit2);
//                                                            break;
//                                                  case "Mango": case "mango":
//                                                            Fruits fruit4=new Mango(Double.parseDouble(file.next()));
//                                                            blender.Add(fruit4);
//                                                            break;
//                                                  case "Orange": case "orange":   
//                                                            Fruits fruit7=new Orange(Double.parseDouble(file.next()));
//                                                            blender.Add(fruit7);
//                                                            break;
//                                                  case "Pineapple": case "pineapple":
//                                                            Fruits fruit10=new Pineapple(Double.parseDouble(file.next()));
//                                                            blender.Add(fruit10);
//                                                            break;
//                                                  case "Watermelon": case "watermelon":
//                                                            Fruits fruit12=new Watermelon(Double.parseDouble(file.next()));
//                                                            blender.Add(fruit12);
//                                                            break;
//                                                  case "Strawberry": case "strawberry":   
//                                                            Fruits fruit14=new Strawberry(Double.parseDouble(file.next()));
//                                                            blender.Add(fruit14);
//                                                            break;
//                                                  case "Milk": case "milk":
//                                                            Milk milk = new Milk(Double.parseDouble(file.next()));               
//                                                            blender.add(milk);
//                                                            break;
//                                                  case "Sugar": case "sugar":
//                                                            blender.add(new Sugar());
//                                                            break;
//        }} while(file.hasNext()); 
//    } 
//}
//
