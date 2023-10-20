package edu.hw1;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Logger;
import static edu.hw1.Config.NUM_100;
import static edu.hw1.Config.NUM_3;
import static edu.hw1.Config.NUM_4;
import static edu.hw1.Config.NUM_5;
import static edu.hw1.Config.NUM_6;
import static edu.hw1.Config.NUM_7;
import static edu.hw1.Config.NUM_8;
import static edu.hw1.Messages.ERR_MESSAGE;
import static edu.hw1.Messages.EXIT_MESSAGE;
import static edu.hw1.Messages.FORMAT_MESSAGE;
import static edu.hw1.Messages.HELP_MESSAGE;
import static edu.hw1.Messages.RES_MESSAGE;
import static edu.hw1.tasks.Task0.task0;
import static edu.hw1.tasks.Task1.task1;
import static edu.hw1.tasks.Task2.task2;
import static edu.hw1.tasks.Task3.task3;
import static edu.hw1.tasks.Task4.task4;
import static edu.hw1.tasks.Task5.task5;
import static edu.hw1.tasks.Task6.task6;
import static edu.hw1.tasks.Task7.task7left;
import static edu.hw1.tasks.Task7.task7right;
import static edu.hw1.tasks.Task8.task8;
import static java.lang.Thread.sleep;

public final class Main {
    private Main() {
    }

    static boolean exit = false;

    private static final Logger LOGGER_MAIN = Logger.getLogger(Main.class.getName());

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        try {
            input = scanner.nextLine();
        } catch (NoSuchElementException ex) {
            LOGGER_MAIN.info(EXIT_MESSAGE);
            exit = true;
        }
        return input;
    }

    @SuppressWarnings("CyclomaticComplexity")
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            int input;
            LOGGER_MAIN.info("Введите номер проверяемого задания (от 0 до 8), "
                + "\"exit\" для выхода, \"help\" для помощи: ");
            String inputs;
            try {
                inputs = scanner.nextLine().trim().toLowerCase();
            } catch (NoSuchElementException ex) {
                LOGGER_MAIN.info(EXIT_MESSAGE);
                exit = true;
                continue;
            }
            if (inputs.equals("exit")) {
                exit = true;
                LOGGER_MAIN.info("Завершение программы\n");
            } else if (inputs.equals("help")) {
                LOGGER_MAIN.info(HELP_MESSAGE + "\n");
            } else {
                try {
                    input = Integer.parseInt(inputs);
                } catch (NumberFormatException ex) {
                    LOGGER_MAIN.info("Некорректное значение! Попробуйте еще раз!" + "\n");
                    continue;
                }
                if (input == 0) {
                    task0();
                    sleep(NUM_100);
                } else {
                    if (input == 1) {
                        LOGGER_MAIN.info("Введите время в формате \"mm:ss\": ");
                        try {
                            LOGGER_MAIN.info(RES_MESSAGE + task1(input()) + "\n");
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else if (input == 2) {
                        LOGGER_MAIN.info("Введите любое число (целое или дробное): ");
                        try {
                            LOGGER_MAIN.info(RES_MESSAGE + task2(input()) + "\n");
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else if (input == NUM_3) {
                        LOGGER_MAIN.info("Введите два массива целых чисел (числа в массиве должны идти "
                            + "через пробел, массивы должны быть разделены знаком \",\"): ");
                        try {
                            LOGGER_MAIN.info(RES_MESSAGE + task3(input()) + "\n");
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else if (input == NUM_4) {
                        LOGGER_MAIN.info("Введите строку, которую надо исправить: ");
                        try {
                            LOGGER_MAIN.info(RES_MESSAGE + task4(input()) + "\n");
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else if (input == NUM_5) {
                        LOGGER_MAIN.info("Введите целое положительное число: ");
                        try {
                            LOGGER_MAIN.info(RES_MESSAGE + task5(input()) + "\n");
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else if (input == NUM_6) {
                        LOGGER_MAIN.info("Введите целое четырехзначное число, в котором не все числа одинаковые: ");
                        try {
                            LOGGER_MAIN.info(RES_MESSAGE + task6(input()) + "\n");
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else if (input == NUM_7) {
                        LOGGER_MAIN.info("Введите \"right\" для циклического сдвига вправо и \"left\" для циклического"
                            + " сдвига влево: ");
                        try {
                            String chose = input();
                            if (chose.equalsIgnoreCase("right") || chose.equalsIgnoreCase("r")) {
                                LOGGER_MAIN.info("Введите два числа (целые, положительные) через запятую (первое - "
                                    + "число для сдвига, второе - размер циклического сдвига): ");
                                LOGGER_MAIN.info(RES_MESSAGE + task7right(input()) + "\n");
                            } else if (chose.equalsIgnoreCase("left") || chose.equalsIgnoreCase("l")) {
                                LOGGER_MAIN.info(
                                    "Введите два числа (целые, положительные) через запятую (первое - число "
                                        + "для сдвига, второе - размер циклического сдвига): ");
                                LOGGER_MAIN.info(RES_MESSAGE + task7left(input()) + "\n");
                            } else {
                                LOGGER_MAIN.info("Некорректные входные данные!" + "\n");
                            }
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else if (input == NUM_8) {
                        LOGGER_MAIN.info("Введите расположение фигур коней на доске (0 - нет коня, 1 - есть конь): ");
                        try {
                            StringBuilder stringBuilder = new StringBuilder();
                            for (int i = 0; i < NUM_7; i++) {
                                stringBuilder.append(input().trim()).append(":");
                            }
                            stringBuilder.append(input().trim());
                            LOGGER_MAIN.info(RES_MESSAGE + task8(stringBuilder.toString()) + "\n");
                        } catch (NumberFormatException ex) {
                            LOGGER_MAIN.info(FORMAT_MESSAGE + "\n");
                        } catch (Exception ex) {
                            LOGGER_MAIN.info(ERR_MESSAGE + "\n");
                        }
                    } else {
                        LOGGER_MAIN.info("Некорректный номер задания! Попробуйте еще раз!" + "\n");
                    }
                }
            }
        }
    }
}
