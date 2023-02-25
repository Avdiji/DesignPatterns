using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuilderPattern.NSCarBuilder {

    // Concrete Class (implements the Builder Interface)
    internal class CarBuilder : ICarBuilder {

        private string? brand;
        private string? model;
        private int amountOfDoors;
        private Color color;

        public Car Build() {
            return new Car(brand, model, amountOfDoors, color);
        }

        public ICarBuilder Brand(string brand) {
            this.brand = brand;
            return this;
        }

        public ICarBuilder Model(string model) {
            this.model = model;
            return this;
        }

        public ICarBuilder AmountOfDoors(int amountOfDoors) {
            this.amountOfDoors = amountOfDoors;
            return this;
        }

        public ICarBuilder Color(Color color) {
            this.color = color;
            return this;
        }

    }
}
