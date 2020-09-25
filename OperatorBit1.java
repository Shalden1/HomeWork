package HomeWork1;

public class OperatorBit1 {
    public static void main(String[] args) {


        // Поначалу использовал только для проверки))
        int x = -42;
        int y = -15;

        System.out.println(Integer.toBinaryString(x << y));

        int z = 0b11111111101011000000000000000000;
        System.out.println(z);
        System.out.println("________________________________");


        // Начало тут.
        // 00101010 - число 42
        // 00001111 - число 15

        System.out.println(42 & 15); // оператор и, 1 - если ОБА операнда 1, иначе 0. 00101010 & 00001111 => 00001010 => 10
        System.out.println(42 | 15); // оператор или, 1 - если хоть в одном есть 1, иначе 0. 00101010 | 00001111 => 00101111 => 47
        System.out.println(42 ^ 15); // оператор XOR, 1 - если ТОЛЬКО в одном из операндов есть 1, оба 0 или обе 1 - 0 00101010 | 00001111 => 00100101 => 37
        System.out.println(42 << 15); // сдвиг влево на 15 позиций, дописываем 15 нулей справа, 101010000000000000000 => 1376256
        System.out.println(42 >> 15); // сдвиг вправо на 15 позиций. 000000000000000 => 0
        System.out.println(42 >>> 15); // то же самое, только правые операнды заполняются 0 000000000000000 => 0
        System.out.println(~ 42); // оператор НЕ, все биты 0 меняем на 1, и наооборот 00101010 => 11010101 (11111111111111111111111111010101) => -43.
        System.out.println(~ 15); // то же самое. 00001111 => 11110000 (11111111111111111111111111110000) => -16
        System.out.println("_________________________________");

        // 11110001 - число -15
        // 11010110 - число -42

        System.out.println(-42 & -15); // 11010000 => -48
        System.out.println(-42 | -15); // 11110111 => -9
        System.out.println(-42 ^ -15); // 00100111 => 39. Все предыдущие единицы меняем на 0, т.к. они присутствуют у обоих чисел.
        // Нужен ли знак минуса при сдвигах влево или вправо?
        System.out.println(-42 << -15); // 11111111101011000000000000000000 => -5505024
        System.out.println(-42 >> -15); // 11111111111111111111111111010110 => 11111111101011000000000000000000 => -1
        System.out.println(-42 >>> -15); // 00000000000000000111111111111111 => 32767
        System.out.println(~ -42); // 11111111111111111111111111010110 => 00101001 => 41
        System.out.println(~ -15); // 11111111111111111111111111110001 => 1110 => 14
        System.out.println("__________________________________");

        // Тут я понял, что ~ != - На всякий случай оставлю это здесь, без комментариев.
        System.out.println(~42 & ~15);
        System.out.println(~42 | ~15);
        System.out.println(~42 ^ ~15);
        System.out.println(~42 << 15);
        System.out.println(~42 >> 15);
        System.out.println(~42 >>> 15);
        System.out.println(~ 42);
        System.out.println(~ 15);
        System.out.println("________________________________");

        // 00101010.1 - те самые 42.5

        //побитовые операции с присваиванием

        int a = 42;
        System.out.println(a <<= 15); // a = a << 15; 42 = 42 << 15; Видели это выше, получаем 1376256, или 101010000000000000000
        System.out.println(a >>= 15); // a = a >> 15; 1376256 = 1376256 >> 15 по сути обратный процесс, получаем обратно 42 или 00101010
        System.out.println(a &= 15); // 42 & 15 - тооже видели в самом начале. 00001010 или 10
        System.out.println(a ^= 15); // 10 = 10 ^ 15; 00001010 & 00001111 = 00000101 или 5
        System.out.println(a |= 15); //  00000101 | 00001111 = 00001111 15.
        System.out.println("________________________________");

        // то же самое, только с отрицательными числами + немного изменю порядок.
        int b = -42;
        System.out.println(b <<= 15);
        System.out.println(b &= 15);
        System.out.println(b ^= -15);
        System.out.println(b |= -15); // везде -15
        System.out.println(b >>= 15);
        

    }
}
