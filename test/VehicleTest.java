import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
     Домашнее задание к семинару №2 JUnit:
     1. Настроить новый проект:
         a). Нужно создать новый проект, со следующей структурой классов (3 отдельных класса):
         b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре))
         c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
*/
class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void init() {
        car = new Car();
        motorcycle = new Motorcycle();
    }

    @Test
    void checkCarInstanceofVehicle() {
        Assertions.assertInstanceOf(Vehicle.class, car);
    }

    @Test
    void checkCarNumWheels() {
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    void checkMotorcycleNumWheels() {
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void checkSpeedCarTestDrive() {
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test
    void checkSpeedMotorcycleTestDrive() {
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void checkCarParkAfterDrive() {
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());

        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    void checkMotorcycleParkAfterDrive() {
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());

        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}