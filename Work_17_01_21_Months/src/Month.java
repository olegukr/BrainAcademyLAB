/**
 * Created by olegpoberezhets on 21.01.17.
 */


public class Month {

    public static void main(String[]args){

    String month12 = "Ноябрь";

    switch(month12)

    {
        case "Январь":
            System.out.println("1 января - Новый Год");
            System.out.println("7 января - Рождество");
            System.out.println("13 января - Старый Новый Год");
            System.out.println("14 января - Василя");
            break;
        case "Февраль":
            System.out.println("14 февраля - День Св.Валентина");
            break;
        case "Март":
            System.out.println("8 Марта");
            break;
        case "Апрель":
            System.out.println("1 апреля - День смеха");
            break;
        case "Май":
            System.out.println("9 мая");
            break;
        case "Июнь":
            System.out.println("Днюха Витика");
            break;
        case "Июль":
        case "Август":
        case "Сентябрь":
        case "Октябрь":
        case "Ноябрь":
        case "Декабрь":
            System.out.println("Не припомню");
            break;
        default:
            System.out.println("неправильный месяц");
    }
}
}