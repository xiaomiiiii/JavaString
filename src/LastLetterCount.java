public class LastLetterCount {
    String s = "It is a String. I need to count all words that end in s and y and to switch the first instance of word that ends in s and y";
    static int cntS = 0;
    static int cntY = 0;
    static int indexS = -1;
    static int indexY = -1;

    public static void countAndSwitch(String str) {
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            char lastLetter = arr[i].charAt(arr[i].length() - 1);
            if (Character.isAlphabetic(lastLetter)) {
                checkLastLetter(lastLetter, i);
            } else {
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    if (Character.isAlphabetic(arr[i].charAt(j))) {
                        checkLastLetter(arr[i].charAt(j), i);
                    }
                }
            }
        }

        if (indexS == 0) {
            arr[indexS] = arr[indexS].toLowerCase();
            arr[indexY].replace(arr[indexY].charAt(0), Character.toUpperCase(arr[indexY].charAt(0)));
        }
        if (indexY == 0) {
            arr[indexY] = arr[indexY].toLowerCase();
            arr[indexS].replace(arr[indexS].charAt(0), Character.toUpperCase(arr[indexS].charAt(0)));
        }
        String temp = arr[indexS];
        arr[indexS] = arr[indexY];
        arr[indexY] = temp;

        System.out.println("There are " + cntS + " words that end with s");
        System.out.println("There are " + cntY + " words that end with y");

        str = arr[0];
        for (int i = 1; i < arr.length; i++) {
            str = str + " " + arr[i];
        }

        System.out.println("The new String is: " + str);
    }

    private static void checkLastLetter(Character c, int i) {
        if (c == 's') {
            cntS++;
            if (indexS == -1) {
                indexS = i;
            }
        } else if (c == 'y') {
            cntY++;
            if (indexY == -1) {
                indexY = i;
            }
        }
    }
}
