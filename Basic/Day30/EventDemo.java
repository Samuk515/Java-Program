package Day30;

class Button {
    private final String label;
    private ClickListener listener;

    // Interface defined INSIDE the class - nested interface
    interface ClickListener {
        void onClick(String buttonLabel);
    }

    Button(String label) { this.label = label; }

    void setOnClick(ClickListener listener) { this.listener = listener; }

    void click() {
        System.out.println("[" + label + "] clicked");
        if (listener != null) {
            listener.onClick(label);
        } else {
            System.out.println("(no action set)");
        }
    }

    String getLabel() { return label; }
}

public class EventDemo {
    public static void main(String[] args) {

        Button submitBtn = new Button("Submit");
        Button cancelBtn = new Button("Cancel");
        Button helpBtn   = new Button("Help");

        // Set anonymous inner class listeners
        submitBtn.setOnClick(new Button.ClickListener() {
            @Override
            public void onClick(String label) {
                System.out.println("Form submitted!");
            }
        });

        cancelBtn.setOnClick(new Button.ClickListener() {
            @Override
            public void onClick(String label) {
                System.out.println("Operation cancelled.");
            }
        });

        helpBtn.setOnClick(new Button.ClickListener() {
            @Override
            public void onClick(String label) {
                System.out.println("Opening help docs...");
            }
        });

        // Simulate user clicks
        Button[] buttons = { submitBtn, cancelBtn, helpBtn };
        for (Button b : buttons) b.click();

        System.out.println("\n--- Unregistered button ---");
        new Button("Unknown").click();
    }
}

