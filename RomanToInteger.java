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
