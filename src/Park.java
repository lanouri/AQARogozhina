public class Park {

        private String attraction;
        private String time;
        private double cost;

        public Park(String attraction, String time, double cost) {
            this.attraction = attraction;
            this.time = time;
            this.cost = cost;
        }

        public String getAttraction() {
            return attraction;
        }

        public void setAttraction(String attraction) {
            this.attraction = attraction;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public class AttractionInfo {

            public void displayAttractionInfo() {
                System.out.println("Attraction: " + attraction);
                System.out.println("Time: " + time);
                System.out.println("Cost: $" + cost);
            }
        }

        public static void main(String[] args) {
            Park[] parkArray = new Park[3];
            parkArray[0] = new Park("Roller Coaster", "10:00 AM - 6:00 PM", 25.0);
            parkArray[1] = new Park("Ferris Wheel", "11:00 AM - 7:00 PM", 15.0);
            parkArray[2] = new Park("Haunted House", "7:00 PM - 12:00 AM", 20.0);

            for (Park park : parkArray) {
                Park.AttractionInfo attractionInfo = park.new AttractionInfo();
                attractionInfo.displayAttractionInfo();
                System.out.println("--------------------");
            }
        }
    }