package Lesson16;


public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        String s10 = s1.substring(3); // substring с какого индекса начать вывод
        System.out.println(s10);

        String s11 = s1.substring(3, 7); // substring с какого индекса  по какой начать вывод(7ой сам не включен)
        System.out.println(s11);

        String s12 = s1.trim();
        System.out.println(s12); // убирает все пробелы по бокам

        String s13 = s1.substring(3, 11); // substring с какого индекса  по какой начать вывод, в данном случае 11 индекса нет. 12 индекс Java  не даст написать
        System.out.println(s13);

        String s14 = s1.replace('g', 'z'); // заменяет g на z
        System.out.println(s14);

        String s15 = s1.replace("abc", "vvv"); // заменяет abc на vvv
        System.out.println(s15);

        String s16 = "qwe";
        String s17 = "asd";
        System.out.println(s16.concat(s17)); // конкетенация



    }
}

