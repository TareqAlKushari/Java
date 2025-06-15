package hr;

public class Main {
    public static void main(String[] args) {
       Employee e1 =new Employee("Mohammed", 2000);
       e1.claTax();
        System.out.println(e1.toString());
       
       Maneger m = new Maneger(new Departament("IT", 2), "Asel", 17000);
       m.claTax();
       m.printAll();
       
       Supervisor s = new Supervisor(new Departament("HR", 3), "Ammar", 20000);
       s.claTax();
       s.printAll();
    }
}
