package goit.module04.homework.autocheck;

abstract class SpaceObject {

}
abstract class Planet extends SpaceObject {

}
class Mars extends Planet {

}
class Moon extends SpaceObject {

}
class PlanetTester {
    String test(SpaceObject object) {
        if (object instanceof Planet) {
            String planet = "planet";
            return planet;
        }
        return "not planet";
    }
    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars()));
        System.out.println(tester.test(new Moon()));
    }
}
