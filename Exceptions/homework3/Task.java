// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, 
// разделенные пробелом:
// Фамилия Имя Отчество датарождения номертелефона пол
// Форматы данных:
// фамилия, имя, отчество - строки
// дата_рождения - строка формата dd.mm.yyyy
// номер_телефона - целое беззнаковое число без форматирования
// пол - символ латиницей f или m.
// Приложение должно проверить введенные данные по количеству.
//  Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, 
// что он ввел меньше и больше данных, чем требуется.
// Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
// Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. 
// Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, 
// пользователю выведено сообщение с информацией, что именно неверно.
// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, 
// в него в одну строку должны записаться полученные данные, вида
// <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
// Не забудьте закрыть соединение с файлом.
// При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
//  пользователь должен увидеть стектрейс ошибки.
package Java.Exceptions.homework3;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Введите данные через пробел:");
        Scanner sc = new Scanner(System.in);
String scString = sc.nextLine();
String[] scStrings = scString.split(" ");
if (scStrings.length != 6)
throw new RuntimeException("Введено не 6 параметров");
for (int i = 0; i < 3; i++) {    
    if (!isAlpha(scStrings[i].toString()))
    throw new RuntimeException("В ФИО должны быть только буквы латинского алфавита! Ошибка в слове: " +scStrings[i]);    
}
if (!isDate(scStrings[3].toString()))
throw new RuntimeException("Введенные данные <"+scStrings[3]+">являются неверным форматом даты. Должно быть: dd.MM.yyyy" );
if (!isDigit(scStrings[4].toString()))
throw new RuntimeException("В номере телефона должны быть только цифры(не более 14), при вводе была допущена ошибка: " +scStrings[4]);
if (!isGender(scStrings[5].toString()))
    throw new RuntimeException("Пол обозначается буквами f или m! При вводе была допущена ошибка: " +scStrings[5]);

System.out.println(scString);
System.out.println(Arrays.toString(scStrings));
}
public static boolean isAlpha(String text) {
    for(char ch : text.toCharArray())
    {
        if (Character.isLetter(ch)){
            return true;
        }
    }
    return false;            
}

public static boolean isDigit(String text) {
    for(char ch : text.toCharArray())
    {
        if (Character.isDigit(ch)&&text.toCharArray().length<15){
            return true;
        }
    }
    return false;            
}
public static boolean isGender(String text) {

        if (text.equals("f")||text.equals("m")){
            return true;
        }
        return false; 
    }
               

public static boolean isDate(String dateString) {
    try {
    Calendar calendar = new GregorianCalendar();
    SimpleDateFormat df=new SimpleDateFormat("dd.MM.yyyy");
    df.setLenient(false);
    calendar.setTime(df.parse(dateString));
    return true;
    }
    catch (Exception e) {
    return false;
    }
    }

}