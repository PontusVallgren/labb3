package edu.lernia.labb3;

import java.util.Objects;

public class Patient {
    private final String name;
    private String illness;
    Patient(String name, String illness) {
        this.name = name;
        this.illness = illness;
    }

    Patient(String name) {
        this.name = name;
        this.illness = null;
    }

    public boolean isSick() {
        return this.illness != null;
    }
        public void takeMedication(Medicine medicine) {
            if(Objects.equals(medicine.getTreatmentName(), illness)) {
                this.illness = null;
            }
        }
        
        public String getName() {
            return this.name;
        }

        public String getSickness() {
            return this.illness;
        }
    }
