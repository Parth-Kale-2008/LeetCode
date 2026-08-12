class Solution {
    public String intToRoman(int num) {
        int ans = 0;
        String out = "";
        int[] arr = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        HashMap<Integer, String> abc = new HashMap<>();
        abc.put(1, "I");
        abc.put(5, "V");
        abc.put(10, "X");
        abc.put(50, "L");
        abc.put(100, "C");
        abc.put(500, "D");
        abc.put(1000, "M");
        abc.put(4, "IV");
        abc.put(9, "IX");
        abc.put(40, "XL");
        abc.put(90, "XC");
        abc.put(400, "CD");
        abc.put(900, "CM");

        for (int i = arr.length - 1; i >= 0; i--) {
            while (num >= arr[i]) {
                out += abc.get(arr[i]);
                num -= arr[i];
            }
        }
        return out;
    }
}