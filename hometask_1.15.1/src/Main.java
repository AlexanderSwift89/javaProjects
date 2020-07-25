import java.util.Scanner;
import java.util.TreeSet;

/**
 * Java. Shopping list.
 *
 * @author Aleksandr Liapunov
 * @version 1.15.1 date April 21, 2020
 */

class Main /*implements Comparator*/ {
    public static void main(String[] args) {
        System.out.println("1. Сортировка по убыванию цены");
        System.out.println("2. Сортировка по возрастанию цены");
        System.out.println("3. Сортировка по приоритету от самого важного");
        System.out.println("4. Сортировка по приоритету от низкого приоритета");
        System.out.println("Введите идентификатор сортировки:");
        Scanner scanner = new Scanner(System.in);
        TreeSet<Wish> myWishes = new TreeSet<Wish>();
        int id = Integer.parseInt(scanner.nextLine());
        if (id == 1) {
            PriceComparator wComp1 = new PriceComparator(1);
            TreeSet<Wish> myWishes1 = new TreeSet<Wish>(wComp1);
            myWishes = sortWishes(myWishes1);
        } else if (id == 2) {
            PriceComparator wComp1 = new PriceComparator(-1);
            TreeSet<Wish> myWishes2 = new TreeSet<Wish>(wComp1);
            //TreeSet<Wish> myWishes = new TreeSet<Wish>(wComp1);
            myWishes = sortWishes(myWishes2);
        } else if (id == 3) {
            PriorityComparator wComp2 = new PriorityComparator(1);
            TreeSet<Wish> myWishes3 = new TreeSet<Wish>(wComp2);
            //TreeSet<Wish> myWishes = new TreeSet<Wish>(wComp2);
            myWishes = sortWishes(myWishes3);
        } else if (id == 4) {
            PriorityComparator wComp2 = new PriorityComparator(-1);
            TreeSet<Wish> myWishes4 = new TreeSet<Wish>(wComp2);
            myWishes = sortWishes(myWishes4);
        } else {
            System.out.println("Вы ввели неверное значение, программа закончит свою работу");
        }

        System.out.println("Введите новую позицию");
        myWishes = addWishes(myWishes);

        System.out.println("Вы хотите отсортировать список другим образом? Введите 1 если хотите и 0 если не хотите");
        int answer = Integer.parseInt(scanner.nextLine());
        if (answer == 1) {
            System.out.println("1. Сортировка по убыванию цены");
            System.out.println("2. Сортировка по возрастанию цены");
            System.out.println("3. Сортировка по приоритету от самого важного");
            System.out.println("4. Сортировка по приоритету от низкого приоритета");
            System.out.println("Введите идентификатор сортировки:");
            int idNext = Integer.parseInt(scanner.nextLine());
            if (idNext == 1) {
                PriceComparator wComp1 = new PriceComparator(1);
                TreeSet<Wish> myWishes1 = new TreeSet<Wish>(wComp1);
                myWishes1.addAll(myWishes);
                displayWishes(myWishes1);
            } else if (idNext == 2) {
                PriceComparator wComp1 = new PriceComparator(-1);
                TreeSet<Wish> myWishes2 = new TreeSet<Wish>(wComp1);
                myWishes2.addAll(myWishes);
                displayWishes(myWishes2);
            } else if (idNext == 3) {
                PriorityComparator wComp2 = new PriorityComparator(1);
                TreeSet<Wish> myWishes3 = new TreeSet<Wish>(wComp2);
                myWishes3.addAll(myWishes);
                displayWishes(myWishes3);
            } else if (idNext == 4) {
                PriorityComparator wComp2 = new PriorityComparator(-1);
                TreeSet<Wish> myWishes4 = new TreeSet<Wish>(wComp2);
                myWishes4.addAll(myWishes);
                displayWishes(myWishes4);
            }
        } else {
            System.out.println("Спасибо за ответ, до свидания!");
        }
    }

    public static TreeSet<Wish> sortWishes(TreeSet<Wish> myWishes) {
        myWishes.add(new Wish("Автомобиль", "Авто", 10000, "г. Москва", 1));
        myWishes.add(new Wish("Автомобиль", "Авто", 3000, "г. Москва", 2));
        myWishes.add(new Wish("Автомобиль", "Авто", 4000, "г. Москва", 4));
        myWishes.add(new Wish("Автомобиль", "Авто", 4500, "г. Москва", 3));
        myWishes.add(new Wish("Автомобиль", "Авто", 7000, "г. Москва", 5));

        for (Wish w : myWishes) {
            System.out.print(w.getNameWish() + " ");
            System.out.print(w.getDescribeWish() + " ");
            System.out.print(w.getPriceWish() + " ");
            System.out.print(w.getUrlShopWish() + " ");
            System.out.println(w.getPriorityWish());
        }
        return myWishes;
    }

    public static TreeSet<Wish> addWishes(TreeSet<Wish> myWishes) {
        while (true) {
            System.out.println("Введите что бы вы хотели купить (введите пустую строку для выхода):");
            System.out.println("Название");
            Scanner scanner = new Scanner(System.in);
            String nameWish = scanner.nextLine();
            if (nameWish.equals("") == true) {
                break;
            }
            System.out.println("Короткое название");
            String describeWish = scanner.nextLine();
            if (describeWish.equals("") == true) {
                break;
            }
            System.out.println("Цена в рублях");
            String price = scanner.nextLine();
            if (price.equals("") == true) {
                break;
            }
            double priceWish = Double.parseDouble(price);
            System.out.println("Где купить");
            String urlShopWish = scanner.nextLine();
            if (urlShopWish.equals("") == true) {
                break;
            }
            System.out.println("Приоритет важности (0 - не очень важно, 5 - очень важно)");
            String priority = scanner.nextLine();
            if (priority.equals("") == true) {
                break;
            }
            int priorityWish = Integer.parseInt(priority);
            System.out.println("Добавлено!");
            myWishes.add(new Wish(nameWish, describeWish, priceWish, urlShopWish, priorityWish));
        }
        return myWishes;
    }

    public static void displayWishes(TreeSet<Wish> myWishes) {
        for (Wish w : myWishes) {
            System.out.print(w.getNameWish() + " ");
            System.out.print(w.getDescribeWish() + " ");
            System.out.print(w.getPriceWish() + " ");
            System.out.print(w.getUrlShopWish() + " ");
            System.out.println(w.getPriorityWish());
        }
    }
}