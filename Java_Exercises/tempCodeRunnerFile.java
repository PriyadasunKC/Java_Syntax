static double Area (double v1 , double v2, double v3) {
        double s = ((v1 + v2 + v3)/3);  
        return Math.sqrt(s * (s - v1) * (s - v2) * (s - v3));
    }