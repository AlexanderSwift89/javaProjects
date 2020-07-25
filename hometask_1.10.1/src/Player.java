import weapons.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                // new BigGun(),
                // new WaterPistol()
                new MaschineGun(),
                new Pistal(),
                new Rpg(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно
        try {
            Weapon weapon = weaponSlots[slot]; // создаем фрейм, помещаем в стек, передаем в него управление
            weapon.shot();// Получаем оружие из выбранного слота
            // Огонь!
        } catch (ArrayIndexOutOfBoundsException e) { //перехват ошибки, связанной с выходом за пределы массива
            System.err.println("Введите значение от 0 до " + (weaponSlots.length - 1));  // и работаем
        }
    }
}

