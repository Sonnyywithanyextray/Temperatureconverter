public class Q14again {
    public static void main(String[] args) {
        In opener = new In("temperature.txt");
        Out closer = new Out("normalized-temperature.txt");

        float[] nums = null;
        String[] chars = null;

        while (!opener.isEmpty()) {
            String line = opener.readLine();
            String[] parts = line.split(" ");

            int numcount = 0;

            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equalsIgnoreCase("C") || parts[i].equalsIgnoreCase("F"))
                    numcount++;
            }

            nums = new float[numcount];
            chars = new String[numcount];

            int a = 0;
            int b = 0;

            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equalsIgnoreCase("C") || parts[i].equalsIgnoreCase("F")) {
                    chars[a] = parts[i];
                    a++;
                } else {
                    nums[b] = Float.parseFloat(parts[i]);
                    b++;
                }
            }
            /*for (int i =0; i<nums.length; i++) {
                closer.print(nums[i] + " " + chars[i] + " ");
            }*/
            int Ccounter = 0;
            int Fcounter = 0;

            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equals("C")) {
                    Ccounter++;
                }
                if (parts[i].equals("F")) {
                    Fcounter++;
                }
            }
            double[] nums2 = new double[nums.length];

            if (Ccounter > Fcounter) {
                System.out.println("Celsius");
                for (int i = 0; i < nums.length; i++) {
                    if (chars[i].equals("F")) {
                        nums2[i] = (int) ((nums[i] - 32) * 5 / 9);
                    } else {
                        nums2[i] = (int) nums[i];
                    }
                    closer.printf(nums2[i] + " " + "C " + " ");

                }
            } else {
                System.out.println("Farenheit");
                for (int i = 0; i < nums.length; i++) {
                    if (chars[i].equals("C")) {
                        nums2[i] = (int) (nums[i] * 9 / 5 + 32);
                    } else {
                        nums2[i] = (int) nums[i];
                    }
                    closer.printf(nums2[i] + " " + "F " + " ");
                }
            }

            
            }
        }
    }





