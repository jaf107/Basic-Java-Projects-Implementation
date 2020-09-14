package EmailAdministratorApplication;

public class EmailApp {
    public static void main(String[] args) {

        Email em1 = new Email("Jafar", "Mahin");

        em1.setAlternativeEmail("jafarmahin107@gmail.com");

        System.out.println(em1.toString());
    }
}
