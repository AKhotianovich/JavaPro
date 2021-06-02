package Lesson5.Package3;

public class Find {
    public static void main(String[] args) {
        String words = "Вскоре после случившегося во двор вышли Пашка и Коля. Пашка поискал глазами ребят. Никого не было видно. – Странно, – обратился он к Коле. – Только что все были во дворе, и уже нет никого. Куда они делись?– А они в луже возились и все вымокли. Наверное, пошли домой, сушиться, – сказал Коля.– Ты-то откуда знаешь?– Я в окно видел. Сережка даже искупался в луже, – хихикнул Коля.– Интересно, зачем они туда залезли? – удивился Пашка. – Не знаю. Во что-то интересное играли. Мальчишки залезли в песочницу. – Давай что ли в ножички поиграем, – предложил Пашка. – Давай, – согласился Колька.";
        String[] newStr;
        newStr = words.split("\\.");

        for (int i = 0; i < newStr.length; i++) {
            int min = 0;
            int minCount = 99;
            for (int j = i; j < newStr.length; j++) {
                int count = 1;
                for (int k = 0; k < newStr[j].length(); k++) {
                    if(newStr[j].charAt(k) == ' '){
                        //Если пробел - увеличиваем количество слов на 1
                        count++;

                    }
                }
                if (minCount > count){
                    min = j;
                    minCount = count;
                }

            }
            String newStr1 = newStr[i];
            newStr[i] = newStr[min];
            newStr[min] = newStr1;
            
        }

        for (String a : newStr) {
            System.out.println(a.trim());
        }
    }
}
