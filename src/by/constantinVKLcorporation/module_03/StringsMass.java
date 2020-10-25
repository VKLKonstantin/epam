package by.constantinVKLcorporation.module_03;

/**
 * Работа со строкой как с массивом символов
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class StringsMass {

    public static void main(String[] args) {

        char word[];//массив для символов слова
        String firstMass[] = {"bbbHbb", "kkkLkk", "oooPoo", "rrrTrr"};
        String secondMass[] = new String[firstMass.length];//новый массивый, где длина слова+1
        secondMass = newMass(firstMass, secondMass);

        for (int i = 0; i < secondMass.length; i++) {
            word = new char[secondMass[i].length() + 1];
            for (int j = 0, k = 0; j < secondMass[i].length(); j++, k++) {
                if (Character.isUpperCase(secondMass[i].charAt(j))) {//триггер по верхнему регистру
                    word[k] = '_';
                    word[k + 1] = Character.toLowerCase(secondMass[i].charAt(j));//перевод на нижний регистр
                    k++;
                } else {
                    word[k] = secondMass[i].charAt(j);
                }

            }
            secondMass[i] = builder(word);//слово из массива букв
            System.out.print(secondMass[i].toString());
            System.out.println();

        }

    }

    public static String[] newMass(String firstMass[], String secondMass[]) {

        for (int i = 0; i < firstMass.length; i++) {
            StringBuffer strBuffer = new StringBuffer();
            secondMass[i] = firstMass[i] + strBuffer.append("");
        }
        return secondMass;
    }


    public static String builder(char word[]) {
        StringBuilder sb = new StringBuilder();
        for (Character c : word) {
            sb.append(c.charValue());
        }
        String str = sb.toString();
        return str;
    }
}
