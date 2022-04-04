package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("PrivetqwayPri");
        int a = s1.length(); // length длина массива стринга
        System.out.println(a);

        char c1 = s1.charAt(3); // charAt - обнаружить какой чар находится на нужном индексе
        System.out.println(c1);

        int i1 = s1.indexOf('t'); // indexOf  на каком индексе находится буква "т"
        System.out.println(i1);

        int i2 = s1.indexOf("vet"); // indexOf  на каком индексе находится буква "vet"
        System.out.println(i2);

        int i4 = s1.indexOf("a", 5); // с какого символа нужно начать поиск
        System.out.println(i4);

        boolean b1 = s1.startsWith("Pri", 10); // startsWith c какого конкретно идекса начинать расматривать, в данном случае с 10 символа. Есть 2 варианта - с начала или с какого то индекса
        System.out.println(b1);

        boolean b2 = s1.endsWith("ri"); //  endsWith  заканчивается ли "ri"
        System.out.println(b2);
    }
}
