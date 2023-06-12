class solution {
    public String gcdOfStrings(String str1, String str2){
        String bigger, smaller = "";
        if(str1.length() > str2.length()){
            bigger = str1;
            smaller = str2;
        }else {
            smaller = str1;
            bigger = str2;
        }
        if(bigger.equals(smaller)){
            return smaller;
        }
        if(!bigger.startsWith(smaller)){
            return "";
        }
        return gcdOfStrings(bigger.substring(smaller.length()), smaller)
    }
    
}

