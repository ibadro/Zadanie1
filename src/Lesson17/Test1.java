package Lesson17;

// все о классе String Builder
class car {
}

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello World!!!");
        StringBuilder sb3 = new StringBuilder(50); //  вместимость 50 символов по дефолту 16 символов
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb3.length());
        System.out.println(sb2.charAt(3)); // вывести 3 символ
        System.out.println(sb2.indexOf("w")); // найти букву
        String s = sb2.substring(5); // с какого симола начать вывод
        System.out.println(s);
        String s2 = sb2.substring(5, 8); // с какого симола по какой  начать вывод
        System.out.println(s2);
        System.out.println(sb2.subSequence(5, 8)); // работает так же метод substring в оутпуте чарсиквенс
        sb2.append(22); // изменил уже имеющийся обект и добавил 22 Hello World!!!22
        System.out.println(sb2);
        sb2.append(true); // добавил true Hello World!!!22true
        System.out.println(sb2);
        sb2.append(sb2); // добавил самого себя Hello World!!!22trueHello World!!!22true
        System.out.println(sb2);
        sb2.append("privet"); // добавил привет   Hello World!!!22trueHello World!!!22trueprivet
        System.out.println(sb2);
        sb2.append(new car()); // Hello World!!!22trueHello World!!!22trueprivetLesson17.car@30c7da1e -  добавили класс car
        System.out.println(sb2);
        System.out.println(sb2.insert(4, 55)); // вставили символ Hell55o World!!!
        System.out.println(sb2);
        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6);  // удалили с 3 го по 6 символ
        System.out.println(sb10);
        sb10.deleteCharAt(6);  // удалили  6 символ Hello orld
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);  // перевернул   Hello orld на dlro olleH
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 5, "Pete"); // заменим с 0 по 5 элемент стрингом "Pete" = Peteprivet
        System.out.println(sb12);
        System.out.println(sb12.capacity()); // 16  дефолт длина
    }
}
