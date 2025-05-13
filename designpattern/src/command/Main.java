package command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fs = new FileService();

        Command[] commands = {
                // new AddCommand(),
//                new Command() { //익명 구현객체
//                    @Override
//                    public void execute() {
//                        System.out.println("Add Command");
//                    }
//                },
                () -> System.out.println("Add Command"),//람다로 대체
                //new OpenCommand(),
                fs::open,
                //new PrintCommand(),
                fs::print,
               // new ExitCommand()
                Main::exit
        };

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.println("선택: ");
            int sel = sc.nextInt();

            commands[sel-1].execute();
        }
    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료할까요?(Y/n) ");
        String answer = scanner.nextLine();

        scanner.close();
        if(answer.isEmpty() || answer.equalsIgnoreCase("Y")){
            System.exit(0);
        }
    }
}
