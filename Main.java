class Main{
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке dev");
        System.out.print("Изменение в ветке dev 1");
        System.out.println(messageGen() + "использовано в 4 обновлении dev");
    }
    public static void newMethod() {
        System.out.println("Новый метод в dev");
    }
    public static String messageGen(){
        return "Какое-то сообщение в dev";
    }
}
