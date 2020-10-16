public class Test {
    public static void main(String[] args) {
        int index = 5;
        double totalSalaries = 0;

        Emplyee[] emplyees = new Emplyee[index];
        emplyees[0] = new Emplyee("Michal", "Panczor", 3890);
        emplyees[1] = new Emplyee("MArcin", "Krajzega", 5000);
        emplyees[2] = new Emplyee("Tomasz", "Ciesla", 3000);
        emplyees[3] = new Emplyee("Wojtek", "Morcinek", 2890);
        emplyees[4] = new Emplyee("Zenek", "Kukla", 3460);

        index = 0;
        while(index < emplyees.length){
            totalSalaries += emplyees[index].getSalary();
            index++;
        }

//         basic solution:
//         totalSalaries = emplyees[0].getSalary() + emplyees[1].getSalary()+ emplyees[2].getSalary()
//         +emplyees[3].getSalary() + emplyees[4].getSalary();

        System.out.printf("Suma wypłat dla %d pracowników wynosi: %.2f\n", emplyees.length , totalSalaries);

    }

}
