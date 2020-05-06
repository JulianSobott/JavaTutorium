class Person {
    String name;
    String adresse;
    int alter;

    void neueAdresse(String adresse) {
        this.adresse = adresse;
    }

    void neuesAlter(int alter) {
        this.alter = alter;
    }

    public String toString() {
        return getBeschreibung();
    }

    // public String toString()
    String getBeschreibung() {
        return "Person: name: " + this.name + " alter: " + this.alter + " adresse: " + this.adresse;
    }
}
