// https://leetcode.com/problems/roman-to-integer/
// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.


class RomanToInteger {
       public HashMap<String, Integer> createMap() {
        HashMap<String, Integer> numberMap = new HashMap<>();
        numberMap.put("I", 1);
        numberMap.put("V", 5);
        numberMap.put("X", 10);
        numberMap.put("L", 50);
        numberMap.put("C", 100);
        numberMap.put("D", 500);
        numberMap.put("M", 1000);
        numberMap.put("IV", 4);
        numberMap.put("IX", 9);
        numberMap.put("XL", 40);
        numberMap.put("XC", 90);
        numberMap.put("CD", 400);
        numberMap.put("CM", 900);
        return numberMap;
    }

    public int romanToInt(String s) {
        int result = 0;
        ArrayList<String> sArr = stringToArrayList(s);
        HashMap<String, Integer> valuesMap = createMap();

        for (int i = sArr.size() - 1; i >= 0; i--) {
            if (i == 0) {
                result += valuesMap.get(sArr.get(i));
            } else if (valuesMap.containsKey(sArr.get(i - 1) + sArr.get(i))) {
                result += valuesMap.get(sArr.get(i - 1) + sArr.get(i));
                i--;
            } else {
                result += valuesMap.get(sArr.get(i));
            }
        }
        return result;
    }

    public ArrayList<String> stringToArrayList(String s) {
        String[] strSplit = s.split("");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
        return strList;
    }
}
