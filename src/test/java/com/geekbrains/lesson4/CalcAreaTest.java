package com.geekbrains.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcAreaTest {
    @Test
    void successSquareCalculation() throws Exception{
        //результат положительный т.к сумма всех сторон / 2 = 6
        Assertions.assertEquals(TriangleArea.calcArea(3, 4, 5),6);
        //результат положительный т.к сумма всех сторон / 2 = 6 - 6 = 0, а 0 меньше 0.0001
        Assertions.assertTrue(Math.abs(TriangleArea.calcArea(3, 4, 5) - 6) < 0.0001);
        //здесь не совсем понял откуда взялась цифра 0.0002
        Assertions.assertEquals( 6, TriangleArea.calcArea(3, 4, 5), 0.0002);
    }
    @Test
    //Здесь можно добавить варианты со всеми отрицательными сторонами, с двумя и т.д в негативных тестах можно написать
    // много сценариев учитывая техники тест- дизайна, но и без них так же
    void negativeTriangleTest() {Assertions.assertThrows(Exception.class, () -> TriangleArea.calcArea(-3, 4, 5));}
}
