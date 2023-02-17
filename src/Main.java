public class Main {
    public static void main(String[] args) {
        Java adilet = new Java("Adilet", 39, 'm', "adilet85@gmail.com");
        Java jhon = new Java("Jhon", 30, 'm', "jhon93@gmail.com");
        Java derek = new Java("Derek", 40, 'm', "derek@gmail.com");
        Java scott = new Java("Scott", 33, 'm', "scott@gmail.com");
        Java steve = new Java("Steve", 22, 'm', "steve@gmail.com");

        Android li = new Android("Li", 32, 'm', "li@gmail.com");
        Android chan  = new Android("Chan", 19, 'm', "chan@gmail.com");
        Android bill  = new Android("Bill", 24, 'm', "bill@gmail.com");

        Go kairat = new Go("Kairat", 28, 'm', "kairat95@gmail.com");
        Go robert = new Go("Robert", 29, 'm', "robert95@gmail.com");


        Company apple = new Company("Donald Cook", "California",
                new Java[]{adilet, jhon, derek, scott, steve},  new Android[]{li,chan,bill},
                new  Go[]{kairat, robert});
        System.out.println(apple.toString());

        Company google = new Company("Larry Page and Sergey Brin", "Mountain View",
                new Java[]{adilet, scott}, new Android[]{li}, new Go[]{robert});
        System.out.println(google.toString());

    }
}