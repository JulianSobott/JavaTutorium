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

    String getBeschreibung() {
        return "Person: " + this.name + ", " + this.adresse + " " + this.alter;
    }
}
