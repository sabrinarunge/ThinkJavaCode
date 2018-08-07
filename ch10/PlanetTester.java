public class PlanetTester
{
    public static void main(String[] args)
    {
        Planet planet1 = new Planet("Mercury");
        Planet planet2 = new Planet("Venus");
        Planet planet3 = new Planet("Earth");
        Planet planet4 = new Planet("Mars");
        Planet planet5 = new Planet("Jupiter");
        Planet planet6 = new Planet("Saturn");
        Planet planet7 = new Planet("Uranus");
        Planet planet8 = new Planet("Neptune");
        Planet planet9 = new Planet("Pluto");

        Planet[] solarSystem = new Planet[9];
        solarSystem[0] = new Planet("Mercury");
        solarSystem[1] = new Planet("Venus");
        solarSystem[2] = new Planet("Earth");
        solarSystem[3] = new Planet("Mars");
        solarSystem[4] = new Planet("Jupiter");
        solarSystem[5] = new Planet("Saturn");
        solarSystem[6] = new Planet("Uranus");
        solarSystem[7] = new Planet("Neptune");
        solarSystem[8] = new Planet("Pluto");

        //for each planet in solarSystem
        for(Planet planet:solarSystem)
        {
            System.out.println(planet.getName());
        }

    }
}
