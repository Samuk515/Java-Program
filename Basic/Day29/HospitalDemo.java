package Day29;

class HealthRecord {
    private static int nextId = 1;
    private static final String[] VALID_BLOOD_TYPES = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};

    private final String patientId;
    private String name;
    private String bloodType;
    private double weight;
    private double height;
    private String[] diagnoses;
    private int diagCount;

    HealthRecord(String name, String bloodType, double weight, double height) {
        this.patientId = "p-" + String.format("%03d", nextId++);
        this.diagnoses = new String[50];
        this.diagCount = 0;
        setName(name);
        setBloodType(bloodType);
        setWeight(weight);
        setHeight(height);
    }

    // Getters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public String getBloodType() { return bloodType; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }

    // Computed - BMI not stored, always fresh
    public double getBMI() {
        double hm = height / 100.0;
        if (hm <= 0) return 0.0;
        return Math.round((weight / (hm * hm)) * 10.0) / 10.0;
    }

    public String getBMICategory() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    // Append-only diagnoses
    public void addDiagnosis(String diagnosis) {
        if (diagnosis == null || diagnosis.trim().isEmpty()) {
            System.out.println("Invalid diagnosis");
            return;
        }
        if (diagCount < diagnoses.length) {
            diagnoses[diagCount++] = diagnosis;
        } else {
            System.out.println("Diagnosis list full");
        }
    }

    public String[] getDiagnoses() {
        // Return a COPY - never expose internal array directly
        String[] copy = new String[diagCount];
        System.arraycopy(diagnoses, 0, copy, 0, diagCount);
        return copy;
    }

    // Validated setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name required");
        this.name = name;
    }

    public void setBloodType(String bt) {
        for (String valid : VALID_BLOOD_TYPES) {
            if (valid.equals(bt)) { this.bloodType = bt; return; }
        }
        throw new IllegalArgumentException("Invalid blood type: " + bt);
    }

    public void setWeight(double w) {
        if (w < 1 || w > 500) throw new IllegalArgumentException("Weight must be 1-500 kg");
        this.weight = w;
    }

    public void setHeight(double h) {
        if (h < 30 || h > 300) throw new IllegalArgumentException("Height must be 30-300 cm");
        this.height = h;
    }

    public void display() {
        System.out.println("patient " + patientId + " " + name
                + " | Blood: " + bloodType
                + " | BMI: " + getBMI() + " (" + getBMICategory() + ")"
                + " | Diagnoses: " + diagCount );
        if (diagCount > 0) {
            System.out.print(" History: ");
            for (int i = 0; i < diagCount; i++) {
                System.out.print(diagnoses[i]);
                if (i < diagCount - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        HealthRecord r = new HealthRecord("Arnav", "B+", 70, 154);
        r.display();

        r.addDiagnosis("Hypertension");
        r.addDiagnosis("Type 2 Diabetes");
        r.display();

        // Update weight after treatment
        r.setWeight(68);
        System.out.println("Updated BMI: " + r.getBMI() + " (" + r.getBMICategory() + ")");

        // getDiagnoses returns a copy - internal array is safe
        String[] copy = r.getDiagnoses();
        if (copy.length > 0) copy[0] = "HACKED"; // modifying copy doesn't affect original
        r.display(); // still shows original diagnoses
    }
}
