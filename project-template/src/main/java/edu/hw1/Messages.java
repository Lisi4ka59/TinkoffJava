package edu.hw1;

public final class Messages {
    private Messages() {}

    public static final String HELP_MESSAGE = """
    0. Привет, мир!
Напишите функцию, которая выводит в консоль фразу "Привет, мир!" при помощи метода LOGGER.info().

Тестировать задание не нужно :)


1. Длина видео
Дана строка с длиной видео в формате mm:ss, например 12:44.
Напишите функцию, которая возвращает общую длину видео в секундах.

Примеры:

minutesToSeconds("01:00") -> 60
minutesToSeconds("13:56") -> 836
minutesToSeconds("10:60") -> -1
Замечания:

если строка некорректная, например, кол-во секунд больше или равно 60, то нужно вернуть -1
количество минут никак не ограничено, например, 999:59 является корректным входным значением

2. Количество цифр
Напишите функцию, которая возвращает количество цифр в числе.

Пользоваться преобразованием в строку запрещено.

Примеры:

countDigits(4666) -> 4
countDigits(544) -> 3
countDigits(0) -> 1

3. Вложенный массив
Напишите функцию, которая возвращает true, если первый массив может быть вложен во второй, и false в противном случае.

Массив может быть вложен, если:

min(a1) больше чем min(a2)
max(a1) меньше, чем max(a2)
Примеры:

isNestable([1, 2, 3, 4], [0, 6]) -> true
isNestable([3, 1], [4, 0]) -> true
isNestable([9, 9, 8], [8, 9]) -> false
isNestable([1, 2, 3, 4], [2, 3]) -> false

4. Сломанная строка
оПомигети псаривьтс ртко!и

Ой, имелось ввиду: "Помогите исправить строки!"

Все мои строки перепутались и каждая пара символов поменялась местами.

Напишите функцию, которая исправляет такие строки и возвращает правильный порядок.

Примеры:

fixString("123456") ➞ "214365"
fixString("hTsii  s aimex dpus rtni.g") ➞ "This is a mixed up string."
fixString("badce") ➞ "abcde"

5. Особый палиндром
Будем называть потомком числа новое число, которое создается путем суммирования каждой пары соседних цифр.

Например, число 123312 не является палиндромом, но его потомок 363 -- является:

3 = 1 + 2
6 = 3 + 3
3 = 1 + 2
Напишите функцию, которая будет возвращать true, если число является палиндромом
или если любой из его потомков длиной > 1 (как минимум 2 цифры) является палиндромом.

Примеры:

isPalindromeDescendant(11211230) -> true // 11211230 -> 2333 -> 56 -> 11
isPalindromeDescendant(13001120) -> true // 13001120 -> 4022 ➞ 44
isPalindromeDescendant(23336014) -> true // 23336014 -> 5665
isPalindromeDescendant(11) -> true

6. Постоянная Капрекара
Выберем любое четырёхзначное число n, больше 1000, в котором не все цифры одинаковы.

Расположим цифры сначала в порядке возрастания, затем в порядке убывания.
Вычтем из большего меньшее. Производя перестановки цифр и вычитания, нули следует сохранять.
Описанное действие назовём функцией Капрекара K(n).

Повторяя этот процесс с получающимися разностями, не более чем за семь шагов мы получим число 6174,
которое будет затем воспроизводить само себя.

Это свойство числа 6174 было открыто в 1949 году. индийским математиком Д. Р. Капрекаром,
в честь которого оно и получило своё название.

Пример выполнения K(3524):

5432 – 2345 = 3087
8730 – 0378 = 8352
8532 – 2358 = 6174
7641 – 1467 = 6174
Требуется написать рекурсивную функцию, которая для заданного числа будет возвращать количество шагов,
которые нужно сделать чтобы получить 6174.

Например, для числа выше ответ будет равен 3.

Другие примеры:

countK(6621) -> 5
countK(6554) -> 4
countK(1234) -> 3

7. Циклический битовый сдвиг
В Java есть базовые битовые операции, но нет циклического сдвига битов.

Напишите 2 функции:

int rotateLeft(int n, int shift)
int rotateRight(int n, int shift)
где

n -- целое число положительное число
shift -- размер циклического сдвига
Примеры:

rotateRight(8, 1) -> 4 // 1000 -> 0100
rotateLeft(16, 1) -> 1 // 10000 -> 00001
rotateLeft(17, 2) -> 6 // 10001 -> 00110

8. Кони на доске
Напишите функцию, которая возвращает true, если кони расставлены на шахматной доске так,
что ни один конь не может захватить другого коня.

На вход подаётся двумерный массив размера 8х8, где 0 означает пустую клетку, а 1 - занятую конём клетку.

Примеры:

knightBoardCapture([
  [0, 0, 0, 1, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0],
  [0, 1, 0, 0, 0, 1, 0, 0],
  [0, 0, 0, 0, 1, 0, 1, 0],
  [0, 1, 0, 0, 0, 1, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0],
  [0, 1, 0, 0, 0, 0, 0, 1],
  [0, 0, 0, 0, 1, 0, 0, 0]
]) -> true

knightBoardCapture([
  [1, 0, 1, 0, 1, 0, 1, 0],
  [0, 1, 0, 1, 0, 1, 0, 1],
  [0, 0, 0, 0, 1, 0, 1, 0],
  [0, 0, 1, 0, 0, 1, 0, 1],
  [1, 0, 0, 0, 1, 0, 1, 0],
  [0, 0, 0, 0, 0, 1, 0, 1],
  [1, 0, 0, 0, 1, 0, 1, 0],
  [0, 0, 0, 1, 0, 1, 0, 1]
]) -> false

knightBoardCapture([
  [0, 0, 0, 0, 1, 0, 0, 0],
  [0, 0, 0, 0, 0, 1, 0, 0],
  [0, 0, 0, 1, 0, 0, 0, 0],
  [1, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 1, 0, 0, 0],
  [0, 0, 0, 0, 0, 1, 0, 0],
  [0, 0, 0, 0, 0, 1, 0, 0],
  [1, 0, 0, 0, 0, 0, 0, 0]
]) -> false
""";
    public static final String FORMAT_MESSAGE = "Некорректные значение! Введите \"help\" чтобы посмотреть справку!";
    public static final String ERR_MESSAGE = "Ошибка при выполнении функции!";
    public static final String RES_MESSAGE = "Результат: ";
    public static final String EXIT_MESSAGE = "Принудительное завершение программы";
}
