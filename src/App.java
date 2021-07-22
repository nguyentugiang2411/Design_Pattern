import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import creational.abstractfactory.chair.IChair;
import creational.abstractfactory.factory.FurnitureAbstractFactory;
import creational.abstractfactory.factory.FurnitureFactory;
import creational.abstractfactory.table.ITable;
import creational.abstractfactory.type.MaterialType;
import creational.builder.concretebuilder.FastFoodOrderBuilder;
import creational.builder.product.order.Order;
import creational.builder.product.type.BreadType;
import creational.builder.product.type.OrderType;
import creational.builder.product.type.SauceType;
import creational.builder.product.type.VegetableType;
import creational.factory.BankFactory;
import creational.factory.BankType;
import creational.factory.IBank;
import creational.prototype.Computer;
import creational.singleton.SingletonService;
import structural.adapter.AudioPlayer;
import structural.adapter.IVietnameseTarget;
import structural.adapter.JapaneseAdaptee;
import structural.adapter.TranslatorAdapter;
import structural.bridge.Assemble;
import structural.bridge.Bank;
import structural.bridge.Bike;
import structural.bridge.Car;
import structural.bridge.CheckingAccount;
import structural.bridge.Produce;
import structural.bridge.SavingAccount;
import structural.bridge.TPBank;
import structural.bridge.Vehicle;
import structural.bridge.VietcomBank;
import structural.composite.FileLeaf;
import structural.composite.FolderComposite;
import structural.composite.IFileComponent;
import structural.decorator.EmployeeConcreteComponent;
import structural.decorator.IEmployeeComponent;
import structural.decorator.Manager;
import structural.decorator.TeamLeader;
import structural.flyweight.Context;
import structural.flyweight.ISoldier;
import structural.flyweight.SoldierFactory;

public class App {

    private static List<ISoldier> soldiers = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        // Singleton
        SingletonService service = new SingletonService();
        service.getBillPughSingleton();
        service.getStaticBlockSingleton();
        service.getEageInitializedSingleton();
        service.getLazyInitializedSingleton();
        service.getThreadSafeLazyInitializedSingleton();

        // Factory
        IBank bank = BankFactory.getBank(BankType.SACOMBANK);
        System.out.println(bank.getBankName());

        // Builder

        Order order = new FastFoodOrderBuilder().orderType(OrderType.ON_SITE).breadType(BreadType.BEEF)
                .sauceType(SauceType.KETCHUP).vegetableType(VegetableType.CUCUMBER).build();

        System.out.println(order.toString());

        // Abstract Factory
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        IChair chair = factory.createChair();
        chair.create();

        ITable table = factory.createTable();
        table.create();

        // Property
        Computer computer1 = new Computer("Window 10", "Word 2013", "BKAV", "Chrome v69", "Skype");
        Computer computer2 = computer1.clone();
        computer2.setOthers("Skype, Teamviewer, FileZilla Client");

        System.out.println(computer1);
        System.out.println(computer2);

        // Adapter
        IVietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        // Bridge
        Bank vietcomBank = new VietcomBank(new CheckingAccount());
        vietcomBank.openAccount();

        Bank tpBank = new TPBank(new SavingAccount());
        tpBank.openAccount();

        Vehicle car = new Car(new Produce());
        car.munuFacture();
        Vehicle bike = new Bike(new Assemble());
        bike.munuFacture();

        // Composite
        IFileComponent file1 = new FileLeaf("file 1", 10);
        IFileComponent file2 = new FileLeaf("file 2", 5);
        IFileComponent file3 = new FileLeaf("file 3", 12);

        List<IFileComponent> files = Arrays.asList(file1, file2, file3);
        IFileComponent folder = new FolderComposite(files);
        folder.showProperty();
        System.out.println("Total Size: " + folder.totalSize());

        // Decorator
        System.out.println("NORMAL EMPLOYEE: ");
        IEmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
        employee.showBasicInfo();
        employee.doTask();
 
        System.out.println("\nTEAM LEADER: ");
        IEmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInfo();
        teamLeader.doTask();
 
        System.out.println("\nMANAGER: ");
        IEmployeeComponent manager = new Manager(employee);
        manager.showBasicInfo();
        manager.doTask();
 
        System.out.println("\nTEAM LEADER AND MANAGER: ");
        IEmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInfo();
        teamLeaderAndManager.doTask();

        // Flyweight
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Yuri", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Yuri", 2);
        long endTime = System.currentTimeMillis();

        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 1; i <= numberOfSoldier; i++) {
            Context star = new Context("Soldier" + (soldiers.size() + 1), numberOfStar);
            ISoldier soldier = SoldierFactory.createSoldier(soldierName);
            soldier.promote(star);
            soldiers.add(soldier);
        }
    }
}
