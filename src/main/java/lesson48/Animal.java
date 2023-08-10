package lesson48;

public enum Animal {

    DOG("собака"), CAT("кошка"), FROG("лягушка");
    // new Animal("собака")

    private String translation;

    // Animal() { }

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() { return translation; }

    public String toString() {
        return "Перевод на русский язык: " + translation;
    }

}