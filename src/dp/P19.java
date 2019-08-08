package dp;

/**
 * @author ming
 * @date 2019/6/5 19:01
 */

/**
 * 正则表达式的匹配
 */
public class P19 {
    public static void main(String[] args){
        System.out.println(new P19().match("aaa".toCharArray(), "a*".toCharArray()));
    }

//    public boolean match(char[] str, char[] pattern){
//        if(str == null || pattern == null){
//            return false;
//        }
//
//        return matchCore(str, pattern, 0, 0);
//    }
//
//    boolean matchCore(char[] str, char[] pattern, int strIndex, int patternIndex) {
//        if (str.length == strIndex && pattern.length == patternIndex) {
//            return true;
//        }
//
//        if (str.length != strIndex && pattern.length == patternIndex) {
//            return false;
//        }
//
//        if (pattern[patternIndex + 1] != '*') {
//            if (str[strIndex] == pattern[patternIndex] || (strIndex < str.length && pattern[patternIndex] == '.')) {
//                return matchCore(str, pattern, strIndex + 1, patternIndex + 1);
//            } else {
//                return false;
//            }
//        } else {
//            if (str[strIndex] == pattern[patternIndex] || (strIndex < str.length && pattern[patternIndex] == '.')) {
//                return matchCore(str, pattern, strIndex + 1, patternIndex) || matchCore(str, pattern, strIndex, strIndex + 2);
//            } else {
//                matchCore(str, pattern, strIndex, patternIndex + 2);
//            }
//
//        }
//        return false;
//    }

    public boolean match(char[] str, char[] pattern)
    {
        return matchTwo(str,0,str.length,pattern,0,pattern.length);

    }
    private boolean matchTwo(char[] str, int i, int length1, char[] pattern,
                             int j, int length2) {
        if(i==length1&&j==length2) {
            return true;
        }

        if(i==length1&&j!=length2) {
            while(j!=length2){
                if(pattern[j]!='*'&&(j+1>=length2||pattern[j+1]!='*')){
                    return false;
                }
                j++;
            }
            return true;
        }
        if(i!=length1&&j==length2) {
            return false;
        }

        if(j+1==length2){
            if(str[i]==pattern[j]||pattern[j]=='.')
                return matchTwo(str, i+1, length1, pattern, j+1, length2);
            else {
                return false;
            }
        }
        if((str[i]==pattern[j]||pattern[j]=='.')&&pattern[j+1]!='*')
            return matchTwo(str, i+1, length1, pattern, j+1, length2);
        if((str[i]==pattern[j]||pattern[j]=='.')&&pattern[j+1]=='*')
            return matchTwo(str, i, length1, pattern, j+2, length2)||matchTwo(str, i+1, length1, pattern, j, length2);
        if(pattern[j+1]=='*')
            return matchTwo(str, i, length1, pattern, j+2, length2);
        return false;
    }
}
