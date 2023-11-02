package com.java.generic;

class CreateTwpTypeParameter<T, U>{
    private T name;
    private U last;

    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public U getLast() {
        return last;
    }
    public void setLast(U last) {
        this.last = last;
    }
}
class Create<T>{
    private T name;
    public T fetchName(){
        return name;
    }

    public void createName(T name){
         this.name = name;
    }

    @Override
    public String toString() {
        return "Create :)";
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Create<String> createObj=new Create<>();
        createObj.createName("Robin");
        System.out.println("Name: "+ createObj.fetchName() +" type of object: "+ createObj.fetchName().getClass().getName());
//        createObj.createName(1); compile time error as we are passing Integer instead of String

        Create<Create> createCreateObj= new Create<>();
        createCreateObj.createName(createObj);
        System.out.println("Name: "+ createCreateObj.fetchName() +" type of object: "+ createCreateObj.fetchName().getClass().getName());

        CreateTwpTypeParameter<String , String> createTwpTypeParameter=new CreateTwpTypeParameter<>();
        createTwpTypeParameter.setName("Hii");
        createTwpTypeParameter.setLast("Hello");
        System.out.println("Name: "+ createTwpTypeParameter.getName() +" type of object: "+ createTwpTypeParameter.getName().getClass().getName());
        System.out.println("Last: "+ createTwpTypeParameter.getLast() +" type of object: "+ createTwpTypeParameter.getLast().getClass().getName());

        CreateTwpTypeParameter<String , Integer> createTwpTypeParameter1=new CreateTwpTypeParameter<>();
        createTwpTypeParameter1.setName("Hii");
        createTwpTypeParameter1.setLast(1);
        System.out.println("Name: "+ createTwpTypeParameter1.getName() +" type of object: "+ createTwpTypeParameter1.getName().getClass().getName());
        System.out.println("Last: "+ createTwpTypeParameter1.getLast() +" type of object: "+ createTwpTypeParameter1.getLast().getClass().getName());
    }
}
