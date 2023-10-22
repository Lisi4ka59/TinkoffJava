package edu.hw2;



import edu.hw2.task4.CallingInfoFunction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class Task4Test {
        @Test
        @DisplayName("Получение названия класса, вызвавшего метод")
        void getClassName() {
            assertEquals("edu.hw2.task4.CallingInfoFunction", CallingInfoFunction.callingInfo("callingInfo").className());
        }

        @Test
        @DisplayName("Получение сообщения о том, что данный метод никто не вызывал")
        void getNoOneCalledThisMethodMessage() {
            assertEquals(CallingInfoFunction.MESSAGE, CallingInfoFunction.callingInfo("nonExistentMethod").className());
        }
    }

