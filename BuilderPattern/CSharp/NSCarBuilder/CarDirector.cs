using System.Drawing;

namespace BuilderPattern.NSCarBuilder {

    // Car Director build premade Car-configurations
    internal class CarDirector {

        // Default-Values of the CarBuilder (optional)
        private static string defaultBrand = "";
        private static string defaultModel = "";
        private static int defaultAmountOfDoors = 4;
        private static Color defaultColor = Color.Black;

        // Method to build the default car (optional)
        public ICarBuilder BuildDefaultCar(ICarBuilder builder) {
            return builder.Brand(defaultBrand)
                .Model(defaultModel)
                .AmountOfDoors(defaultAmountOfDoors)
                .Color(defaultColor);
        }

        // Method to build BMW's
        public void BuildBMW(ICarBuilder builder) {
            BuildDefaultCar(builder).Brand("BMW");
        }

        // Method to build Blue Audi's
        public void BuildBlueAudi(ICarBuilder builder) {
            BuildDefaultCar(builder).Brand("Audi").Color(Color.Blue);
        }

        // Build White Smart's
        public void BuildWhiteSmart(ICarBuilder builder) {
            BuildDefaultCar(builder).Brand("Smart").Color(Color.White).AmountOfDoors(2);
        }
    }
}
