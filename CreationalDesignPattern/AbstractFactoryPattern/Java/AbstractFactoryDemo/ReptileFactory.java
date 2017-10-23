public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String animalType) {
        if ("snake".equals(animalType)) {
            return new Snake();
        } else {
            return new Tyrannosaurus();
        }
    }
}
