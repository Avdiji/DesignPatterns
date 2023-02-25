using BuilderPattern.NSCarBuilder;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuilderPattern {

    public class BuilderPatternMain {
        public static void Main(string[] args) {

            //Car car = new Car("Audi", "A6", 4, Color.BLACK); // unable to initialize Car like this, since the Constructor is protected

            // initialize the director and CarBuilder
            CarDirector director = new CarDirector();
            ICarBuilder builder = new CarBuilder();

            //build default car
            director.BuildDefaultCar(builder);
            Car defaultCar = builder.Build();

            // build white Smart
            director.BuildWhiteSmart(builder);
            Car whiteSmart = builder.Build();

            // build other custom Cars
            Car whitePolo = builder.Brand("VW").Model("Polo").Color(Color.White).Build();
            Car blackFordMustang = builder.Brand("Ford").Model("Mustang").Color(Color.Black).AmountOfDoors(2).Build();
        }

    }
}
