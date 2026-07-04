package day25;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age;}
    void introduce() { System.out.println("I am " + name +  ", age is " + age); }
}

class Doctor extends Person {
    String specilization; double fee;
    Doctor(String name, int age, String spec, double fee) {
        super(name, age); this.specilization = spec; this.fee = fee;

    }
    @Override void introduce() {
        super.introduce();
        System.out.println(" Specialization: " + specilization + " | Fee: Rs. " + fee);
    }
    void treat(Patient p){
        System.out.println("Dr. " + name + " treating " + p.name + " for " + p.ailment);
    }

}
 class Patient extends Person {
    String ailment; boolean isAdmitted = false;
    Patient(String name, int age, String ailment) {
        super(name, age); this.ailment = ailment;
    }
    @Override void introduce() {
        super.introduce();
        System.out.println(" Aliment: " + ailment + " | Admitted: " + isAdmitted);
    }
    void admit() { isAdmitted = true; System.out.println( name + " is admitted"); }
     void discharge(){ isAdmitted = false; System.out.println(name + " is discharged"); }
 }

 class Hospital {
    String name;
    Doctor[] doctors; int dCount = 0;
    Patient[] patients; int pCount = 0;

    Hospital(String name, int dCap, int pCap) {
        this.name = name;
        doctors = new Doctor[dCap];
        patients = new Patient[pCap];
    }
    void addDoctor(Doctor d) { doctors[dCount++] =d;}
     void addPatient(Patient p) { patients[pCount++] =p;}

     void showStatus() {
        System.out.println("=== " + name + " Status ==");
         System.out.println("-- Doctors (" + dCount + ") --");
         for (int i = 0; i <dCount; i++) doctors[i].introduce();
         System.out.println("-- Patients (" + pCount + ") --");
         for (int i = 0; i <pCount; i++) patients[i].introduce();
         long admitted = 0;
         for (int i = 0; i < pCount; i++) if (patients[i].isAdmitted) admitted++;
         System.out.println("Admitted: " + admitted + "/" + pCount);
     }
 }
public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital", 5, 10);
        Doctor d1 = new Doctor("Sharma", 34, "Cardiology", 1500);
        Doctor d2 = new Doctor("Verma", 45, "Neurology", 2000);
        Patient p1 = new Patient("Arjun", 25, "Fever");
        Patient p2 = new Patient("Juan", 25, "Fracture");

        h.addDoctor(d1); h.addDoctor(d2);
        h.addPatient(p1); h.addPatient(p2);

        p1.admit();
        d1.treat(p1);
        d2.treat(p2);
        p2.admit();

        h.showStatus();
        p1.discharge();
        h.showStatus();

    }
}
