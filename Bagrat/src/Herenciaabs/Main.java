package Herenciaabs;

public class Main {

    public static void main(String[] args) {

        Planta planta1 = new Planta();
        //Servivo servivo = new Servivo(); // no puedo crear objeto de una clase abstracta
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        animalCarnivoro.Alimentarse();
        AnimalHervivoro animalHervivoro = new AnimalHervivoro();
        animalHervivoro.Alimentarse();

    }
}
