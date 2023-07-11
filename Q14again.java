public class Q14again {
    public static void main (String [] args) {
        In opener = new In ("temperature.txt");
        Out closer = new Out ("normalized-temperature.txt");

        String [] nums = null;
        String [] chars = null;
        double [] nums2 = new double [nums.length];
     

        while (!opener.isEmpty()) {
            String line = opener.readLine();
            String [] parts = line.split(" ");

            int numcount=0;

            for (int i = 0; i<parts.length; i++) {
                if (parts[i].equalsIgnoreCase("C")||parts[i].equalsIgnoreCase("F"))
                numcount++;
            }

            nums = new String [numcount];
            chars = new String[numcount];

            int a =0;
            int b =0;
            for (int i =0; i<parts.length; i++) {
                if (parts[i].equalsIgnoreCase("C")||parts[i].equalsIgnoreCase("F")) {
                    chars[a] = parts[i];
                    a++;
                }
                else {
                    nums[b] = parts[i];
                    b++;
                }
            }
            /*for (int i =0; i<nums.length; i++) {
                closer.print(nums[i] + " " + chars[i] + " ");
            }*/
            int Ccounter = 0;
            int Fcounter = 0;

            for (int i =0; i<parts.length; i++) {
                if (parts[i].equals("C")) {
                    Ccounter++;
                }
                if (parts[i].equals("F")) {
                    Fcounter++;
                }
            }
            if (Ccounter>Fcounter) {
                b=0;
                for (int i = 0; i<nums2.length; i++) {
                    if (parts[i].equals("F")) {
                        double newval = Double.parseDouble(nums[b]);
                        nums2[i] = newval;
                        double newval2 = (newval-32) *0.55555556;
                        double c = newval2;

                        closer.print(c + " " + "C ");
                        b++;
                    }
                    }
                }
            }
        }
    }



