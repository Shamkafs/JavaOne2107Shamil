package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaOneApp extends JFrame{
    private int value;

    private static final String COUNTER_NULL = "Начало отсчёта";
    private static final String COUNTER_IS_EVEN_INTEGER = "Число чётное";
    private static final String COUNTER_IS_ODD_INTEGER = "Число нечётное";
    private static final String COUNTER_IS_NEGATIVE = "Число отрицательное";

    public JavaOneApp(int initialValue) {
        this.value = initialValue;
        setBounds(150,150,500,500);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Создадим шрифт
        Font font = new Font("Arial Black", Font.BOLD, 35);

        //Создадим сам счётчик
        JLabel counterValue = new JLabel(String.valueOf(initialValue));//Редактируемая текстовая метка(JLabel)
        counterValue.setFont(font);//Присваиваем счётчику заданный шрифт
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);//Горизонтальное выравнивание
        add(counterValue, BorderLayout.CENTER);//Добавили на панель

        //Создаем инфо о счётчике
        JLabel infoPane = new JLabel(COUNTER_NULL);
        infoPane.setHorizontalAlignment(SwingConstants.CENTER);
        infoPane.setFont(font);
        add(infoPane, BorderLayout.NORTH);

        //Уменьшение значения
        JButton decrement = new JButton("-1");//Создали кнопку
        decrement.setFont(font);//Добавили шрифт
        add(decrement, BorderLayout.WEST);//Добавили на панель

        //Увеличение значения
        JButton increment = new JButton("+1");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        //Увеличение значения на 5
        JButton incrementFive = new JButton("+5");//Создали кнопку
        incrementFive.setFont(font);//Добавили шрифт
        add(incrementFive, BorderLayout.SOUTH);//Добавили на панель


        //Добавляем слушателей
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value --;
                counterValue.setText(String.valueOf(value));
                if (value < 0) {
                    infoPane.setText(COUNTER_IS_NEGATIVE);
                } else if (value % 2 != 0){
                    infoPane.setText(COUNTER_IS_ODD_INTEGER);
                } else if (value == 0){
                    infoPane.setText(COUNTER_NULL);
                } else {
                    infoPane.setText(COUNTER_IS_EVEN_INTEGER);
                }
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValue.setText(String.valueOf(value));
                if (value < 0) {
                    infoPane.setText(COUNTER_IS_NEGATIVE);
                } else if (value % 2 != 0){
                    infoPane.setText(COUNTER_IS_ODD_INTEGER);
                } else if (value == 0){
                    infoPane.setText(COUNTER_NULL);
                } else {
                    infoPane.setText(COUNTER_IS_EVEN_INTEGER);
                }
            }
        });

        incrementFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + 5;
                counterValue.setText(String.valueOf(value));
                if (value < 0) {
                    infoPane.setText(COUNTER_IS_NEGATIVE);
                } else if (value % 2 != 0){
                    infoPane.setText(COUNTER_IS_ODD_INTEGER);
                } else if (value == 0){
                    infoPane.setText(COUNTER_NULL);
                } else {
                    infoPane.setText(COUNTER_IS_EVEN_INTEGER);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaOneApp(0);
    }
}
