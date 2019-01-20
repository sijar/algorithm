package sijar.algo;

public class Permutation {

        public static void main(String[] args)
        {
            String str = "ABC";
            //int n = str.length();
            //sijar.algo.Permutation permutation = new sijar.algo.Permutation();
            //permutation.permute(str, 0, str.length()-1);

            Permutation.permutation(str,"");

        }

        /**
         * permutation function
         * @param str string to calculate permutation for
         * @param l starting index
         * @param r end index
         */
        private void permute(String str, int l, int r)
        {
            System.out.println("===============================");
            System.out.println("Permuting=" + str + " l=" + l + " r=" + r);

            if (l == r)
                System.out.println("[" + str + "]");
            else
            {
                for (int i = l; i <= r; i++)
                {
                    str = swap(str,l,i);
                    System.out.println("Post swap = {" + str + "} ");

                    //System.out.println("{" + str + "} " + " l=" + l + " r=" + r + " i=" + i);
                    permute(str, l+1, r);

                    str = swap(str,l,i);
                    //System.out.println("Post swap = {" + str + "} ");
                }
            }
        }

        /**
         * Swap Characters at position
         * @param a string value
         * @param i position 1
         * @param j position 2
         * @return swapped string
         */
        private String swap(String a, int i, int j)
        {
            System.out.println("swapping at " + i + "&" + j + " position {" + a + "} ") ;
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i] ;
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }



    public static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    }

// This code is contributed by Mihir Joshi


