package org.example;

public class Main {
    public static void main(String[] args){
        try{
            int a=Integer.parseInt("This string");
            String s=null;
            System.out.println(s.length());
        }catch(NumberFormatException | NullPointerException e){
            System.out.println("Found exception"+ e.getMessage());
        }
    }
}
//В этом примере мы пытаемся преобразовать строку, которая не является целым числом,
// в переменную типа int. Затем мы пытаемся вызвать метод length() для переменной типа String,
// которой было присвоено значение null. Оба этих действия могут привести к выбросу различных исключений,
// таких как NumberFormatException или NullPointerException.
//
//Мы перехватываем оба исключения в блоке catch с помощью оператора | (или),
// который позволяет указывать несколько типов исключений через запятую. Затем мы выводим сообщение об ошибке.