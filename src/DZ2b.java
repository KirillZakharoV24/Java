// Один из сотовых операторов решил сделать своим клиентам приятный бонус:
// если клиент пополняет счёт более чем на 1000 рублей,
// то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.
public class DZ2b {
    public static void main(String[] args) {
        // Начальная сумма
        int currentBalance = 100;

        //Сумма поплнения
        int replenishmentAmount = 900;

        //Бонусные рубли
        int bonus;
        
        if (replenishmentAmount > 1000) {
            bonus = (replenishmentAmount / 100);
        } else (bonus = 0)
        
            //Итоговая сумма
        int totalAmount = currentBalance + replenishmentAmount + bonus;

        System.out.println("Итоговая сумма: " + totalAmount + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
