import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Выберите операцию: ");
            System.out.println("");
            System.out.println("");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.println("5. Удаление по ключевому слову");
            System.out.print("Ваш выбор: ");

            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            } else if (input.equals("1")) {
                System.out.print("Введите дело которое хотите добавить: ");
                String cas = scanner.nextLine();
                list.add(cas);
            } else if (input.equals("2")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Дело номер " + (i + 1) + ": " + list.get(i));
                }
            } else if (input.equals("3")) {
                System.out.print("Выберите номер элемента для удаления: ");
                String del = scanner.nextLine();
                int rem = Integer.parseInt(del);
                rem -= 1;
                if(!list.contains(rem)){
                    System.out.println("Такого номера дела в списке нет");
                }
                list.remove(rem);
            } else if (input.equals("4")) {
                System.out.print("Введите текст заметки для удаления: ");
                String remForWords = scanner.nextLine();
                    if ( list.remove(remForWords)) {
                        System.out.println("Удаление по слову прошло успешно.");
                    } else System.out.println("Ошибка при удалении, попробуйте еще раз.");

            } else if (input.equals("5")) {
                System.out.print("Введите ключевое слово для удаления: ");
                String inp = scanner.nextLine();

                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.contains(inp)) {
                        list.remove(i);
                        System.out.println("Удаление прошло успешно.");
                    } else System.out.println("Сопадений не найдено.");
                }

            }


        }
    }
}