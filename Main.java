class Main{
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        System.out.print("Изменение в ветке main 1");
        System.out.println(messageGen() + "использовано в 4 обновлении");
    }
    public static void newMethod() {
        System.out.println("Новый метод");
    }
    public static String messageGen(){
        return "Какое-то сообщение";
    }
}