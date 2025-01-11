class EarthVolumeCalculator {
//class to compute the volume of Earth in km^3 and miles^3
    public static void main(String[] args) {
        // Define the radius of the Earth and conversion factor
        double EARTH_RADIUS_KM = 6378;
        double KM_TO_MILES_CONVERSION_FACTOR = 0.621371;

        // Calculate the volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(EARTH_RADIUS_KM, 3);

        // Convert the volume to cubic miles
        double volumeMiles3 = volumeKm3 * Math.pow(KM_TO_MILES_CONVERSION_FACTOR, 3);

        // Display the results
        System.out.printf(
                "The volume of Earth in cubic kilometers is "+volumeKm3+" and in cubic miles is "
                +volumeMiles3
        );
    }
}
