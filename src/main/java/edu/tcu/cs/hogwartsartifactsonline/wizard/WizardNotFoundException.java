package edu.tcu.cs.hogwartsartifactsonline.wizard;

public class WizardNotFoundException extends RuntimeException {

    public WizardNotFoundException(String wizardId) {
        super("Could not find wizard with Id" + wizardId + ":(");
    }
}
