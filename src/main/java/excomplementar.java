public static void main(String[] args) {
    String product1 = "Computer";
    String product2 = "Office desk";
    int age = 30;
    int code = 5200;
    char gender = 'F';
    double price1 = 2100.0;
    double price2 = 650.50;
    double  measure = 53.234567;
    System.out.printf("%s, which  price is  $ %.2f%n", product1, price1);
    System.out.printf("%s, which  price is  $ %.2f%n", product2, price2);
    System.out.printf("record %d yearsold, code %d and gender: %c%n ", age,code, gender);
    System.out.printf("Measue witheight decimal places %.8f%n", + measure);

    System.out.printf("Rounded (three decima places) : %.3f%n", measure);
}