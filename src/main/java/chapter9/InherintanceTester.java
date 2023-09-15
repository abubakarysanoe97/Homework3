package chapter9;

public class InherintanceTester {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Mother mom = new Mother();
        mom.setName("Glenda ");
        System.out.println(mom.getName()+ "Is a " + mom.getGender());

    }
}
