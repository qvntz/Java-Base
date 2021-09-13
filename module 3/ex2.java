public static final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != this.getClass()) return false;
            if (this.hashCode() == obj.hashCode()) {
                if (obj == this) return true;
                ComplexNumber complex = (ComplexNumber) obj;
                return this.re == complex.getRe() && this.im == complex.getIm();
            }
            return false;
        }

        //и
        @Override
        public int hashCode() {
            Double result = this.getRe() * 23 + this.getIm();
            return result.hashCode();
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }


    }