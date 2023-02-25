using System.Drawing;

namespace BuilderPattern.NSCarBuilder {
    // Business Object
    internal class Car {

        // member all private
        private string brand;
        private string model;
        private int amountOfDoors;
        private Color color;

        // Constructor (includes a big amount of parameters and gets messy)
        internal Car(string brand, string model, int amountOfDoors, Color color) {
            this.brand = brand;
            this.model = model;
            this.amountOfDoors = amountOfDoors;
            this.color = color;
        }

        // Properties with no setters for data integrity //
        public string Brand { get { return brand; } }
        public string Model { get { return model; } }
        public int AmountOfDoors { get { return amountOfDoors; } }
        public Color Color { get { return color; } }
        // Properties with no setters for data integrity //

        public override string ToString() {
            return string.Format("Brand: {0}\nModel: {1}\nAmountOfDoors: {2}\nColor: {3}", Brand, Model, AmountOfDoors, Color.ToString());
        }
    }
}