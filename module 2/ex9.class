public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int A = 0; int B = 0;
        for (int i = 0; i < a3.length; i++) {
            if (A > a1.length - 1){
                a3[i] = a2[B];
                B++;
            }
            else if (B > a2.length - 1){
                a3[i] = a1[A];
                A++;
            } 
            else if (a1[A] < a2[B]) {
                a3[i] = a1[A];
                A++;
            }
            else {
                a3[i] = a2[B];
                B++;
            }
        }
        
        return a3;
    }